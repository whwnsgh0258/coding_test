import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    String s = bf.readLine();
    String[] str = s.split("");
    for (int i = 0; i < n - 1; i++) {
      String s2 = bf.readLine();
      String[] str2 = s2.split("");
      for (int j = 0; j < str.length; j++) {
        if (str[j].equals(str2[j])) {
          str[j] = str2[j];
        } else {
          str[j] = "?";
        }
      }
    }
    for (int i = 0; i < str.length; i++) {
      System.out.print(str[i]);
    }
  }
}