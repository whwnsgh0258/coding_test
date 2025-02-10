import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    int count = 0;
    for (int i = 0; i < n; i++) {
      String s = bf.readLine();
      if (isGroupWord(s)) {
        count++;
      }
    }
    System.out.println(count);
  }

  private static boolean isGroupWord(String s) {
    boolean[] seen = new boolean[26];
    char prev = '\0';
    for (char c : s.toCharArray()) {
      if (c != prev) {
        if (seen[c - 'a']) {
          return false;
        }
        seen[c- 'a'] = true;
        prev = c;
      }
    }
    return true;
  }
}
