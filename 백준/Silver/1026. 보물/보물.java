import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());
        int temp = n;
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    a[j] = Integer.parseInt(st.nextToken());
                } else {
                    b[j] = Integer.parseInt(st.nextToken());
                }
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            temp--;
            sum += a[temp] * b[i];
        }
        System.out.println(sum);
    }
}