package 자바입문;
import java.util.*;
/*
시험 점수를 입력받아  평균 점수에 따라
90 ~ 100점은 A, 
80 ~ 89점은 B, 
70 ~ 79점은 C, 
60 ~ 69점은 D, 
나머지 점수는 F를 출력하는 프로그램을 작성하시오.

입력
학생 이름과 시험점수(국어, 영어, 수학)를 입력한다.
첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
시험 성적을 출력한다.

******************************************************************
이름 국어 영어 수학 총점 평균 등급
******************************************************************
홍길동 90 90 90 270 90
****************************************************************** 
 */
public class 성적표 {
    public static void main(String[] args) {
        성적표 solution = new 성적표();
        System.out.println(solution.solution());
    }
    public String solution(){

        Scanner scanner = new Scanner(System.in);
        final int SCORE_MAX = 100;
        final int SCORE_MIN = 0;
        final int SUBJECT_SIZE = 3;
        String name = "";
        int korean = 0;
        int english = 0;
        int math = 0;
        int sum = 0;
        float average = 0.0f;
        String grade = "";
        System.out.println("이름을 입력해주세요");
        name = scanner.nextLine();
        System.out.println("국어점수를 입력해주세요");
        korean = scanner.nextInt();
        while(korean < SCORE_MIN || korean > SCORE_MAX){
            System.out.println("잘못되 수치입니다.");
            System.out.println("국어점수를 입력해주세요");
            korean = scanner.nextInt();
        }
        System.out.println("영어점수를 입력해주세요");
        english = scanner.nextInt();
        while(english < SCORE_MIN || english > SCORE_MAX){
            System.out.println("잘못되 수치입니다.");
            System.out.println("영어점수를 입력해주세요");
            english = scanner.nextInt();
        }
        System.out.println("수학점수를 입력해주세요");
        math  = scanner.nextInt();
        while(math < SCORE_MIN || math > SCORE_MAX){
            System.out.println("잘못되 수치입니다.");
            System.out.println("수학점수를 입력해주세요");
            math = scanner.nextInt();
        }
        sum = korean + english + math;
        average = (float)sum / SUBJECT_SIZE;

        if(average >= 90){
            grade = "A";
        } else if (average >= 80){
            grade = "B";
        } else if (average >= 70){
            grade = "C";
        } else if (average >= 60){
            grade = "D";
        } else if (average >= 50){
            grade = "E";
        } else {
            grade = "F";
        }

        String title = "### 성적표 ###\n";
        String answer = String.format(
            "******************************************************************\n"
            + "이름 국어 영어 수학 총점 평균 등급\n"
            + "******************************************************************\n"
            + "%s %d %d %d %d %.1f %s\n"
            + "******************************************************************\n" , name, korean, english, math, sum, average, grade);
        scanner.close();
        return title + answer;
    }
    
}
