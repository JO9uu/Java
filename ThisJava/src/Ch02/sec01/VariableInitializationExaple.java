package Ch02.sec01;


//37p
public class VariableInitializationExaple {
 
	
	public static void main(String[] args) {
		int value = 20;
					
		int result = value + 10;
		
		System.out.println(result);
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
		
		int x = 3; 
		int y= 4;
		System.out.println("x:" + x + ", y" + y);
		
		int z= x;
		x= y;
		y= z;
		System.out.println("x:" + x + ", y" + y);
		
		
	}
}
