import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    String s = bf.readLine();
    String[] str = s.split(" ");
    int[] a = new int[str.length];
    int count = 0;
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(str[i]);
    }
    for (int i = 0; i < a.length; i++) {
      if (a[i] < 2) count++;
      for (int j = 2; j < a[i]; j++) {
        if (a[i] % j == 0) {
          count++;
          break;
        }
      }
    }
    System.out.println(str.length - count);
  }
}
