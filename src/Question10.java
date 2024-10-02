//설명: 사용자가 입력한 숫자가 3의 배수이면서 5의 배수인 경우 "3과 5의 배수입니다"를 출력하고, 3의 배수이지만 5의 배수가 아닌 경우 "3의 배수입니다"를 출력하고, 5의 배수이지만 3의 배수가 아닌 경우 "5의 배수입니다"를 출력하세요. 둘 다 아닌 경우 "해당 조건을 만족하지 않습니다"를 출력하는 프로그램을 작성하세요.


import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("값 입력: ");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("3과 5의 배수입니다.");
        }else if(n%5==0){
            System.out.println("5의 배수입니다.");
        }else if(n%3==0){
            System.out.println("3의 배수입니다.");
        }else{
            System.out.println("해당 조건을 만족하지 않습니다.");
        }
    }
}