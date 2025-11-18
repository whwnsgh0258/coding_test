import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] strings) throws IOException {
        long t = Long.parseLong(bf.readLine());
        for (long i = 0; i < t; i++) {
            long n = Long.parseLong(bf.readLine());
            bw.write(prime(n) + "\n");
        }
        bw.close();
    }
    
    static long prime(long n) {
        if (n == 0 || n == 1) {
            return 2;
        }
        while (true) {
            boolean isPrime = true;
            long num = (long) Math.sqrt(n);
            for (long i = 2; i <= num; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) return n;
            n++;
        }
    }
}