package assignments;

import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class U3A8_Encryption {

	private JFrame frame;
	private static JTextField inField1;
	private static JTextField outField1;
	private static JTextField outField2;
	private static JTextField inField2;
	private static JTextField shiftField1;
	private static JTextField shiftField2;
	
	private static char[] alph = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A8_Encryption window = new U3A8_Encryption();
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
	public U3A8_Encryption() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 656, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Caesar Cipher");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(246, 11, 164, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Encrypt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				encrypt();
			}
		});
		btnNewButton.setBounds(10, 91, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDecrypt = new JButton("Decrypt");
		btnDecrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				decrypt();
			}
		});
		btnDecrypt.setBounds(10, 202, 89, 23);
		frame.getContentPane().add(btnDecrypt);
		
		inField1 = new JTextField();
		inField1.setBounds(109, 64, 315, 20);
		frame.getContentPane().add(inField1);
		inField1.setColumns(10);
		
		outField1 = new JTextField();
		outField1.setColumns(10);
		outField1.setBounds(109, 120, 315, 20);
		frame.getContentPane().add(outField1);
		
		outField2 = new JTextField();
		outField2.setColumns(10);
		outField2.setBounds(109, 230, 315, 20);
		frame.getContentPane().add(outField2);
		
		inField2 = new JTextField();
		inField2.setColumns(10);
		inField2.setBounds(109, 179, 315, 20);
		frame.getContentPane().add(inField2);
		
		JLabel lblNewLabel_1 = new JLabel("IN:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(70, 66, 39, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("IN:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(70, 182, 39, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("OUT:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(60, 231, 39, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("OUT:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(60, 121, 39, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Clear All");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inField1.setText("");
				outField1.setText("");
				inField2.setText("");
				outField2.setText("");
				shiftField1.setText("");
				shiftField2.setText("");
			}
		});
		btnNewButton_1.setBounds(164, 261, 107, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		shiftField1 = new JTextField();
		shiftField1.setHorizontalAlignment(SwingConstants.CENTER);
		shiftField1.setFont(new Font("Tahoma", Font.BOLD, 14));
		shiftField1.setBounds(443, 103, 188, 20);
		frame.getContentPane().add(shiftField1);
		shiftField1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Random encryption Shift:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(444, 78, 187, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Decryption Shift:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(443, 202, 106, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		shiftField2 = new JTextField();
		shiftField2.setHorizontalAlignment(SwingConstants.CENTER);
		shiftField2.setFont(new Font("Tahoma", Font.BOLD, 14));
		shiftField2.setColumns(10);
		shiftField2.setBounds(443, 225, 188, 20);
		frame.getContentPane().add(shiftField2);
	}
	
	public static void encrypt() 
	{
		try 
		{
			outField1.setText("");
			int shiftVal = (int)(Math.random() * 1000000000);
			shiftField1.setText(shiftVal+"");
			
			for(int i = 0; i < inField1.getText().length(); i++) 
			{
				boolean isUpper = Character.isUpperCase(inField1.getText().charAt(i));
				int val = new String(alph).indexOf(Character.toLowerCase(inField1.getText().charAt(i)));
				
				for(int j = 0; j != Math.abs(shiftVal % 26); j++) 
				{
					if(shiftVal > 0) 
					{
						val++;
						if(val == 26) val = 0;
					}
					else if(shiftVal < 0)
					{
						val--;
						if(val == -1) val = 25;
					}
				}
				if(isUpper) outField1.setText(outField1.getText() + Character.toUpperCase(alph[val]));
				else outField1.setText(outField1.getText() + alph[val]);
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Invalid Entry!");
		}
	}
	
	public static void decrypt() 
	{
		try 
		{
			outField2.setText("");
			
			for(int i = 0; i < inField2.getText().length(); i++) 
			{
				boolean isUpper = Character.isUpperCase(inField2.getText().charAt(i));
				
				int val = new String(alph).indexOf(Character.toLowerCase(inField2.getText().charAt(i)));
					
				int shiftVal = Integer.parseInt(shiftField2.getText()) % 26;
				for(int j = 0; j != Math.abs(shiftVal); j++) 
				{
					if(shiftVal > 0) 
					{
						val++;
						if(val == 26) val = 0;
					}
					else if(shiftVal < 0)
					{
						val--;
						if(val == -1) val = 25;
					}
				}
				if(isUpper) outField2.setText(outField2.getText() + Character.toUpperCase(alph[val]));
				else outField2.setText(outField2.getText() + alph[val]);
			}
		}
		catch(Exception e) 
		{
			JOptionPane.showMessageDialog(null, "Invalid Entry!");
		}
	}
}
