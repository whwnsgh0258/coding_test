import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());

            map.put(st.nextToken(), st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            bw.write(map.get(bf.readLine()) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
