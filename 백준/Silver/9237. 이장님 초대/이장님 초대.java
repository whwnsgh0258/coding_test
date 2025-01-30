import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] t = new int[n];

    for (int i = 0; i < n; i++) {
      t[i] = sc.nextInt();
    }

    Arrays.sort(t);
    for (int i = 0; i < n / 2; i++) {
      int temp = t[i];
      t[i] = t[n - 1 - i];
      t[n - 1 - i] = temp;
    }

    int maxDays = 0;
    for (int i = 0; i < n; i++) {
      maxDays = Math.max(maxDays, t[i] + i + 1);
    }

    System.out.println(maxDays + 1);
  }
}
