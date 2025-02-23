import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(bf.readLine());
    int last = -1;
    Queue<Integer> queue = new LinkedList<>();

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(bf.readLine());
      String s = st.nextToken();
      if (s.equals("push")) {
        int x = Integer.parseInt(st.nextToken());
        queue.offer(x);
        last = x;
      } else if (s.equals("pop")) {
        bw.write(queue.isEmpty() ? "-1" : String.valueOf(queue.poll()));
        bw.newLine();
      } else if (s.equals("size")) {
        bw.write(String.valueOf(queue.size()));
        bw.newLine();
      } else if (s.equals("empty")) {
        bw.write(queue.isEmpty() ? "1" : "0");
        bw.newLine();
      } else if (s.equals("front")) {
        bw.write(queue.isEmpty() ? "-1" : String.valueOf(queue.peek()));
        bw.newLine();
      } else if (s.equals("back")) {
        bw.write(queue.isEmpty() ? "-1" : String.valueOf(last));
        bw.newLine();
      }
    }
    bw.close();
  }
}
