import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(bf.readLine());
    for (int i = 0; i < n; i++) {
      int count = 0;
      String s = bf.readLine();
      for (char c : s.toCharArray()) {
        if (c == '(') count++;
        else count--;
        if (count < 0) break;
      }
      bw.write(count == 0 ? "YES\n" : "NO\n");
    }
    bw.close();
  }
}