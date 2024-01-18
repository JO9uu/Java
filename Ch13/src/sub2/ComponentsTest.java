package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUId;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt6;
	private JTextField txt7;
	private JTextField txt8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame(); //프레임 생성
		frame.setBounds(100, 100, 450, 684); //프레임크기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트실습");
		lblNewLabel.setBounds(12, 10, 77, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 클릭 했을 때 실행되는 리스너(핸들러)
				System.out.println("확인1 클릭!!!");
			}
		});
		btn1.setBounds(12, 78, 97, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭!!!");
				
			}
		});
		
		btn2.setBounds(114, 78, 97, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog
						(null, "버튼3 클릭!!!", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("Yes 클릭...");
				}else {
					System.out.println("No 클릭...");
				}
				
			}
		});
		btn3.setBounds(216, 78, 97, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(12, 53, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("텍스트 필드 실습");
		lblNewLabel_2.setBounds(12, 111, 97, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtUId = new JTextField();
		txtUId.setBounds(53, 136, 116, 21);
		frame.getContentPane().add(txtUId);
		txtUId.setColumns(10);
		
		JButton btnUId = new JButton("확인");
		
		btnUId.setBounds(170, 135, 97, 23);
		frame.getContentPane().add(btnUId);
		
		JLabel lbResultUId = new JLabel("결과:");
		lbResultUId.setBounds(267, 139, 57, 15);
		frame.getContentPane().add(lbResultUId);
		
		JLabel lblNewLabel_4 = new JLabel("아이디");
		lblNewLabel_4.setBounds(12, 136, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("이름");
		lblNewLabel_4_1.setBounds(12, 168, 57, 15);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(53, 168, 116, 21);
		frame.getContentPane().add(txtName);
		
		JButton btnName = new JButton("확인");
		
		btnName.setBounds(170, 167, 97, 23);
		frame.getContentPane().add(btnName);
		
		JLabel lbResultName = new JLabel("결과:");
		lbResultName.setBounds(267, 171, 57, 15);
		frame.getContentPane().add(lbResultName);
		
		JLabel lblNewLabel_4_2 = new JLabel("휴대폰");
		lblNewLabel_4_2.setBounds(12, 199, 57, 15);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(53, 199, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JButton btnHp = new JButton("확인");
		
		btnHp.setBounds(170, 198, 97, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lbResultHp = new JLabel("결과:");
		lbResultHp.setBounds(267, 202, 57, 15);
		frame.getContentPane().add(lbResultHp);
		
		JLabel lblNewLabel_3 = new JLabel("덧셈");
		lblNewLabel_3.setBounds(12, 236, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		txt1 = new JTextField();
		txt1.setBounds(39, 233, 57, 21);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(108, 233, 61, 21);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		JButton btnPlus = new JButton("확인");
		
		btnPlus.setBounds(180, 232, 68, 23);
		frame.getContentPane().add(btnPlus);
		
		JLabel lbResultPlus = new JLabel("결과:");
		lbResultPlus.setBounds(256, 236, 57, 15);
		frame.getContentPane().add(lbResultPlus);
		
		JLabel lblNewLabel_6 = new JLabel("+");
		lblNewLabel_6.setBounds(98, 236, 57, 15);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_3_1 = new JLabel("뺄셈");
		lblNewLabel_3_1.setBounds(12, 265, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(39, 262, 57, 21);
		frame.getContentPane().add(txt3);
		
		JLabel lblNewLabel_6_1 = new JLabel("-");
		lblNewLabel_6_1.setBounds(98, 265, 57, 15);
		frame.getContentPane().add(lblNewLabel_6_1);
		
		txt4 = new JTextField();
		txt4.setColumns(10);
		txt4.setBounds(108, 262, 61, 21);
		frame.getContentPane().add(txt4);
		
		JButton btnMinus = new JButton("확인");
		
		btnMinus.setBounds(180, 261, 68, 23);
		frame.getContentPane().add(btnMinus);
		
		JLabel lbResultMinus = new JLabel("결과:");
		lbResultMinus.setBounds(256, 265, 57, 15);
		frame.getContentPane().add(lbResultMinus);
		
		JLabel lblNewLabel_3_2 = new JLabel("곱셈");
		lblNewLabel_3_2.setBounds(12, 294, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		txt5 = new JTextField();
		txt5.setColumns(10);
		txt5.setBounds(39, 291, 57, 21);
		frame.getContentPane().add(txt5);
		
		JLabel lblNewLabel_6_2 = new JLabel("*");
		lblNewLabel_6_2.setBounds(98, 294, 57, 15);
		frame.getContentPane().add(lblNewLabel_6_2);
		
		txt6 = new JTextField();
		txt6.setColumns(10);
		txt6.setBounds(108, 291, 61, 21);
		frame.getContentPane().add(txt6);
		
		JButton btnMulti = new JButton("확인");
		
		btnMulti.setBounds(180, 290, 68, 23);
		frame.getContentPane().add(btnMulti);
		
		JLabel lbResultMulti = new JLabel("결과:");
		lbResultMulti.setBounds(256, 294, 57, 15);
		frame.getContentPane().add(lbResultMulti);
		
		JLabel lblNewLabel_3_3 = new JLabel("나눗셈");
		lblNewLabel_3_3.setBounds(12, 323, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		txt7 = new JTextField();
		txt7.setColumns(10);
		txt7.setBounds(53, 319, 57, 21);
		frame.getContentPane().add(txt7);
		
		JLabel lblNewLabel_6_3 = new JLabel("/");
		lblNewLabel_6_3.setBounds(112, 322, 57, 15);
		frame.getContentPane().add(lblNewLabel_6_3);
		
		txt8 = new JTextField();
		txt8.setColumns(10);
		txt8.setBounds(122, 320, 61, 21);
		frame.getContentPane().add(txt8);
		
		JButton btnDivide = new JButton("확인");
		
		btnDivide.setBounds(190, 319, 68, 23);
		frame.getContentPane().add(btnDivide);
		
		JLabel lbResultDivide = new JLabel("결과:");
		lbResultDivide.setBounds(267, 323, 57, 15);
		frame.getContentPane().add(lbResultDivide);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 392, 61, 23);
		frame.getContentPane().add(chk1);
		
		JLabel lblNewLabel_5 = new JLabel("체크박스 실습");
		lblNewLabel_5.setBounds(12, 363, 77, 23);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(82, 392, 61, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(147, 392, 61, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(216, 392, 61, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(281, 392, 61, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbCheckResult = new JLabel("결과:");
		lbCheckResult.setBounds(12, 432, 278, 49);
		frame.getContentPane().add(lbCheckResult);
		
		JButton btnCheck = new JButton("확인");
		
		btnCheck.setBounds(341, 392, 68, 23);
		frame.getContentPane().add(btnCheck);
		
		//이벤트 리스너
		btnUId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				//텍스트 필드에 입력된 문자열 가져오기
				String uid = txtUId.getText();
				
				//결과 라벨에 가져온 문자열 입력하기
				lbResultUId.setText("결과: " + uid);
				
				
			}
		});
		
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String name = txtName.getText();
			
			lbResultName.setText("결과: " + name);
			
			
			
			}
		});
	
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = txtHp.getText();
				
				lbResultHp.setText("결과: " + hp);
				
				
			}
		});
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(txt1.getText());
				int num2 = Integer.parseInt(txt2.getText());

				
				int result1 = num1 + num2;
				lbResultPlus.setText("결과: " + result1);
				
				
			}
		});
		
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num3 = Integer.parseInt(txt3.getText());
				int num4 = Integer.parseInt(txt4.getText());
				
				int result2 = num3 - num4;
				lbResultMinus.setText("결과 : " + result2);
				
				
				
				
			}
		});
		
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int num5 = Integer.parseInt(txt5.getText());
				int num6 = Integer.parseInt(txt6.getText());
				
				int result3 = num5 * num6;
				lbResultMulti.setText("결과 : " + result3);
			
			
			}
		});
		
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int num7 = Integer.parseInt(txt7.getText());
				int num8 = Integer.parseInt(txt8.getText());
				
				int result4 = num7 / num8;
				lbResultDivide.setText("결과 : " + result4);
			
			}
		});
		
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()){
					cities.add(chk1.getText());
				}
				
				if(chk2.isSelected()){
					cities.add(chk2.getText());
				}
				
				if(chk3.isSelected()){
					cities.add(chk3.getText());
				}
				
				if(chk4.isSelected()){
					cities.add(chk4.getText());
				}
				
				if(chk5.isSelected()){
					cities.add(chk5.getText());
				}
				lbCheckResult.setText("결과: " + cities);
			}
		});
		
		
	}
}
