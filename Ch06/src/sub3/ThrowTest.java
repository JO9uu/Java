package sub3;
/*
 * 날짜 : 2024/01/08
 * 이름 : 정원구
 * 내용 : Java 예외 발생 시키기 실습하기
 */

//사용자 정의 예외 클래스
class MinusException extends Exception{
	public MinusException(String msg) {
		super(msg);
	}
	
}

class OverException extends Exception{
	public OverException(String msg) {
		super(msg);
		
	}
}

class Score{
	public void check(int score) throws MinusException, OverException {
		
		if(score<0) {
			//예외 발생 시키기
			throw new MinusException("정수는 음수가 될 수 없습니다");
			
		}else if(score > 100) {
			throw new OverException("점수는 100점을 초과할 수 없습니다");
			
		}else {
			
			System.out.println("점수는 이상 없습니다");
		}
	}
	
}

public class ThrowTest {
	public static void main(String[] args) {
		
		Score score = new Score();
		
		try {
			score.check(-3);
			score.check(-102);
			score.check(96);
		}catch(MinusException | OverException e) {
			
		}
		
	}

}
