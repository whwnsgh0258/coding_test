import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int sum = 0;
    int[] a = new int[n + 1];
    int[] b = new int[n + 1];

    for (int i = 1; i <= n; i++) {
      b[i] = sc.nextInt();

      sum += a[i - 1];
      a[i] = b[i] * i - sum;
    }
    for (int i = 1; i <= n; i++) {
      System.out.print(a[i] + " ");
    }
  }
}