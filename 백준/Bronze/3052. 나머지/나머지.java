import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int n = 10;
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(bf.readLine());
      list.add(num % 42);
    }
    List<Integer> newList = list.stream().distinct().collect(Collectors.toList());

    System.out.println(newList.size());
  }
}