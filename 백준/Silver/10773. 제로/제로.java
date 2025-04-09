import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int r = Integer.parseInt(bf.readLine());
                if (r != 0) {
                    stack.push(r);
                } else {
                    stack.pop();
                }
        }
        for (int i : stack) {
            sum += i;
        }
        bw.write(sum + "");
        bw.close();
    }
}
