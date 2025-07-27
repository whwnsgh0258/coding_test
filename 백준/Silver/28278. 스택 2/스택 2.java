import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int m = Integer.parseInt(st.nextToken());
            
            if (m == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (m == 2) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            } else if (m == 3) {
                bw.write(stack.size() + "\n");
            } else if (m == 4) {
                bw.write((stack.isEmpty() ? "1" : "0") + "\n");
            } else if (m == 5) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}