class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    private static void dfs (int[] numbers, int target, int idx, int sum) {
        if (idx == numbers.length) {
            if (sum == target) answer++;
            return;
        }
        
        // 더할때
        dfs(numbers, target, idx + 1, sum + numbers[idx]);
        // 뺄때
        dfs(numbers, target, idx + 1, sum - numbers[idx]);
    }
}