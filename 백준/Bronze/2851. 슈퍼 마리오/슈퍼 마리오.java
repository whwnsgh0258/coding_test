import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    int result1 = 0;
    int result2 = 0;
    for (int i = 0; i < 10; i++) {
      int n = Integer.parseInt(bf.readLine());
      if (result1 < 100) {
        result2 = result1; // 0  10 30 60
        result1 += n;      // 10 30 60 100
      } else {
        break;
      }
    }
    if (100 - result2 < result1 - 100) {
      bw.write(result2 + "");
    } else if ((100 - result2 > result1 - 100) || (100 - result2 == result1 - 100)) {
      bw.write(result1 + "");
    }
    bw.close();
  }
}
