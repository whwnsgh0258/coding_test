import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(bf.readLine());
    String[] str = new String[n];
    List<String> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int result = 0;
      int score = 0;
      str[i] = bf.readLine();
      for (int j = 0; j < str[i].length(); j++) {
        char c = str[i].charAt(j);
        list.add(String.valueOf(c));
      }
      for (int j = 0; j < list.size(); j++) {
        if (list.get(j).equals("O")) {
          result++;
          score += result;
        } else {
          result = 0;
        }
      }
      sb.append(score + "\n");
      list.clear();
    }

    System.out.println(sb);
  }
}
