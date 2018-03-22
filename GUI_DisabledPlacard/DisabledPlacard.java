/**
 * @author Miguel Menjivar
 * 
 * Date: 3/19/2018
 * 
 * Disabled Placard:
 * This GUI based project is to track all Disabled Placards
 * that come to campus. 
 */
package db;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class DisabledPlacard {

	// frame
	private JFrame frame;

	// menu bar and items
	private JMenuBar jmb;
	private JMenu file;
	private JMenu help;
	private JMenu about;
	private JMenuItem fileExit;
	private JMenuItem aboutMe;
	private JMenuItem helpInstructions;

	// labels
	private JLabel addNamePlacardLabel;
	private JLabel addNumberPlacardLabel;
	private JLabel addNotePlacardLabel;
	private JLabel searchNamePlacardLabel;
	private JLabel searchNumberPlacardLabel;
	private JLabel dialogLabel;
	private JLabel githubLink;
	private JLabel placardSaved;
	private JLabel information;

	// buttons
	private JButton addPlacardButton;
	private JButton searchNamePlacardButton;
	private JButton searchNumberPlacardButton;
	private JButton dialogButton;
	private JButton cancelButton;

	// text fields
	private JTextField addNamePlacardText;
	private JTextField addNumberPlacardText;
	private JTextField addNotePlacardText;
	private JTextField searchNamePlacardText;
	private JTextField searchNumberPlacardText;

	// placards that were found
	private JTextArea dataFound;
//	private JTextArea information;

	// panels
	private JPanel addPlacardPanel;
	private JPanel searchPlacardPanel;
//	private JPanel infoPanel;

	// dialogs
	private JDialog aboutDialog;
	private JDialog helpDialog;
	private JDialog saveDialog;
	private JDialog searchDialog;
	
	// inside of help dialog box
	private JScrollPane jscrlp;

	// for searching text file
	private Scanner scan;

	// name of file
	private String fileName = "disabledPlacard.txt";

	// help section instructions on how to use this program
	private String helpSection = "<html><p>Add New Placard:<br>"
			+ "In the boxes provided you will input the name,<br> placard number, and notes and it will be saved<br><br>"
			+ "Search a Placard: <br>"
			+ "With any information provided,<br> you may search placards by name or by permit number."
			+ "<br><br>Storing placards:<br>"
			+ "The placards are to be stored inside a file<br> named disabledPlacard.txt"
			+ "<br><br>Source Code:<br>"
			+ "The source code will be located on Github. The link is provided<br> under the about page and more information<br>"
			+ "will be provided on the site</html></p>";

	// tracks the amount of occurrences each time search comes true
	private int searchCounter;

	/**
	 * Create the application.
	 */
	public DisabledPlacard() {
		// frame settings
		frame = new JFrame("Disabled Placard Tracker");
		frame.setSize(550, 350);
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// menu bar
		jmb = new JMenuBar();

		// menus
		file = new JMenu("File");
		help = new JMenu("Help");
		about = new JMenu("About");

		// menu items
		aboutMe = new JMenuItem("About");
		about.add(aboutMe);
		fileExit = new JMenuItem("Exit");
		file.add(fileExit);
		helpInstructions = new JMenuItem("Help");
		help.add(helpInstructions);

		// about dialog block
		jmb.add(file);
		jmb.add(help);
		jmb.add(about);

		// add settings
		addPlacardPanel = new JPanel();
		TitledBorder addBorder = new TitledBorder("Add New Placard");
		addPlacardPanel.setPreferredSize(new Dimension(325, 150));
		addBorder.setTitleJustification(TitledBorder.LEFT);
		addBorder.setTitlePosition(TitledBorder.TOP);
		addPlacardPanel.setBorder(addBorder);
		addNamePlacardLabel = new JLabel("Name: ");
		addNamePlacardText = new JTextField(20);
		addNumberPlacardLabel = new JLabel("Placard: ");
		addNumberPlacardText = new JTextField(20);
		addNotePlacardLabel = new JLabel("Notes: ");
		addNotePlacardText = new JTextField(20);
		addPlacardButton = new JButton("Add");
		addPlacardPanel.add(addNamePlacardLabel);
		addPlacardPanel.add(addNamePlacardText);
		addPlacardPanel.add(addNumberPlacardLabel);
		addPlacardPanel.add(addNumberPlacardText);
		addPlacardPanel.add(addNotePlacardLabel);
		addPlacardPanel.add(addNotePlacardText);
		addPlacardPanel.add(addPlacardButton);

		// search settings
		searchPlacardPanel = new JPanel();
		searchPlacardPanel.setPreferredSize(new Dimension(450, 100));
		searchPlacardPanel.setLayout(new FlowLayout());
		TitledBorder searchBorder = new TitledBorder("Search Placard By");
		searchBorder.setTitleJustification(TitledBorder.LEFT);
		searchBorder.setTitlePosition(TitledBorder.TOP);
		searchPlacardPanel.setBorder(searchBorder);
		searchNamePlacardLabel = new JLabel("Name: ");
		searchNamePlacardText = new JTextField(20);
		searchNamePlacardButton = new JButton("Search Name");
		searchNumberPlacardLabel = new JLabel("Placard:");
		searchNumberPlacardText = new JTextField(20);
		searchNumberPlacardButton = new JButton("Search Placard");
		searchPlacardPanel.add(searchNamePlacardLabel);
		searchPlacardPanel.add(searchNamePlacardText);
		searchPlacardPanel.add(searchNamePlacardButton);
		searchPlacardPanel.add(searchNumberPlacardLabel);
		searchPlacardPanel.add(searchNumberPlacardText);
		searchPlacardPanel.add(searchNumberPlacardButton);

		// about dialog block
		aboutDialog = new JDialog();
		aboutDialog.setTitle("About");
		aboutDialog.setSize(300, 125);
		aboutDialog.setLayout(new FlowLayout());
		aboutDialog.setLocationRelativeTo(null);
		dialogLabel = new JLabel("Miguel Menjivar (C) 2018");
		githubLink = new JLabel("github.com/mamenjivar/DPTracker_CPP_PTS");
		dialogButton = new JButton("Close");
		aboutDialog.add(dialogLabel);
		aboutDialog.add(githubLink);
		aboutDialog.add(dialogButton);

		// opens about dialog box
		aboutMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				aboutDialog.setVisible(true);
			}
		});

		// closes dialog box
		dialogButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				aboutDialog.setVisible(false);
				saveDialog.setVisible(false);
			}
		});

		// closes program when exit pressed
		fileExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});

		// save placard information block
		saveDialog = new JDialog();
		saveDialog.setTitle("Placard Saved!");
		saveDialog.setSize(200, 100);
		saveDialog.setLayout(new FlowLayout());
		saveDialog.setLocationRelativeTo(null);
		placardSaved = new JLabel();
		cancelButton = new JButton("Cancel");
		saveDialog.add(placardSaved);
		saveDialog.add(cancelButton);

		// when save button is pressed
		addPlacardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (addNamePlacardText.getText().equals("") || addNumberPlacardText.getText().equals("")
						|| addNotePlacardText.getText().equals("")) {
					placardSaved.setText("Please fill in all boxes please");
					saveDialog.setVisible(true);
				} else {
					try {
						PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
						writer.print(addNamePlacardText.getText());
						writer.print(" ");
						writer.print(addNumberPlacardText.getText());
						writer.print(" ");
						writer.print(addNotePlacardText.getText());
						writer.println();
						writer.close();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}

					placardSaved.setText("The placard has been saved!");
					// opens dialog box to confirm saving placard information
					saveDialog.setVisible(true);

					// sets all text fields empty for user to write a new permit
					addNamePlacardText.setText(null);
					addNumberPlacardText.setText(null);
					addNotePlacardText.setText(null);
				}
			}
		});

		// closes saved placard box
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				saveDialog.setVisible(false);
			}
		});

		// help instruction block
		helpDialog = new JDialog();
		helpDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		helpDialog.setTitle("Help");
		helpDialog.setSize(375, 300);
		helpDialog.setLayout(new FlowLayout());
		helpDialog.setLocationRelativeTo(null);
//		infoPanel = new JPanel();
		
		information = new JLabel(helpSection);
		jscrlp = new JScrollPane();
		jscrlp.setViewportView(information);
		
		helpDialog.add(jscrlp);

		// displays help instructions menu
		helpInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				helpDialog.setVisible(true);
			}
		});

		// search box that displays found users
		searchDialog = new JDialog();
		searchDialog.setTitle("Search a Placard");
		searchDialog.setSize(300, 200);
		searchDialog.setLayout(new FlowLayout());
		searchDialog.setLocationRelativeTo(null);
		dataFound = new JTextArea();
		dataFound.setEditable(false);
		searchDialog.add(dataFound);

		// search by name block
		searchNamePlacardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				searchDialog.setVisible(true);
				searchCounter = 1;
				try {
					scan = new Scanner(new File(fileName));

					// add number of occurrences
					while (scan.hasNext()) {
						String line = scan.nextLine().toLowerCase().toString();
						if (line.contains(searchNamePlacardText.getText())) {
							dataFound.append(searchCounter + ") " + line);
							dataFound.append("\n");
							searchCounter++;
						} else
							dataFound.setText("Nothing was found");
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				searchNamePlacardText.setText(null);
				scan.close();
			}
		});

		// search by placard number block
		searchNumberPlacardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				searchDialog.setVisible(true);
				searchCounter = 1;
				try {
					scan = new Scanner(new File(fileName));

					// add number of occurrences
					while (scan.hasNext()) {
						String line = scan.nextLine().toLowerCase().toString();
						if (line.contains(searchNumberPlacardText.getText())) {
							dataFound.append(searchCounter + ") " + line);
							dataFound.append("\n");
							searchCounter++;
						} else
							dataFound.setText("Nothing was found");
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				searchNumberPlacardText.setText(null);
				scan.close();
			}
		});

		// add functions to frame
		frame.setJMenuBar(jmb);
		frame.add(addPlacardPanel);
		frame.add(searchPlacardPanel);

		// set frame visible
		frame.setVisible(true);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new DisabledPlacard();
			}
		});
	}
}
