import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bf.readLine());
    int[] nums = new int[n];

    StringTokenizer st = new StringTokenizer(bf.readLine());

    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(st.nextToken());
    }
    int x = Integer.parseInt(bf.readLine());

    Arrays.sort(nums);
    int count = 0;
    int i = 0;
    int j = n - 1;

    while(i < j) {
      int sum = nums[i] + nums[j];
      if (sum == x) {
        count++;
        i++;
        j--;
      } else if (sum < x) {
        i++;
      } else {
        j--;
      }
    }
    System.out.println(count);
  }
}
