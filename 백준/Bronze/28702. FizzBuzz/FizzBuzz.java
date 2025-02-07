import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String[] s = new String[3];
    int r = 0;
    for (int i = 0; i < 3; i++) {
      s[i] = bf.readLine();
    }
    int i = 0;
    while (i < 3) {
      if (s[i].equals("Fizz")) {
        i++;
      } else if (s[i].equals("Buzz")) {
        i++;
      } else if (s[i].equals("FizzBuzz")) {
        i++;
      } else if (s[i].chars().allMatch(Character::isDigit)) {
        r = Integer.parseInt(s[i]);
        for (int j = 0; j < 3 - i; j++) {
          r++;
        }
        if (r % 3 == 0 && r % 5 ==0) {
          System.out.println("FizzBuzz");
          break;
        } else if (r % 3 == 0) {
          System.out.println("Fizz");
          break;
        } else if (r % 5 == 0) {
          System.out.println("Buzz");
          break;
        } else {
          System.out.println(r);
          break;
        }
      }
    }
  }
}