import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  static int m, n;
  static int[][] field;
  static boolean[][] visited;
  static int[] dy = {-1, 1, 0, 0};
  static int[] dx = {0, 0, -1, 1};

  public static void main(String[] args) throws IOException {
    int t = Integer.parseInt(bf.readLine());

    for (int i = 0; i < t; i++) {
      StringTokenizer st = new StringTokenizer(bf.readLine());
      m = Integer.parseInt(st.nextToken());
      n = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(st.nextToken());

      field = new int[n][m];
      visited = new boolean[n][m];

      for (int k = 0; k < K; k++) {
        st = new StringTokenizer(bf.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        field[y][x] = 1;
      }
      int count = 0;

      for (int j = 0; j < n; j++) {
        for (int k = 0; k < m; k++) {
          if (field[j][k] == 1 && !visited[j][k]) {
            count++;
            dfs(j, k);
          }
        }
      }
      bw.write(count +"\n");
    }
    bw.close();
  }

  static void dfs(int y, int x) {
    visited[y][x] = true;

    for (int i = 0; i < 4; i++) {
      int nextY = y + dy[i];
      int nextX = x + dx[i];

      if (nextY >= 0 && nextY < n && nextX >= 0 && nextX < m) {
        if (field[nextY][nextX] == 1 && !visited[nextY][nextX]) {
          dfs(nextY, nextX);
        }
      }
    }
  }
}
