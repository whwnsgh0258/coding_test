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

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = m; i <= n; i++) {
            int x = (int) Math.sqrt(i) + 1;
            if (x == 2 && i != 1) {
                if (i % x != 0 || i == 2) {
                    bw.write(i + "\n");
                }
            } else if (x == 1 && i != 1) {
                bw.write(i + "\n");
            }
            for (int j = 2; j < x; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == x - 1) {
                    bw.write(i + " \n");
                }
            }
        }
        bw.close();
    }
}
