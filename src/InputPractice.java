import java.util.Scanner;
public class InputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력 : ");
        int first = sc.nextInt();
        System.out.println("두 번째 숫자 입력: ");
        int second = sc.nextInt();
        System.out.println("연산자(+, -, *, /): ");
        String a = sc.next();

        System.out.println("결과 : "+first +" "+ a +" "+ second);
        String b = sc.next();


    }
}
