import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static long[] p = new long[101];

    public static void main(String[] args) throws IOException {

        int t = Integer.parseInt(bf.readLine());
        p[0] = 1;
        p[1] = 1;
        p[2] = 1;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bf.readLine());
            bw.write(pado(n) + "\n");
        }
        bw.close();
    }

    private static long pado(int n) {
        for (int i = 3; i < n; i++) {
            p[i] = p[i - 2] + p[i -3];
        }
        return p[n - 1];
    }
}
