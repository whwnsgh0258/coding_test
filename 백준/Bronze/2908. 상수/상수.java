import java.util.*;
import java.io.*;

public class Main {
    
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(bf.readLine());

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        String[] n = s1.split("");
        String[] m = s2.split("");

        String temp1 = n[2];
        String temp2 = m[2];

        n[2] = n[0];
        n[0] = temp1;
        m[2] = m[0];
        m[0] = temp2;

        s1 = n[0] + n[1] + n[2];
        s2 = m[0] + m[1] + m[2];

        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);

        if (x > y) {
            bw.write(x + "");
        } else {
            bw.write(y + "");
        }
        bw.close();
    }
}