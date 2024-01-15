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

public class U3A5_Algorithms {

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
					U3A5_Algorithms window = new U3A5_Algorithms();
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
	public U3A5_Algorithms() {
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
		
		JLabel lblNewLabel = new JLabel("Fibonacci");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setBounds(144, 11, 268, 80);
		frame.getContentPane().add(lblNewLabel);
		
		inField = new JTextField();
		inField.setHorizontalAlignment(SwingConstants.CENTER);
		inField.setBounds(20, 102, 76, 34);
		frame.getContentPane().add(inField);
		inField.setColumns(10);
		
		outField = new JTextField();
		outField.setHorizontalAlignment(SwingConstants.CENTER);
		outField.setEditable(false);
		outField.setColumns(10);
		outField.setBounds(287, 102, 163, 34);
		frame.getContentPane().add(outField);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					int num = Integer.parseInt(inField.getText());
					
					if(num < 1) 
					{
						JOptionPane.showMessageDialog(null, "Invalid sequence number!");
						inField.setText("");
					}
					else 
					{
						if(num == 1) outField.setText("0");
						else if(num == 2) outField.setText("1");
						else 
						{
							long result = 0;
							long a = 0;
							long b = 1;
							for(long i = 2; i < num; i++) 
							{
								result = a + b;
								a = b;
								b = result;
							}
							outField.setText(result+"");
						}
					}
					
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, "Invalid Input!");
					inField.setText("");
				}
			}
		});
		btnNewButton.setBounds(119, 102, 138, 34);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Sequence");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 73, 96, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Number");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(287, 77, 163, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
	}
}
