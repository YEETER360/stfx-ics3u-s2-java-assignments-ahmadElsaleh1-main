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

public class U3A3_Factorial {

	private JFrame frame;
	private JTextField inField;
	private JTextField outField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A3_Factorial window = new U3A3_Factorial();
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
	public U3A3_Factorial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 476, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factorial");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setBounds(144, 11, 268, 80);
		frame.getContentPane().add(lblNewLabel);
		
		inField = new JTextField();
		inField.setFont(new Font("Tahoma", Font.BOLD, 14));
		inField.setHorizontalAlignment(SwingConstants.CENTER);
		inField.setBounds(50, 102, 52, 34);
		frame.getContentPane().add(inField);
		inField.setColumns(10);
		
		outField = new JTextField();
		outField.setHorizontalAlignment(SwingConstants.CENTER);
		outField.setEditable(false);
		outField.setColumns(10);
		outField.setBounds(332, 102, 98, 34);
		frame.getContentPane().add(outField);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					long num = Long.parseLong(inField.getText());
					long result = 0;
					
					if(num < 1) 
					{
						JOptionPane.showMessageDialog(null, "Math Error!");
						inField.setText("");
					}
					else 
					{
						result = num;
						for(long i = 1; i < num; i++) 
						{
							result *= num - i;
						}
						outField.setText(result+"");
					}
					
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, "Invalid Input!");
					inField.setText("");
				}
			}
		});
		btnNewButton.setBounds(154, 102, 138, 34);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(50, 77, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("n!");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(332, 77, 98, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
	}
}
