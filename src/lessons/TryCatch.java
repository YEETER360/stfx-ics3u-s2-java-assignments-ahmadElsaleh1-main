package lessons;

import java.awt.EventQueue;
// need to import for error pop up
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TryCatch {

	private JFrame frame;
	int num1 = 0;
	int num2 = 0;
	int answer = 0;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryCatch window = new TryCatch();
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
	public TryCatch() {
		initialize();
		textField1.setText(Integer.toString(num1));
		textField2.setText(Integer.toString(num2));
		textField3.setText(Integer.toString(answer));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Add function
				try 
				{
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					answer = num1 + num2;
					textField3.setText(Integer.toString(answer));
				}
				
				catch(Exception e) 
				{
					JOptionPane.showMessageDialog(null, "Invalid Entry!");
				}
			}
		});
		btnNewButton.setBounds(10, 120, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField1 = new JTextField();
		textField1.setBounds(129, 121, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(225, 121, 86, 20);
		frame.getContentPane().add(textField2);
		
		textField3 = new JTextField();
		textField3.setEditable(false);
		textField3.setColumns(10);
		textField3.setBounds(336, 121, 86, 20);
		frame.getContentPane().add(textField3);
		
		JLabel lblNewLabel = new JLabel("Num1");
		lblNewLabel.setBounds(129, 96, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNum = new JLabel("Num2");
		lblNum.setBounds(225, 96, 46, 14);
		frame.getContentPane().add(lblNum);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(336, 96, 46, 14);
		frame.getContentPane().add(lblAnswer);
	}
}
