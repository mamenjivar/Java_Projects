/**
 * @author Miguel Menjivar
 * 
 * Date: 3/18/2018
 * 
 * Tic-Tac-Toe:
 * A simple GUI based game of Tic Tac Toe. 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe {

	private JFrame frame;

	private JPanel rowOneOne;
	private JPanel rowOneTwo;
	private JPanel rowOneThree;
	private JPanel rowTwoOne;
	private JPanel rowTwoTwo;
	private JPanel rowTwoThree;
	private JPanel rowThreeOne;
	private JPanel rowThreeTwo;
	private JPanel rowThreeThree;

	private JLabel label;
	private JLabel footer;
	private JLabel blockOne = new JLabel();
	private JLabel blockTwo = new JLabel();
	private JLabel blockThree = new JLabel();
	private JLabel blockFour = new JLabel();
	private JLabel blockFive = new JLabel();
	private JLabel blockSix = new JLabel();
	private JLabel blockSeven = new JLabel();
	private JLabel blockEight = new JLabel();
	private JLabel blockNine = new JLabel();

	private JButton btnOne;
	private JButton btnTwo;
	private JButton btnThree;
	private JButton btnFour;
	private JButton btnFive;
	private JButton btnSix;
	private JButton btnSeven;
	private JButton btnEight;
	private JButton btnNine;
	private JButton btnTen;
	private JButton btnEleven;
	private JButton btnTwelve;
	private JButton btnThirteen;
	private JButton btnFourteen;
	private JButton btnFifteen;
	private JButton btnSixteen;
	private JButton btnSeventeen;
	private JButton btnEighteen;

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		// frame settings
		frame = new JFrame("Tic-Tac-Toe");
		frame.setSize(300, 400);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// have each button inside a label and stack them
		// 3 x 3
		label = new JLabel("Tic Tac Toe");
		label.setBounds(25, 10, 80, 20); 
		btnOne = new JButton("X");
		btnOne.setSize(200, 200);
		btnTwo = new JButton("O");
		btnTwo.setSize(100, 100);
		btnThree = new JButton("X");
		btnThree.setSize(25, 25);
		btnFour = new JButton("O");
		btnFour.setSize(25, 25);
		btnFive = new JButton("X");
		btnFive.setSize(25, 25);
		btnSix = new JButton("O");
		btnSix.setSize(25, 25);
		btnSeven = new JButton("X");
		btnSeven.setSize(25, 25);
		btnEight = new JButton("O");
		btnEight.setSize(25, 25);
		btnNine = new JButton("X");
		btnNine.setSize(25, 25);
		btnTen = new JButton("O");
		btnTen.setSize(25, 25);
		btnEleven = new JButton("X");
		btnEleven.setSize(25, 25);
		btnTwelve = new JButton("O");
		btnTwelve.setSize(25, 25);
		btnThirteen = new JButton("X");
		btnThirteen.setSize(25, 25);
		btnFourteen = new JButton("O");
		btnFourteen.setSize(25, 25);
		btnFifteen = new JButton("X");
		btnFifteen.setSize(25, 25);
		btnSixteen = new JButton("O");
		btnSixteen.setSize(25, 25);
		btnSeventeen = new JButton("X");
		btnSeventeen.setSize(25, 25);
		btnEighteen = new JButton("O");
		btnEighteen.setSize(25, 25);

		footer = new JLabel("Hello");
		footer.setBounds(100, 250, 150, 50);

		// adding both X and O buttons on each panel
		rowOneOne = new JPanel();
		rowOneOne.setLayout(new FlowLayout());
		rowOneOne.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		rowOneOne.setBounds(20, 30, 70, 75);
		rowOneOne.add(btnOne);
		rowOneOne.add(btnTwo);

		rowOneTwo = new JPanel();
		rowOneTwo.setLayout(new FlowLayout());
		rowOneTwo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		rowOneTwo.setBounds(90, 30, 70, 75);
		rowOneTwo.add(btnThree);
		rowOneTwo.add(btnFour);

		rowOneThree = new JPanel();
		rowOneThree.setLayout(new FlowLayout());
		rowOneThree.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		rowOneThree.setBounds(150, 30, 70, 75);
		rowOneThree.add(btnFive);
		rowOneThree.add(btnSix);

		rowTwoOne = new JPanel();
		rowTwoOne.setLayout(new FlowLayout());
		rowTwoOne.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		rowTwoOne.setBounds(20, 105, 70, 75);
		rowTwoOne.add(btnSeven);
		rowTwoOne.add(btnEight);

		rowTwoTwo = new JPanel();
		rowTwoTwo.setLayout(new FlowLayout());
		rowTwoTwo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		rowTwoTwo.setBounds(90, 105, 70, 75);
		rowTwoTwo.add(btnNine);
		rowTwoTwo.add(btnTen);

		rowTwoThree = new JPanel();
		rowTwoThree.setLayout(new FlowLayout());
		rowTwoThree.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		rowTwoThree.setBounds(150, 105, 70, 75);
		rowTwoThree.add(btnEleven);
		rowTwoThree.add(btnTwelve);

		rowThreeOne = new JPanel();
		rowThreeOne.setLayout(new FlowLayout());
		rowThreeOne.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		rowThreeOne.setBounds(20, 175, 70, 75);
		rowThreeOne.add(btnThirteen);
		rowThreeOne.add(btnFourteen);

		rowThreeTwo = new JPanel();
		rowThreeTwo.setLayout(new FlowLayout());
		rowThreeTwo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		rowThreeTwo.setBounds(90, 175, 70, 75);
		rowThreeTwo.add(btnFifteen);
		rowThreeTwo.add(btnSixteen);

		rowThreeThree = new JPanel();
		rowThreeThree.setLayout(new FlowLayout());
		rowThreeThree.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		rowThreeThree.setBounds(150, 175, 70, 75);
		rowThreeThree.add(btnSeventeen);
		rowThreeThree.add(btnEighteen);

		// added actionListeners to all the buttons inside each panel
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnOne.setVisible(false);
				btnTwo.setVisible(false);
				rowOneOne.add(blockOne);
				blockOne.setText(btnOne.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnOne.setVisible(false);
				btnTwo.setVisible(false);
				rowOneOne.add(blockOne);
				blockOne.setText(btnTwo.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnThree.setVisible(false);
				btnFour.setVisible(false);
				rowOneTwo.add(blockTwo);
				blockTwo.setText(btnThree.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnThree.setVisible(false);
				btnFour.setVisible(false);
				rowOneTwo.add(blockTwo);
				blockTwo.setText(btnFour.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnFive.setVisible(false);
				btnSix.setVisible(false);
				rowOneThree.add(blockThree);
				blockThree.setText(btnFive.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnFive.setVisible(false);
				btnSix.setVisible(false);
				rowOneThree.add(blockThree);
				blockThree.setText(btnSix.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnSeven.setVisible(false);
				btnEight.setVisible(false);
				rowTwoOne.add(blockFour);
				blockFour.setText(btnSeven.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnSeven.setVisible(false);
				btnEight.setVisible(false);
				rowTwoOne.add(blockFour);
				blockFour.setText(btnEight.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnNine.setVisible(false);
				btnTen.setVisible(false);
				rowTwoTwo.add(blockFive);
				blockFive.setText(btnNine.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}

		});

		btnTen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnNine.setVisible(false);
				btnTen.setVisible(false);
				rowTwoTwo.add(blockFive);
				blockFive.setText(btnTen.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnEleven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnEleven.setVisible(false);
				btnTwelve.setVisible(false);
				rowTwoThree.add(blockSix);
				blockSix.setText(btnEleven.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnTwelve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnEleven.setVisible(false);
				btnTwelve.setVisible(false);
				rowTwoThree.add(blockSix);
				blockSix.setText(btnTwelve.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnThirteen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnThirteen.setVisible(false);
				btnFourteen.setVisible(false);
				rowThreeOne.add(blockSeven);
				blockSeven.setText(btnThirteen.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnFourteen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnThirteen.setVisible(false);
				btnFourteen.setVisible(false);
				rowThreeOne.add(blockSeven);
				blockSeven.setText(btnFourteen.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnFifteen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnFifteen.setVisible(false);
				btnSixteen.setVisible(false);
				rowThreeTwo.add(blockEight);
				blockEight.setText(btnFifteen.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnSixteen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnFifteen.setVisible(false);
				btnSixteen.setVisible(false);
				rowThreeTwo.add(blockEight);
				blockEight.setText(btnSixteen.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnSeventeen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnSeventeen.setVisible(false);
				btnEighteen.setVisible(false);
				rowThreeThree.add(blockNine);
				blockNine.setText(btnSeventeen.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		btnEighteen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btnSeventeen.setVisible(false);
				btnEighteen.setVisible(false);
				rowThreeThree.add(blockNine);
				blockNine.setText(btnEighteen.getText());

				if (blockOne.getText().equals("X")
						&& (blockTwo.getText().equals("X") && (blockThree.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockFour.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSix.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockSeven.getText().equals("X")
						&& (blockEight.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFour.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockTwo.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockEight.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockSix.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockNine.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockThree.getText().equals("X")
						&& (blockFive.getText().equals("X") && (blockSeven.getText().equals("X")))) {
					footer.setText("You Win!");
				} else if (blockOne.getText().equals("O")
						&& (blockTwo.getText().equals("O") && (blockThree.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockFour.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSix.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockSeven.getText().equals("O")
						&& (blockEight.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFour.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockTwo.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockEight.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockSix.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockOne.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockNine.getText().equals("O")))) {
					footer.setText("You Lost!");
				} else if (blockThree.getText().equals("O")
						&& (blockFive.getText().equals("O") && (blockSeven.getText().equals("O")))) {
					footer.setText("You Lost!");
				}
			}
		});

		// add buttons and labels to the frame
		frame.add(label);
		frame.add(rowOneOne);
		frame.add(rowOneTwo);
		frame.add(rowOneThree);
		frame.add(rowTwoOne);
		frame.add(rowTwoTwo);
		frame.add(rowTwoThree);
		frame.add(rowThreeOne);
		frame.add(rowThreeTwo);
		frame.add(rowThreeThree);
		frame.add(footer);

		// make frame visible
		frame.setVisible(true);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TicTacToe();
			}
		});
	}
}
