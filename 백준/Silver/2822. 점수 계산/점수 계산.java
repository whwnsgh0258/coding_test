import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

class Score {
  int value;
  int originalIndex;

  public Score(int value, int originalIndex) {
    this.value = value;
    this.originalIndex = originalIndex;
  }
}

public class Main {

  static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    Score[] scores = new Score[8];

    for (int i = 0; i < scores.length; i++) {
      int scoreValue = Integer.parseInt(bf.readLine());
      scores[i] = new Score(scoreValue, i + 1);
    }

    Arrays.sort(scores, (o1, o2) -> o2.value - o1.value);

    int sum = 0;
    int[] idx = new int[5];
    for (int i = 0; i < 5; i++) {
      sum += scores[i].value;
      idx[i] = scores[i].originalIndex;
    }
    bw.write(sum + "\n");
    Arrays.sort(idx);
    for (int i = 0; i < idx.length; i++) {
      bw.write(idx[i] + (i == idx.length - 1 ? "": " "));
    }
    bw.close();
  }
}
