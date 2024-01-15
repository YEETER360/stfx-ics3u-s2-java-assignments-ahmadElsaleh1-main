package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdderGUI {

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
					AdderGUI window = new AdderGUI();
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
	public AdderGUI() {
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
		
		JLabel lblNewLabel = new JLabel("Adder GUI");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(145, 11, 129, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Number");
		lblNewLabel_1.setBounds(39, 88, 66, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Second Number");
		lblNewLabel_2.setBounds(39, 134, 83, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Answer");
		lblNewLabel_3.setBounds(39, 191, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField1 = new JTextField();
		textField1.setBounds(164, 85, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(164, 128, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(164, 188, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JButton button1 = new JButton("Add");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField3.setText(Integer.toString(Integer.parseInt(textField1.getText()) + Integer.parseInt(textField2.getText())));
			}
		});
		button1.setBounds(309, 84, 89, 23);
		frame.getContentPane().add(button1);
	}
}
