import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*getMiddleString();*/
        // DogProblem();
//        String str = "When organizing items, always label each group with the appropriate category. category: books, category: electronics, category: clothing, category: kitchenware, and so on. ";
        /*String str = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";
        printCategory(str);*/

        search();
    }

    /*static String getMiddleString() {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String result = str1;
        String str2;
        if (str1.length() % 2 == 0 && str1.length() >= 3) {
            System.out.println(str1);
        } else if (str1.length() % 2 != 0 && str1.length() >= 3) {
            str2 = str1.substring(str1.length()/2-1, str1.length()/2+2);
            System.out.println(str2);
        }else if(str1.length() < 3){
            System.out.println(str1);
        }
        return result;
    }*/

    /*
    *     여러분은 아주 크게 짖는 개를 키우고 있습니다.
     hour 매개변수는 현재 시각을 의미하고 0~23까지 숫자를 넣을 수 있습니다.
     만약 개가 7시 이전이나 20시 이후에 짖으면 매우 곤란해질겁니다.
     만약 곤란한 상황이 발생하면 "짖으면 안돼!!" 를 반환하세요, 아니라면 "든든하군!" 을 반환하세요.

     barkingDogProblem(true, 6) ==> "짖으면 안돼!!"
     barkingDogProblem(true, 7) ==> "든든하군!"
     barkingDogProblem(false, 5) ==> "든든하군!"
     * */

    /*static String DogProblem() {
        Scanner sc = new Scanner(System.in);
        boolean barking = true;
        int hour = sc.nextInt();
        int result = hour;
        if (barking && (hour < 7 || hour > 20)) {
            return "짖으면 안돼!!";
        } else {
            return "든든하군!";
        }

//        return barking && (hour < 7 || hour > 20) ? "짖으면 안돼!!" : "든든하군!";
//        return String.valueOf(result);
    }*/
    /*
     * 주어진 문장에서 category 에 해당하는 모든 단어를 출력하세요.
     *
     "When organizing items, always label each group with the appropriate
     category. category: books, category: electronics, category: clothing, category: kitchenware,
     and so on. "
     */

    static void printCategory(String str) {
        /*int i = 0;
        while (true) {
            // i의 값이 업데이트 되면서 해당 인덱스의 문자열을 탐색 합니다.
            int idx = str.indexOf("category:", i);
            if (idx == -1) {
                break;
            }
            int startIndex = idx + 9;
            int endIndex = str.indexOf(',', startIndex);
            System.out.println(str.substring(startIndex, endIndex));
            i = endIndex + 1;
        }*/

        /*
         * // 다음 문장을 for 문을 이용해 순회하면서 안에 있는 문자를 모두 순서대로 한번씩 콘솔로 출력해보세요.
         *
         * String someTxt = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";
         * /*
         * *
         * 물
         * 방
         * 울
         * 이
         * 그리고 거꾸로 가장 마지막 문자부터 출력하도록 만들어 보세요.*/

        /*for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)); // charAt은 특정 index의 문자를 출력해줌
        }
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }*/
    }
    static int search() {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println(list.indexOf(k));
        return k;
    }
}
