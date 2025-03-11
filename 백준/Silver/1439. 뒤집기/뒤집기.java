import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        char[] c = s.toCharArray();
        int changeZeroToOne1 = 0;
        int changeOneToZero1 = 0;
        int changeZeroToOne2 = 0;
        int changeOneToZero2 = 0;
      
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == '1') {
                if (c[i + 1] != '1') {
                    changeOneToZero1++;
                }
            } else if (c[i] == '0') {
                if (c[i + 1] != '0') {
                    changeZeroToOne1++;
                }
            }
        }
        for (int i = c.length - 1; i > 0; i--) {
            if (c[i] == '1') {
                if (c[i - 1] != '1') {
                    changeOneToZero2++;
                }
            } else if (c[i] == '0') {
                if (c[i - 1] != '0') {
                    changeZeroToOne2++;
                }
            }
        }
        System.out.println(Math.min(Math.max(changeOneToZero1, changeOneToZero2), Math.max(changeZeroToOne1, changeZeroToOne2)));
    }
}
