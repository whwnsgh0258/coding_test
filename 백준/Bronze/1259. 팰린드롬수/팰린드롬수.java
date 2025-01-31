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

    while (!list.contains(Integer.valueOf(0))) {
      list.add(Integer.parseInt(bf.readLine()));
    }

    for (int i = 0; i < list.size() - 1; i++) {
      int[] reverse = new int[list.size() - 1];
      reverse[i] = Integer.parseInt(new StringBuilder(String.valueOf(list.get(i))).reverse().toString());

      sb.append(reverse[i] == list.get(i) ? "yes\n" : "no\n");
    }

    System.out.println(sb);
  }

}
