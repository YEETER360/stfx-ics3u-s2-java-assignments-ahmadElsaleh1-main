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

public class U3A9_Binary {

	private JFrame frame;
	private static JTextField binIn;
	private static JTextField decOut;
	private static JTextField decIn;
	private static JTextField binOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A9_Binary window = new U3A9_Binary();
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
	public U3A9_Binary() {
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
		
		JLabel lblNewLabel = new JLabel("Binary-Decimal Converter");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(81, 11, 274, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Binary (8 bits):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(22, 73, 110, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Decimal (-128 to 127):");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(22, 175, 166, 25);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Decimal:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(291, 73, 110, 25);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Binary (signed):");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2_1.setBounds(291, 175, 110, 25);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		binIn = new JTextField();
		binIn.setHorizontalAlignment(SwingConstants.CENTER);
		binIn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		binIn.setBounds(22, 109, 110, 20);
		frame.getContentPane().add(binIn);
		binIn.setColumns(10);
		
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
		
		binOut = new JTextField();
		binOut.setEditable(false);
		binOut.setHorizontalAlignment(SwingConstants.CENTER);
		binOut.setFont(new Font("Tahoma", Font.PLAIN, 13));
		binOut.setColumns(10);
		binOut.setBounds(291, 211, 110, 20);
		frame.getContentPane().add(binOut);
		
		JButton btnNewButton = new JButton("To Decimal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				binToDec();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(156, 108, 110, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnToBinary = new JButton("To Binary");
		btnToBinary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				decToBin();
			}
		});
		btnToBinary.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnToBinary.setBounds(156, 211, 110, 23);
		frame.getContentPane().add(btnToBinary);
	}
	
	public static void binToDec() 
	{
		try 
		{
			if(!binIn.getText().contains("0") && !binIn.getText().contains("1")) JOptionPane.showMessageDialog(null, "Invalid Input!");
			else if(binIn.getText().length() != 8) JOptionPane.showMessageDialog(null, "Please enter 8 bits only!");
			else 
			{
				if(binIn.getText().equals("10000000")) decOut.setText("-128");
				else 
				{
					int result = 0;
					int pow = 0;
					boolean signed = false;
					
					if(binIn.getText().charAt(0) == '1') signed = true;
					
					for(int i = 7; i > 0; i--) 
					{
						result += Math.pow(2, pow) * Integer.parseInt(binIn.getText().charAt(i)+"");
						pow++;
					}
					if(signed) decOut.setText(-result+"");
					else decOut.setText(result+"");
				}
			}
		}
		catch(Exception e) 
		{
			JOptionPane.showMessageDialog(null, "Invalid Input!");
		}
		
	}
	
	public static void decToBin() 
	{
		try 
		{
			byte input = Byte.parseByte(decIn.getText());
			String result = "";
			
			if(input > -1) result += "0";
			else 
			{
				result += "1";
				Math.abs(input);
			}
			
			result += input % 64;
			input /= 64;
			
			result += input % 32;
			input /= 32;
			
			result += input % 16;
			input /= 16;
			
			result += input % 8;
			input /= 8;
			
			result += input % 4;
			input /= 4;
			
			result += input % 2;
			input /= 2;
			
			result += input % 1;

			binOut.setText(result);
		}
		catch(Exception e) 
		{
			JOptionPane.showMessageDialog(null, "Invalid Input!");
		}
	}
}
