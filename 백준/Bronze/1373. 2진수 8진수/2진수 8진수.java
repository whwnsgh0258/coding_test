import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    String binary = bf.readLine().trim();

    int len = binary.length();
    int pad = (3 - len % 3) % 3;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < pad; i++)
      sb.append('0');
    sb.append(binary);
    String padded = sb.toString();

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < padded.length(); i += 3) {
      int val = (padded.charAt(i) - '0') * 4
          + (padded.charAt(i + 1) - '0') * 2
          + (padded.charAt(i + 2) - '0');
      result.append(val);
    }
    String res = result.toString();
    int idx = 0;
    while (idx < res.length() && res.charAt(idx) == '0') idx++;
    if (idx == res.length()) {
      System.out.println("0");
    } else {
      System.out.println(res.substring(idx));
    }
  }
}
