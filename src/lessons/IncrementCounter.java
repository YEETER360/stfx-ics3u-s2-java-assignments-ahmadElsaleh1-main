package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IncrementCounter {

	// Variable declaration
	private JFrame frame;
	private JTextField textField;
	int counter = 0;
	private JButton button2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncrementCounter window = new IncrementCounter();
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
	public IncrementCounter() {
		initialize();
		textField.setText(Integer.toString(counter));
		
		button2 = new JButton("Count Down");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Decrement method
				counter --;
				
				// Clamp counter value to 0
				if(counter < 0) counter = 0;
				
				textField.setText(Integer.toString(counter));
			}
		});
		button2.setBounds(154, 163, 126, 23);
		frame.getContentPane().add(button2);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(168, 125, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button1 = new JButton("Count Up");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Increment method
				counter ++;
				
				textField.setText(Integer.toString(counter));
			}
		});
		button1.setBounds(168, 85, 89, 23);
		frame.getContentPane().add(button1);
	}
}
