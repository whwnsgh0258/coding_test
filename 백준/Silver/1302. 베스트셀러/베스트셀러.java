import java.io.*;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public class Main {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Map<String, Integer> count = new HashMap<>();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            String book = bf.readLine();
            count.put(book, count.getOrDefault(book,0) + 1);
        }

        String bestSeller = count.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                    .thenComparing(Map.Entry.comparingByKey()))
            .map(Map.Entry::getKey)
            .findFirst()
            .get();

        bw.write(bestSeller);
        bw.close();
    }
}