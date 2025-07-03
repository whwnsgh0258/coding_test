import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int caseNum = 1;
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if (L == 0 && P == 0 && V == 0) break;

            int fullPeriods = V / P;
            int remainderDays = V % P;
            int result = fullPeriods * L + Math.min(remainderDays, L);

            sb.append("Case ").append(caseNum++).append(": ").append(result).append("\n");
        }
        bw.write(sb.toString());
        bw.close();
    }
}