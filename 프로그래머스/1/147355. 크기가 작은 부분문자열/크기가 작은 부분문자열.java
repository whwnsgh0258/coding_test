class Solution {
    public int solution(String t, String p) {
        int pLen = p.length();
        Long pNum = Long.parseLong(p);
        int count = 0;
        
        for(int i=0; i <= t.length() - pLen; i++){
            String subStr = t.substring(i, i + pLen);
            long subNum = Long.parseLong(subStr);
            if (subNum <= pNum) {
                count++;
            }
        }
        return count;
    }
}