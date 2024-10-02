
//- **설명**: 사용자로부터 점수를 입력받고, 점수에 따라 A, B, C, D, F 등급을 출력하는 프로그램을 작성하세요.
//    - 90 이상: A
//    - 80 이상 90 미만: B
//    - 70 이상 80 미만: C
//    - 60 이상 70 미만: D
//    - 60 미만: F
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 :");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else if (score >= 70) {
            System.out.println("C학점");
        } else if (score >= 60) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점");
        }
    }
    }