package 자바입문;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;
/*
 * Lotto1

로또번호 생성기를 만들 거다

조건)

1. 서로 겹치지 않는 숫자 6개를 생성

2. 각 숫자는 1 ~ 45 범위 내의 숫자

3. 매번 실행 시 다른 숫자 출력

4. 오름차순 정렬

-> 랜덤수 : Math 사용

입력은 없다.
 

결과)

******************************************************************
로또 추첨 결과
******************************************************************
2 11 25 27 35 38
******************************************************************


 */
public class 로또생성기 {
    public static void main(String[] args) {
        로또생성기 solution = new 로또생성기();
        System.out.println(solution.solution());
    }
    public String solution(){
        String title = " ### LOTTO ### \n";
        Random random = new Random();
        final int LOTTO_SIZE = 6;
        final int LOTTO_MAX = 45;
        final int LOTTO_MIN = 1;
        String result = "";
        int[] lotto_num = new int[LOTTO_SIZE];
        for(int i = 0; i < lotto_num.length; i++){
            lotto_num[i] = random.nextInt(LOTTO_MAX) + LOTTO_MIN;
            
        }
        for(int i = 0; i > lotto_num.length; i++){
            result += lotto_num[i] + "\t";
        }
        String answer = String.format(
        "******************************************************************\n"
        + "로또 추첨 결과\n"
        + "******************************************************************\n"
        + "%s\n"
        + "******************************************************************", result);
        return title + answer;
    }
    
}
