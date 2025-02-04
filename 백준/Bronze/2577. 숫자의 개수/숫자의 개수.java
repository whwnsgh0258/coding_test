import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int a = Integer.parseInt(bf.readLine());
    int b = Integer.parseInt(bf.readLine());
    int c = Integer.parseInt(bf.readLine());
    int result = a * b * c;
    String s = String.valueOf(result);
    String[] str = s.split("");
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < str.length; i++) {
      list.add(Integer.parseInt(str[i]));
    }
    for (int i = 0; i <= 9; i++) {
      int count = Collections.frequency(list, i);
      sb.append( count+ "\n");
    }
    System.out.println(sb);
  }

}
