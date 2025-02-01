import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while (true) {
      StringTokenizer st = new StringTokenizer(bf.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      if (a == 0 && b == 0 && c == 0) break;

      int[] sides = {a, b, c};
      
      Arrays.sort(sides);

      if ((int) Math.pow(sides[0], 2) + (int) Math.pow(sides[1], 2) == (int) Math.pow(sides[2],
          2)) {
        sb.append("right\n");
      } else {
        sb.append("wrong\n");
      }
    }
    System.out.println(sb);
  }
}
