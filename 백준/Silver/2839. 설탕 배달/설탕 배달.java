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
    int count = 0;
    if (n >= 5) {
      if (n % 5 == 0) {
        bw.write(String.valueOf(n / 5));
      } else {
        if (n % 5 == 1) {
          count = n / 5 - 1;
          bw.write(String.valueOf(count + 2));
        } else if (n % 5 == 2) {
          count = n / 5 - 2;
          if (n == 7) {
            bw.write(String.valueOf(-1));
          } else {
            bw.write(String.valueOf(count + 4));
          }
        } else if (n % 5 == 3) {
          count = n / 5 + 1;
          bw.write(String.valueOf(count));
        } else {
          count = n / 5 - 1;
          bw.write(String.valueOf(count + 3));
        }
      }
    } else {
      if (n % 3 == 0) {
        bw.write(String.valueOf(n / 3));
      } else {
        bw.write(String.valueOf(-1));
      }
    }
    bw.close();
  }
}
