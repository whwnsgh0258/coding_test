import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int i = 1;
        List<Integer> list = new ArrayList<>();
        for (int j = 1; j <= 10000; j++) {
            list.add(j);
        }
        while (i <= 10000) {
            int sum = 0;
            int temp = i;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            int sum2 = sum + i;
            list.remove((Integer) sum2);
            i++;
        }
        for (int n : list) {
            if (n == list.get(list.size() - 1)) {
                bw.write(String.valueOf(n));
            } else {
                bw.write(String.valueOf(n));
                bw.newLine();
            }
        }
        bw.close();
    }
}