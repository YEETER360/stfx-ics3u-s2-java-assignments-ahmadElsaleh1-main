package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI {

	private JFrame frame;
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
					CalculatorGUI window = new CalculatorGUI();
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
	public CalculatorGUI() {
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
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(150, 11, 132, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button1 = new JButton("Add");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Add method
				textField3.setText(Float.toString(Float.parseFloat(textField1.getText()) + Float.parseFloat(textField2.getText())));
			}
		});
		button1.setBounds(20, 48, 89, 23);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("Subtract");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Subtract method
				textField3.setText(Float.toString(Float.parseFloat(textField1.getText()) - Float.parseFloat(textField2.getText())));
			}
		});
		button2.setBounds(20, 82, 89, 23);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("Multiply");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Multiply method
				textField3.setText(Float.toString(Float.parseFloat(textField1.getText()) * Float.parseFloat(textField2.getText())));
			}
		});
		button3.setBounds(20, 116, 89, 23);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("Divide");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Divide method
				textField3.setText(Float.toString(Float.parseFloat(textField1.getText()) / Float.parseFloat(textField2.getText())));
			}
		});
		button4.setBounds(20, 150, 89, 23);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("Reset");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Reset method
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
			}
		});
		button5.setBounds(20, 184, 89, 23);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("Exit");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Exit method
				System.exit(0);
			}
		});
		button6.setBounds(20, 218, 89, 23);
		frame.getContentPane().add(button6);
		
		JLabel lblNewLabel_1 = new JLabel("First Number:");
		lblNewLabel_1.setBounds(175, 86, 107, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Second Number:");
		lblNewLabel_2.setBounds(175, 140, 107, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Answer:");
		lblNewLabel_3.setBounds(175, 200, 107, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField1 = new JTextField();
		textField1.setBounds(307, 83, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(307, 137, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setEnabled(false);
		textField3.setBounds(307, 197, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
	}
}
