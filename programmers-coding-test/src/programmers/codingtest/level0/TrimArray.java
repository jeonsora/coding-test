package programmers.codingtest.level0;

public class TrimArray {
    //문제 설명
    //정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
    // numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = null;
        for(int i=0; ; i++){
            answer[i]=numbers[num1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers={1, 2, 3, 4, 5};
        solution(numbers,1,3);
    }
}
