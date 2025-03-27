package day03;


import java.util.Scanner;  // Scanner 클래스를 사용하여 사용자 입력을 받을 수 있도록함

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int number = sc.nextInt();  // 사용자로부터 정수 입력을 받아 'number' 변수에 저장함
        int answer = 0;  // 2자리씩 잘라서 더한 값을 저장할 변수인 answer를 초기화하기 위해 넣음
        
        while(number > 0) {  // number가 0보다 클 때까지 반복 (number가 남아있을 때까지)
            answer += number % 100;  // number의 마지막 두 자리를 더함 (number % 100은 끝 두 자리를 구함)
            number /= 100;  // number를 100으로 나누어 마지막 두 자리를 잘라냄 그리고 다시 갱신함
        }

        System.out.println(answer);  // 누적된 합을 출력
   
        
    }
}
