import java.util.*;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        while(checkSize(wallet, bill)){
            if(bill[0] < bill[1]){
                bill[1] /= 2;
            } else {
                bill[0] /= 2;
            }
            answer++;
        }
        return answer;
    }
    private boolean checkSize(int[] wallet, int[] bill){
        Arrays.sort(wallet);
        Arrays.sort(bill);
        return wallet[0] < bill[0] || wallet[1] < bill[1];
    }
}