import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        int[] b = new int[m];

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                sb.append(a[i++]).append(" ");
            } else {
                sb.append(b[j++]).append(" ");
            }
        }

        while (i < n) sb.append(a[i++]).append(" ");
        while (j < m) sb.append(b[j++]).append(" ");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}