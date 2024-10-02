//설명: 사용자가 입력한 연산자와 두 개의 숫자에 따라 사칙연산(+, -, *, /)을 수행하는 프로그램을 작성하세요. 단, 나눗셈의 경우 두 번째 숫자가 0일 때 "0으로 나눌 수 없습니다."라는 메시지를 출력하세요.
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int first = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int second = sc.nextInt();
        System.out.print("연산자(+, -, *, /): ");
        String a = sc.next();
        System.out.print("결과값 : ");
        switch (a) {
            case "+":
                System.out.print(first + second);
                break;
            case "-":
                System.out.print(first - second);
                break;
            case "*":
                System.out.print(first * second);
                break;
            case "/":
                if(second == 0) {System.out.print("0으로 나눌 수 없습니다."); break;}
                System.out.print(first / second);
                break;
            default: System.out.print("오류"); break;
        }

        sc.close();
    }
}
