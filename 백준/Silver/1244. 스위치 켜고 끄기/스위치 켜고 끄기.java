import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    int n = Integer.parseInt(bf.readLine());
    StringTokenizer st = new StringTokenizer(bf.readLine());
    int[] s = new int[n + 1];

    for (int i = 1; i <= n; i++) {
      s[i] = Integer.parseInt(st.nextToken());
    }
    int student = Integer.parseInt(bf.readLine());

    for (int i = 0; i < student; i++) {
      st = new StringTokenizer(bf.readLine());
      int type = Integer.parseInt(st.nextToken());
      int num = Integer.parseInt(st.nextToken());
      if (type == 1) {
        male(s, n, num);
      } else {
        female(s, n, num);
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= n; i++) {
      sb.append(s[i]);

      if (i % 20 == 0 || i == n) {
        sb.append('\n');
      } else {
        sb.append(' ');
      }
    }
    bw.write(sb.toString());
    bw.close();
  }

  private static void male(int[] s, int n, int i) {
    for (int j = i; j <= n; j += i) {
        toggle_switch(s, j);
    }
  }

  private static void female(int[] s, int n, int i) {
    toggle_switch(s, i);
    int k = 1;
    while (true) {
      int left_idx = i - k;
      int right_idx = i + k;
      if (left_idx < 1 || right_idx > n) {
        break;
      }
      if (s[left_idx] == s[right_idx]) {
        toggle_switch(s, left_idx);
        toggle_switch(s, right_idx);
        k++;
      } else {
        break;
      }
    }
  }

  private static void toggle_switch(int[] s, int index) {
    s[index] = 1 - s[index];
  }
}