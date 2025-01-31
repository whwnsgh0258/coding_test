import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int result = 0;
    int m = ((n / 10) + n % 10) + (n % 10) * 10;
    if (n == 0) {
      System.out.println(1);
      return;
    }
    List<Integer> list = new ArrayList<>();
    if (n != m && (n / 10) + n % 10 < 10) {
      result++;
      list.add(m);
    } else if (n != m && (n / 10) + n % 10 >= 10) {
      result++;
      m = (((n / 10) + n % 10) - 10) + (n % 10) * 10;
      list.add(m);
    }
    while(list.get(list.size()-1) != n) {
      if ((m / 10) + m % 10 < 10) {
        result++;
        m = ((m / 10) + m % 10) + (m % 10) * 10;
        list.add(m);
      } else if ((m / 10) + m % 10 >= 10) {
        result++;
        m = (((m / 10) + m % 10) - 10) + (m % 10) * 10;
        list.add(m);
      }
    }
    System.out.println(result);
  }
}
