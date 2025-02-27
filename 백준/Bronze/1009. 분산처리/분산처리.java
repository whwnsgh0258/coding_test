import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(bf.readLine());

    for (int i = 0; i < t; i++) {
      StringTokenizer st = new StringTokenizer(bf.readLine());
      int a = Integer.parseInt(st.nextToken()) % 10;
      int b = Integer.parseInt(st.nextToken());
      if (a == 0) {
        bw.write("10\n");
        continue;
      }
      int lastDigit = modPow(a, b);
      bw.write(lastDigit + "\n");
    }
    bw.close();
  }

  private static int modPow(int a, int b) {
    int r = 1;
    while (b > 0) {
      if (b % 2 != 0) {
        r = (r * a) % 10;
      }
      a = (a * a) % 10;
      b /= 2;
    }
    return r;
  }
}
