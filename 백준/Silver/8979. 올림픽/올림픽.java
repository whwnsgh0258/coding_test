import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String str = bf.readLine();

    String[] strs = str.split(" ");

    int n = Integer.parseInt(strs[0]);
    int k = Integer.parseInt(strs[1]);
    int[][] c = new int[n][4];
    int[] ranks = new int[n];

    for (int i = 0; i < n; i++) {
      String str2 = bf.readLine();
      String[] strs2 = str2.split(" ");
      for (int j = 0; j < 4; j++) {
        c[i][j] = Integer.parseInt(strs2[j]);
      }
    }
    Arrays.sort(c, new Comparator<int[]>() {
      @Override
      public int compare(int[] a, int[] b) {
        return a[0] - b[0];
      }
    });

    for (int i = 0; i < n; i++) {
      int r = 1;
      for (int j = 0; j < n; j++) {
        if (i == j) {
          continue;
        }
        if (c[i][1] < c[j][1] ||
            (c[i][1] == c[j][1] && c[i][2] < c[j][2]) || (c[i][1] == c[j][1] && c[i][2] == c[j][2]
            && c[i][3] < c[j][3])) {
          r++;
        }
      }
      ranks[i] = r;
    }
    System.out.println(ranks[k-1]);
  }
}
