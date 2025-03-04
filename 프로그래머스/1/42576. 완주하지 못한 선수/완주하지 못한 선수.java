import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String[] arrP = Arrays.stream(participant).sorted().toArray(String[]::new);
        String[] arrC = Arrays.stream(completion).sorted().toArray(String[]::new);
        int idx = 0;
        for (int i = 0; i < arrP.length; i++) {
            if (i < arrP.length - 1) {
                if (!Objects.equals(arrP[i], arrC[i])) {
                    idx = i;
                    break;
                }
            } else {
                idx = i;
            }
        }
        return arrP[idx];
    }
}