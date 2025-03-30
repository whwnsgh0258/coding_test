import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), count = 0;
        int[] nums = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        
        while(count < n) {
            for (int i = 0; i < k; i++) {
                if (i == k - 1) {
                    nums[count] = queue.poll();
                    count++;
                } else {
                    queue.offer(queue.poll());
                }
            }
        }
        bw.write("<");
        for(int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                bw.write(nums[i] + "");
            } else {
                bw.write(nums[i] + ", ");
            }
        }
        bw.write(">");
        bw.close();
    }
}