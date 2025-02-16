import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    List<String> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(bf.readLine());
    }
    for (int i = 0; i < list.size(); i++) {
      String s = list.get(i);
      StringBuilder sb = new StringBuilder(s).reverse();
      String reverse = sb.toString();
      if (list.contains(reverse)) {
        String[] s2 = reverse.split("");
        int n2 = s2.length/2;
        System.out.println(reverse.length() + " " + s2[n2]);
        break;
      }
    }
  }
}
