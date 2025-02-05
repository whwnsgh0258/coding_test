import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    long n = Long.parseLong(bf.readLine());
    long r = 1;
    long count = 1;
    while (r < n) {
      r += 6 * count;
      count++;
    }
    System.out.println(count);
  }
}
