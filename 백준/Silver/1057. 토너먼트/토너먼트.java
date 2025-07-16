import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int kim = Integer.parseInt(st.nextToken());
        int lim = Integer.parseInt(st.nextToken());
        int round = 1;

        while (kim != lim) {
            kim = (kim + 1) / 2;
            lim = (lim + 1) / 2;
            round++;
        }
        bw.write(round - 1 + "");
        bw.close();
    }
}