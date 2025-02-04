import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(bf.readLine());
    List<String> list = new ArrayList<>();
    for (int i = 0; i < t; i++) {
      String s = bf.readLine();
      String[] s1 = s.split("");
      for (int j = 0; j < s1.length; j++) {
        list.add(s1[j]);
        if (list.contains(" ")){
          list.remove(" ");
        }
      }
      int n = Integer.parseInt(list.get(0));
      for (int j = 1; j < list.size(); j++) {
        for (int k = 0; k < n; k++) {
          sb.append(list.get(j));
        }
      }
      sb.append("\n");
      list.clear();
    }
    System.out.println(sb);
  }
}
