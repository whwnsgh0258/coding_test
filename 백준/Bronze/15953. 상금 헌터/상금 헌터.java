import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] first = {500, 300, 200, 50, 30, 10};
    int[] second = {512, 256, 128, 64, 32};
    int[] firstRank = {1, 3, 6, 10, 15, 21};
    int[] secondRank = {1, 3, 7, 15, 31};

    for (int i = 0; i < n; i++) {
      int money = 0;
      int a = sc.nextInt();
      int b = sc.nextInt();

      if (a > 0 && a <= 21) {
        for (int j = 0; j < firstRank.length; j++) {
          if (a <= firstRank[j]) {
            money += first[j];
            break;
          }
        }
      }
      if (b > 0 && b <= 31) {
        for (int j = 0; j < secondRank.length; j++) {
          if (b <= secondRank[j]) {
            money += second[j];
            break;
          }
        }
      }
      System.out.println(money * 10000);
    }
  }
}
