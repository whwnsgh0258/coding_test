import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String str = bf.readLine();

    String[] strs = str.split(" ");

    int e = Integer.parseInt(strs[0]);
    int s = Integer.parseInt(strs[1]);
    int m = Integer.parseInt(strs[2]);
    int[] y = {0, 0, 0};
    int count = 1;
    if (e == 1 && s == 1 && m == 1) {
      System.out.println(count);
      return;
    }
    while (true) {
      y[0] = y[0] < 15 ? y[0] + 1 : 1;
      y[1] = y[1] < 28 ? y[1] + 1 : 1;
      y[2] = y[2] < 19 ? y[2] + 1 : 1;

      if (y[0] == e && y[1] == s && y[2] == m) {
        break;
      } else {
        count ++;
      }
    }
    System.out.println(count);
  }
}
