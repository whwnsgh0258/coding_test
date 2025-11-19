import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String document = bf.readLine();
        String word = bf.readLine();
        int wordLength = word.length();
        int documentLength = document.length();
        int count = 0;
        int i = 0;
        
        while (i <= documentLength - wordLength) {
            String sub = document.substring(i, i + wordLength);
            if (sub.equals(word)) {
                count++;
                i += wordLength;
            } else {
                i++;
            }
        }
        bw.write(count + "");
        bw.close();
    }
}