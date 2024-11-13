import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> ponkets = new HashMap<>();
        for(int num : nums){
            ponkets.put(num, ponkets.getOrDefault(num, 0) + 1);
        }
        
        int halfN = nums.length / 2;
        if (halfN <= ponkets.size()) {
            return halfN;
        } else {
            return ponkets.size();
        }
    }
}
