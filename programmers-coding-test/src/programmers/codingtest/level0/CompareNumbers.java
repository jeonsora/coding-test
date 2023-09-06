package programmers.codingtest.level0;

public class CompareNumbers {
    //문제 설명
    //정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
    public static int solution(int num1, int num2) {
        if(num1!=num2){
            System.out.println("CompareNumbers : "+-1);
            return -1;
        }else{
            System.out.println("CompareNumbers : "+1);
            return 1;
        }
    }
}
