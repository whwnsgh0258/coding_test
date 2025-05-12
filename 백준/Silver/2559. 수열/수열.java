import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];
        
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int idx1 = 0;
        int idx2 = idx1 + (k - 1);
        int max = 0;
        while(idx2 < n) {
            int sum = 0;
            for (int i = idx1; i <= idx2; i++) {
                sum += nums[i];
            }
            if (idx1 == 0) {
                max = sum;
            }
            if (sum > max) {
                max = sum;
            }
            idx1++;
            idx2++;
        }
        bw.write(max + "");
        bw.close();
    }
}