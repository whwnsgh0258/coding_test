import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());
        int count = 0;
        
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 1; i < n; i++) {
            pQ.offer(Integer.parseInt(bf.readLine()));
        }
        if(n == 1) {
            System.out.print(0);
        }
        
        while (!pQ.isEmpty()) {
            int poll = pQ.poll();
            if (poll < m) {
                System.out.print(count);
                break;
            } else {
                poll--;
                pQ.offer(poll);
                count++;
                m++;
            }
        }
    }
}