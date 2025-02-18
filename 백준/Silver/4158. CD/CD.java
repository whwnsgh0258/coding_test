import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
        
            long[] sk = new long[n];
            long[] sy = new long[m];
            
            if (n == 0 && m == 0) break;
        
            for (int i = 0; i < n; i++) {
                sk[i] = Long.parseLong(bf.readLine());
            }
            for (int i = 0; i < m; i++) {
                sy[i] = Long.parseLong(bf.readLine());
            }
            int skIdx = 0, syIdx = 0, count = 0;
            
            while(skIdx < n && syIdx < m) {
                if (sk[skIdx] == sy[syIdx]) {
                    count++;
                    skIdx++;
                    syIdx++;
                } else if (sk[skIdx] < sy[syIdx]) skIdx++;
                else syIdx++;
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}