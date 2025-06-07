import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] result;
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, m;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        result = new int[m];
        backtrack(1, 0);
        bw.flush();
        bw.close();
    }

    static void backtrack(int start, int depth) throws IOException {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                bw.write(result[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = start; i <= n; i++) {
            result[depth] = i;
            backtrack(i + 1, depth + 1);
        }
    }
}