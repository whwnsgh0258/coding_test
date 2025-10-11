import java.io.*;
import java.util.StringTokenizer;

public class Main {

  static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(bf.readLine());
    int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    int[][] num = new int[n + 1][m + 1];

    for (int i = 1; i <= n; i++) {
      st = new StringTokenizer(bf.readLine());
      for (int j = 1; j <= m; j++) {
        num[i][j] = num[i - 1][j] + num[i][j - 1] - num[i - 1][j - 1] + Integer.parseInt(
            st.nextToken());
      }
    }
    int k = Integer.parseInt(bf.readLine());
    for (int q = 0; q < k; q++) {
      st = new StringTokenizer(bf.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      int sum = num[x][y]
          - num[i - 1][y]
          - num[x][j - 1]
          + num[i - 1][j - 1];
      bw.write(sum + " \n");
    }
    bw.close();
  }
}
