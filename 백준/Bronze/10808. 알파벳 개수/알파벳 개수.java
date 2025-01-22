import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    char[] alphas = new char[26];

    for (int i = 0; i < s.length(); i++) {
      char alpha = s.charAt(i);
      if ('a' <= alpha && alpha <= 'z') {
        alphas[alpha - 'a']++;
      }
    }
    for (char x = 'a'; x <= 'z'; x++) {
      System.out.print((int) alphas[x - 'a'] + " ");
    }
  }
}
