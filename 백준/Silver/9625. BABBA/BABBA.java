import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int k = Integer.parseInt(bf.readLine());
        int aCount = 1;
        int bCount = 0;
        for (int i = 0; i < k; i++) {
            int newA = bCount;
            int newB = aCount + bCount;
            aCount = newA;
            bCount = newB;
        }
        System.out.print(aCount + " " + bCount);
    }
}