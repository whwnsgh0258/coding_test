import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = 0;

        Set<Integer> set = new HashSet<>(a);

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < a; i++) {
            set.add(Integer.valueOf(st.nextToken()));
        }
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < b; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (set.contains(n)) {
                c++;
            }
        }
        bw.write(a + b - c * 2 + "");
        bw.close();
    }
}