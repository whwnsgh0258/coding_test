import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    int t = Integer.parseInt(bf.readLine());
    for (int i = 0; i < t; i++) {
      String s = bf.readLine();
      String[] str = s.split(" ");
      for (String string : str) {
        StringBuilder sb = new StringBuilder(string);
        bw.write(sb.reverse() + " ");
      }
      if (i + 1 >= t) {
        bw.close();
      } else {
        bw.write("\n");
      }
    }
  }
}
