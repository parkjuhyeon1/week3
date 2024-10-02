//- **설명**: 두 개의 숫자와 연산자(+, -, *, /)를 입력받아 해당 연산을 수행하고 결과를 출력하는 프로그램을 작성하세요.
  //      - **힌트**: `switch` 문을 사용하여 연산자를 처리하세요.
import java.util.Scanner;
public class Question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int first = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int second = sc.nextInt();
        System.out.print("연산자(+, -, *, /): ");
        String operation = sc.next();

        switch (operation){
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            default:
                System.out.println("올바른 연산자를 입력하세요.");
                break;
        }
        sc.close();
    }
}

