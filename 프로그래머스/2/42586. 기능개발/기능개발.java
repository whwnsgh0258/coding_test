import java.util.*;

class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> days = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int r = 100 - progresses[i];
            int day = (int) Math.ceil((double) r / speeds[i]);
            days.add(day);
        }
        while (!days.isEmpty()) {
            int current = days.poll();
            int count = 1;
            while (!days.isEmpty() && days.peek() <= current) {
                days.poll();
                count++;
            }
            list.add(count);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}