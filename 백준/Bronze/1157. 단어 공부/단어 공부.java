import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String s = bf.readLine().toLowerCase();
    int[] count = new int[26];

    for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i) - 'a']++;
    }
    if (s.length() == 1) {
      System.out.print(s.toUpperCase());
      return;
    }
    int max = 0;
    char result = '?';
    for (int i = 0; i < 26; i++) {
      if (count[i] > max) {
        max = count[i];
        result = (char) (i + 'A');
      } else if (count[i] == max) {
        result = '?';
      }
    }
    System.out.println(result);
  }
}
