/**
 * Name: Menjivar, Miguel
 * Project: #3
 * Date: March 12, 2018
 * Course: CS-245-01-w18
 * 
 * Description:
 * 	Implement the windows version of Note pad. 
 */

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.*;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JNotepad implements ActionListener {

	private JFrame frame;
	private JDialog aboutDialog;
	private JPopupMenu popUp;
	private JDialog findMe;
	private JTextArea textArea;
	private Font font;
	private Color color;
	private String openName = "";
	private int findIdx;
	private int count = 0;

	/**
	 * Create the application.
	 */
	public JNotepad() {
		// frame settings
		setName("Untitled");
		frame = new JFrame(getName() + " - JNotepad");
		frame.setSize(750, 750);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create the menu bar
		JMenuBar menuBar = new JMenuBar();

		// create the File, Edit, Format, View, Help menu
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		JMenu edit = new JMenu("Edit");
		edit.setMnemonic(KeyEvent.VK_E);
		JMenu format = new JMenu("Format");
		format.setMnemonic(KeyEvent.VK_O);
		JMenu view = new JMenu("View");
		view.setMnemonic(KeyEvent.VK_V);
		JMenu help = new JMenu("Help");
		help.setMnemonic(KeyEvent.VK_H);
		JMenu extra = new JMenu("Extras");

		// ITEMS FOR EACH MENU BLOCK
		// KEYBOARD SHORTCUTS INCLUDED FOR EACH RESPECTIVE MENUS
		// file items
		JMenuItem fileNew = new JMenuItem("New", KeyEvent.VK_N);
		fileNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		JMenuItem fileOpen = new JMenuItem("Open...", KeyEvent.VK_O);
		fileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		JMenuItem fileSave = new JMenuItem("Save", KeyEvent.VK_S);
		fileSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		JMenuItem fileSaveAs = new JMenuItem("Save as...");
		JMenuItem filePageSetup = new JMenuItem("Page Setup...");
		JMenuItem filePrint = new JMenuItem("Print...", KeyEvent.VK_P);
		filePrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		JMenuItem fileExit = new JMenuItem("Exit");

		// edit items
		JMenuItem editUndo = new JMenuItem("Undo");
		JMenuItem editCut = new JMenuItem("Cut", KeyEvent.VK_X);
		editCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		JMenuItem editCopy = new JMenuItem("Copy", KeyEvent.VK_C);
		editCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		JMenuItem editPaste = new JMenuItem("Paste", KeyEvent.VK_V);
		editPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		JMenuItem editDelete = new JMenuItem("Delete", KeyEvent.VK_DELETE);
		editDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		JMenuItem editFind = new JMenuItem("Find...", KeyEvent.VK_F);
		editFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		JMenuItem editFindNext = new JMenuItem("Find Next");
		JMenuItem editReplace = new JMenuItem("Replace...", KeyEvent.VK_H);
		editReplace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		JMenuItem editGoTo = new JMenuItem("Go To...", KeyEvent.VK_G);
		editGoTo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		JMenuItem editSelectAll = new JMenuItem("Select All", KeyEvent.VK_A);
		editSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		JMenuItem editTimeDate = new JMenuItem("Time/Date", KeyEvent.VK_F5);
		editTimeDate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));

		// format items
		JCheckBoxMenuItem formatWordWrap = new JCheckBoxMenuItem("Word Wrap");
		formatWordWrap.setEnabled(true);
		JMenuItem formatFont = new JMenuItem("Font...");

		// view items
		JMenuItem viewStatusBar = new JMenuItem("Status Bar");

		// help items
		JMenuItem helpViewHelp = new JMenuItem("View Help");
		JMenuItem helpAbout = new JMenuItem("About JNotepad");

		// extra items
		JMenuItem extraBackground = new JMenuItem("Background");
		
		// ADD ITEMS TO RESPECTIVE MENUS BLOCK
		// add item to file
		file.add(fileNew);
		file.add(fileOpen);
		file.add(fileSave);
		file.add(fileSaveAs);
		file.addSeparator();
		file.add(filePageSetup);
		file.add(filePrint);
		file.addSeparator();
		file.add(fileExit);

		// add items to edit
		edit.add(editUndo);
		edit.addSeparator();
		edit.add(editCut);
		edit.add(editCopy);
		edit.add(editPaste);
		edit.add(editDelete);
		edit.addSeparator();
		edit.add(editFind);
		edit.add(editFindNext);
		edit.add(editReplace);
		edit.add(editGoTo);
		edit.addSeparator();
		edit.add(editSelectAll);
		edit.add(editTimeDate);

		// add items to format
		format.add(formatWordWrap);
		format.add(formatFont);

		// add items to view
		view.add(viewStatusBar);

		// add items to help
		help.add(helpViewHelp);
		help.addSeparator();
		help.add(helpAbout);

		// add items to extra
		extra.add(extraBackground);

		// add File, edit to menu
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(format);
		menuBar.add(view);
		menuBar.add(help);
		menuBar.add(extra);

		// create the text field
		textArea = new JTextArea();

		// line wrap
		// textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Courier", Font.PLAIN, 12));

		// put text area into a scroll pane
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setPreferredSize(new Dimension(250, 200));

		// CUT COPY PASTE FOR MENU BLOCK
		// cut command when menu is pressed
		editCut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				textArea.cut();
			}
		});

		// copy command when menu is pressed
		editCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				textArea.copy();
			}
		});

		// paste command when menu is pressed
		editPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				textArea.paste();
			}
		});

		// SELECT ALL BLOCK
		// copies all text when option pressed in menu
		editSelectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				textArea.selectAll();
			}
		});

		// DELETE BLOCK
		// deletes highlighted text when menu is accessed
		editDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				textArea.replaceSelection("");
			}
		});

		// POP UP BLOCK
		// create a pop up menu
		popUp = new JPopupMenu();

		// create pop up menu items
		JMenuItem popCut = new JMenuItem("Cut");
		JMenuItem popCopy = new JMenuItem("Copy");
		JMenuItem popPaste = new JMenuItem("Paste");

		// cut on right click
		popCut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				textArea.cut();
			}
		});

		// copy on right click
		popCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				textArea.copy();
			}
		});

		// paste on right click
		popPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				textArea.paste();
			}
		});

		// add menu items to pop up menu
		popUp.add(popCut);
		popUp.add(popCopy);
		popUp.add(popPaste);

		// listener is added onto JTextArea
		// add listener to pop up trigger
		textArea.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				if (me.isPopupTrigger())
					popUp.show(me.getComponent(), me.getX(), me.getY());
			}

			public void mouseReleased(MouseEvent me) {
				if (me.isPopupTrigger())
					popUp.show(me.getComponent(), me.getX(), me.getY());
			}
		});

		// keeps track of where caret pointer is on text Area
		textArea.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				findIdx = textArea.getCaretPosition();
			}
		});

		// OPEN FILE BLOCK
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
		fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("*.java", "java"));

		// show the file chooser when show file chooser item is pressed
		fileOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// centers dialog onto screen
				int result = fileChooser.showOpenDialog(null);

				// fix this if possible crashes when user hits escape
				openName = fileChooser.getSelectedFile().getName();
				setName(openName);

				// if file has been selected display name
				if (result == JFileChooser.APPROVE_OPTION) {
					try {
						textArea.read(new FileReader(fileChooser.getSelectedFile().getAbsolutePath()), null);
						frame.setTitle(fileChooser.getSelectedFile().getName());

					} catch (IOException e) {
						e.printStackTrace();
					}

					frame.setTitle(openName + " - JNotePad");
				} else
					openName = "";
				setName(openName);
			}
		});

		// NEW BLOCK
		// new dialog frame settings
		JDialog newDialog = new JDialog(frame, "JNotePad", true);
		newDialog.setSize(250, 100);
		newDialog.setLayout(new FlowLayout());
		newDialog.setResizable(false);
		newDialog.setLocationRelativeTo(null);

		// have a save button link it to the save
		JButton newCancel = new JButton("Cancel");
		JButton newDontSave = new JButton("Don't Save");
		JButton newSave = new JButton("Save");

		JLabel newLabel = new JLabel();
		newLabel.setText("Do you want to save changes to " + getName() + "?");

		newDialog.add(newLabel);
		newDialog.add(newSave);
		newDialog.add(newDontSave);
		newDialog.add(newCancel);

		// when user presses new on menu options and opens dialog
		fileNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				newDialog.setVisible(true);
			}
		});

		// closes dialog box and does nothing
		newCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				newDialog.setVisible(false);
			}
		});

		// doesn't save file and closes dialog
		newDontSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				setName("Untitled");
				textArea.setText(null);
				newDialog.setVisible(false);
			}
		});

		// DIALOG SAVE FUNCTION
		JFileChooser newFileSave = new JFileChooser("Save");

		newSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				FileWriter fw;
				int result = newFileSave.showSaveDialog(null);
				newDialog.setVisible(false);
				String fileName = newFileSave.getSelectedFile() + ".txt";

				if (result == JFileChooser.APPROVE_OPTION) {
					try {
						fw = new FileWriter(fileName);
						textArea.write(fw);
						fw.close();

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});

		// SAVE FILE BLOCK
		JFileChooser saveFile = new JFileChooser("Save");
		saveFile.addChoosableFileFilter(new FileNameExtensionFilter("*.txt", "txt"));

		// show save file dialog when menu pressed
		fileSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				FileWriter fileWrite;
				int result = saveFile.showSaveDialog(null);
				// String fileName = saveFile.getName();
				String fileName = saveFile.getSelectedFile() + ".txt";

				if (result == JFileChooser.APPROVE_OPTION) {
					try {
						fileWrite = new FileWriter(fileName);
						textArea.write(fileWrite);
						fileWrite.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});

		// SAVE AS BLOCK
		// jfilechooser
		// SAVE FILE BLOCK
		JFileChooser saveAsFile = new JFileChooser("Save");
		saveAsFile.addChoosableFileFilter(new FileNameExtensionFilter("*.txt", "txt"));

		// show save file dialog when menu pressed
		fileSaveAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				FileWriter fileWrite;
				int result = saveAsFile.showSaveDialog(null);
				// String fileName = saveFile.getName();
				String fileName = saveAsFile.getSelectedFile() + ".txt";

				if (result == JFileChooser.APPROVE_OPTION) {
					try {
						fileWrite = new FileWriter(fileName);
						textArea.write(fileWrite);
						fileWrite.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});

		// DATE AND TIME BLOCK
		DateFormat dateFormat = new SimpleDateFormat("hh:mm a MM/dd/yyy");
		Calendar cal = Calendar.getInstance();

		editTimeDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				textArea.insert(dateFormat.format(cal.getTime()), textArea.getCaretPosition());
			}
		});

		// ABOUT DIALOG BLOCK
		// create modal dialog with frame settings
		aboutDialog = new JDialog(frame, "About JNotepad", true);
		aboutDialog.setSize(200, 100);
		aboutDialog.setLayout(new FlowLayout());
		aboutDialog.setLocationRelativeTo(null);

		// create label with about information
		aboutDialog.add(new JLabel("(c) Miguel Menjivar     "));

		// create button used by dialog
		JButton btnClose = new JButton("Close");

		// add button to dialog
		aboutDialog.add(btnClose);

		// close dialog box when user presses close button
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				aboutDialog.setVisible(false);
			}
		});

		// FIND DIALOG BLOCK
		// MAKE IT FUNCTIONAL
		// frame settings
		findMe = new JDialog(frame, "Find", true);
		findMe.setSize(365, 150);
		findMe.setLayout(null); // set it to null
		findMe.setResizable(false);
		findMe.setLocationRelativeTo(null);

		// features of find
		// panel settings
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(125, 50));
		panel.setOpaque(true);
		panel.setBorder(BorderFactory.createTitledBorder("Direction"));

		// individual features for dialog box
		// dimensions are also included
		JLabel findWhatLabel = new JLabel("Find what:");
		findWhatLabel.setBounds(5, 15, 75, 25);
		JTextField findWhat = new JTextField(10);
		findWhat.setBounds(65, 15, 200, 25);
		JButton findNext = new JButton("Find Next");
		findNext.setBounds(265, 15, 90, 25);
		JButton cancel = new JButton("Cancel");
		cancel.setBounds(265, 42, 90, 25);
		JCheckBox matchCase = new JCheckBox("Match case");
		matchCase.setBounds(5, 50, 100, 100);
		JRadioButton up = new JRadioButton("Up");
		JRadioButton down = new JRadioButton("Down", true);

		ButtonGroup bg = new ButtonGroup();
		bg.add(up);
		bg.add(down);

		// adds radio buttons to panel
		panel.add(up);
		panel.add(down);

		// sets the dimension of the panel with radio buttons
		panel.setBounds(130, 40, 130, 50);

		// add features to dialog box
		findMe.add(findWhatLabel);
		findMe.add(findWhat);
		findMe.add(findNext);
		findMe.add(panel);
		findMe.add(cancel);
		findMe.add(matchCase);

		editFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				findMe.setVisible(true);
				findIdx = 0;
			}
		});

		// closes dialog when button pressed
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				findMe.setVisible(false);
			}
		});

		//
		// set up for rest of find block
		findNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// find(findIdx+1);

				String str = textArea.getText();
				String findString = findWhat.getText();

				int index = str.indexOf(findString, findIdx);

				if (index > -1) {
					textArea.setCaretPosition(index);
					findIdx = index;
				}

				textArea.requestFocusInWindow();

			}
		});

		// font chooser class
		JFontChooser jfontc = new JFontChooser();
		jfontc.setDefault(font);
		jfontc.setDefault(color);

		formatFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jfontc.showDialog(frame);
				textArea.setForeground(jfontc.getColor());
				textArea.setFont(jfontc.getFont());
			}
		});

		// WORD WRAP BLOCK
		// turns word wrap on
		formatWordWrap.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ae) {
				if (formatWordWrap.isSelected())
					textArea.setLineWrap(true);
				else
					textArea.setLineWrap(false);
			}
		});

		// extra credit settings foreground and background a specific color
		extraBackground.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
//				Random rand = new Random();

				switch (count) {
				case 0:
					textArea.setBackground(Color.BLACK);
					textArea.setForeground(Color.WHITE);
					count++;
					break;
				case 1:
					textArea.setBackground(Color.RED);
					textArea.setForeground(Color.BLACK);
					count++;
					break;
				case 2:
					textArea.setBackground(Color.GREEN);
					textArea.setForeground(Color.BLUE);
					count++;
					break;
				case 3:
					textArea.setBackground(Color.WHITE);
					textArea.setForeground(Color.BLACK);
				}
			}
		});

		// add actionListeners for menu items
		fileExit.addActionListener(this);
		helpAbout.addActionListener(this);
		// editFind.addActionListener(this);

		// add contents to the frame
		frame.setJMenuBar(menuBar);
		frame.add(scrollPane);
		frame.setVisible(true);
	}

	/**
	 * handle menu item action events
	 * 
	 * @param ae
	 */
	public void actionPerformed(ActionEvent ae) {
		// if user chooses Exit, then exit program
		if (ae.getActionCommand().equals("Exit"))
			System.exit(0);

		// opens about dialog
		if (ae.getActionCommand().equals("About JNotepad"))
			aboutDialog.setVisible(true);
	}

	/**
	 * setter for name
	 * 
	 * @param name
	 *            name of file
	 */
	public void setName(String name) {
		openName = name;
	}

	/**
	 * getter for name
	 * 
	 * @return get name of file
	 */
	public String getName() {
		return openName;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JNotepad();
			}
		});
	}
}
