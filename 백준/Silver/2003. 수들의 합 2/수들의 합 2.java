import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            if (temp == m) {
                count++;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (temp + nums[j] == m) {
                    count++;
                    break;
                } else if (temp + nums[j] < m) {
                    temp += nums[j];
                } else {
                    break;
                }
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}