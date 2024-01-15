package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U3A10_Hexadecimal {

	private JFrame frame;
	private static JTextField hexIn;
	private static JTextField decOut;
	private static JTextField decIn;
	private static JTextField hexOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A10_Hexadecimal window = new U3A10_Hexadecimal();
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
	public U3A10_Hexadecimal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Decimal-Hex Converter");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(101, 11, 274, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hex (4 nibbles):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(22, 73, 110, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Decimal:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(22, 175, 166, 25);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Decimal:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(291, 73, 110, 25);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Hexadecimal:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_1.setBounds(291, 175, 110, 25);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		hexIn = new JTextField();
		hexIn.setHorizontalAlignment(SwingConstants.CENTER);
		hexIn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		hexIn.setBounds(22, 109, 110, 20);
		frame.getContentPane().add(hexIn);
		hexIn.setColumns(10);
		
		decOut = new JTextField();
		decOut.setEditable(false);
		decOut.setHorizontalAlignment(SwingConstants.CENTER);
		decOut.setFont(new Font("Tahoma", Font.PLAIN, 13));
		decOut.setColumns(10);
		decOut.setBounds(291, 109, 110, 20);
		frame.getContentPane().add(decOut);
		
		decIn = new JTextField();
		decIn.setHorizontalAlignment(SwingConstants.CENTER);
		decIn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		decIn.setColumns(10);
		decIn.setBounds(22, 211, 110, 20);
		frame.getContentPane().add(decIn);
		
		hexOut = new JTextField();
		hexOut.setEditable(false);
		hexOut.setHorizontalAlignment(SwingConstants.CENTER);
		hexOut.setFont(new Font("Tahoma", Font.PLAIN, 13));
		hexOut.setColumns(10);
		hexOut.setBounds(291, 211, 110, 20);
		frame.getContentPane().add(hexOut);
		
		JButton btnNewButton = new JButton("To Decimal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				hexToDec();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(156, 108, 110, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnToBinary = new JButton("To Hex");
		btnToBinary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				decToHex();
			}
		});
		btnToBinary.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnToBinary.setBounds(156, 211, 110, 23);
		frame.getContentPane().add(btnToBinary);
	}
	
	public static void hexToDec() 
	{
		try 
		{
			if(hexIn.getText().length() <= 4 && Integer.parseInt(hexIn.getText(), 16) > -1) decOut.setText(Integer.parseInt(hexIn.getText(), 16)+"");
			else JOptionPane.showMessageDialog(null, "Invalid Input! Please enter 4 nibbles only! No negative!");
		}
		catch(Exception e) 
		{
			JOptionPane.showMessageDialog(null, "Invalid Input!");
		}
	}
	
	public static void decToHex() 
	{
		try 
		{
			if(Integer.parseInt(decIn.getText()) > -1) hexOut.setText(Integer.toHexString(Integer.parseInt(decIn.getText())));
			else JOptionPane.showMessageDialog(null, "Negative numbers not supported!");
		}
		catch(Exception e) 
		{
			JOptionPane.showMessageDialog(null, "Invalid Input!");
		}
	}
}
