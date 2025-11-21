import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = 0;
        int result = 0;
        boolean[] m = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (!m[i]) {
                for (int j = i; j <= n; j += i) {
                    if (!m[j]) {
                        m[j] = true;
                        c++;
                    }
                    if (c == k) {
                        result = j;
                      break;
                    }
                }
            }
        }
        bw.write(result + "");
        bw.close();
    }
}