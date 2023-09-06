package programmers.codingtest.level0;

import java.util.Arrays;

public class NumberOfEvenAndOddNumbers {
    //문제 설명
    //정수가 담긴 리스트 num_list가 주어질 때,
    // num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                answer[0]+=1;
            }else{
                answer[1]+=1;
            }
        }
        System.out.println("NumberOfEvenAndOddNumbers : "+ Arrays.toString(answer));
        return answer;
    }
}
