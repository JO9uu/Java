package sub3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 날짜: 2024/01/11
 * 이름: 정원구
 * 내용: Java 직렬화 연습
 */

public class DEserializeTest {
	
	public static void main(String[] args) {
		
		String sorce = "C:\\Users\\java\\Desktop\\Apple.txt";
		
		try {
			//객체를 직렬화 하기 위한 스트림 생성
			FileInputStream fis = new FileInputStream(sorce);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//객체 역직렬화
			Apple apple = (Apple) ois.readObject();
			apple.show();
			
			//스트림 해제
			ois.close();
			fis.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
