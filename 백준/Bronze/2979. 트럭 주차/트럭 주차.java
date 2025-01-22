import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer str = new StringTokenizer(bf.readLine());

    int a = Integer.parseInt(str.nextToken());
    int b = Integer.parseInt(str.nextToken());
    int c = Integer.parseInt(str.nextToken());
    int[][] truck = new int[3][2];
    int[] arr = new int[100];
    int first = 101;
    int last = 0;
    int fee = 0;

    for (int i = 0; i < 3; i++) {
      str = new StringTokenizer(bf.readLine());
      int start = Integer.parseInt(str.nextToken());
      int end = Integer.parseInt(str.nextToken());

      truck[i][0] = start;
      truck[i][1] = end;
      for (int j = start; j < end; j++) {
        arr[j]++;
      }
    }
    for (int i = 0; i < 3; i++) {
      for(int j=0; j<2; j++) {
        if(truck[i][j] < first) {
          first = truck[i][j];
        }
        if(truck[i][j] > last) {
          last = truck[i][j];
        }
      }
    }

    for (int i = first; i < last; i++) {
      fee += (arr[i] == 1) ? arr[i] * a : 0;
      fee += (arr[i] == 2) ? arr[i] * b : 0;
      fee += (arr[i] == 3) ? arr[i] * c : 0;
    }
    System.out.println(fee);
  }
}
