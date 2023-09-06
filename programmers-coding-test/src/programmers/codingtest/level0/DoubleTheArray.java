package programmers.codingtest.level0;

import java.util.Arrays;

public class DoubleTheArray {
    //문제 설명
    //정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i=0; i< numbers.length; i++){
            answer[i]=numbers[i]*2;
        }
        System.out.println("DoubleArray : "+ Arrays.toString(answer));
        return answer;
    }
}
