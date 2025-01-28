import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    boolean[] isPresent = new boolean[2000001];

    for (int i = 0; i < n; i++) {
      int nums = Integer.parseInt(br.readLine());
      isPresent[nums + 1000000] = true;
    }

    for (int i = 0; i < isPresent.length; i++) {
      if (isPresent[i]){
        sb.append(i - 1000000).append("\n");
      }
    }
    System.out.println(sb);
  }
}
