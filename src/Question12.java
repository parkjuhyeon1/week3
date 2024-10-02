//4개 과목의 점수를 각각 입력받은 후, 각 과목의 등급을 출력하고, 평균 점수를 구한 뒤 평균 점수가 60점 이상이면 "합격", 그렇지 않으면 "불합격"을 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int awr = 0;
        for(int i = 0; i < 4; i++){
            System.out.print((i+1)+"째 값 입력 : ");
            n = sc.nextInt();
            awr += n;
        }

        if(awr / 4 >= 90){
            System.out.println("A");
        }else if(awr / 4 >= 80){
            System.out.println("B");
        }else if(awr / 4 >= 70){
            System.out.println("C");
        }else if(awr / 4 >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }

    }
}