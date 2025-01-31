import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bf.readLine());
    int o = n;
    int result = 0;
    if (n == 0) {
      System.out.println(1);
      return;
    }

    do {
      n = ((n / 10) + n % 10) % 10 + (n % 10) * 10;
      result++;
    } while (o != n);

    System.out.println(result);
  }
}
