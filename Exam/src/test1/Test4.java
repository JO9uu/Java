
package test1;

import java.util.Scanner;

public class Test4 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("점수 입력 : ");
	int score = sc.nextInt();
	String grade;
	
	
	
	System.out.println("입력한 점수는 " + score + "점 입니다." );
	
	
	if(score >= 90){
		grade = "A";
		
	}
	else if(score >=80){
		grade = "B";
	}
	else if(score >=70){	
        grade = "C";
        
	}
	else if(score >=60) {
		grade = "D";
		
	}
	else {
		grade = "F";
		
	}
	
	System.out.printf("%등급은 %c 입니다." + grade);
	
	sc.close();
	
}
}