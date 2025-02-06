import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int t = Integer.parseInt(bf.readLine());
    for (int i = 0; i < t; i++) {
      int k = Integer.parseInt(bf.readLine());
      int n = Integer.parseInt(bf.readLine());
      int[][] nk = new int[k + 1][n];

      for (int j = 0; j < n; j++) {
        nk[0][j] = j + 1;
      }
      for (int j = 1; j < k + 1; j++) {
        int r = 0;
        for (int l = 0; l < n; l++) {
          r += nk[j - 1][l];
          nk[j][l] = r;
        }
      }
      sb.append(nk[k][n - 1] + "\n");
    }
    System.out.println(sb);
  }
}
