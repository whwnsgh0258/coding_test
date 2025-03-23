import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            int n = Integer.parseInt(bf.readLine());
            if (n == -1) {
                break;
            }
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    list.add(i);
                }
            }
            if (sum == n) {
                bw.write(sum + " = ");
                for (int i = 0; i < list.size(); i++) {
                    if (i == list.size() - 1) {
                        bw.write("" + list.get(i));
                    } else {
                        bw.write(list.get(i) + " + ");
                    }
                }
            } else {
                bw.write(n + " is NOT perfect.");
            }
            bw.write("\n");
        }
        bw.close();
    }
}