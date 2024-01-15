package assignments;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class U2A9_StringMethods {

	private JFrame frame;
	private JTextField findLength;
	private JTextField fullCaps;
	private JTextField fourthChar;
	private JTextField string1;
	private JTextField checkString;
	private JTextField fourToSix;
	private JTextField replaceA;
	private JTextField string2;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_2;
	private JTextField findLengthAns;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_9;
	private JTextField fullCapsAns;
	private JTextField fourthCharAns;
	private JTextField identicalAns;
	private JTextField letterFound;
	private JTextField fourToSixAns;
	private JTextField replaceAns;
	private JTextField checkLetter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A9_StringMethods window = new U2A9_StringMethods();
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
	public U2A9_StringMethods() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 476, 890);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("String Methods");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setBounds(95, 11, 287, 80);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Find the number of charcters in the String:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(29, 102, 341, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Convert the string to full Caps:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(29, 194, 252, 17);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Check if the strings are identical:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(29, 406, 450, 17);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Enter a string and a letter. Check if the letter is found:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(29, 512, 422, 17);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Enter a string at least 8 characters long. Output characters 4 to 6:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_5.setBounds(10, 622, 441, 17);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_7 = new JLabel("Replace letters \"a\" with \"x\":");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_7.setBounds(29, 738, 450, 17);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		findLength = new JTextField();
		findLength.setHorizontalAlignment(SwingConstants.CENTER);
		findLength.setBounds(39, 130, 191, 20);
		frame.getContentPane().add(findLength);
		findLength.setColumns(10);
		
		fullCaps = new JTextField();
		fullCaps.setHorizontalAlignment(SwingConstants.CENTER);
		fullCaps.setColumns(10);
		fullCaps.setBounds(39, 222, 191, 20);
		frame.getContentPane().add(fullCaps);
		
		fourthChar = new JTextField();
		fourthChar.setHorizontalAlignment(SwingConstants.CENTER);
		fourthChar.setColumns(10);
		fourthChar.setBounds(39, 325, 191, 20);
		frame.getContentPane().add(fourthChar);
		
		string1 = new JTextField();
		string1.setHorizontalAlignment(SwingConstants.CENTER);
		string1.setColumns(10);
		string1.setBounds(39, 434, 191, 20);
		frame.getContentPane().add(string1);
		
		checkString = new JTextField();
		checkString.setHorizontalAlignment(SwingConstants.CENTER);
		checkString.setColumns(10);
		checkString.setBounds(39, 540, 191, 20);
		frame.getContentPane().add(checkString);
		
		fourToSix = new JTextField();
		fourToSix.setHorizontalAlignment(SwingConstants.CENTER);
		fourToSix.setColumns(10);
		fourToSix.setBounds(39, 650, 191, 20);
		frame.getContentPane().add(fourToSix);
		
		replaceA = new JTextField();
		replaceA.setHorizontalAlignment(SwingConstants.CENTER);
		replaceA.setColumns(10);
		replaceA.setBounds(39, 770, 191, 20);
		frame.getContentPane().add(replaceA);
		
		string2 = new JTextField();
		string2.setHorizontalAlignment(SwingConstants.CENTER);
		string2.setColumns(10);
		string2.setBounds(39, 456, 191, 20);
		frame.getContentPane().add(string2);
		
		lblNewLabel_1_2 = new JLabel("Find the character in the fouth spot:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(29, 297, 450, 17);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		lblNewLabel_2 = new JLabel("Output:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(29, 166, 73, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		findLengthAns = new JTextField();
		findLengthAns.setHorizontalAlignment(SwingConstants.CENTER);
		findLengthAns.setEditable(false);
		findLengthAns.setColumns(10);
		findLengthAns.setBounds(102, 163, 128, 20);
		frame.getContentPane().add(findLengthAns);
		
		lblNewLabel_3 = new JLabel("Output:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(29, 269, 73, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Output:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(29, 378, 73, 17);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Output:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(29, 484, 73, 17);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Output:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(29, 594, 73, 17);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Output:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(29, 694, 73, 17);
		frame.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_9 = new JLabel("Output:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(29, 815, 73, 17);
		frame.getContentPane().add(lblNewLabel_9);
		
		fullCapsAns = new JTextField();
		fullCapsAns.setHorizontalAlignment(SwingConstants.CENTER);
		fullCapsAns.setEditable(false);
		fullCapsAns.setColumns(10);
		fullCapsAns.setBounds(102, 266, 128, 20);
		frame.getContentPane().add(fullCapsAns);
		
		fourthCharAns = new JTextField();
		fourthCharAns.setHorizontalAlignment(SwingConstants.CENTER);
		fourthCharAns.setEditable(false);
		fourthCharAns.setColumns(10);
		fourthCharAns.setBounds(102, 375, 128, 20);
		frame.getContentPane().add(fourthCharAns);
		
		identicalAns = new JTextField();
		identicalAns.setHorizontalAlignment(SwingConstants.CENTER);
		identicalAns.setEditable(false);
		identicalAns.setColumns(10);
		identicalAns.setBounds(102, 481, 128, 20);
		frame.getContentPane().add(identicalAns);
		
		letterFound = new JTextField();
		letterFound.setHorizontalAlignment(SwingConstants.CENTER);
		letterFound.setEditable(false);
		letterFound.setColumns(10);
		letterFound.setBounds(102, 591, 128, 20);
		frame.getContentPane().add(letterFound);
		
		fourToSixAns = new JTextField();
		fourToSixAns.setHorizontalAlignment(SwingConstants.CENTER);
		fourToSixAns.setEditable(false);
		fourToSixAns.setColumns(10);
		fourToSixAns.setBounds(102, 691, 128, 20);
		frame.getContentPane().add(fourToSixAns);
		
		replaceAns = new JTextField();
		replaceAns.setHorizontalAlignment(SwingConstants.CENTER);
		replaceAns.setEditable(false);
		replaceAns.setColumns(10);
		replaceAns.setBounds(107, 815, 123, 20);
		frame.getContentPane().add(replaceAns);
		
		JButton btnNewButton = new JButton("Length");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					findLengthAns.setText(Integer.toString(findLength.getText().length()));
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, exc);
				}
			}
		});
		btnNewButton.setBounds(281, 130, 138, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSmallest = new JButton("Full Caps");
		btnSmallest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					fullCapsAns.setText(fullCaps.getText().toUpperCase());
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, exc);
				}
			}
		});
		btnSmallest.setBounds(281, 222, 138, 34);
		frame.getContentPane().add(btnSmallest);
		
		JButton btnPowerOf = new JButton("4th Character");
		btnPowerOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					fourthCharAns.setText(""+fourthChar.getText().charAt(3));
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, "Enter a string with at least four characters!");
				}
			}
		});
		btnPowerOf.setBounds(281, 342, 138, 34);
		frame.getContentPane().add(btnPowerOf);
		
		JButton btnHypotenuse = new JButton("Identical?");
		btnHypotenuse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					if(string1.getText().equals(string2.getText())) 
					{
						identicalAns.setText("Identical");
					}
					else 
					{
						identicalAns.setText("Not identical");
					}
					
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, exc);
				}
			}
		});
		btnHypotenuse.setBounds(281, 449, 138, 34);
		frame.getContentPane().add(btnHypotenuse);
		
		JButton btnRoundedDown = new JButton("Letter found?");
		btnRoundedDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					if(checkString.getText().contains(checkLetter.getText())) 
					{
						letterFound.setText("Letter "+ checkLetter.getText() +" found");
					}
					else 
					{
						letterFound.setText("Letter "+ checkLetter.getText() +" not found");
					}
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, exc);
				}
			}
		});
		btnRoundedDown.setBounds(281, 560, 138, 34);
		frame.getContentPane().add(btnRoundedDown);
		
		JButton btnRoundedUp = new JButton("Characters 4 to 6");
		btnRoundedUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					fourToSixAns.setText(fourToSix.getText().substring(3, 6));
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, "Enter a string with at least eight characters!");
				}
			}
		});
		btnRoundedUp.setBounds(281, 669, 138, 34);
		frame.getContentPane().add(btnRoundedUp);
		
		JButton btnInRadians = new JButton("Replace");
		btnInRadians.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					replaceAns.setText(replaceA.getText().replace("a", "x"));
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, exc);
				}
			}
		});
		btnInRadians.setBounds(281, 782, 138, 34);
		frame.getContentPane().add(btnInRadians);
		
		checkLetter = new JTextField();
		checkLetter.setHorizontalAlignment(SwingConstants.CENTER);
		checkLetter.setColumns(10);
		checkLetter.setBounds(39, 563, 46, 20);
		frame.getContentPane().add(checkLetter);
	}
}
