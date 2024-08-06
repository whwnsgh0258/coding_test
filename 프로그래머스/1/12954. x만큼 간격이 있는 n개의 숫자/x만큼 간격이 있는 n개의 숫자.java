class Solution {
    public long[] solution(int x, int n) {
        if(n<=0){
            System.out.println("n must be a natural number (greater than 0).");
        }
        if(-10000000>= x || x>=10000000){
            System.out.println("n must be a natural number (greater than 0).");
        }
        long[] answer = new long[n];
        
        for(int i = 0; i<n; i++) {
            answer[i] = (long)x*(i+1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(answer[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        return answer;
    }
}