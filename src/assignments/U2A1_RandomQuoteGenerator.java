package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U2A1_RandomQuoteGenerator {

	private JFrame frame;
	final int N = 8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A1_RandomQuoteGenerator window = new U2A1_RandomQuoteGenerator();
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
	public U2A1_RandomQuoteGenerator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 655, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Motivation Machine");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setBounds(134, 11, 383, 63);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea txtrClickgenerateQuote = new JTextArea();
		txtrClickgenerateQuote.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 20));
		txtrClickgenerateQuote.setText("Click \"Generate Quote\" and fuel your motivation");
		txtrClickgenerateQuote.setEditable(false);
		txtrClickgenerateQuote.setWrapStyleWord(true);
		txtrClickgenerateQuote.setLineWrap(true);
		txtrClickgenerateQuote.setBounds(30, 85, 574, 31);
		frame.getContentPane().add(txtrClickgenerateQuote);
		
		JTextArea quoteField = new JTextArea();
		quoteField.setWrapStyleWord(true);
		quoteField.setLineWrap(true);
		quoteField.setFont(new Font("Monospaced", Font.BOLD, 24));
		quoteField.setEditable(false);
		quoteField.setBounds(30, 218, 574, 177);
		frame.getContentPane().add(quoteField);
		
		JButton btnNewButton = new JButton("Generate Quote");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int randInt = (int)((Math.random() * N) + 1);
				
				switch(randInt) 
				{
					case 1:
						quoteField.setText("This thing that we call failure is not the falling down, but the staying down. -Mary Pickford");
						break;
					case 2:
						quoteField.setText("I feel within me a peace above all earthly dignities, a still and quiet consciences—William Shakespeare");
						break;
					case 3:
						quoteField.setText("You cannot believe now that you'll ever feel better. But this is not true. You are sure to be happy again. Knowing this, truly believing it, will make you less miserable now. —Abraham Lincoln");
						break;
					case 4:
						quoteField.setText("To live is to suffer. To survive is to find meaning in the suffering. —Friedrich Nietzsche");
						break;
					case 5:
						quoteField.setText("Of all sad words of tongue or pen, the saddest are these, 'It might have been. —John Greenleaf Whittier");
						break;
					case 6:
						quoteField.setText("In the end… We only regret the chances we didn’t take —Lewis Carroll");
						break;
					case 7:
						quoteField.setText("There are no regrets in life, just lessons. —Jennifer Aniston");
						break;
					case 8:
						quoteField.setText("Our doubts are traitors, and make us lose the good we oft might win, by fearing to attempt. —William Shakespeare");
						break;
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(202, 134, 222, 63);
		frame.getContentPane().add(btnNewButton);
	}
}
