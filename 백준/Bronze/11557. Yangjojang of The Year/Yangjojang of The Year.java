import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(bf.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bf.readLine());
            List<String> list = new ArrayList<>();
            int n2 = 0;
            int count = 0;
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(bf.readLine());
                String s = st.nextToken();
                int n3 = Integer.parseInt(st.nextToken());
                if (n3 > n2) {
                    n2 = n3;
                    count++;
                    list.add(s);
                }
            }
            bw.write(list.get(count - 1) + "\n");
        }
        bw.close();
    }
}