import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(bf.readLine());
    int i = 2;
    while (true) {
      if (n % i == 0) {
        n /= i;
        sb.append(i).append("\n");
      } else {
        i++;
      }
      if (n == 1) {
        break;
      }
    }
    System.out.print(sb);
  }
}