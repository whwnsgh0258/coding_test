import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] n = new int[10];
        int avg = 0;
        for (int i = 0; i < 10; i++) {
            n[i] = Integer.parseInt(bf.readLine());
            avg += n[i];
        }
        
        bw.write(avg / 10 + "\n");
        Arrays.sort(n);
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                if (n[i] == n[j]) {
                    c1++;
                } else {
                    if (c1 > c2) {
                        c2 = c1;
                        list.add(n[i]);
                        c3++;
                    } else {
                        c1 = 0;
                        break;
                    }
                }
            }
        }
        bw.write(list.get(c3 - 1) + "");
        bw.close();
    }
}