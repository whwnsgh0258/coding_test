import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        HashSet<String> set = new HashSet<>();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            String line = bf.readLine();

            if (line.equals("ENTER")) {
                answer += set.size();
                set.clear();
            } else {
                set.add(line);
            }
        }
        answer += set.size();
        bw.write("" + answer);
        bw.close();
    }
}