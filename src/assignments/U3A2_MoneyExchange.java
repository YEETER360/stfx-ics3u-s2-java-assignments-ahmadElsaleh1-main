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

public class U3A2_MoneyExchange {

	private JFrame frame;
	private JTextField inField;
	private JTextField toonieField;
	private JTextField loonieField;
	private JTextField quarterField;
	private JTextField dimeField;
	private JTextField nickelField;
	private JTextField pennyField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A2_MoneyExchange window = new U3A2_MoneyExchange();
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
	public U3A2_MoneyExchange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.setBounds(100, 100, 649, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Change Exchange");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setBounds(150, 11, 332, 61);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Amount:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(120, 92, 227, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		inField = new JTextField();
		inField.setFont(new Font("Tahoma", Font.BOLD, 18));
		inField.setHorizontalAlignment(SwingConstants.CENTER);
		inField.setBounds(309, 92, 173, 23);
		frame.getContentPane().add(inField);
		inField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Toonies:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 180, 102, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Loonies:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(245, 180, 102, 23);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Quarters:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(487, 180, 102, 23);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		toonieField = new JTextField();
		toonieField.setFont(new Font("Tahoma", Font.BOLD, 18));
		toonieField.setHorizontalAlignment(SwingConstants.CENTER);
		toonieField.setBounds(10, 214, 86, 20);
		frame.getContentPane().add(toonieField);
		toonieField.setColumns(10);
		
		loonieField = new JTextField();
		loonieField.setFont(new Font("Tahoma", Font.BOLD, 18));
		loonieField.setHorizontalAlignment(SwingConstants.CENTER);
		loonieField.setColumns(10);
		loonieField.setBounds(245, 214, 86, 20);
		frame.getContentPane().add(loonieField);
		
		quarterField = new JTextField();
		quarterField.setFont(new Font("Tahoma", Font.BOLD, 18));
		quarterField.setHorizontalAlignment(SwingConstants.CENTER);
		quarterField.setColumns(10);
		quarterField.setBounds(487, 214, 86, 20);
		frame.getContentPane().add(quarterField);
		
		JLabel lblNewLabel_2_3 = new JLabel("Dimes:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3.setBounds(10, 291, 102, 23);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Nickels:");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_4.setBounds(245, 291, 102, 23);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Pennies:");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_5.setBounds(487, 291, 102, 23);
		frame.getContentPane().add(lblNewLabel_2_5);
		
		dimeField = new JTextField();
		dimeField.setFont(new Font("Tahoma", Font.BOLD, 18));
		dimeField.setHorizontalAlignment(SwingConstants.CENTER);
		dimeField.setColumns(10);
		dimeField.setBounds(10, 325, 86, 20);
		frame.getContentPane().add(dimeField);
		
		nickelField = new JTextField();
		nickelField.setFont(new Font("Tahoma", Font.BOLD, 18));
		nickelField.setHorizontalAlignment(SwingConstants.CENTER);
		nickelField.setColumns(10);
		nickelField.setBounds(245, 325, 86, 20);
		frame.getContentPane().add(nickelField);
		
		pennyField = new JTextField();
		pennyField.setFont(new Font("Tahoma", Font.BOLD, 18));
		pennyField.setHorizontalAlignment(SwingConstants.CENTER);
		pennyField.setColumns(10);
		pennyField.setBounds(487, 325, 86, 20);
		frame.getContentPane().add(pennyField);
		
		JButton calcBtn = new JButton("Calculate");
		calcBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try 
				{
					double amount = Math.round(Double.parseDouble(inField.getText()) * 100.0) / 100.0;
					
					if(amount < 0) JOptionPane.showMessageDialog(null, "Please input a positive value!");
					else 
					{
						toonieField.setText((int)(amount/2)+"");
						amount = Math.round((amount % 2) * 100.0) / 100.0;
						
						loonieField.setText((int)(amount/1)+"");
						amount = Math.round((amount % 1) * 100.0) / 100.0;
						
						quarterField.setText((int)(amount/0.25)+"");
						amount = Math.round((amount % 0.25) * 100.0) / 100.0;
						
						dimeField.setText((int)(amount/0.1)+"");
						amount = Math.round((amount % 0.1) * 100.0) / 100.0;
						
						nickelField.setText((int)(amount/0.05)+"");
						amount = Math.round((amount % 0.05) * 100.0) / 100.0;
						
						pennyField.setText((int)(amount/0.01)+"");
					}
					
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, "Invalid Input!");
					inField.setText("");
				}
				
			}
		});
		calcBtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		calcBtn.setBounds(223, 137, 129, 32);
		frame.getContentPane().add(calcBtn);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(497, 356, 129, 32);
		frame.getContentPane().add(btnExit);
	}
}
