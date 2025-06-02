import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int day = 0;
        
        for (int i = 1; i < x; i++) {
            if (i <= 7 && i % 2 != 0) {
                day += 31;
            } else if (i > 7 && i % 2 == 0) {
                day += 31;
            } else if (i < 7 && i != 2) {
                day += 30;
            } else if (i > 7) {
                day += 30;
            } else {
                day += 28;
            }
        }
        day += y;
        if (day % 7 == 0) {
            bw.write("SUN");
        } else if (day % 7 == 1) {
            bw.write("MON");
        } else if (day % 7 == 2) {
            bw.write("TUE");
        } else if (day % 7 == 3) {
            bw.write("WED");
        } else if (day % 7 == 4) {
            bw.write("THU");
        } else if (day % 7 == 5) {
            bw.write("FRI");
        } else {
            bw.write("SAT");
        }
        bw.close();
    }
}