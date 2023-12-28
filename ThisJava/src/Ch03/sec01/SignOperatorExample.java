package Ch03.sec01;
//p. 78

public class SignOperatorExample {

	public static void main(String[] args) {
		
		
		/*
		 * 부호/증감 연산자
		 * +는 피연산자의 부호 유지
		 * -는 피연산자의 부호 변경 
		 */
		
		int x = -100;{
		x = -x;
		System.out.println("x : " + x);
		}
		byte b = 100;{
		int y = -b;
		System.out.println("y : " + y);
		}
		/*
		 * ++x는 x의 값을 1 증가 시킴
		 * --x는 x의 값을 1 감소 시킴
		 * x++은 다른 연산을 수행한 후 1 증가 시킴
		 * x--는 다른 연산을 수행한 후 1 감소 시킴
		 */
		System.out.println();
		int c = 10;
		int d = 10;
		int e;
		int f;
		c++;
		++c;
		System.out.println("c = " + c);
		System.out.println();
		System.out.println();
		 d--;
		 --d;
		System.out.println("d = " + d);
		System.out.println();
		System.out.println();
	    e = ++c;
	    f = --d;
		System.out.println("e = " + e);
		System.out.println("f = " + f);
	  
		
		
	}
}
