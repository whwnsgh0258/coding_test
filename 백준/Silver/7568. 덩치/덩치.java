import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(bf.readLine());
        int[][] xy = new int[t][2];
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < 2; j++) {
                xy[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < t; i++) {
            int r = 1;
            for (int j = 0; j < t; j++) {
                if (xy[i][0] < xy[j][0] && xy[i][1] < xy[j][1]) {
                    r++;
                }
            }
            bw.write(r + " ");
        }
        bw.close();
    }
}