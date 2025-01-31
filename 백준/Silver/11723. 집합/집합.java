import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    List<Integer> list = new ArrayList<>();
    int n = Integer.parseInt(bf.readLine());

    for (int i = 0; i < n; i++) {

      String str = bf.readLine();
      int x;

      if (str.contains("add ")) {
        x = Integer.parseInt(str.replace("add ", ""));
        list.add(x);
      } else if (str.contains("remove ")) {
        x = Integer.parseInt(str.replace("remove ", ""));
        list.remove(Integer.valueOf(x));
      } else if (str.contains("check ")) {
        x = Integer.parseInt(str.replace("check ", ""));
        sb.append(list.contains(x) ? "1\n" : "0\n");
      } else if (str.contains("toggle ")) {
        x = Integer.parseInt(str.replace("toggle ", ""));
        if (list.contains(x)) {
          list.remove(Integer.valueOf(x));
        } else {
          list.add(x);
        }
      } else if (str.equals("all")) {
        list.clear();
        for (int j = 1; j <= 20; j++) {
          list.add(j);
        }
      } else if (str.equals("empty")) {
        list.clear();
      }
    }
      System.out.println(sb);
  }
}
