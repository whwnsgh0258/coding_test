import java.util.StringTokenizer;
import java.util.HashSet;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(bf.readLine());
        }
        if (s.equals("Y")) {
            System.out.println(set.size());
        } else if (s.equals("F")) {
            System.out.println(set.size() / 2);
        } else if (s.equals("O")) {
            System.out.println(set.size() / 3);
        }
    }
}