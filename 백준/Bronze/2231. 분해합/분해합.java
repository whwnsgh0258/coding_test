import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    int r = 0;
    for (int i = 0; i < n; i++) {
      if (i + sumOfDigits(i) == n) {
        r = i;
        break;
      }
    }
    System.out.println(r);
  }
    private static int sumOfDigits(int i) {
    int sum = 0;
    while (i != 0) {
      sum += i % 10;
      i /= 10;
    }
    return sum;
  }
}
