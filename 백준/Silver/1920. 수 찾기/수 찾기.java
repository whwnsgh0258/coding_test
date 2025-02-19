import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(st.nextToken());
        }
        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        
        for (int i = 0; i < m; i++) {
            if (set.contains(st.nextToken())) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }
}