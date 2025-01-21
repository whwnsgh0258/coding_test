import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[8];
        String[] s = {"ascending", "descending", "mixed"};
        String result = "";
        
        for (int i = 0; i < 8; i++) {
            n[i] = sc.nextInt();
        }
        
        if (n[0] < n[1]) {
            for (int i = 2; i < 8; i++) {
                if (n[i - 1] < n[i]) {
                    result = s[0];
                } else {
                    result = s[2];
                    System.out.println(result);
                    return;
                }
            }
        } else if (n[7] < n[6]) {
            for (int i = 5; i >= 0; i--) {
                if (n[i] > n[i + 1]) {
                    result = s[1];
                } else {
                    result = s[2];
                    System.out.println(result);
                    return;
                }
            }
        }
        System.out.println(result);
    }
}