import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    int n = Integer.parseInt(bf.readLine());
    int m = Integer.parseInt(bf.readLine());
    StringTokenizer st = new StringTokenizer(bf.readLine());
    int[] nums = new int[n];

    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(nums);
    int c = 0;
    int start = 0;
    int end = n - 1;

    while (start < end) {
      int sum = nums[start] + nums[end];

      if (sum == m) {
        c++;
        start++;
        end--;
      } else if (sum < m) {
        start++;
      } else {
        end--;
      }
    }
    bw.write(c + "");
    bw.close();
  }
}
