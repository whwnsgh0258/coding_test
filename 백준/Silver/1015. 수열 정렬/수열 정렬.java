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
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            int idx = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] > a[j]) {
                    idx++;
                } else if (a[i] == a[j]) {
                    if (i > j) {
                        idx++;
                    }
                }
                if (j == n - 1) {
                    bw.write(idx++ + " ");
                }
            }
        }
        bw.close();
        bf.close();
    }
}