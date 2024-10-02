//- 세 개의 숫자와 연산자(+, -, *, /)를 입력받아 * , / 연산자를 먼저 계산을 수행하고 결과를 출력하는 프로그램을 작성하세요.
//- if 문을 사용 하지 말고 switch 문으로만 작성하세요.
import java.util.Scanner;


public class Question13 {
    public static void main(String[] args) {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 값 입력 : ");
        int n1 = sc.nextInt();
        System.out.print("두번째 값 입력 : ");
        int n2 = sc.nextInt();
        System.out.print("세번째 값 입력 : ");
        int n3 = sc.nextInt();
        System.out.print("첫번째 부호 입력 : ");
        String sign1 = sc.next();
        System.out.print("두번째 부호 입력 : ");
        String sign2 = sc.next();

        switch(sign1){
            case "*": number += (n1 * n2); break;
            case "/": number += (n1 / n2); break;
            default:switch(sign2){
                case "+": number += (n1 + n2); break;
                case "-": number += (n1 - n2); break;
            }
        }

        switch(sign2){
            case "*": number = (number * n3); break;
            case "/": number = (number / n3); break;
            default:switch(sign2){
                case "+": number = (number + n3); break;
                case "-": number = (number - n3); break;
            }
        }

        System.out.println(number);

    }
}
