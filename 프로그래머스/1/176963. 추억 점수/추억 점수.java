import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; photo.length>i; i++){
            for(int j = 0; photo[i].length>j; j++){
                for(int k = 0; name.length>k; k++){
                    if(photo[i][j].equals(name[k]))
                       answer[i] += yearning[k];
                }
            }
        }
        return answer;
    }
}