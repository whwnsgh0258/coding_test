import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(bf.readLine());

    Deque<Integer> dQ = new ArrayDeque<>();

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(bf.readLine());
      String s = st.nextToken();
      if (s.equals("push_front")) {
        int x = Integer.parseInt(st.nextToken());
        dQ.offerFirst(x);
      } else if (s.equals("push_back")) {
        int x = Integer.parseInt(st.nextToken());
        dQ.offerLast(x);
      } else if (s.equals("pop_front")) {
        if (dQ.isEmpty()) {
          bw.write("-1\n");
        } else {
          bw.write(dQ.pollFirst() + "\n");
        }
      } else if (s.equals("pop_back")) {
        if (dQ.isEmpty()) {
          bw.write("-1\n");
        } else {
          bw.write(dQ.pollLast() + "\n");
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
      } else {
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
