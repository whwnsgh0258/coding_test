import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(bf.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        long r = 0;
        
        for (int i = 0; i < n; i++) {
            if (a[i] - b > 0) {
                if ((a[i] - b) % c != 0) {
                    r += ((a[i] - b) / c) + 2;
                } else {
                    r += ((a[i] - b) / c) + 1;
                }
            } else {
                r += 1;
            }
        }
        bw.write(r + "");
        bw.close();
    }
}