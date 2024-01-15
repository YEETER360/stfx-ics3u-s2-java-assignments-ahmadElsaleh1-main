package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U1A5_AverageCalculatorGUI {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A5_AverageCalculatorGUI window = new U1A5_AverageCalculatorGUI();
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
	public U1A5_AverageCalculatorGUI() {
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
		
		JTextPane txtpnCourseAverageCalculator = new JTextPane();
		txtpnCourseAverageCalculator.setText("Course average calculator");
		txtpnCourseAverageCalculator.setBounds(150, 11, 133, 20);
		frame.getContentPane().add(txtpnCourseAverageCalculator);
		
		JTextArea txtrEnterYour = new JTextArea();
		txtrEnterYour.setLineWrap(true);
		txtrEnterYour.setRows(2);
		txtrEnterYour.setText("Enter your 4 course makrs and click Calculate to find out your average");
		txtrEnterYour.setBounds(10, 42, 398, 40);
		frame.getContentPane().add(txtrEnterYour);
		
		JLabel lblNewLabel = new JLabel("Couse mark 1");
		lblNewLabel.setBounds(36, 102, 99, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Course mark 2");
		lblNewLabel_1.setBounds(36, 134, 99, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Course mark 3");
		lblNewLabel_2.setBounds(36, 172, 99, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Course mark 4");
		lblNewLabel_3.setBounds(36, 210, 99, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField1 = new JTextField();
		textField1.setBounds(156, 99, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(156, 131, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(156, 169, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setBounds(156, 207, 86, 20);
		frame.getContentPane().add(textField4);
		textField4.setColumns(10);
		
		JButton button1 = new JButton("Calculate");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField5.setText(Integer.toString((Integer.parseInt(textField1.getText()) + Integer.parseInt(textField2.getText()) + Integer.parseInt(textField3.getText()) + Integer.parseInt(textField4.getText())) / 4));
			}
		});
		button1.setBounds(295, 134, 89, 23);
		frame.getContentPane().add(button1);
		
		JLabel lblNewLabel_4 = new JLabel("Average:");
		lblNewLabel_4.setBounds(265, 196, 86, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField5 = new JTextField();
		textField5.setBounds(338, 193, 86, 20);
		frame.getContentPane().add(textField5);
		textField5.setColumns(10);
	}
}
