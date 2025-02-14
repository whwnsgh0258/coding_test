import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(bf.readLine());
        long[] n2 = new long[n1 + 1];
        if (n1 == 0) {
            System.out.print(0);
        } else if (n1 == 1) {
            System.out.print(1);
        } else {
            for (int i = 2; i <= n1; i++) {
                n2[0] = 0;
                n2[1] = 1;
                n2[i] = n2[i - 1] + n2[i - 2];
            }
            System.out.print(n2[n1]);
        }
    }
}