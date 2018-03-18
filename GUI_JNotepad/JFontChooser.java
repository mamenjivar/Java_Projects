/**
 * Name: Menjivar, Miguel 
 * Project: #3 
 * Date: March 3, 2018 
 * Course: CS-245-01-w18
 *
 * Description: creating a JFontChooser class implementation
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class JFontChooser {
	private String fontList[] = { "Courrier New", "Times new Roman", "Monospaced", "Bold", "Italic" };
	private String[] colors = { "Green", "Blue", "Black", "Red", "Gray" };
	private String[] size = { "5", "7", "10", "11", "25", "30" };
	private Font font;
	private Color color;

	/**
	 * set the default settings for the font
	 * 
	 * @param font
	 */
	public void setDefault(Font font) {
		font = new Font("monospaced", Font.BOLD, 20);
	}

	/**
	 * set default settings for color
	 * 
	 * @param color
	 */
	public void setDefault(Color color) {
		color = Color.GREEN;
	}

	/**
	 * open the dialog for fontchooser
	 */
	public void showDialog(JFrame frame) {
		JDialog dialog = new JDialog();
		JLabel label = new JLabel("Sample Text");
		JButton button = new JButton("Confirm");
		dialog.setVisible(true);
		dialog.setSize(400, 200);
		dialog.setLayout(new FlowLayout());
		dialog.setLocationRelativeTo(null);

		// font list block
		JList list = new JList(fontList);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollVertical = new JScrollPane(list);

		scrollVertical.setPreferredSize(new Dimension(100, 90));

		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent le) {
				int index = list.getSelectedIndex();
				if (index != -1) {
					// label.setFont(new Font(fontList[index], Font.PLAIN, 20));
					switch (index) {
					case 0:
						font = new Font(fontList[index], Font.PLAIN, 20);
						setFont(font);
						label.setFont(font);
						break;
					case 1:
						font = new Font(fontList[index], Font.PLAIN, 20);
						label.setFont(font);
						break;
					case 2:
						font = new Font(fontList[index], Font.PLAIN, 20);
						label.setFont(font);
						break;
					case 3:
						font = new Font("Serif", Font.BOLD, 20);
						setFont(font);
						label.setFont(font);
						break;
					case 4:
						font = new Font("Serif", Font.ITALIC, 20);
						setFont(font);
						label.setFont(font);
						break;
					}
				}
			}
		});

		// colors list block
		JList secondList = new JList(colors);
		secondList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane secondScroll = new JScrollPane(secondList);

		secondScroll.setPreferredSize(new Dimension(100, 90));

		secondList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent le) {
				int index2 = secondList.getSelectedIndex();
				// label.setBackground(colors[index]);
				if (index2 != -1) {
					switch (index2) {
					case 0:
						label.setForeground(Color.GREEN);
						setColor(Color.GREEN);
						break;
					case 1:
						label.setForeground(Color.BLUE);
						setColor(Color.BLUE);
						break;
					case 2:
						label.setForeground(Color.BLACK);
						setColor(Color.BLACK);
						break;
					case 3:
						label.setForeground(Color.RED);
						setColor(Color.RED);
						break;
					case 4:
						label.setForeground(Color.GRAY);
						color = Color.GRAY;
						break;
					}
				}
			}
		});

		// size of text list block
		JList thirdList = new JList(size);
		thirdList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane thirdScroll = new JScrollPane(thirdList);

		thirdScroll.setPreferredSize(new Dimension(100, 90));

		thirdList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent le) {
				int index3 = thirdList.getSelectedIndex();
				if (index3 != -1) {
					switch (index3) {
					case 0:
						font = new Font("monospaced", Font.PLAIN, 5);
						label.setFont(font);
					case 1:
						font = new Font("monospaced", Font.PLAIN, 7);
						label.setFont(font);
						break;
					case 2:
						font = new Font("monospaced", Font.PLAIN, 10);
						label.setFont(font);
						break;
					case 3:
						font = new Font("monospaced", Font.PLAIN, 11);
						label.setFont(font);
						break;
					case 4:
						font = new Font("monospaced", Font.PLAIN, 25);
						label.setFont(font);
						break;
					case 5:
						font = new Font("monospaced", Font.PLAIN, 30);
						label.setFont(font);
						break;
					}
				}
			}
		});

		// closes dialog when pressed
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// color = Color.BLUE;
				getColor();
				getFont();
				dialog.setVisible(false);
			}
		});

		// adds functions to the dialog box
		dialog.add(scrollVertical);
		dialog.add(secondScroll);
		dialog.add(thirdScroll);
		dialog.add(button);
		dialog.add(label);
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * gets the specified font
	 */
	public Font getFont() {
		return font;
	}

	/**
	 * gets the specified color
	 */
	public Color getColor() {
		return color;
	}
}
