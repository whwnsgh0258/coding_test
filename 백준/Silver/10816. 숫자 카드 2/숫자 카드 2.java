import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(bf.readLine());
    StringTokenizer st = new StringTokenizer(bf.readLine());
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
      int count = 1;
      int n2 = Integer.parseInt(st.nextToken());
      if (map.containsKey(n2)) {
        map.replace(n2, map.get(n2) + 1);
      } else {
        map.put(n2, count);
      }
    }
    int m = Integer.parseInt(bf.readLine());
    st = new StringTokenizer(bf.readLine());
    for (int i = 0; i < m; i++) {
      int m2 = Integer.parseInt(st.nextToken());
      if (map.containsKey(m2)) {
        sb.append(map.get(m2)).append(" ");
      } else {
        sb.append(0).append(" ");
      }
    }
    System.out.println(sb);
  }
}