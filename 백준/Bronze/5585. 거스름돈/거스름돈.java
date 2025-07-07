import java.io.*;

public class Main {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());
        int change = 1000 - n;
        int count = 0;
        int[] coins = {500, 100, 50, 10, 5, 1};
        
        for (int coin : coins) {
            count += change / coin;
            change %= coin;
        }
        bw.write(count + "");
        bw.close();
    }
}