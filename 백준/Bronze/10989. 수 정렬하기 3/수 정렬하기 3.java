import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    int[] count = new int[1000000];

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(br.readLine());
      count[num]++;
    }


    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        sb.append(i).append("\n");
        count[i]--;
      }
    }
    System.out.println(sb);
  }
}
