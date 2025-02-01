import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
      
    String str = bf.readLine();
    String[] parts = str.split(" ");
    int n = Integer.parseInt(parts[0]);
    int m = Integer.parseInt(parts[1]);
    int gcd;

    if (n < m) {
      int temp = n;
      n = m;
      m = temp;
    }
    gcd = gcd(n, m);

    sb.append(gcd + "\n");
    sb.append(n * m / gcd);
    System.out.println(sb);
  }

  private static int gcd(int n, int m) {
    int r;
    while (m > 0) {
      r = n % m;
      n = m;
      m = r;
    }
    return n;
  }
}
