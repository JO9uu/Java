package Ch02.sec11;

public class VariableScopeExample {
public static void main(String[] args) {
	for(int v=0; v<=10; v++)
	if (v<10) {
		int v2 = v-10;
			
	int v3 = v * 2 + 5; 
	System.out.println("결과1  " + v);
	System.out.println("결과2  " + v2);
	System.out.println("결과3  " + v3);
	
}
}}
