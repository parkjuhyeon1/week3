//설명: 사용자로부터 나이를 입력받아, 18세 이상이면 "성인입니다"를 출력하고, 그렇지 않으면 "미성년자입니다"를 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class Question5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("성인입니다");
        } else {
            System.out.println("미성년자 입니다");
        }
    }
}
