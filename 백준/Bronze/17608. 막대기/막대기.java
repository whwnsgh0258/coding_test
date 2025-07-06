import java.io.*;

public class Main {
    
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());
        int[] nums = new int[n];
        int c = 1;
        
        for (int i = n - 1; i >= 0; i--) {
            nums[i] = Integer.parseInt(bf.readLine());
        }
        int temp = nums[0];
        for (int i = 0; i < n - 1; i++) {
            if (temp < nums[i + 1]) {
                temp = nums[i + 1];
                c++;
            }
        }
        bw.write(c + "");
        bw.close();
    }
}