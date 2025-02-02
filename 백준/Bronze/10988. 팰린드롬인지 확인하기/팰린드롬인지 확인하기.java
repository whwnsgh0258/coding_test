import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String str = bf.readLine();

    char[] arr = str.toCharArray();
    List<Character> list = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();

    for (char c : arr) {
      list.add(c);
    }

    Collections.reverse(list);

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == arr[i]) {
        list1.add(1);
      } else {
        list1.add(0);
      }
    }

    if (list1.contains(0)){
      System.out.println(0);
    } else {
      System.out.println(1);
    }
  }
}
