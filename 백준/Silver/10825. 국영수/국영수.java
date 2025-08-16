import java.util.*;
import java.io.*;

class Student {
    String name;
    int korean;
    int english;
    int math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());

        List<Student> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            list.add(new Student(name, korean, english, math));
        }

        list.sort((s1, s2) -> {
            if (s1.korean != s2.korean) {
                return s2.korean - s1.korean;
            } else if (s1.english != s2.english) {
                return s1.english - s2.english;
            } else if (s1.math != s2.math) {
                return s2.math - s1.math;
            } else {
                return s1.name.compareTo(s2.name);
            }
        });

        for (Student s : list) {
            bw.write(s.name + "\n");
        }
        bw.close();
    }
}