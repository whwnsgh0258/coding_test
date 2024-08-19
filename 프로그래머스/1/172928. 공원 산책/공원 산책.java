import java.util.Arrays;
import java.util.StringTokenizer;
class Solution {
   static String[][] arr; // 공원을 2차배열로 나타냄
    public static void main(String[] args) {
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};
        System.out.println(Arrays.toString(solution(park, routes)));
    }

    // 동 E 서 W 남 S 북 N
    static public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        String[] a = park[0].split("");

        arr = new String[park.length][a.length];

        for (int i = 0; i < park.length; i++) {
            String[] str = park[i].split("");
            System.arraycopy(str, 0, arr[i], 0, a.length);
        }

        int x = 0;
        int y = 0;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (arr[i][j].equals("S")) {
                    x = i;
                    y = j;
                }
            }
        }

        for (String route : routes) {
            StringTokenizer st = new StringTokenizer(route);
            String location = st.nextToken();

            int size = Integer.parseInt(st.nextToken());

            boolean check = false;
            switch (location) {
                case "E" -> {
                    if (y + size < 0 || y + size >= a.length) {
                        break;
                    }
                    for (int j = y + 1; j <= y + size; j++) {
                        if (arr[x][j].equals("X")) {
                            check = true;
                            break;
                        }
                    }
                    if (!check) y = y + size;
                }
                case "W" -> {
                    if (y - size < 0 || y - size >= a.length) {
                        break;
                    }
                    for (int j = y - 1; j >= y - size; j--) {
                        if (arr[x][j].equals("X")) {
                            check = true;
                            break;
                        }
                    }
                    if (!check) y = y - size;
                }
                case "S" -> {
                    if (x + size < 0 || x + size >= park.length) {
                        break;
                    }
                    for (int j = x + 1; j <= x + size; j++) {
                        if (arr[j][y].equals("X")) {
                            check = true;
                            break;
                        }
                    }
                    if (!check) x = x + size;
                }
                case "N" -> { // "N"
                    if (x - size < 0 || x - size >= park.length) {
                        break;
                    }
                    for (int j = x - 1; j >= x - size; j--) {
                        if (arr[j][y].equals("X")) {
                            check = true;
                            break;
                        }
                    }
                    if (!check) x = x - size;
                }
            }

        }

        answer[0] = x;
        answer[1] = y;

        return answer;
    }
}