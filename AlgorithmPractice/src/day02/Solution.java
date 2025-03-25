package day02;
import java.util.Scanner;

//각도를 나타내는 두 정수 angle1 & angle2 이 두각도가 0도이상 360도 
// 미만으로 출력되게 만드는 코드 
//제한사항 : 0 ≤ angle1 ≤ 5000, 0 ≤ angle2 ≤ 5000
public class Solution {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        //입력 : 두개의 정수(각도)
	        int angle1 = sc.nextInt(); // ex : 30
	        int angle2 = sc.nextInt(); // ex : 90

	        
	        //출력 : 두 각도의 합을 360으로 나눈 나머지
	        int sum_angle = (angle1 + angle2)%360;
	        System.out.println(sum_angle);
	        //ex 값 : 120
	    }
	}

