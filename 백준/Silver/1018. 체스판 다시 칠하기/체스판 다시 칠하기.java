import java.io.*;

public class Main {
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sizes = br.readLine().split(" ");
        int n = Integer.parseInt(sizes[0]);
        int m = Integer.parseInt(sizes[1]);

        board = new char[n][m];

        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                minCount = Math.min(minCount, repaintCount(i, j));
            }
        }

        System.out.println(minCount);
    }

    static int repaintCount(int x, int y) {
        int count1 = 0;
        int count2 = 0;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'W') count1++;
                    if (board[i][j] != 'B') count2++;
                } else {
                    if (board[i][j] != 'B') count1++;
                    if (board[i][j] != 'W') count2++;
                }
            }
        }
        return Math.min(count1, count2);
    }
}