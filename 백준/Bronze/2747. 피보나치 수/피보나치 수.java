import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        if (n == 1) {
            System.out.println(1);
        } else if (n == 0) {
            System.out.println(0);
        } else {
            for (int i = 2; i <= n; i++) {
                a[0] = 0;
                a[1] = 1;
                a[i] = a[i-1] + a[i-2];
            }
            System.out.println(a[n]);
        }
    }
}