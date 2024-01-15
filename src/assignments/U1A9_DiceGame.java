package assignments;

import java.awt.EventQueue;
//need to import for error pop up
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U1A9_DiceGame {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	
	final int n = 6;
	double rolls = 0;
	int correct = 0;
	int incorrect = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A9_DiceGame window = new U1A9_DiceGame();
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
	public U1A9_DiceGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 607, 648);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dice Guessing Game");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel.setBounds(100, 0, 408, 85);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea txtrEnter = new JTextArea();
		txtrEnter.setText("Guess a number between 1 to 6 and click 'Roll' to roll the dice");
		txtrEnter.setFont(new Font("Monospaced", Font.BOLD, 24));
		txtrEnter.setWrapStyleWord(true);
		txtrEnter.setLineWrap(true);
		txtrEnter.setEditable(false);
		txtrEnter.setBounds(22, 77, 546, 70);
		frame.getContentPane().add(txtrEnter);
		
		JLabel lblNewLabel_1 = new JLabel("Your Guess:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(50, 169, 170, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField1 = new JTextField();
		textField1.setBounds(68, 221, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Roll Result:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(392, 169, 176, 41);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField2 = new JTextField();
		textField2.setEditable(false);
		textField2.setColumns(10);
		textField2.setBounds(408, 221, 86, 20);
		frame.getContentPane().add(textField2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Number of Rolls:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_1_1.setBounds(50, 344, 338, 41);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton button1 = new JButton("Roll");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Roll method
				try 
				{
					if(textField1.getText().equals("")) JOptionPane.showMessageDialog(null, "Please guess a number between 1 and 6!");
					else if(Integer.parseInt(textField1.getText()) < 1 || Integer.parseInt(textField1.getText()) > 6) JOptionPane.showMessageDialog(null, "Please guess a number between 1 and 6!");
					else 
					{
						double accuracy = 0;
						
						textField2.setText(Integer.toString((int)(Math.random() * n) +1));
						if(textField1.getText().equals(textField2.getText())) correct ++;
						else incorrect ++;
						rolls ++; 
						
						accuracy = Math.round(((correct / rolls) * 100.0) * 100.0) / 100.0;
						
						int noOfRolls = (int)rolls;
						textField3.setText(Integer.toString(noOfRolls));
						textField4.setText(Integer.toString(correct));
						textField5.setText(Integer.toString(incorrect));
						textField6.setText(Double.toString(accuracy) + "%");
					}
				}
				
				catch(Exception e) 
				{
					JOptionPane.showMessageDialog(null, "Invalid Entry! Please enter a whole number between 1 and 6");
				}
				
			}
		});
		button1.setBounds(230, 247, 115, 41);
		frame.getContentPane().add(button1);
		
		textField3 = new JTextField();
		textField3.setEditable(false);
		textField3.setColumns(10);
		textField3.setBounds(408, 360, 86, 20);
		frame.getContentPane().add(textField3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Number of Correct Guesses:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_1_1_1.setBounds(50, 406, 338, 41);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Number of incorrect Guesses:");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_1_1_2.setBounds(50, 474, 338, 41);
		frame.getContentPane().add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Guessing Accuracy:");
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_1_1_3.setBounds(50, 542, 338, 41);
		frame.getContentPane().add(lblNewLabel_1_1_1_3);
		
		textField4 = new JTextField();
		textField4.setEditable(false);
		textField4.setColumns(10);
		textField4.setBounds(408, 421, 86, 20);
		frame.getContentPane().add(textField4);
		
		textField5 = new JTextField();
		textField5.setEditable(false);
		textField5.setColumns(10);
		textField5.setBounds(408, 489, 86, 20);
		frame.getContentPane().add(textField5);
		
		textField6 = new JTextField();
		textField6.setEditable(false);
		textField6.setColumns(10);
		textField6.setBounds(408, 557, 86, 20);
		frame.getContentPane().add(textField6);
	}
}
