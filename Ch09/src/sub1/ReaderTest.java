package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 날짜: 2024/01/11
 * 이름: 정원구
 * 내용: Java 데이터 입출력 스트링 실습
 */
public class ReaderTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\java\\Desktop\\text1.txt";
		String target = "C:\\Users\\java\\Desktop\\test2.txt";
		
		try {
			//스트림 생성(연결)
			FileReader fr = new FileReader(source);
			FileWriter fw = new FileWriter(target);
			
			while(true) {
				//파일 읽기
				int data = fr.read();
						
				if(data == -1) {
					//파일을 모두 읽었을 때 반복 종료
					break;
				}
				char ch = (char) data;
				
				//System.out.print(ch);
				
				fw.write(data);
			}
			
			//스트림 해제: 생성 후 무조건 해줘
			fr.close();
			fw.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
	}
}
