import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] p = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(p);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += p[i];
            sum1 += sum2;
        }
        System.out.println(sum1);
    }
}