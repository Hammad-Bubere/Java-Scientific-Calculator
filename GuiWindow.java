package guiApplication;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class GuiWindow {

	private JFrame frame;
	private JTextField textField;

	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiWindow window = new GuiWindow();
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
	public GuiWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 9));
		frame.setBounds(100, 100, 323, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(48, 0, 220, 40);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBackground(SystemColor.controlHighlight);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(10, 36, 283, 70);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton.setBounds(10, 130, 58, 32);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("1/x");
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1 / (Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_1.setBounds(10, 165, 58, 32);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("X^Y");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "X^Y";
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_2.setBounds(10, 199, 58, 31);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("x^3");
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a * a;
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_3.setBounds(10, 232, 58, 31);
		frame.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("x^2");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a;
				textField.setText("");
				textField.setText(textField.getText() + a);

			}
		});
		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_4.setBounds(10, 263, 58, 32);
		frame.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("n!");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while (a != 0) {
					fact = fact * a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText() + fact);
			}
		});
		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_5.setBounds(10, 297, 58, 32);
		frame.getContentPane().add(btnNewButton_5);

		JButton btnPlusMin = new JButton("+/-");
		btnPlusMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a * (-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMin.setFont(new Font("Dialog", Font.BOLD, 13));
		btnPlusMin.setBounds(10, 332, 58, 40);
		frame.getContentPane().add(btnPlusMin);

		JButton btnNewButton_7 = new JButton("e^x");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnNewButton_7.setBounds(69, 130, 56, 32);
		frame.getContentPane().add(btnNewButton_7);

		JButton btnNewButton_1_1 = new JButton("log");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_1_1.setBounds(69, 165, 56, 32);
		frame.getContentPane().add(btnNewButton_1_1);

		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPercent.setBounds(69, 199, 56, 31);
		frame.getContentPane().add(btnPercent);

		final JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Dialog", Font.BOLD, 11));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBounds(69, 232, 53, 31);
		frame.getContentPane().add(btn7);

		final JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Dialog", Font.BOLD, 11));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBounds(69, 263, 53, 32);
		frame.getContentPane().add(btn4);

		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 11));
		btn1.setBounds(69, 297, 53, 32);
		frame.getContentPane().add(btn1);

		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnSin.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnSin.setBounds(126, 130, 53, 32);
		frame.getContentPane().add(btnSin);

		JButton btnNewButton_1_2 = new JButton("Sinh");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1_2.setBounds(126, 165, 54, 32);
		frame.getContentPane().add(btnNewButton_1_2);

		JButton btnClear = new JButton("AC");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setForeground(new Color(255, 0, 0));
		btnClear.setBounds(126, 199, 53, 31);
		frame.getContentPane().add(btnClear);

		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 11));
		btn8.setBounds(126, 232, 49, 31);
		frame.getContentPane().add(btn8);

		final JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Dialog", Font.BOLD, 11));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBounds(126, 263, 49, 32);
		frame.getContentPane().add(btn5);

		final JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Dialog", Font.BOLD, 11));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(126, 297, 49, 32);
		frame.getContentPane().add(btn2);

		final JButton btnNewButton_6_2 = new JButton("0");
		btnNewButton_6_2.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btnNewButton_6_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_6_2.setBounds(69, 332, 107, 40);
		frame.getContentPane().add(btnNewButton_6_2);

		JButton btnNewButton_9 = new JButton("Cos");
		btnNewButton_9.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_9.setBounds(180, 130, 57, 32);
		frame.getContentPane().add(btnNewButton_9);

		JButton btnNewButton_1_3 = new JButton("Cosh");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1_3.setBounds(180, 165, 57, 32);
		frame.getContentPane().add(btnNewButton_1_3);

		JButton btnBackSpace = new JButton("DEL");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackSpace.setForeground(new Color(255, 0, 0));
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnBackSpace.setBounds(180, 199, 57, 31);
		frame.getContentPane().add(btnBackSpace);

		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 11));
		btn9.setBounds(180, 232, 52, 31);
		frame.getContentPane().add(btn9);

		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 11));
		btn6.setBounds(180, 263, 52, 32);
		frame.getContentPane().add(btn6);

		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 11));
		btn3.setBounds(180, 297, 52, 32);
		frame.getContentPane().add(btn3);

		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDot.setBounds(180, 332, 52, 40);
		frame.getContentPane().add(btnDot);

		JButton btnNewButton_10 = new JButton("tan");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_10.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnNewButton_10.setBounds(238, 130, 59, 32);
		frame.getContentPane().add(btnNewButton_10);

		JButton btnNewButton_1_4 = new JButton("tanh");
		btnNewButton_1_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_1_4.setBounds(238, 165, 59, 32);
		frame.getContentPane().add(btnNewButton_1_4);

		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Dialog", Font.BOLD, 14));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnPlus.setBounds(238, 199, 59, 31);
		frame.getContentPane().add(btnPlus);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Dialog", Font.BOLD, 18));
		btnSub.setBounds(238, 232, 59, 31);
		frame.getContentPane().add(btnSub);

		JButton btnMul = new JButton("X");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMul.setFont(new Font("Dialog", Font.BOLD, 14));
		btnMul.setBounds(238, 263, 59, 32);
		frame.getContentPane().add(btnMul);

		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";

			}
		});
		btnDivide.setFont(new Font("Dialog", Font.BOLD, 15));
		btnDivide.setBounds(238, 297, 59, 32);
		frame.getContentPane().add(btnDivide);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "X^Y") {
					double resultt = 1;
					for (int i = 0; i < second; i++) {
						resultt = first * resultt;
					}

					answer = String.format("%.2f", resultt);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Dialog", Font.BOLD, 14));
		btnEqual.setBounds(238, 332, 59, 40);
		frame.getContentPane().add(btnEqual);
	}
}
