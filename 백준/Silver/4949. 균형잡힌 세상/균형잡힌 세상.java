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

        while (true) {
            String s = bf.readLine();
            if (s.equals(".")) {
                break;
            }
            String result = "yes";
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || !stack.peek().equals('(')) {
                        result = "no";
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || !stack.peek().equals('[')) {
                        result = "no";
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            bw.write(result.equals("no") || !stack.isEmpty() ? "no\n" : "yes\n");
        }
        bw.close();
    }
}
