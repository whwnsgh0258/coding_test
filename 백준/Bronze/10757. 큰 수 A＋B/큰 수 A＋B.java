import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String str = bf.readLine();

    String[] parts = str.split(" ");

    BigInteger n1 = new BigInteger(parts[0]);
    BigInteger n2 = new BigInteger(parts[1]);

    BigInteger sum = n1.add(n2);
    System.out.println(sum);
  }
}