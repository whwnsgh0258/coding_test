import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        HashSet<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            set.add(bf.readLine());
        }
        for (int i = 1; i <= m; i++) {
            String s = bf.readLine();
            if (set.contains(s)) {
                list.add(s);
                count++;
            }
        }
        list.sort(Comparator.naturalOrder());
        bw.write(count + "\n");
        for (String s : list) {
            bw.write(s + "\n");
        }
        bw.close();
    }
}