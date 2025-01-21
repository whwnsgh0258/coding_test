import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int score = 0;
    int bonus = 0;
    String s = sc.next();

    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == 'O') {
          score += i + 1;
          score += bonus;
          bonus++;
      } if (s.charAt(i) == 'X') {
          bonus = 0;
      }
    }
    System.out.println(score);
  }
}
