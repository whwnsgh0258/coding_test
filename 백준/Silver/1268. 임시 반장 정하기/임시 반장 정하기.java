import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] m = new int[n][5];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            m[i][0] = Integer.parseInt(st.nextToken());
            m[i][1] = Integer.parseInt(st.nextToken());
            m[i][2] = Integer.parseInt(st.nextToken());
            m[i][3] = Integer.parseInt(st.nextToken());
            m[i][4] = Integer.parseInt(st.nextToken());
        }
        Entry<Integer, Integer> maxEntry = getMaxEntry(n, m);
        System.out.println(maxEntry.getKey());
    }
    private static Entry<Integer, Integer> getMaxEntry(int n, int[][] m) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++){
                if (i != j) {
                    if (m[i][0] == m[j][0] || m[i][1] == m[j][1] 
                        || m[i][2] == m[j][2] || m[i][3] == m[j][3] || m[i][4] == m[j][4]) {
                        count++;
                    }
                }
            }
            map.put(i + 1, count);
        }
        int maxCount = -1;
        int maxStudent = -1;
        
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int student = entry.getKey();
            if (count > maxCount || (count == maxCount && student < maxStudent)) {
                maxCount = count;
                maxStudent = student;
            }
        }
        return Map.entry(maxStudent, maxCount);
    }
}