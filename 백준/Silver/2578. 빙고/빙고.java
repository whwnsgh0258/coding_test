import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

  static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    Map<Integer, int[]> map = new HashMap<>();
    int[] rowCount = new int[5];
    int[] colCount = new int[5];
    int[] diagCount = new int[2];
    StringTokenizer st = null;
    for (int i = 0; i < 5; i++) {
      st = new StringTokenizer(bf.readLine());
      for (int j = 0; j < 5; j++) {
        int n = Integer.parseInt(st.nextToken());

        map.put(n, new int[]{i, j});
      }
    }
    int call_count = 0;
    int total_count = 0;
    for (int i = 0; i < 25; i++) {
      if (i % 5 == 0) {
        st = new StringTokenizer(bf.readLine());
      }
      int called_number = Integer.parseInt(st.nextToken());
      call_count++;

      int[] pos = map.get(called_number);
      int r = pos[0];
      int c = pos[1];

      rowCount[r]++;
      if (rowCount[r] == 5) {
        total_count++;
      }
      colCount[c]++;
      if (colCount[c] == 5) {
        total_count++;
      }
      if (r == c) {
        diagCount[0]++;
        if (diagCount[0] == 5) {
          total_count++;
        }
      }

      if (r + c == 5 - 1) {
        diagCount[1]++;
        if (diagCount[1] == 5) {
          total_count++;
        }
      }

      if (total_count >= 3) {
        bw.write(call_count + "");
        bw.close();
        return;
      }
    }
  }
}
