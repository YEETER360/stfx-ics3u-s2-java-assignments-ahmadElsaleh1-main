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

public class U2A8_MathMethods {

	private JFrame frame;
	private JTextField large1;
	private JTextField small1;
	private JTextField power1;
	private JTextField hypot1;
	private JTextField roundDown;
	private JTextField roundUp;
	private JTextField squareRoot;
	private JTextField findRadian;
	private JTextField large2;
	private JTextField small2;
	private JTextField power2;
	private JTextField hypot2;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_2;
	private JTextField largeAns;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField smallAns;
	private JTextField powerAns;
	private JTextField hypotAns;
	private JTextField roundDownAns;
	private JTextField roundUpAns;
	private JTextField squareRootAns;
	private JTextField findRadianAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A8_MathMethods window = new U2A8_MathMethods();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application
	 */
	public U2A8_MathMethods() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 476, 982);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Math Methods");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setBounds(102, 11, 268, 80);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Find largest of two numbers:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(29, 102, 252, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Find smallest of two numbers:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(29, 194, 252, 17);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Find hypotenuse of a right angled triangle from the two sides:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(29, 406, 450, 17);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Round a decimal down to the nearest whole number:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(29, 512, 422, 17);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Round a decimal up to the nearest whole number:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_5.setBounds(29, 622, 422, 17);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Find the square root of a number:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_6.setBounds(29, 722, 252, 17);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Enter an angle in degrees. Find the angle in radians:");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_7.setBounds(29, 838, 450, 17);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		large1 = new JTextField();
		large1.setHorizontalAlignment(SwingConstants.CENTER);
		large1.setBounds(39, 130, 46, 20);
		frame.getContentPane().add(large1);
		large1.setColumns(10);
		
		small1 = new JTextField();
		small1.setHorizontalAlignment(SwingConstants.CENTER);
		small1.setColumns(10);
		small1.setBounds(39, 222, 46, 20);
		frame.getContentPane().add(small1);
		
		power1 = new JTextField();
		power1.setHorizontalAlignment(SwingConstants.CENTER);
		power1.setColumns(10);
		power1.setBounds(39, 325, 46, 20);
		frame.getContentPane().add(power1);
		
		hypot1 = new JTextField();
		hypot1.setHorizontalAlignment(SwingConstants.CENTER);
		hypot1.setColumns(10);
		hypot1.setBounds(39, 434, 46, 20);
		frame.getContentPane().add(hypot1);
		
		roundDown = new JTextField();
		roundDown.setHorizontalAlignment(SwingConstants.CENTER);
		roundDown.setColumns(10);
		roundDown.setBounds(39, 540, 46, 20);
		frame.getContentPane().add(roundDown);
		
		roundUp = new JTextField();
		roundUp.setHorizontalAlignment(SwingConstants.CENTER);
		roundUp.setColumns(10);
		roundUp.setBounds(39, 650, 46, 20);
		frame.getContentPane().add(roundUp);
		
		squareRoot = new JTextField();
		squareRoot.setHorizontalAlignment(SwingConstants.CENTER);
		squareRoot.setColumns(10);
		squareRoot.setBounds(39, 750, 46, 20);
		frame.getContentPane().add(squareRoot);
		
		findRadian = new JTextField();
		findRadian.setHorizontalAlignment(SwingConstants.CENTER);
		findRadian.setColumns(10);
		findRadian.setBounds(39, 866, 46, 20);
		frame.getContentPane().add(findRadian);
		
		large2 = new JTextField();
		large2.setHorizontalAlignment(SwingConstants.CENTER);
		large2.setColumns(10);
		large2.setBounds(132, 130, 46, 20);
		frame.getContentPane().add(large2);
		
		small2 = new JTextField();
		small2.setHorizontalAlignment(SwingConstants.CENTER);
		small2.setColumns(10);
		small2.setBounds(132, 222, 46, 20);
		frame.getContentPane().add(small2);
		
		power2 = new JTextField();
		power2.setHorizontalAlignment(SwingConstants.CENTER);
		power2.setColumns(10);
		power2.setBounds(132, 325, 46, 20);
		frame.getContentPane().add(power2);
		
		hypot2 = new JTextField();
		hypot2.setHorizontalAlignment(SwingConstants.CENTER);
		hypot2.setColumns(10);
		hypot2.setBounds(132, 434, 46, 20);
		frame.getContentPane().add(hypot2);
		
		lblNewLabel_1_2 = new JLabel("Find the first number to the power of the second number:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(29, 297, 450, 17);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		lblNewLabel_2 = new JLabel("Answer: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(49, 161, 73, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		largeAns = new JTextField();
		largeAns.setHorizontalAlignment(SwingConstants.CENTER);
		largeAns.setEditable(false);
		largeAns.setColumns(10);
		largeAns.setBounds(132, 163, 98, 20);
		frame.getContentPane().add(largeAns);
		
		lblNewLabel_3 = new JLabel("Answer: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(49, 269, 73, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Answer: ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(49, 378, 73, 17);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Answer: ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(49, 484, 73, 17);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Answer: ");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(49, 594, 73, 17);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Answer: ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(49, 694, 73, 17);
		frame.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Answer: ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(49, 810, 73, 17);
		frame.getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Answer: ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(49, 915, 73, 17);
		frame.getContentPane().add(lblNewLabel_9);
		
		smallAns = new JTextField();
		smallAns.setHorizontalAlignment(SwingConstants.CENTER);
		smallAns.setEditable(false);
		smallAns.setColumns(10);
		smallAns.setBounds(132, 266, 98, 20);
		frame.getContentPane().add(smallAns);
		
		powerAns = new JTextField();
		powerAns.setHorizontalAlignment(SwingConstants.CENTER);
		powerAns.setEditable(false);
		powerAns.setColumns(10);
		powerAns.setBounds(132, 375, 98, 20);
		frame.getContentPane().add(powerAns);
		
		hypotAns = new JTextField();
		hypotAns.setHorizontalAlignment(SwingConstants.CENTER);
		hypotAns.setEditable(false);
		hypotAns.setColumns(10);
		hypotAns.setBounds(132, 481, 98, 20);
		frame.getContentPane().add(hypotAns);
		
		roundDownAns = new JTextField();
		roundDownAns.setHorizontalAlignment(SwingConstants.CENTER);
		roundDownAns.setEditable(false);
		roundDownAns.setColumns(10);
		roundDownAns.setBounds(132, 591, 98, 20);
		frame.getContentPane().add(roundDownAns);
		
		roundUpAns = new JTextField();
		roundUpAns.setHorizontalAlignment(SwingConstants.CENTER);
		roundUpAns.setEditable(false);
		roundUpAns.setColumns(10);
		roundUpAns.setBounds(132, 691, 98, 20);
		frame.getContentPane().add(roundUpAns);
		
		squareRootAns = new JTextField();
		squareRootAns.setHorizontalAlignment(SwingConstants.CENTER);
		squareRootAns.setEditable(false);
		squareRootAns.setColumns(10);
		squareRootAns.setBounds(132, 807, 98, 20);
		frame.getContentPane().add(squareRootAns);
		
		findRadianAns = new JTextField();
		findRadianAns.setHorizontalAlignment(SwingConstants.CENTER);
		findRadianAns.setEditable(false);
		findRadianAns.setColumns(10);
		findRadianAns.setBounds(116, 915, 147, 20);
		frame.getContentPane().add(findRadianAns);
		
		JButton btnNewButton = new JButton("Largest");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Largest method
				try 
				{
					largeAns.setText(Double.toString(Math.max(Double.parseDouble(large1.getText()), Double.parseDouble(large2.getText()))));
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, "Logic Error or Invalid Option!");
					large1.setText("");
					large2.setText("");
				}
			}
		});
		btnNewButton.setBounds(281, 130, 138, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSmallest = new JButton("Smallest");
		btnSmallest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Smallest method
				try 
				{
					smallAns.setText(Double.toString(Math.min(Double.parseDouble(small1.getText()), Double.parseDouble(small2.getText()))));
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, "Logic Error or Invalid Option!");
					small1.setText("");
					small2.setText("");
				}
			}
		});
		btnSmallest.setBounds(281, 222, 138, 34);
		frame.getContentPane().add(btnSmallest);
		
		JButton btnPowerOf = new JButton("Power Of");
		btnPowerOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Power method
				try 
				{
					powerAns.setText(Double.toString(Math.pow(Double.parseDouble(power1.getText()), Double.parseDouble(power2.getText()))));
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, "Logic Error or Invalid Option!");
					power1.setText("");
					power2.setText("");
				}
			}
		});
		btnPowerOf.setBounds(281, 342, 138, 34);
		frame.getContentPane().add(btnPowerOf);
		
		JButton btnHypotenuse = new JButton("Hypotenuse");
		btnHypotenuse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Hypotenuse method
				try 
				{
					hypotAns.setText(Double.toString(Math.hypot(Double.parseDouble(hypot1.getText()), Double.parseDouble(hypot2.getText()))));
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, "Logic Error or Invalid Option!");
					hypot1.setText("");
					hypot2.setText("");
				}
			}
		});
		btnHypotenuse.setBounds(281, 449, 138, 34);
		frame.getContentPane().add(btnHypotenuse);
		
		JButton btnRoundedDown = new JButton("Rounded Down");
		btnRoundedDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Round down method
				try 
				{
					roundDownAns.setText(Double.toString(Math.floor(Double.parseDouble(roundDown.getText()))));
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, "Logic Error or Invalid Option!");
					roundDown.setText("");
				}
			}
		});
		btnRoundedDown.setBounds(281, 560, 138, 34);
		frame.getContentPane().add(btnRoundedDown);
		
		JButton btnRoundedUp = new JButton("Rounded Up");
		btnRoundedUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Round up method
				try 
				{
					roundUpAns.setText(Double.toString(Math.ceil(Double.parseDouble(roundUp.getText()))));
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, "Logic Error or Invalid Option!");
					roundUp.setText("");
				}
			}
		});
		btnRoundedUp.setBounds(281, 669, 138, 34);
		frame.getContentPane().add(btnRoundedUp);
		
		JButton btnSquareRoot = new JButton("Square Root");
		btnSquareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Square root method
				try 
				{
					squareRootAns.setText(Double.toString(Math.sqrt(Double.parseDouble(squareRoot.getText()))));
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, "Logic Error or Invalid Option!");
					squareRoot.setText("");
				}
			}
		});
		btnSquareRoot.setBounds(281, 762, 138, 34);
		frame.getContentPane().add(btnSquareRoot);
		
		JButton btnInRadians = new JButton("In Radians");
		btnInRadians.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//To Radians method
				try 
				{
					findRadianAns.setText(Double.toString(Math.toRadians(Double.parseDouble(findRadian.getText()))));
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, "Logic Error or Invalid Option!");
					findRadian.setText("");
				}
			}
		});
		btnInRadians.setBounds(281, 880, 138, 34);
		frame.getContentPane().add(btnInRadians);
	}
}
