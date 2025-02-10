import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int t = Integer.parseInt(bf.readLine());
    for (int i = 0; i < t; i++) {
      String s = bf.readLine();
      String[] str = s.split(" ");
      int student = Integer.parseInt(str[0]);
      int score = 0;
      int[] score2 = new int[student];
      for (int j = 0; j < student; j++) {
        score2[j] = Integer.parseInt(str[j + 1]);
        score += score2[j];
      }
      double scoreAverage = (double) score / student;
      double average = (double) 100 / student;
      int count = 0;
      for (int j = 0; j < student; j++) {
        if (score2[j] > scoreAverage) {
          count++;
        }
      }
      double result = count * average;
      String result2 = String.format("%.3f", result);
      sb.append(result2).append("%").append("\n");
    }
    System.out.println(sb);
  }
}
