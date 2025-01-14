import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        double max = 0, sum = 0;
        
        for(int i = 0; i < s; i++){
            int score = sc.nextInt();
            if (score > max) {
                max = score;
            }
                sum += score;
        }
        System.out.println(((sum/max)*100)/s);
    }
}