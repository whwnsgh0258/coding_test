// 투 포인터 핵심 설명:
// - 배열은 오름차순 정렬되어 있다.
// - left는 항상 증가만, right는 항상 감소만 한다 (한 번 이동하면 되돌리지 않는다).
// - while (left < right) 조건에서 두 포인터가 교차하면 탐색 종료.
// - 합(a[left] + a[right])이 x보다 작으면 left++ (더 큰 값을 만들어야 하므로 작은 쪽을 키움).
//   합이 x보다 크면 right-- (더 작은 값을 만들어야 하므로 큰 쪽을 줄임).
//   합이 x와 같으면 count++ 하고 left++ && right-- (해당 쌍을 처리하고 다음 가능한 쌍으로 이동).
//
// 왜 "left++ 와 right-- 후 값이 같아질 수 있지 않나?" 하는 걱정이 잘못된지:
// 1) 정렬되어 있기 때문에 left를 증가시키면 a[left]는 비감소(늘어나거나 같은)하고,
//    right를 감소시키면 a[right]는 비증가(줄어들거나 같은)한다.
//    따라서 left가 커지고 right가 작아지면 두 값이 같아지는(=교차하는) 경우는 결국 포인터가 만나거나 교차하는 상황이다.
//    그럴 때는 while(left < right) 조건으로 탐색이 끝난다 — 즉 중복으로 셀 일이 없다.
// 2) 합이 정확히 x일 때 left++ && right-- 하는 이유는
//    이미 (left, right) 쌍은 처리했으므로 동일한 인덱스 조합을 다시 세지 않기 위함이다.
//    같은 숫자가 중복해서 존재해도(예: 같은 값이 여러 인덱스에 있어도) 포인터 이동 규칙이
//    모든 가능한 서로 다른 인덱스 조합을 정확히 한 번씩 검사하도록 보장한다.
// 3) 요약하면: 포인터를 되돌리지 않고 한 방향으로만 이동시키는 한, "값이 같아지는" 걱정은
//    알고리즘의 안전성(중복/누락 없음)을 해치지 않는다.
//
// 한 줄 요약:
// → 정렬 + 포인터 비가역적 이동(left 증가, right 감소)으로 인해 동일 쌍의 중복 카운트나 누락이 발생하지 않는다.

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] strings) throws IOException {
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int count = 0;
        int x = Integer.parseInt(bf.readLine());
        int left = 0;
        int right = n - 1;

        while(left < right) {
            if (a[left] + a[right] < x) {
                left++;
            } else if (a[left] + a[right] == x) {
                left++;
                right--;
                count++;
            } else {
                right--;
            }
        }
        bw.write(count + "");
        bw.close();
    }
}