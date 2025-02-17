import java.util.Queue;
import java.util.LinkedList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(bf.readLine());
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
            if(!queue.isEmpty()) {
                queue.offer(queue.poll());
            }
        }
        System.out.print(sb);
    }
}