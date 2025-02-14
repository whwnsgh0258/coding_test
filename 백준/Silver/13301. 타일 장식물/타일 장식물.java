import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n1 = Integer.parseInt(bf.readLine());
    long[] n2 = new long[n1 + 1];
    if (n1 == 1) {
      System.out.println(4);
        return;
    }
    for (int i = 2; i <= n1; i++) {
      n2[0] = 1;
      n2[1] = 1;
      n2[i] = n2[i - 1] + n2[i - 2];
    }
    long r = (n2[n1] + n2[n1 - 1]) * 2;
    System.out.println(r);
  }
}
