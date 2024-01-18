package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcTest {

	private JFrame frame;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcTest window = new CalcTest();
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
	public CalcTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private int operator = 0; // 1:더하기, 2:빼기, 3:곱하기, 4:나누기 
	private int num1 = 0; 
	private int num2 = 0; 
	private int num3 = 0;
	private int num4 = 0;
	private int num5 = 0;
	private int num6 = 0;
	private int num7 = 0;
	private int num8 = 0;
	private int num9 = 0;
	private int num0 = 0;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 251, 357);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setBackground(new Color(255, 255, 255));
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setFont(new Font("굴림", Font.PLAIN, 24));
		txtResult.setEditable(false);
		txtResult.setText("0");
		txtResult.setBounds(12, 10, 211, 50);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(12, 70, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btnNewButton_2_1_1 = new JButton("x");
		btnNewButton_2_1_1.setBounds(173, 130, 50, 55);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(173, 260, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(65, 70, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(118, 70, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnNewButton_5 = new JButton("/");
		btnNewButton_5.setBounds(173, 70, 50, 50);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_2_1_1_1 = new JButton("-");
		btnNewButton_2_1_1_1.setBounds(173, 195, 50, 50);
		frame.getContentPane().add(btnNewButton_2_1_1_1);
		
		JButton btn4 = new JButton("4");
		
		btn4.setBounds(12, 130, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(65, 130, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(118, 130, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(12, 195, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(65, 195, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(118, 195, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnCancel = new JButton("c");
		btnCancel.setBounds(12, 260, 50, 50);
		frame.getContentPane().add(btnCancel);
		
		JButton btnNewButton_1_3 = new JButton("0");
		
		btnNewButton_1_3.setBounds(65, 260, 50, 50);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnEq = new JButton("=");
		btnEq.setBounds(118, 260, 50, 50);
		frame.getContentPane().add(btnEq);
		
		
		
		// 버튼 리스너
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 1;
			}
		});
		
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				
				if(operator == 1) {
					result = num1 + num2;	
				}else if(operator == 2) {
					
				}else if(operator == 3) {
					
				}else if(operator == 4) {
					
				}
				
				txtResult.setText(""+result);
			}
		});
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtResult.setText("0");
			num0 = 0;
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("1");
				num1 = 1;
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("2");
				num2 = 2;
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("3");
				num3 = 3;
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("4");
				num4 = 4;
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("5");
				num5 = 5;
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("6");
				num6 = 6;
			}
		});
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("7");
				num7 = 7;
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("8");
				num8 = 8;
			}
		});
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("9");
				num9 = 9;
			}
		});
		
		
		
		
	}

}