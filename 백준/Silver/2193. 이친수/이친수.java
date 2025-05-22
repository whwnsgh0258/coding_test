import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    int n = Integer.parseInt(bf.readLine());
    long[] dp = new long[n + 1];
    dp[1] = 1;
    if (n >= 2) dp[2] = 1;
      for (int i = 3; i <= n; i++) {
        dp[i] = dp[i - 2] + dp[i - 1];
      }
    System.out.println(dp[n]);
  }
}
