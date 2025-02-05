import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(bf.readLine());
    String str = bf.readLine();
    String[] strs = str.split(" ");
    int[] s = new int[strs.length];
    String str2 = bf.readLine();
    String[] strs2 = str2.split(" ");
    int t = Integer.parseInt(strs2[0]);
    int p = Integer.parseInt(strs2[1]);
    int tCount = 0;

    for (int i = 0; i < s.length; i++) {
      s[i] = Integer.parseInt(strs[i]);
    }
    for (int i = 0; i < s.length; i++) {
      tCount += (s[i] + t -1)/t;
    }
    int pCount = n / p;
    int p2Count = n % p;
    sb.append(tCount + "\n" + pCount + " " + p2Count);
    System.out.println(sb);
  }
}