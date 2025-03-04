import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] n2 = new int[n];
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            n2[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = n - 1; i >= 0; i--) {
            if (n2[i] <= k) {
                count += k / n2[i];
                k %= n2[i];
            }
        }
        System.out.println(count);
    }
}