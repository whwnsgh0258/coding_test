import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int n = Integer.parseInt(bf.readLine());
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
      String s = bf.readLine();
      String[] str = s.split(" ");
      if (str[0].equals("push")) {
        int n2 = Integer.parseInt(str[1]);
        stack.push(n2);
      } else if (str[0].equals("pop")) {
        if (stack.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(stack.pop()).append("\n");
        }
      } else if (str[0].equals("size")) {
        sb.append(stack.size()).append("\n");
      } else if (str[0].equals("empty")) {
        if (stack.isEmpty()) {
          sb.append(1).append("\n");
        } else {
          sb.append(0).append("\n");
        }
      } else if (str[0].equals("top")) {
        if (stack.isEmpty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(stack.peek()).append("\n");
        }
      }
    }
    System.out.println(sb);
  }
}
