import java.util.Scanner;
import java.math.BigInteger;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigInteger r = BigInteger.ONE;
    for (int i = 1; i <= n; i++) {
      r = BigInteger.valueOf(i).multiply(r);
    }
    String s = String.valueOf(r);
    String[] str = s.split("");
    for (int i = str.length - 1; i >= 0; i--) {
      if (!str[i].equals("0")) {
        System.out.println(str.length - (i + 1));
        break;
      }
    }
  }
}
