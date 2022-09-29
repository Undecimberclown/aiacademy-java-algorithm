package 자바입문;
import java.util.*;
/*
소수구하기

 1부터 100까지의 소수를 구하는 프로그램
 1. 소수란 무엇인가
 1과 자기자신만이 약수인 숫자
 = 약수의 갯수가 2개인 숫자
 2. 약수란 무엇인가
 어떤 수를 나눴을때 나누어 떨어지는 숫자
 = 어떤 수를 나눴을때 나머지가 0인 숫자
 3. 어떤 숫자의 가장 큰 약수는?
 = 자기 자신이다.

문제
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. 
(1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
시작하는 값과 끝나는 값을 입력한다.

출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

******************************************************************
3부터 16까지 소수
******************************************************************
3,5,6,11,13
****************************************************************** 
*/

public class 소수구하기 {
    public static void main(String[] args) {
        소수구하기 solution = new 소수구하기();
        System.out.println(solution.solution());
    }
    public String solution(){
        int start = 0;
        int end = 0;
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("시작값을 입력: ");
        start = scanner.nextInt();
        System.out.println("마지막값을 입력: ");
        end = scanner.nextInt();
        for(int i = start; i <= end;i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
                
                
            
            }
            if( count == 2){
                result += i + "\n";
            }    
            
        }
        String title = "### 소수구하기### \n";
        String answer = String.format("******************************************************************\n"
        + "%d부터 %d까지의 짝수\n"
        + "******************************************************************\n"
        + "%s"
        + "******************************************************************\n", start, end, result);
        
        scanner.close();
        return title + answer;
    }
}
