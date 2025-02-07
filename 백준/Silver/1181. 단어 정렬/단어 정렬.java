import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(bf.readLine());
    List<String> s = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      s.add(bf.readLine());
    }
    s = s.stream().distinct().collect(Collectors.toList());

    s.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

    for (String str : s) {
      sb.append(str).append("\n");
    }
    System.out.println(sb);
  }
}
