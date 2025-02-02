import java.io.*;
import java.util.*;
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int k = Integer.parseInt(bf.readLine());
    int[] directions = new int[6];
    int[] lengths = new int[6];

    for(int i = 0; i < 6; i++) {
      StringTokenizer st = new StringTokenizer(bf.readLine());
      directions[i] = Integer.parseInt(st.nextToken());
      lengths[i] = Integer.parseInt(st.nextToken());
    }

    int maxArea = 0;
    int minArea = 0;

    for(int i = 0; i < 6; i++) {
      int area = lengths[i] * lengths[(i+1) % 6];
      if(area > maxArea) {
        maxArea = area;
        minArea = lengths[(i+3) % 6] * lengths[(i+4) % 6];
      }
    }

    System.out.println((maxArea - minArea) * k);
  }
}
