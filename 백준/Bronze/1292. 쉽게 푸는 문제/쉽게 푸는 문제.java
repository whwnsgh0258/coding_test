import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sum = getSum(b) - getSum(a - 1);
        
        bw.write(sum + "");
        bw.close();
    }
    private static int getSum(int a) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < i && count < a; j++) {
                sum += i;
                count++;
            }
        }
        return sum;
    }
}