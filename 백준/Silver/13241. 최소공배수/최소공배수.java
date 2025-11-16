import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] string) throws IOException{
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        
        long lcm = (a * b) / gcd(a, b);
        bw.write(lcm + "");
        bw.close();
    }
    
    static long gcd(long a, long b) {
        while(b != 0) {
            long n = a % b;
            a = b;
            b = n;
        }
        return a;
    }
}