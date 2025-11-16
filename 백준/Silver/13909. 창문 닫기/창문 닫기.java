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
        int i = 1;
        int c = 0;
        while (i * i <= n) {
            c = c + 1;
            i = i + 1;
        }
        bw.write(c + "");
        bw.close();
    }
}