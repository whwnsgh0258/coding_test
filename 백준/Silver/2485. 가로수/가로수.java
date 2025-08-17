import java.io.*;

public class Main {

  static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    int n = Integer.parseInt(bf.readLine());
    long[] m = new long[n];
    long[] m2 = new long[n - 1];
    for (int i = 0; i < n; i++) {
      m[i] = Long.parseLong(bf.readLine());
      if (i > 0) {
        m2[i - 1] = m[i] - m[i - 1];
      }
    }
    long arrGcd = gcdArr(m2);

    bw.write(((m[n - 1] - m[0]) / arrGcd + 1) - n + "");
    bw.close();
  }

  private static long gcdArr(long[] arr) {
    long result = arr[0];
    for (int i = 1; i < arr.length; i++) {
      result = gcd(result, arr[i]);
    }
    return result;
  }
  public static long gcd(long a, long b) {
    while (b != 0) {
      long temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}