import java.util.*;

public class Main {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    int[] w = new int[n+1];
    int[] v = new int[n+1];
    
    for (int i = 1; i <= n; i++) {
        w[i] = sc.nextInt();
        v[i] = sc.nextInt();
    }
    
    int dp[] = new int[k + 1];
    
    for (int i = 1; i <= n; i++) {
        for (int j = k; j >= w[i]; j--) {
            dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
        }
    }
    System.out.println(dp[k]);
    }
}