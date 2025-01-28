package myCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalcularor extends JFrame {

	private double total1 = 0.0;
	private double total2 = 0.0;
	private char math_operator;
	private JPanel contentPane;
	private JTextField outputTextField;
	private JTextField txtNumber_1;
	private JTextField txtNumber_2;
	private JTextField textFieldResult;
	private JTextField celsiusTextField;
	private JTextField fahrenheitTextField;

	public void getOperator(String btnText) {

			try {
				math_operator = btnText.charAt(0);
				total1 += Double.parseDouble(outputTextField.getText());
				 outputTextField.setText("");
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				outputTextField.setText("You must enter a number!");
			}
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalcularor frame = new MyCalcularor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyCalcularor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 776);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String btnOneText = outputTextField.getText() + btn_1.getText();
				String textField = outputTextField.getText();
				outputTextField.setText(btnOneText);
			}
		});
		btn_1.setFont(new Font("Verdana", Font.BOLD, 15));
		btn_1.setBounds(46, 138, 65, 40);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String btnTwoText = outputTextField.getText() + btn_2.getText();
				String textField = outputTextField.getText();
				outputTextField.setText(btnTwoText);
			}
		});
		btn_2.setFont(new Font("Verdana", Font.BOLD, 15));
		btn_2.setBounds(147, 138, 65, 40);
		contentPane.add(btn_2);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String button_text = btnDivide.getText();
					getOperator( button_text);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					outputTextField.setText("Please enter a valid number!");
				}
			}
		});
		btnDivide.setFont(new Font("Verdana", Font.BOLD, 15));
		btnDivide.setBounds(364, 138, 65, 40);
		contentPane.add(btnDivide);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String btnThreeText = outputTextField.getText() + btn_3.getText();
				String textField = outputTextField.getText();
				outputTextField.setText(btnThreeText);
			}
		});
		btn_3.setFont(new Font("Verdana", Font.BOLD, 15));
		btn_3.setBounds(255, 138, 65, 40);
		contentPane.add(btn_3);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String button_text = btnMultiply.getText();
					getOperator( button_text);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					outputTextField.setText("Please enter a valid number!");
				}
			}
		});
		btnMultiply.setFont(new Font("Verdana", Font.BOLD, 15));
		btnMultiply.setBounds(364, 214, 65, 40);
		contentPane.add(btnMultiply);
		

		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String btnFourText = outputTextField.getText() + btn_4.getText();
				String textField = outputTextField.getText();
				outputTextField.setText(btnFourText);
			}
		});
		btn_4.setFont(new Font("Verdana", Font.BOLD, 15));
		btn_4.setBounds(46, 214, 65, 40);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String btnFiveText = outputTextField.getText() + btn_5.getText();
				String textField = outputTextField.getText();
				outputTextField.setText(btnFiveText);
			}
		});
		btn_5.setFont(new Font("Verdana", Font.BOLD, 15));
		btn_5.setBounds(147, 214, 65, 40);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String btnSixText = outputTextField.getText() + btn_6.getText();
				String textField = outputTextField.getText();
				outputTextField.setText(btnSixText);
			}
		});
		btn_6.setFont(new Font("Verdana", Font.BOLD, 15));
		btn_6.setBounds(255, 214, 65, 40);
		contentPane.add(btn_6);
		
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String btnSevenText = outputTextField.getText() + btn_7.getText();
				String textField = outputTextField.getText();
				outputTextField.setText(btnSevenText);
			}
		});
		btn_7.setFont(new Font("Verdana", Font.BOLD, 15));
		btn_7.setBounds(46, 285, 65, 40);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String btnEightText = outputTextField.getText() + btn_8.getText();
				String textField = outputTextField.getText();
				outputTextField.setText(btnEightText);
			}
		});
		btn_8.setFont(new Font("Verdana", Font.BOLD, 15));
		btn_8.setBounds(147, 285, 65, 40);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String btnNineText = outputTextField.getText() + btn_9.getText();
				String textField = outputTextField.getText();
				outputTextField.setText(btnNineText);
			}
		});
		btn_9.setFont(new Font("Verdana", Font.BOLD, 15));
		btn_9.setBounds(255, 285, 65, 40);
		contentPane.add(btn_9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//total1 += Double.parseDouble(outputTextField.getText());
				//outputTextField.setText(" ");
				
				try {
					String button_text = btnPlus.getText();
					getOperator( button_text);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					outputTextField.setText("Please enter a valid number!");
				}
			}
		});
		btnPlus.setFont(new Font("Verdana", Font.BOLD, 15));
		btnPlus.setBounds(364, 349, 65, 40);
		contentPane.add(btnPlus);
		
		
		JButton btnEqualsTo = new JButton("=");
		btnEqualsTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						switch(math_operator) {
						
						case '+' :
								total2 = total1 + Double.parseDouble(outputTextField.getText());
								break;
								
						case '-' :
							total2 = total1 - Double.parseDouble(outputTextField.getText());
							break;
						
						case '/' :
							total2 = total1 / Double.parseDouble(outputTextField.getText());
							break;
							
						case '*' :
						total2 = total1 * Double.parseDouble(outputTextField.getText());
						break;
									
						}
						
					} catch (NumberFormatException e1) {
						// TODO Auto-generated catch block
						outputTextField.setText("You must enter a number!");
						
					}
			
			outputTextField.setText(Double.toString(total2));
			total1 = 0;
					
			}
		});
		btnEqualsTo.setFont(new Font("Verdana", Font.BOLD, 15));
		btnEqualsTo.setBounds(255, 349, 65, 40);
		contentPane.add(btnEqualsTo);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String button_text = btnMinus.getText();
					getOperator( button_text);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					outputTextField.setText("Please enter a valid number!");
				}
			}
		});
		btnMinus.setFont(new Font("Verdana", Font.BOLD, 15));
		btnMinus.setBounds(364, 285, 65, 40);
		contentPane.add(btnMinus);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String btnDotText = outputTextField.getText() + btnDot.getText();
				String textField = outputTextField.getText();
				outputTextField.setText(btnDotText);
			}
		});
		btnDot.setFont(new Font("Verdana", Font.BOLD, 15));
		btnDot.setBounds(147, 349, 65, 40);
		contentPane.add(btnDot);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String btnZeroText = outputTextField.getText() + btn_0.getText();
				String textField = outputTextField.getText();
				outputTextField.setText(btnZeroText);
				
			}
		});
		btn_0.setFont(new Font("Verdana", Font.BOLD, 15));
		btn_0.setBounds(46, 349, 65, 40);
		contentPane.add(btn_0);
		
		outputTextField = new JTextField();
		outputTextField.setFont(new Font("Verdana", Font.BOLD, 17));
		outputTextField.setBounds(46, 56, 383, 58);
		contentPane.add(outputTextField);
		outputTextField.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				total2 = 0;
				outputTextField.setText("");
				txtNumber_1.setText("");
				txtNumber_2.setText("");
				textFieldResult.setText("");
				celsiusTextField.setText("");
				fahrenheitTextField.setText("");
			}
		});
		btnClear.setFont(new Font("Verdana", Font.BOLD, 16));
		btnClear.setBounds(108, 672, 91, 51);
		contentPane.add(btnClear);
		
		JLabel titleLabel = new JLabel("Calculator");
		titleLabel.setFont(new Font("Verdana", Font.BOLD, 22));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(91, 10, 302, 40);
		contentPane.add(titleLabel);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 16));
		btnNewButton.setBounds(344, 671, 85, 52);
		contentPane.add(btnNewButton);
		
		txtNumber_1 = new JTextField();
		txtNumber_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumber_1.setFont(new Font("Verdana", Font.BOLD, 15));
		txtNumber_1.setText("Part %");
		txtNumber_1.setBounds(146, 406, 79, 44);
		contentPane.add(txtNumber_1);
		txtNumber_1.setColumns(10);
		
		JButton btnGetPercentage = new JButton("Get %");
		btnGetPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float percentPart, percentWhole,result;
				
				try {
					percentPart = Float.parseFloat(txtNumber_1.getText());
					percentWhole = Float.parseFloat(txtNumber_2.getText());
					result = (percentPart /percentWhole) * 100;
					textFieldResult.setText(String.valueOf(result));
				} 
				catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					textFieldResult.setText("You must enter two number!");
				
				}
				
				
				
			}
		});
		btnGetPercentage.setFont(new Font("Verdana", Font.BOLD, 16));
		btnGetPercentage.setBounds(35, 406, 91, 40);
		contentPane.add(btnGetPercentage);
		
		txtNumber_2 = new JTextField();
		txtNumber_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumber_2.setText("Whole");
		txtNumber_2.setFont(new Font("Verdana", Font.BOLD, 15));
		txtNumber_2.setColumns(10);
		txtNumber_2.setBounds(350, 406, 79, 44);
		contentPane.add(txtNumber_2);
		
		textFieldResult = new JTextField();
		textFieldResult.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldResult.setFont(new Font("Verdana", Font.BOLD, 15));
		textFieldResult.setColumns(10);
		textFieldResult.setBounds(147, 469, 274, 40);
		contentPane.add(textFieldResult);
		
		JLabel lblNewLabel = new JLabel("of");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel.setBounds(259, 406, 52, 44);
		contentPane.add(lblNewLabel);
		
		JLabel celsiusLabel = new JLabel("Celsius");
		celsiusLabel.setHorizontalAlignment(SwingConstants.CENTER);
		celsiusLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		celsiusLabel.setBounds(237, 533, 91, 40);
		contentPane.add(celsiusLabel);
		
		JLabel FahrenheitLabel = new JLabel("Fahrenheit");
		FahrenheitLabel.setHorizontalAlignment(SwingConstants.CENTER);
		FahrenheitLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		FahrenheitLabel.setBounds(225, 635, 120, 40);
		contentPane.add(FahrenheitLabel);
		
		celsiusTextField = new JTextField();
		celsiusTextField.setHorizontalAlignment(SwingConstants.CENTER);
		celsiusTextField.setFont(new Font("Verdana", Font.BOLD, 16));
		celsiusTextField.setBounds(324, 534, 105, 40);
		contentPane.add(celsiusTextField);
		celsiusTextField.setColumns(10);
		
		fahrenheitTextField = new JTextField();
		fahrenheitTextField.setHorizontalAlignment(SwingConstants.CENTER);
		fahrenheitTextField.setFont(new Font("Verdana", Font.BOLD, 16));
		fahrenheitTextField.setColumns(10);
		fahrenheitTextField.setBounds(147, 591, 282, 40);
		contentPane.add(fahrenheitTextField);
		
		JButton convertBtn = new JButton("Convert");
		convertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double fahrenheit = Double.parseDouble(celsiusTextField.getText())*(1.8) + 32;
					fahrenheitTextField.setText(String.valueOf(fahrenheit));
				} 
				catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					fahrenheitTextField.setText("You must enter a number!");
				}
				
			}
		});
		convertBtn.setFont(new Font("Verdana", Font.BOLD, 16));
		convertBtn.setBounds(108, 533, 128, 40);
		contentPane.add(convertBtn);
	}
}
