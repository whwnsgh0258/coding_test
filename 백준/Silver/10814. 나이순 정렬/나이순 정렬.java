import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 회원 정보를 담을 리스트
    List<Member> members = new ArrayList<>();

    // 입력 개수
    int n = Integer.parseInt(scanner.nextLine());

    // 입력 받기
    for (int i = 0; i < n; i++) {
      String[] input = scanner.nextLine().split(" ");
      int age = Integer.parseInt(input[0]);
      String name = input[1];
      members.add(new Member(age, name, i)); // 입력 순서 저장
    }

    // 나이 순으로 정렬, 나이가 같으면 입력 순서를 기준으로 정렬
    Collections.sort(members, new Comparator<Member>() {
      @Override
      public int compare(Member m1, Member m2) {
        if (m1.age == m2.age) {
          return Integer.compare(m1.order, m2.order); // 입력 순서 비교
        }
        return Integer.compare(m1.age, m2.age); // 나이 비교
      }
    });

    // 출력
    for (Member member : members) {
      System.out.println(member.age + " " + member.name);
    }

    scanner.close();
  }

  // 회원 정보를 나타내는 클래스
  static class Member {
    int age;
    String name;
    int order; // 입력 순서를 저장

    public Member(int age, String name, int order) {
      this.age = age;
      this.name = name;
      this.order = order;
    }
  }
}