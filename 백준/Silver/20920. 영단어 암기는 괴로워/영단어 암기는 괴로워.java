import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = bf.readLine();
            
            if (word.length() >= M) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        List<String> wordList = new ArrayList<>(wordCountMap.keySet());

        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int count1 = wordCountMap.get(o1);
                int count2 = wordCountMap.get(o2);

                if (count1 != count2) {
                    return count2 - count1; 
                }
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                
                return o1.compareTo(o2);
            }
        });

        for (String word : wordList) {
            bw.write(word + "\n");
        }
        bw.close();
    }
}