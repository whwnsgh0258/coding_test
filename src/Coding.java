public class Coding {
    public static void main(String[] args) {
        // System.out.println(speedRacer(80, false));

        //Scanner sc = new Scanner(System.in);
        /* int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(twoSumOne(a, b, c));*/

        // System.out.println(isOrdered(1, 2, 2, true));

        // System.out.println(isCool(120));

        // System.out.println(secomDalcom(n));

        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(sumUnique(a, b, c));*/

        // System.out.println(repeatChar("The"));

        System.out.println(starSideDel("cd**zq"));
    }

    /**
     *  경찰이 당신을 과속으로 잡았을 때 내야 할 벌금을 계산하는 코드를 작성해보겠습니다.
     *  만약 당신의 속도가 60 이하라면 벌금은 없습니다.
     *  속도가 61에서 80 사이(포함)라면 벌금은 100원입니다.
     *  속도가 81 이상이라면 벌금은 200원입니다.
     *  단, 휴일인 경우 속도 한도가 5 더 높아집니다.
     *
     *  속도가 60 이하라면 벌금은 0원입니다.
     *  속도가 61 이상이라면 벌금은 100원입니다.
     *  만약 휴일이라면 속도가 65라도 벌금은 0원입니다.
     **/

    /*static int speedRacer(int speed, boolean isHoliday) {
        //휴일인 경우 - if문 사용
        if(isHoliday == true && speed > 65 && speed <= 85   ){
            return 100;
        }
        if(isHoliday == true && speed >= 86 ){
            return 200;
        }
        if(isHoliday == true && speed <= 65){
            return 0;
        }

        // 휴일이 아닌 경우
        if(speed > 60 && speed <= 80   ){
            return 100;
        }
        if(speed >= 81 ) {
            return 200;
        }else{
            return 0;
        }

        // if문 변수사용
        int safeSpeed = 60;
        int dangerSpeed = 80;
        int tax = 0;
        if (isHoliday == true) {
            safeSpeed += 5;
            dangerSpeed += 5;
        }
        if (speed > dangerSpeed) {
            tax = 200;
        } else if (speed < safeSpeed) {
            tax = 0;
        } else if (speed > safeSpeed && speed < dangerSpeed) {
            tax = 100;
        }
        return tax;
    }*/

    /**
     * 세 개의 정수 a, b, c가 주어졌을 때,
     * 두 개의 정수를 더해서 세 번째 정수를 만들 수 있으면 true를 반환하는 코드를 작성합니다.
     * 메서드 본문은 단 한 줄의 코드로 작성되어야 합니다.
     * <p>
     * <p>
     * twoSumOne(1, 2, 3)  --->true
     * twoSumOne(3, 1, 2)  --->true
     * twoSumOne(3, 2, 2)  --->false
     */
    /*public static boolean twoSumOne(int a, int b, int c) {
        if (a + b == c || b + c == a || c + a == b) {
            return true;
        }
        return false;
    }*/

    /**
     * 세 개의 정수 first, second, third가 주어졌을 때,
     * second가 first보다 크고 third가 second보다 크면 true를 반환하는 코드를 작성하세요.
     * 단, 마지막 opt 파라미터가 true인 경우에는 second가 first보다 크지 않아도 되지만,
     * 여전히 third보다는 작아야 합니다.
     * <p>
     * <p>
     * System.out.println(isOrdered(1, 2, 4, false)); // true <br>
     * System.out.println(isOrdered(1, 2, 1, false)); // false <br>
     * System.out.println(isOrdered(1, 1, 2, true));  // true
     */
    /*public static boolean isOrdered(int first, int second, int third, boolean opt) {
        return (second < third && opt) || (first < second && second < third);
    }*/

    /**
     * 어떤 숫자가 11의 배수이거나 11의 배수보다 1 큰 숫자라면, 그 숫자를 "cool"하다고 하겠습니다.
     * 주어진 0 이상의 숫자가 cool하다면 true를 반환하세요. <br>
     * <p>
     * System.out.println(isCool(22)); // true (11의 배수)<br>
     * System.out.println(isCool(23)); // true (11의 배수보다 1 큼)<br>
     * System.out.println(isCool(24)); // false (11의 배수도 아니고, 11의 배수보다 1 크지도 않음)
     */
    /*public static boolean isCool(int a) {
        return a > 0 && (a % 11 - 1 == 0 || a % 11 == 0) ? true : false;
    }*/

    /**
     * 정수 n이 주어졌을 때, 숫자를 문자열 형태로 변환하고 뒤에 "!"를 붙여 반환하세요.
     * 예를 들어, 정수가 13인 경우 이 메서드는 "13!"을 반환해야 합니다.
     * 하지만, 숫자가 3으로 나누어 떨어지면 숫자 대신 "새콤!"를 반환하고,
     * 5로 나누어 떨어지면 "달콤!"를 반환하며, 3과 5 모두로 나누어 떨어지면
     * "새콤달콤!"를 반환해야 합니다. <br><br>
     * <p>
     * secomDalcom(1)   ---> "1!" <br>
     * secomDalcom(2)   ---> "2!"<br>
     * secomDalcom(3)   ---> "새콤!"
     **/

    /*public static String secomDalcom(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "새콤 달콤!";
        } else if (n % 5 == 0) {
            return "달콤";
        } else if (n % 3 == 0) {
            return  "새콤";
        }
        return  n+"!";

        boolean secome = n % 3 == 0;
        boolean dalcom = n % 5 == 0;

        if (secome && dalcom) {
            return "새콤 달콤!";
        } else if (secome) {
            return "세콤!";
        } else if (dalcom) {
            return "달콤";
        } else
            return n + "!";
    }*/

    /**
     * 3개의 정수 인자 a, b, c가 주어졌을 때, 이들의 합을 반환하세요.
     * 하지만, 인자 중 하나가 다른 인자와 동일하면, 그 숫자는 합산에서 제외합니다.
     * 기본적으로 중복되지 않는 숫자만 합산합니다. <br><br>
     * <p>
     * System.out.println(sumUnique(1, 2, 3)); // 6 <br>
     * System.out.println(sumUnique(3, 2, 3)); // 2 <br>
     * System.out.println(sumUnique(3, 3, 3)); // 0
     */
    /*public static int sumUnique(int a, int b, int c) {
        if (a == b && b==c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (b == c) {
            return a;
        } else if (a == c) {
            return b;
        }
        return a + b + c;
    }*/

    /**
     * // 주어진 문자열에서 각 문자마다 동일한 문자를 한 번 더 추가한 문자열을 반환하세요.<br><br>
     * <p>
     * System.out.println(repeatChar("The")); // "TThhee"<br>
     * System.out.println(repeatChar("AAbb")); // "AAAAbbbb"<br>
     * System.out.println(repeatChar("Hi-There")); // "HHii--TThheerree"
     */
    /*static String repeatChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char theChar = str.charAt(i);
            result += String.valueOf(theChar) + theChar;
            // char은 정수형 데이터로 그냥 theChar만 넣으면 이상한 정수가 나옴
            // 리터럴 형식("~~~"+'~')은 자동으로 형변환 해주지만 표현식은 valueOf()메서드를 사용해서 문자열로 데이터 타입을 형변환 해야합니다.
        }
        return result;*/

    /**
     * 주어진 문자열에서 모든 별표(*)와 별표 바로 왼쪽 및 오른쪽에 있는 문자를 제거한 버전을 반환하세요.<br>
     * 예를 들어, "abcd"는 "ad"를 반환하고, "ab**cd"도 "ad"를 반환합니다.<br><br>
     * <p>
     * System.out.println(starSideDel("cd*zq")); // "cq"<br>
     * System.out.println(starSideDel("ab**cd")); // "ad"<br>
     * System.out.println(starSideDel("wacy*xko")); // "wacko"
     */
    static String starSideDel(String str) {
        /*StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (i > 0 && str.length()>0) {
                    result.deleteCharAt(result.length()-1);
                }i++;
            }
                else  {
                if (i < str.length() -1 && str.charAt(i + 1) == '*') {
                    continue;
                }
                result.append(str.charAt(i));
            }
        }
        return result.toString();*/

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) != '*') {
                result += String.valueOf(str.charAt(i));
            }
            if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*') {
                result += String.valueOf(str.charAt(i));
            }
            if (i > 0 && str.charAt(i) == '*' && str.charAt(i + 1) != '*') {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }
}
