import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> bouts = new ArrayList<>();
        int[] c = new int[n];
        int bout;
        int max;
        
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    bout = c[i] + c[j] + c[k];
                    if (bout <= m) {
                        if (bout == m) {
                            System.out.println(m);
                            return;
                        } else {
                            bouts.add(bout);
                        }
                    }
                }
            }
        }
        max = bouts.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(max);
    }
}