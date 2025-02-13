import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int t = Integer.parseInt(bf.readLine());
    for (int i = 0; i < t; i++) {
      String s = bf.readLine();
      String[] str = s.split(" ");
      int n1 = Integer.parseInt(str[0]);
      int n2 = Integer.parseInt(str[1]);
      sb.append(n1 * n2 /gcd(n1, n2)).append("\n");
    }
    System.out.println(sb);
  }

  private static int gcd(int n2, int n1) {
    while (n2 != 0) {
      int r = n1 % n2;
      n1 = n2;
      n2 = r;
    }
    return n1;
  }
}
