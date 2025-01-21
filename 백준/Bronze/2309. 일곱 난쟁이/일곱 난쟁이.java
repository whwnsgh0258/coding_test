import java.util.Arrays;
import java.util.Scanner;

public class Main {

  private static int p = 9;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] n = new int[p];

    for (int i = 0; i < p; i++) {
      n[i] = sc.nextInt();
    }
    foundSevenBout(n);
  }

  private static void foundSevenBout(int[] n) {
    for (int i = 0; i < p; i++) {
      for (int j = i + 1; j < p; j++) {
        int sum = 0;
        int index = 0;
        int[] select = new int[7];

        for (int k = 0; k < p; k++) {
          if (k != i && k != j) {
            sum += n[k];
            select[index++] = n[k];
          }
        }
        if (sum == 100) {
          Arrays.sort(select);
          for (int num : select) {
              System.out.println(num);
          } return;
        }
      }
    }
  }
}
