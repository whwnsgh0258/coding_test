import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] resultNum = Arrays.stream(nums).distinct().toArray();
        Arrays.sort(resultNum);
        for (int i = 0; i < resultNum.length; i++) {
            System.out.println(resultNum[i]);
        }
    }
}