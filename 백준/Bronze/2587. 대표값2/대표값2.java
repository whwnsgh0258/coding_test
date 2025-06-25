import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        int[] nums = new int[5];
        int sum = 0;
        int avg = 0;
        
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(bf.readLine());
            sum += nums[i];
        }
        avg = sum / 5;
        
        Arrays.sort(nums);
        bw.write(avg + "\n");
        bw.write(nums[2] + "");
        
        bw.close();
    }
}