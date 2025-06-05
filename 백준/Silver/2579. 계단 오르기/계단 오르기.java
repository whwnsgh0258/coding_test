import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(bf.readLine());
        int[] stairs = new int[t + 1];
        int[] dp = new int[t + 1];

        for (int i = 0; i <= t; i++) {
            if (i == 0) stairs[0] = 0;
            else stairs[i] = Integer.parseInt(bf.readLine());
        }

        dp[0] = 0;
        if (t >= 1) dp[1] = stairs[1];
        if (t >= 2) dp[2] = stairs[1] + stairs[2];

        for (int i = 3; i <= t; i++) {
            dp[i] = Math.max(dp[i - 2] + stairs[i], dp[i - 3] + stairs[i - 1] + stairs[i]);
        }
        System.out.println(dp[t]);
    }
}