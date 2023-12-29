package sub4;
/*
 * 날짜: 23.12.29
 * 이름: 정원구
 * 학습: 매서드오버로드 학습
 * 
 * 매서브 오버로드
 * -같은 이름의 매서드를 매개변수로 구분한 매서드
 * -매개변수 갯수, 타입으로 구분
 * -반환 타입은 매서드 오버로드 지원x
 * 
 
 */
public class MethodOverloadTest {
public static void main(String[] args) {
	int r1 = add(3);
	int r2 = add(1, 2 );
	double r3 = add(1.1, 2.1);
	String r4 = add("Hello", "World");
	
	System.out.println("r1 : " + r1);
	System.out.println("r2 : " + r2);
	System.out.println("r3 : " + r3);
	System.out.println("r4 : " + r4);
	
	
	
	
}

//매서드 오버로딩
public static int add (int a) {
	return a+a;
}
public static int add (int a, int b) {
    return a+b;
}
public static double add(double a, double b) {
	return a+ b;
}
public static String add(String a, String b) {
	return a+ b;
}

}
