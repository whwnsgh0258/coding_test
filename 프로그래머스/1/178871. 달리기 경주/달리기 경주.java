import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> idxMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            idxMap.put(players[i], i);
        }
        for (String calling : callings) {
            int idx = idxMap.get(calling);
            if (idx > 0) {
                String changePlayer = players[idx - 1];
                players[idx] = changePlayer;
                players[idx - 1] = calling;
                idxMap.put(calling, idx - 1);
                idxMap.put(changePlayer, idx);
            }
        }
        return players;
    }
}