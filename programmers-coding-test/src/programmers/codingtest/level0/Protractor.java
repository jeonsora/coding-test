package programmers.codingtest.level0;

public class Protractor {
    //문제 설명
    //각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
    // 각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
    public static int solution(int angle) {
        if(0<angle && angle<90){
            System.out.println("Protractor : "+1);
            return 1;
        }else if(angle==90){
            System.out.println("Protractor : "+2);
            return 2;
        }else if(90<angle && angle<180){
            System.out.println("Protractor : "+3);
            return 3;
        }else if(angle==180){
            System.out.println("Protractor : "+4);
            return 4;
        }
        System.out.println("Protractor : "+-1);
        return -1;
    }
}
