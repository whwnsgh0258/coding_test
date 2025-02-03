import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String s = bf.readLine();
    String[] str = s.split("");

    for (char c = 'a'; c <= 'z'; c++) {
      int index = -1;
      for (int i = 0; i < str.length; i++) {
        if (str[i].equals(String.valueOf(c))) {
          index = i;
          break;
        }
      }
      sb.append(index + " ");
    }
    System.out.println(sb);
  }
}
