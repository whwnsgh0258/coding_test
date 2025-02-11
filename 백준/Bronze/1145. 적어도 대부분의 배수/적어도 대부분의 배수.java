import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String s = bf.readLine();
    String[] str = s.split(" ");
    int[] n = new int[5];
    for (int i = 0; i < 5; i++) {
      n[i] = Integer.parseInt(str[i]);
    }
    int r = 1;
    while (true) {
      int count = 0;
      for (int i = 0; i < 5; i++) {
        if (r % n[i] == 0) {
          count++;
        }
        if (count == 3) {
          System.out.println(r);
          return;
        }
      }
      r++;
    }
  }
}
