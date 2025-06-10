import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());

        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                sum += i;
                list.add(i);
            }
        }
        if (sum == 0) {
            bw.write("-1");
        } else {
            bw.write(sum + "\n");
            bw.write(list.get(0) + "");
        }
        bw.close();
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}