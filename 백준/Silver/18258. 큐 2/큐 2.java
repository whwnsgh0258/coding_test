import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> dQ = new LinkedList<>();
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String s = bf.readLine();
            if (s.startsWith("push")) {
                String[] s2 = s.split(" ");
                int x = Integer.parseInt(s2[1]);
                dQ.offer(x);
            } else if (s.equals("pop")) {
                if (dQ.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(dQ.pollFirst() + "\n");
                }
            } else if (s.equals("size")) {
                bw.write(dQ.size() + "\n");
            } else if (s.equals("empty")) {
                if (dQ.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (s.equals("front")) {
                if (dQ.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(dQ.peekFirst() + "\n");
                }
            } else if (s.equals("back")) {
                if (dQ.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(dQ.peekLast() + "\n");
                }
            }
        }
        bw.close();
    }
}