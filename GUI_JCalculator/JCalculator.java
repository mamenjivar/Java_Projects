/**
 * Name: Menjivar, Miguel
 * Project: #1
 * Date: 1/314
 * Course: CS-245-01-w18
 * 
 * Description:
 *      creating a simple calculator
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class JCalculator implements ActionListener {

	private JFrame frame;
	private JButton btnOne;
	private JButton btnTwo;
	private JButton btnThree;
	private JButton btnFour;
	private JButton btnFive;
	private JButton btnSix;
	private JButton btnSeven;
	private JButton btnEight;
	private JButton btnNine;
	private JButton btnClear;
	private JButton btnZero;
	private JButton btnEqual;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnTimes;
	private JButton btnDivide;
	private JLabel textBox;

	String firstSet = "";
	String secondSet = "";
	int operator;
	int result;

	/**
	 * Create the application.
	 */
	public JCalculator() {
		frame = new JFrame("Calculator"); // sets name to window and creates
		frame.setBounds(100, 100, 300, 370);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); // centers window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textBox = new JLabel();
		btnOne = new JButton("1");
		btnTwo = new JButton("2");
		btnThree = new JButton("3");
		btnFour = new JButton("4");
		btnFive = new JButton("5");
		btnSix = new JButton("6");
		btnSeven = new JButton("7");
		btnEight = new JButton("8");
		btnNine = new JButton("9");
		btnClear = new JButton("C");
		btnZero = new JButton("0");
		btnEqual = new JButton("=");
		btnPlus = new JButton("+");
		btnMinus = new JButton("-");
		btnTimes = new JButton("*");
		btnDivide = new JButton("/");

		textBox.setBounds(25, 25, 240, 50); // x, y, length, width
		textBox.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		frame.add(textBox);

		// buttons 7, 8, 9, /
		btnSeven.addActionListener(this);
		btnSeven.setBounds(25, 75, 60, 60);
		frame.add(btnSeven);
		btnEight.addActionListener(this);
		btnEight.setBounds(85, 75, 60, 60);
		frame.add(btnEight);
		btnNine.addActionListener(this);
		btnNine.setBounds(145, 75, 60, 60);
		frame.add(btnNine);
		btnDivide.addActionListener(this);
		btnDivide.setBounds(205, 75, 60, 60);
		frame.add(btnDivide);

		// buttons 4, 5, 6, *
		btnFour.addActionListener(this);
		btnFour.setBounds(25, 135, 60, 60);
		frame.add(btnFour);
		btnFive.addActionListener(this);
		btnFive.setBounds(85, 135, 60, 60);
		frame.add(btnFive);
		btnSix.addActionListener(this);
		btnSix.setBounds(145, 135, 60, 60);
		frame.add(btnSix);
		btnTimes.addActionListener(this);
		btnTimes.setBounds(205, 135, 60, 60);
		frame.add(btnTimes);

		// buttons 1, 2, 3, -
		btnOne.addActionListener(this);
		btnOne.setBounds(25, 195, 60, 60);
		frame.add(btnOne);
		btnTwo.addActionListener(this);
		btnTwo.setBounds(85, 195, 60, 60);
		frame.add(btnTwo);
		btnThree.addActionListener(this);
		btnThree.setBounds(145, 195, 60, 60);
		frame.add(btnThree);
		btnMinus.addActionListener(this);
		btnMinus.setBounds(205, 195, 60, 60);
		frame.add(btnMinus);

		// buttons clear, 0, =, +
		btnClear.addActionListener(this);
		btnClear.setBounds(25, 255, 60, 60);
		frame.add(btnClear);
		btnZero.addActionListener(this);
		btnZero.setBounds(85, 255, 60, 60);
		frame.add(btnZero);
		btnEqual.addActionListener(this);
		btnEqual.setBounds(145, 255, 60, 60);
		frame.add(btnEqual);
		btnPlus.addActionListener(this);
		btnPlus.setBounds(205, 255, 60, 60);
		frame.add(btnPlus);

		// set textfield to have default number 0
		textBox.setText("0");
		textBox.setFont(new Font("Courrier", Font.BOLD, 18));
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		textBox.setBorder(border);
	}
	
	/**
	 * action that is performed when the button is pressed
	 */
	public void actionPerformed(ActionEvent ae) {
		if (textBox.getText().length() <= 9) {
			if ((ae.getModifiers() & ActionEvent.SHIFT_MASK) != 0 && (ae.getModifiers() & ActionEvent.CTRL_MASK) != 0 && (ae.getSource() == btnClear)) {
				textBox.setText("(c) 2018 Miguel Menjivar");
			} else if (ae.getSource() == btnZero) {
				if (textBox.getText() == "0") {
					textBox.setText(null);
					textBox.setText("0");
				} else {
					textBox.setText(textBox.getText().concat("0"));
				}
			} else if (ae.getSource() == btnOne) {
				if (textBox.getText() == "0") {
					textBox.setText(null);
					textBox.setText("1");
				} else {
					textBox.setText(textBox.getText().concat("1"));
				}
			} else if (ae.getSource() == btnTwo) {
				if (textBox.getText() == "0") {
					textBox.setText(null);
					textBox.setText("2");
				} else {
					textBox.setText(textBox.getText().concat("2"));
				}
			} else if (ae.getSource() == btnThree) {
				if (textBox.getText() == "0") {
					textBox.setText(null);
					textBox.setText("3");
				} else {
					textBox.setText(textBox.getText().concat("3"));
				}
			} else if (ae.getSource() == btnFour) {
				if (textBox.getText() == "0") {
					textBox.setText(null);
					textBox.setText("4");
				} else {
					textBox.setText(textBox.getText().concat("4"));
				}
			} else if (ae.getSource() == btnFive) {
				if (textBox.getText() == "0") {
					textBox.setText(null);
					textBox.setText("5");
				} else {
					textBox.setText(textBox.getText().concat("5"));
				}
			} else if (ae.getSource() == btnSix) {
				if (textBox.getText() == "0") {
					textBox.setText(null);
					textBox.setText("6");
				} else {
					textBox.setText(textBox.getText().concat("6"));
				}
			} else if (ae.getSource() == btnSeven) {
				if (textBox.getText() == "0") {
					textBox.setText(null);
					textBox.setText("7");
				} else {
					textBox.setText(textBox.getText().concat("7"));
				}
			} else if (ae.getSource() == btnEight) {
				if (textBox.getText() == "0") {
					textBox.setText(null);
					textBox.setText("8");
				} else {
					textBox.setText(textBox.getText().concat("8"));
				}
			} else if (ae.getSource() == btnNine) {
				if (textBox.getText() == "0") {
					textBox.setText(null);
					textBox.setText("9");
				} else {
					textBox.setText(textBox.getText().concat("9"));
				}
			} else if (ae.getSource() == btnClear) {
				textBox.setText(null);
				textBox.setText("0");
				firstSet = "";
				secondSet = "";
				operator = 0;
			} else if (ae.getSource() == btnPlus) {
				firstSet = textBox.getText();
				operator = 1;
				textBox.setText(null);
				textBox.setText("0");
			} else if (ae.getSource() == btnMinus) {
				firstSet = textBox.getText();
				operator = 2;
				textBox.setText(null);
				textBox.setText("0");
			} else if (ae.getSource() == btnTimes) {
				firstSet = textBox.getText();
				operator = 3;
				textBox.setText(null);
				textBox.setText("0");
			} else if (ae.getSource() == btnDivide) {
				firstSet = textBox.getText();
				operator = 4;
				textBox.setText(null);
				textBox.setText("0");
			} else if (ae.getSource() == btnEqual) {
				secondSet = textBox.getText();
				textBox.setText(null);
				switch (operator) {
				case 1:
					result = Integer.parseInt(firstSet) + Integer.parseInt(secondSet);
					if (result >= 999999999) {
						textBox.setText("Overflow");
					} else {
						textBox.setText(Integer.toString(result));
					}
					break;
				case 2:
					result = Integer.parseInt(firstSet) - Integer.parseInt(secondSet);
					textBox.setText(Integer.toString(result));
					break;
				case 3:
					result = Integer.parseInt(firstSet) * Integer.parseInt(secondSet);
					if (result >= 999999999) {
						textBox.setText("Overflow");
					} else {
						textBox.setText(Integer.toString(result));
					}
					break;
				case 4:
					if (secondSet.equals("0")) {
						textBox.setText("Div by 0");
					} else {
						result = Integer.parseInt(firstSet) / Integer.parseInt(secondSet);
						textBox.setText(Integer.toString(result));
					}
					break;
				}
			}
		} else {
			if (ae.getSource() == btnClear) {
				textBox.setText(null);
				textBox.setText("0");
				firstSet = "";
				result = 0;
				operator = 0;
			} else if (ae.getSource() == btnPlus) {
				firstSet = textBox.getText();
				operator = 1;
				textBox.setText(null);
				textBox.setText("0");
			} else if (ae.getSource() == btnMinus) {
				firstSet = textBox.getText();
				operator = 2;
				textBox.setText(null);
				textBox.setText("0");
			} else if (ae.getSource() == btnTimes) {
				firstSet = textBox.getText();
				operator = 3;
				textBox.setText(null);
				textBox.setText("0");
			} else if (ae.getSource() == btnDivide) {
				firstSet = textBox.getText();
				operator = 4;
				textBox.setText(null);
				textBox.setText("0");
			}
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCalculator window = new JCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
