package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class U1A8_PizzaCalculatorGUI {

	private JFrame frame;
	private JTextField subtotalValue;
	private JTextField taxValue;
	private JTextField totalValue;
	private JTextField textField;
	
	final float TAX_RATE = 0.13f;
	final float LABOUR_COST = 0.75f;
	final float RENT_COST = 0.99f;
	final float COST_PER_CM = 0.5f;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A8_PizzaCalculatorGUI window = new U1A8_PizzaCalculatorGUI();
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
	public U1A8_PizzaCalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 617, 716);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Putrid Pizza");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 41));
		lblNewLabel.setBounds(170, 22, 252, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pizza Diameter (cm):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(30, 127, 294, 32);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().setLayout(null);
		
		JTextArea message = new JTextArea();
		message.setWrapStyleWord(true);
		message.setFont(new Font("Monospaced", Font.PLAIN, 29));
		message.setLineWrap(true);
		message.setEditable(false);
		message.setBounds(30, 592, 533, 74);
		frame.getContentPane().add(message);
		
		JButton button1 = new JButton("Calculate");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Calculate function
				
				float subtotal = Math.round((Float.parseFloat(textField.getText()) * COST_PER_CM * 100.0f) + LABOUR_COST + RENT_COST) / 100.0f;
				
				subtotalValue.setText("$"+Float.toString(subtotal));
				taxValue.setText("$"+Float.toString(Math.round(subtotal * TAX_RATE * 100.0f) / 100.0f));
				totalValue.setText("$"+Float.toString(Math.round(subtotal * (1 + TAX_RATE) * 100.0f) / 100.0f));
				
				if(Float.parseFloat(textField.getText()) <= 15 ) {
					message.setText("We are going to make you a cute little pizza!");
				}
				else if(Float.parseFloat(textField.getText()) < 40) {
					message.setText("This will be delicious!");
				}
				else message.setText("Whoa, big pizza! You might need a truck to get this home!");
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 22));
		button1.setBounds(213, 206, 186, 51);
		frame.getContentPane().add(button1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Subtotal:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1_1.setBounds(30, 307, 294, 32);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tax (13%):");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1_2.setBounds(30, 405, 294, 32);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Grand Total:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1_3.setBounds(30, 502, 294, 32);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		subtotalValue = new JTextField();
		subtotalValue.setFont(new Font("Tahoma", Font.PLAIN, 26));
		subtotalValue.setEditable(false);
		subtotalValue.setBounds(282, 307, 198, 32);
		frame.getContentPane().add(subtotalValue);
		subtotalValue.setColumns(10);
		
		taxValue = new JTextField();
		taxValue.setFont(new Font("Tahoma", Font.PLAIN, 26));
		taxValue.setEditable(false);
		taxValue.setColumns(10);
		taxValue.setBounds(282, 405, 198, 32);
		frame.getContentPane().add(taxValue);
		
		totalValue = new JTextField();
		totalValue.setFont(new Font("Tahoma", Font.PLAIN, 26));
		totalValue.setEditable(false);
		totalValue.setColumns(10);
		totalValue.setBounds(282, 502, 198, 32);
		frame.getContentPane().add(totalValue);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 23));
		textField.setColumns(10);
		textField.setBounds(365, 127, 198, 32);
		frame.getContentPane().add(textField);
		
	}
}
