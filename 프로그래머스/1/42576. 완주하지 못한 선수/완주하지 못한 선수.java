import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int idx = 0;
        for (int i = 0; i < participant.length; i++) {
            if (i < participant.length - 1) {
                if (!Objects.equals(participant[i], completion[i])) {
                    idx = i;
                    break;
                }
            } else {
                idx = i;
            }
        }
        return participant[idx];
    }
}