import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bf.readLine());
        int count = 99;
        if (n < 100) {
            bw.write(n + "");
        } else if (n == 100) {
            bw.write("99");
        } else {
            for (int i = 101; i <= n; i++) {
                int h = i / 100;
                int t = i % 100 / 10;
                int o = i % 10;
                if (h - t == t - o) {
                    count++;
                }
            }
            bw.write(count + "");
        }
        bw.close();
    }
}