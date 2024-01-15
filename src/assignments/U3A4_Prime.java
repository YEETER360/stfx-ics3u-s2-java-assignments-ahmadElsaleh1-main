package assignments;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class U3A4_Prime {

	private JFrame frame;
	private JTextField inField;
	private JTextField outField;
	private JTextField timeField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U3A4_Prime window = new U3A4_Prime();
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
	public U3A4_Prime() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 476, 233);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Prime");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setBounds(171, 11, 268, 80);
		frame.getContentPane().add(lblNewLabel);
		
		inField = new JTextField();
		inField.setFont(new Font("Tahoma", Font.BOLD, 12));
		inField.setHorizontalAlignment(SwingConstants.CENTER);
		inField.setBounds(10, 102, 151, 34);
		frame.getContentPane().add(inField);
		inField.setColumns(10);
		
		outField = new JTextField();
		outField.setFont(new Font("Tahoma", Font.BOLD, 18));
		outField.setHorizontalAlignment(SwingConstants.CENTER);
		outField.setEditable(false);
		outField.setColumns(10);
		outField.setBounds(352, 102, 98, 34);
		frame.getContentPane().add(outField);
		
		JButton btnNewButton = new JButton("Determine");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					long start = System.nanoTime();
				    
					long num = Long.parseLong(inField.getText());
					boolean success = true;
					boolean isPrime = true;
					
					if(num < 1) 
					{
						JOptionPane.showMessageDialog(null, "Logic Error!");
						success = false;
						inField.setText("");
						outField.setText("");
					}
					else if(num == 1) outField.setText("false");
					else if(num == 2) outField.setText("true");
					else if(num % 2 == 1) 
					{
						long sqrt = (long)Math.sqrt(num);
						if(sqrt % 2 == 0) sqrt++;
						
						for(long i = 3; i <= sqrt; i+=2) 
						{
							if(num % i == 0) 
							{
								isPrime = false;
								break;
							}
						}
						outField.setText(String.valueOf(isPrime));
					}
					else outField.setText("false");
					
					if(success) 
					{
						long end = System.nanoTime();
						long calcTime = end - start;
						long calcMs = TimeUnit.NANOSECONDS.toMillis(calcTime);
						calcTime -= calcMs * 1000000;
						long calcMc = TimeUnit.NANOSECONDS.toMicros(calcTime);
						calcTime -= calcMc * 1000;
						timeField.setText("ms "+ calcMs +":"+ calcMc +":"+ calcTime);
					}
					
				}
				catch(Exception exc) 
				{
					JOptionPane.showMessageDialog(null, "Invalid Input!");
					inField.setText("");
					outField.setText("");
					timeField.setText("");
				}
			}
		});
		btnNewButton.setBounds(193, 102, 138, 34);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 77, 151, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Is Prime");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(352, 77, 98, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Calculation Time:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(20, 145, 184, 36);
		frame.getContentPane().add(lblNewLabel_2);
		
		timeField = new JTextField();
		timeField.setHorizontalAlignment(SwingConstants.CENTER);
		timeField.setEditable(false);
		timeField.setFont(new Font("Tahoma", Font.BOLD, 18));
		timeField.setBounds(207, 147, 223, 34);
		frame.getContentPane().add(timeField);
		timeField.setColumns(10);
	}
}
