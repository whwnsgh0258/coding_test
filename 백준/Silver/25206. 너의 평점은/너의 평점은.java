import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    float totalScore = 0.0f;
    float totalCredit = 0.0f;
    for (int i = 1; i <= 20; i++) {
      StringTokenizer st = new StringTokenizer(bf.readLine());
      String s1 = st.nextToken();
      float credit = Float.parseFloat(st.nextToken());
      String grade = st.nextToken();

      float gradeP = 0.0f;
      boolean isPass = false;

      switch (grade) {
        case "A+":
          gradeP = 4.5f;
          break;
        case "A0":
          gradeP = 4.0f;
          break;
        case "B+":
          gradeP = 3.5f;
          break;
        case "B0":
          gradeP = 3.0f;
          break;
        case "C+":
          gradeP = 2.5f;
          break;
        case "C0":
          gradeP = 2.0f;
          break;
        case "D+":
          gradeP = 1.5f;
          break;
        case "D0":
          gradeP = 1.0f;
          break;
        case "F":
          gradeP = 0;
          break;
        case "P":
          isPass = true;
          break;
      }
      if (!isPass) {
        totalScore += gradeP * credit;
        totalCredit += credit;
      }
    }
    float avg = totalScore / totalCredit;
    System.out.printf("%.6f", avg);
  }
}
