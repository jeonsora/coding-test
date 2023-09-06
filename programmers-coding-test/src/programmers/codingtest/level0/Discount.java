package programmers.codingtest.level0;

public class Discount {
    //문제 설명
    //머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
    //구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
    //할인금액=정가*((100-할인율)/100)
    public static int solution(int price) {
        int answer = 0;
        if(price>=500000){
            answer=(int)(price*((double)(100-20)/100));
            System.out.println("Discount : "+answer);
            return answer;
        }else if(price>=300000){
            answer=(int)(price*((double)(100-10)/100));
            System.out.println("Discount : "+answer);
            return answer;
        }else if(price>=100000){
            answer=(int)(price*((double)(100-5)/100));
            System.out.println("Discount : "+answer);
            return answer;
        }else{
            answer=price;
            System.out.println("Discount : "+answer);
            return answer;
        }
    }
}
