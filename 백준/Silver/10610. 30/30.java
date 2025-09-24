import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = bf.readLine();
        int sum = 0;
        int[] digits = new int[s.length()];
        
        boolean hasZero = false;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            digits[i] = digit;
            sum += digit;
            if (digit == 0) {
                hasZero = true;
            }
        }

        if (!hasZero || sum % 3 != 0) {
            bw.write("-1");
        } else {
            Arrays.sort(digits);
            for (int i = digits.length - 1; i >= 0; i--) {
                bw.write(String.valueOf(digits[i]));
            }
        }
        
        bw.flush();
        bw.close();
        bf.close();
    }
}