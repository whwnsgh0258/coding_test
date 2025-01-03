import java.util.Arrays;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int x = bandage[2];
    int y = bandage[1];
    int t = bandage[0];

    int currantHealth = health;


    int attackIndex = 0;
    int successfulTime = 0;

    for (int time = 0; attackIndex < attacks.length || successfulTime > 0; time++) {
      if (attackIndex < attacks.length && attacks[attackIndex][0] == time) {
        currantHealth -= attacks[attackIndex][1];
        if (currantHealth <= 0) {
          return -1;
        }
        successfulTime = 0;
        attackIndex++;
        continue;
      }
      if (successfulTime < t) {
        currantHealth = Math.min(health, currantHealth + y);
        successfulTime++;
      }
      if (successfulTime == t) {
        currantHealth = Math.min(health, currantHealth + x);
        successfulTime = 0;
      }
    }
    return currantHealth;
    }
}