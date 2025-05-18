import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static class Document {
    int idx;
    int priority;

    Document (int idx, int priority) {
      this.idx = idx;
      this.priority = priority;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t = Integer.parseInt(bf.readLine());

    while (t-- > 0) {
      StringTokenizer st = new StringTokenizer(bf.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      Queue<Document> q = new LinkedList<>();
      st = new StringTokenizer(bf.readLine());
      for (int i = 0; i < n; i++) {
        int priority = Integer.parseInt(st.nextToken());
        q.offer(new Document(i, priority));
      }
      int count = 0;
      while (!q.isEmpty()) {
        Document document = q.poll();
        boolean isHigh = false;

        for (Document doc : q) {
          if (doc.priority > document.priority) {
            isHigh = true;
            break;
          }
        }
        if (isHigh) {
          q.offer(document);
        } else {
          count++;
          if (document.idx == m) {
            bw.write(count + "\n");
            break;
          }
        }
      }
    }
    bw.close();
  }
}