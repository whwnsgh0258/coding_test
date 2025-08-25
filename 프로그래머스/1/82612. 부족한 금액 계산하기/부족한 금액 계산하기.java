class Solution {
    public long solution(int price, int money, int count) {
        long total = price;
        long temp = price;
        for (int i = 1; i < count; i++) {
            temp += price;
            total += temp;
        }

        return total >= money ? total - money : 0;
    }
}