import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> queue = new LinkedList<>();
        queue.offer(arr[0]);
        for (int n : arr) {
            if (queue.peekLast() != n) {
                queue.offer(n);
            }
        }
        int[] answer = new int[queue.size()];
        int qS = queue.size();
        for (int i = 0; i < qS; i++) {
            answer[i] = queue.poll();
        }
        return Arrays.stream(answer).toArray();
    }
}