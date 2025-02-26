import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String s = bf.readLine();
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (i < s.length() - 1) {
        if (s.charAt(i) == 'c') {
          if (s.charAt(i + 1) == '-') {
            i++;
          } else if (s.charAt(i + 1) == '='){
            i++;
          }
        } else if (s.charAt(i) == 'd') {
          if (i < s.length() - 2 && s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '=') {
            i += 2;
          } else if (s.charAt(i + 1) == '-') {
            i++;
          }
        } else if (s.charAt(i + 1) == 'j') {
          if (s.charAt(i) == 'l' || s.charAt(i) == 'n') {
            i++;
          }
        } else if (s.charAt(i + 1) == '=') {
          if (s.charAt(i) == 's' || s.charAt(i) == 'z') {
            i++;
          }
        }
      }
      count++;
    }
    System.out.println(count);
    bf.close();
  }
}
