import java.io.*;

public class Main {

    static int n, m;
    static int[] result;
    static boolean[] visited;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        result = new int[m];
        visited = new boolean[n + 1];

        backtrack(0);

        bw.flush();
        bw.close();
    }

    static void backtrack(int depth) throws IOException {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                bw.write(result[i] + " ");
            }
            bw.newLine();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = i;
                backtrack(depth + 1);
                visited[i] = false;
            }
        }
    }
}