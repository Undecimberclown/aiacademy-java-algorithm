package 자바입문;
import java.util.Scanner;
/* 

마지막 날짜 문제

특정 달의 마지막 날을 알아내는 알고리즘을 작성하시오.

달력으로 프린트 될수 있는 경우는 모두 몇가지 경우가 있을까?

그달이 큰달인 경우 31일까지 있을 것이고,

작은달인경우 30일 혹은 28일, 29일까지 있을 것이니까 모두 4가지 경우가 있다..

그달이 며칠까지 있는지는 다음과 같다.

31 , 28 or 29 ,31, 30, 31, 30, 31, 31, 30, 31, 30, 31 (1~12월까지) 입니다.

여기서 2월달이 문제다.

바로 윤년 때문이다.

윤년을 계산해 내는 방법은 간단하다.

1. 기본적으로 4의 배수가 되는 해는 윤년입니다...

2. 다만 100의 배수가 되는 해는 윤년이 아닙니다...

3. 그중에서 또 400의 배수가 되는 해는 윤년입니다..

위 3가지 규칙을 만족하는 해는 윤년이 된다.

년과 일을 입력받아서

출력하는 예는 다음과 같다

*************
년 월 일
*************
2000 2 28
*************

*/
public class 마지막날짜 {
    public static void main(String[] args) {
        마지막날짜 solution = new 마지막날짜();
        System.out.println(solution.solution());
        
    }
    public String solution(){
        String title = "### 마지막 날짜 ###\n";
        Scanner scanner = new Scanner(System.in);
        
        int year = 0;
        int month = 0;
        int days = 0;
        System.out.println("년도를 입력해주세요");
        year = scanner.nextInt();
        System.out.println("몇 월인지 입력해주세요");
        month = scanner.nextInt();
        String answer = String.format(
            "*************\n"
            + "년 월 일\n"
            + "*************\n"
            + "%d %d %d\n"
            + "*************\n"
            , 
            year, month, days);
            scanner.close();
        return title + answer;
    }
    
}
