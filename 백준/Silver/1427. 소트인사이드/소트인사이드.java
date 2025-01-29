import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        int[] nums = new int[input.length()];
        
        for (int i = 0; i < input.length(); i++) {
            nums[i] = input.charAt(i) - '0';
        }
        nums = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        
        for (int n : nums) {
            System.out.print(n);
        }
    }
}