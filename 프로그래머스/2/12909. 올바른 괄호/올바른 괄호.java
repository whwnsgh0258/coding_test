class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String[] str = s.split("");
        
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("(")) {
                count++;
            } else if (str[i].equals(")")) {
                count--;
            }
            
            if (count < 0) {
                return false;
            }
        }
        if (count != 0) {
            return false;
        } else {
            return answer;
        }
    }
}