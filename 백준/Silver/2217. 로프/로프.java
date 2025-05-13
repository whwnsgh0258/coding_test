import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bf.readLine());
    Integer[] nums = new Integer[n];

    for (int i = 0; i < n; i++) {
      nums[i] = Integer.parseInt(bf.readLine());
    }
    Arrays.sort(nums, Collections.reverseOrder());
    int max = 0;
    int idx = 1;
    for (int i : nums) {
      if (max < idx * i) {
        max = idx * i;
      }
      idx++;
    }
    System.out.println(max);
  }
}
