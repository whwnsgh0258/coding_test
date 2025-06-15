import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(bf.readLine());
        int[] fibo = new int[n + 1];

        if (n == 0) {
            bw.write("0");
        } else if (n == 1) {
            bw.write("1");
        } else {
            fibo[0] = 0;
            fibo[1] = 1;
            for (int i = 2; i < fibo.length; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
            bw.write(fibo[n] + "");
        }
        bw.close();
    }
}
