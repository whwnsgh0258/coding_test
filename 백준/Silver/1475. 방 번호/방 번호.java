import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String s = bf.readLine();
    String[] str = s.split("");
    for (int i = 0; i < str.length; i++) {
      if (str[i].equals("6")) {
        str[i] = "9";
      }
    }
    List<String > list = Arrays.asList(str);
    int max = 0;
    for (int i = 0; i < str.length; i++) {
      int count = Collections.frequency(list, str[i]);
      if (str[i].equals("9")) {
        if (count % 2 == 0) {
          count /= 2;
        } else {
          count /=2;
          count++;
        }
      }
      if (count >= max) {
        max = count;
      }
    }
    bw.write(max + "");
    bw.close();
  }
}
