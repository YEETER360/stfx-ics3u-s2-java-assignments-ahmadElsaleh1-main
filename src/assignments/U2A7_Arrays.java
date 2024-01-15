package assignments;

import java.awt.EventQueue;
//need to import for error pop up
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U2A7_Arrays {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	JButton nextBtn;
	JButton submitBtn;
	JButton backBtn;
	JButton finishBtn;
	JButton backBtn2;
	
	int index = 0;
	double correct = 0;
	int incorrect = 0;
	
	final String QUESTIONS[] = {"What is Java?", "What is an IDE?", "What is a variable in Java?", "What function can you use to compare two strings?", "What do the functions 'try' and 'catch' do?", "How do you convert a String to a Double?", "How should you name a constant variable?", "How do you convert a double to an integer?", "What is an exception in Java?"};
	final String OPTION_1[] = {"a) A type of coffee", "a) A type of computer", "a) A data type used to store numbers", "a) Scanner.toString()", "a) Takes a String and catches it as an integer", "a) myString = Double.toString(myDouble);", "a) MY_CONSTANT_VARIABLE", "a) myInteger = Integer.toDouble(myDouble);", "a) A special type of loop"};
	final String OPTION_2[] = {"b) A programming language", "b) A software used to write and run programs", "b) A type of loop", "b) string1 == string2", "b) Tries to catch a ball", "b) myDouble = Scanner.toString;", "b) myConstantVariable", "b) myDouble = Double.parseInt(myInteger);", "b) A data structure used to store multiple values"};
	final String OPTION_3[] = {"c) A type of car", "c) A type of programming language", "c) A programming language", "c) string1.equals(string2)", "c) Used to call superclass methods", "c) myDouble = Double.parseDouble(myString);", "c) My constant variable", "c) myInteger = (int)myDouble;", "c) An error that occurs in program execution"};
	final String OPTION_4[] = {"d) A type of animal", "d) A type of file format", "d) A special character used in Java code", "d) string1 && string2", "d) Tries a block of code and returns an error", "d) myDouble = myString;", "d) MYCONSTANTVARIABLE", "d) if(myDouble == double) myDouble = int;", "d) A type of method used to write Java code"};
	final String CORRECT_MESSAGES[] = {"Nice job!", "Well done!", "I saw you cheat", "Java Wizard!", "Too easy!", "Programming Genius!", "You're crushing it!!", "Spot on!!", "You're on fire!", "Aced it!"};
	final String INCORRECT_MESSAGES[] = {"Better luck next time!", "Try harder", "Use your brain!!", "It's quite simple", "Put in some effort!", "You can do better!", "Keep trying!", "Not quite... but don't give up!", "Close, but not quite!", "Come on, that was an easy one!", "Poor attempt :("};
	final String ANSWERS_STRING[] = {"b", "b", "a", "c", "d", "c", "a", "c", "c"};
	final int ANSWERS_INT[] = {1, 1, 0, 2, 3, 2, 0, 2, 2};
	final String ABCD = "abcd";
	String answeredStr[] = new String[QUESTIONS.length];
	int answered[] = new int[QUESTIONS.length];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A7_Arrays window = new U2A7_Arrays();
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
	public U2A7_Arrays() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 595, 753);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel finish4 = new JLabel("Accuracy:");
		finish4.setFont(new Font("Tahoma", Font.BOLD, 22));
		finish4.setBounds(97, 509, 213, 40);
		frame.getContentPane().add(finish4);
		
		JLabel finish3 = new JLabel("Score:");
		finish3.setFont(new Font("Tahoma", Font.BOLD, 22));
		finish3.setBounds(97, 432, 213, 40);
		frame.getContentPane().add(finish3);
		
		JLabel lblNewLabel = new JLabel("Computer Science Trivia");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel.setBounds(53, 11, 486, 87);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea startMessage = new JTextArea();
		startMessage.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 32));
		startMessage.setText("The following "+ QUESTIONS.length +" questions will test your knowledge in Java programming");
		startMessage.setLineWrap(true);
		startMessage.setWrapStyleWord(true);
		startMessage.setEditable(false);
		startMessage.setBounds(36, 98, 503, 162);
		frame.getContentPane().add(startMessage);
		
		JLabel correctLabel = new JLabel("Correct Answers:");
		correctLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		correctLabel.setBounds(289, 559, 183, 28);
		frame.getContentPane().add(correctLabel);
		
		JLabel incorrectLabel = new JLabel("Incorrect Answers:");
		incorrectLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		incorrectLabel.setBounds(289, 610, 183, 28);
		frame.getContentPane().add(incorrectLabel);
		
		JLabel accuracy = new JLabel("Accuracy:");
		accuracy.setFont(new Font("Tahoma", Font.BOLD, 18));
		accuracy.setBounds(289, 663, 183, 28);
		frame.getContentPane().add(accuracy);
		
		textField1 = new JTextField();
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField1.setEditable(false);
		textField1.setBounds(483, 566, 56, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField2.setEditable(false);
		textField2.setColumns(10);
		textField2.setBounds(483, 617, 56, 20);
		frame.getContentPane().add(textField2);
		
		textField3 = new JTextField();
		textField3.setHorizontalAlignment(SwingConstants.CENTER);
		textField3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField3.setEditable(false);
		textField3.setColumns(10);
		textField3.setBounds(464, 670, 75, 20);
		frame.getContentPane().add(textField3);
		
		JLabel answer = new JLabel("Answer:");
		answer.setFont(new Font("Tahoma", Font.BOLD, 21));
		answer.setBounds(10, 559, 118, 28);
		frame.getContentPane().add(answer);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBounds(137, 566, 56, 20);
		frame.getContentPane().add(textField);
		
		JLabel question = new JLabel("Question 1:");
		question.setFont(new Font("Tahoma", Font.BOLD, 30));
		question.setBounds(36, 98, 399, 52);
		frame.getContentPane().add(question);
		
		JLabel questionField = new JLabel("Question");
		questionField.setFont(new Font("Tahoma", Font.BOLD, 19));
		questionField.setBounds(36, 173, 543, 28);
		frame.getContentPane().add(questionField);
		
		JLabel optionA = new JLabel("A");
		optionA.setFont(new Font("Tahoma", Font.BOLD, 22));
		optionA.setBounds(36, 232, 543, 28);
		frame.getContentPane().add(optionA);
		
		JLabel optionB = new JLabel("B");
		optionB.setFont(new Font("Tahoma", Font.BOLD, 22));
		optionB.setBounds(36, 298, 543, 28);
		frame.getContentPane().add(optionB);
		
		JLabel optionC = new JLabel("C");
		optionC.setFont(new Font("Tahoma", Font.BOLD, 22));
		optionC.setBounds(36, 363, 543, 28);
		frame.getContentPane().add(optionC);
		
		JLabel optionD = new JLabel("D");
		optionD.setFont(new Font("Tahoma", Font.BOLD, 22));
		optionD.setBounds(36, 427, 543, 28);
		frame.getContentPane().add(optionD);
		
		JTextArea message = new JTextArea();
		message.setWrapStyleWord(true);
		message.setText("Message");
		message.setLineWrap(true);
		message.setFont(new Font("Monospaced", Font.BOLD, 26));
		message.setEditable(false);
		message.setBounds(36, 483, 503, 65);
		frame.getContentPane().add(message);
		
		String[] OPTIONS[] = {OPTION_1, OPTION_2, OPTION_3, OPTION_4};
		JLabel[] options = {optionA, optionB, optionC, optionD};
		
		submitBtn = new JButton("Submit");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Submit method
				try 
				{
					double accuracy = 0;
					
					if(textField.getText().equalsIgnoreCase("a") || textField.getText().equalsIgnoreCase("b") || textField.getText().equalsIgnoreCase("c") || textField.getText().equalsIgnoreCase("d")) 
					{
						answeredStr[index] = textField.getText();
						int answerIndex = ABCD.indexOf(textField.getText().toLowerCase());
						answered[index] = answerIndex; 
						
						if(textField.getText().equalsIgnoreCase(ANSWERS_STRING[index]))
						{
							//Correct answer
							correct++;
							
							message.setText(CORRECT_MESSAGES[(int)(Math.random() * CORRECT_MESSAGES.length)]);
							options[answered[index]].setForeground(Color.GREEN);
						}
						else 
						{
							//Wrong answer
							incorrect++;
							
							message.setText(INCORRECT_MESSAGES[(int)(Math.random() * INCORRECT_MESSAGES.length)]);
							options[answered[index]].setForeground(Color.RED); 
							options[ANSWERS_INT[index]].setForeground(Color.GREEN);
						}
						accuracy = Math.round(((correct / (index + 1) * 100.0) * 10.0) / 10.0);
						
						textField1.setText(Integer.toString((int)correct));
						textField2.setText(Integer.toString(incorrect));
						textField3.setText(Double.toString(accuracy) + "%");
						
						message.setVisible(true);
						textField.setEditable(false);
						submitBtn.setEnabled(false);
						finishBtn.setEnabled(true);
						nextBtn.setEnabled(true);
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "Invalid Option!");
						textField.setText("");
					}
				}
				
				catch(Exception e) 
				{
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		submitBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		submitBtn.setBounds(97, 614, 89, 23);
		frame.getContentPane().add(submitBtn);
		
		nextBtn = new JButton("NEXT ->");
		nextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Next method
				index++;
				
				if(answeredStr[index] != null) 
				{
					//If already answered
					for(int i = 0; i < options.length; i++) 
					{
						options[i].setForeground(Color.BLACK);
					}
					
					textField.setText(answeredStr[index]);
					
					if(textField.getText().equalsIgnoreCase(ANSWERS_STRING[index])) 
					{
						message.setText(CORRECT_MESSAGES[(int)(Math.random() * CORRECT_MESSAGES.length)]);
						options[answered[index]].setForeground(Color.GREEN);
					}
					else 
					{
						message.setText(INCORRECT_MESSAGES[(int)(Math.random() * INCORRECT_MESSAGES.length)]);
						options[answered[index]].setForeground(Color.RED); 
						options[ANSWERS_INT[index]].setForeground(Color.GREEN);
					}
					
					textField1.setText(Integer.toString((int)correct));
					textField2.setText(Integer.toString(incorrect));
					
					question.setText("Question "+ (index + 1) +":");
					questionField.setText(QUESTIONS[index]);
					
					for(int i = 0; i < options.length; i++) 
					{
						options[i].setText(OPTIONS[i][index]);
					}
					
					if(index == 0) backBtn.setVisible(false);
					else backBtn.setVisible(true);
					textField.setEditable(false);
					message.setVisible(true);
					nextBtn.setEnabled(true);
					submitBtn.setEnabled(false);
					
					if(index >= (QUESTIONS.length - 1)) 
					{
						finishBtn.setVisible(true);
						nextBtn.setVisible(false);
					}
					else
					{
						finishBtn.setVisible(false);
						nextBtn.setVisible(true);
					}
				}
				
				else 
				{
					//If not answered yet
					question.setText("Question "+ (index + 1) +":");
					questionField.setText(QUESTIONS[index]);
					for(int i = 0; i < options.length; i++) 
					{
						options[i].setText(OPTIONS[i][index]);
					}
					
					if(index == 1) backBtn.setVisible(true);
					
					textField.setText("");
					textField.setEditable(true);
					message.setVisible(false);
					nextBtn.setEnabled(false);
					submitBtn.setEnabled(true);

					for(int i = 0; i < options.length; i++) 
					{
						options[i].setForeground(Color.BLACK);
					}
					
					if(index == (QUESTIONS.length - 1)) 
					{
						finishBtn.setVisible(true);
						finishBtn.setEnabled(false);
						nextBtn.setVisible(false);
					}
				}
			}
		});
		nextBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		nextBtn.setBounds(146, 656, 133, 40);
		frame.getContentPane().add(nextBtn);
		
		JButton start = new JButton("START");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start.setVisible(false);
				startMessage.setVisible(false);
				
				question.setVisible(true);
				questionField.setVisible(true);
				optionA.setVisible(true);
				optionB.setVisible(true);
				optionC.setVisible(true);
				optionD.setVisible(true);
				submitBtn.setVisible(true);
				nextBtn.setVisible(true);
				nextBtn.setEnabled(false);
				answer.setVisible(true);
				correctLabel.setVisible(true);
				incorrectLabel.setVisible(true);
				accuracy.setVisible(true);
				textField.setVisible(true);
				textField1.setVisible(true);
				textField2.setVisible(true);
				textField3.setVisible(true);
				
				question.setText("Question "+ (index + 1) +":");
				questionField.setText(QUESTIONS[index]);
				
				for(int i = 0; i < options.length; i++) 
				{
					options[i].setText(OPTIONS[i][index]);
				}
			}
		});
		start.setFont(new Font("Tahoma", Font.BOLD, 40));
		start.setBounds(120, 413, 335, 142);
		frame.getContentPane().add(start);
		
		backBtn = new JButton("<- BACK");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Back method
				for(int i = 0; i < options.length; i++) 
				{
					options[i].setForeground(Color.BLACK);
				}
				
				index--;
				
				textField.setText(answeredStr[index]);
				
				if(textField.getText().equalsIgnoreCase(ANSWERS_STRING[index])) 
				{
					message.setText(CORRECT_MESSAGES[(int)(Math.random() * CORRECT_MESSAGES.length)]);
					options[answered[index]].setForeground(Color.GREEN);
				}
				else 
				{
					message.setText(INCORRECT_MESSAGES[(int)(Math.random() * INCORRECT_MESSAGES.length)]);
					options[answered[index]].setForeground(Color.RED); 
					options[ANSWERS_INT[index]].setForeground(Color.GREEN);
				}
				
				textField1.setText(Integer.toString((int)correct));
				textField2.setText(Integer.toString(incorrect));
				
				question.setText("Question "+ (index + 1) +":");
				questionField.setText(QUESTIONS[index]);
				
				for(int i = 0; i < options.length; i++) 
				{
					options[i].setText(OPTIONS[i][index]);
				}
				
				if(index == 0) backBtn.setVisible(false);
				textField.setEditable(false);
				message.setVisible(true);
				nextBtn.setEnabled(true);
				submitBtn.setEnabled(false);
				
				if(index >= (QUESTIONS.length - 1)) 
				{
					finishBtn.setVisible(true);
					nextBtn.setVisible(false);
				}
				else
				{
					finishBtn.setVisible(false);
					nextBtn.setVisible(true);
				}
			}
		});
		backBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		backBtn.setBounds(10, 656, 133, 40);
		frame.getContentPane().add(backBtn);
		
		JTextArea finishMessage = new JTextArea();
		finishMessage.setWrapStyleWord(true);
		finishMessage.setText("Great Job! You have completed the Trivia. Here are your results:");
		finishMessage.setLineWrap(true);
		finishMessage.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 32));
		finishMessage.setEditable(false);
		finishMessage.setBounds(36, 98, 503, 142);
		frame.getContentPane().add(finishMessage);
		
		JLabel finish1 = new JLabel("Correct Answers:");
		finish1.setFont(new Font("Tahoma", Font.BOLD, 22));
		finish1.setBounds(97, 312, 213, 40);
		frame.getContentPane().add(finish1);
		
		JLabel finish2 = new JLabel("Incorrect Answers:");
		finish2.setFont(new Font("Tahoma", Font.BOLD, 22));
		finish2.setBounds(97, 375, 213, 40);
		frame.getContentPane().add(finish2);
		
		JButton exitBtn = new JButton("QUIT");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		exitBtn.setBounds(436, 656, 133, 40);
		frame.getContentPane().add(exitBtn);
		
		finishBtn = new JButton("FINISH ->");
		finishBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Finish method
				question.setVisible(false);
				questionField.setVisible(false);
				for(int i = 0; i < options.length; i++) 
				{
					options[i].setVisible(false);
				}
				message.setVisible(false);
				finishBtn.setVisible(false);
				backBtn.setVisible(false);
				submitBtn.setVisible(false);
				answer.setVisible(false);
				correctLabel.setVisible(false);
				incorrectLabel.setVisible(false);
				accuracy.setVisible(false);
				textField.setVisible(false);
				textField1.setVisible(false);
				textField2.setVisible(false);
				textField3.setVisible(false);
				
				finishMessage.setVisible(true);
				finish1.setVisible(true);
				finish2.setVisible(true);
				finish3.setVisible(true);
				finish4.setVisible(true);
				textField_1.setVisible(true);
				textField_2.setVisible(true);
				textField_3.setVisible(true);
				textField_4.setVisible(true);
				backBtn2.setVisible(true);
				exitBtn.setVisible(true);
				
				textField_1.setText(textField1.getText());
				textField_2.setText(textField2.getText());
				textField_3.setText((int)correct +"/"+ QUESTIONS.length);
				textField_4.setText(textField3.getText());
			}
		});
		finishBtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		finishBtn.setBounds(146, 656, 133, 40);
		frame.getContentPane().add(finishBtn);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_1.setBounds(386, 324, 86, 28);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_2.setColumns(10);
		textField_2.setBounds(386, 388, 86, 28);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_3.setColumns(10);
		textField_3.setBounds(386, 444, 86, 28);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_4.setColumns(10);
		textField_4.setBounds(386, 521, 86, 28);
		frame.getContentPane().add(textField_4);
		
		backBtn2 = new JButton("<- BACK");
		backBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Back from finish page
				question.setVisible(true);
				questionField.setVisible(true);
				for(int i = 0; i < options.length; i++) 
				{
					options[i].setVisible(true);
				}
				message.setVisible(true);
				finishBtn.setVisible(true);
				backBtn.setVisible(true);
				submitBtn.setVisible(true);
				answer.setVisible(true);
				correctLabel.setVisible(true);
				incorrectLabel.setVisible(true);
				accuracy.setVisible(true);
				textField.setVisible(true);
				textField1.setVisible(true);
				textField2.setVisible(true);
				textField3.setVisible(true);
				
				finishMessage.setVisible(false);
				finish1.setVisible(false);
				finish2.setVisible(false);
				finish3.setVisible(false);
				finish4.setVisible(false);
				textField_1.setVisible(false);
				textField_2.setVisible(false);
				textField_3.setVisible(false);
				textField_4.setVisible(false);
				backBtn2.setVisible(false);
				exitBtn.setVisible(false);
			}
		});
		backBtn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		backBtn2.setBounds(10, 656, 133, 40);
		frame.getContentPane().add(backBtn2);
		backBtn2.setVisible(false);
		
		question.setVisible(false);
		questionField.setVisible(false);
		for(int i = 0; i < options.length; i++) 
		{
			options[i].setVisible(false);
		}
		message.setVisible(false);
		finishBtn.setVisible(false);
		backBtn.setVisible(false);
		submitBtn.setVisible(false);
		nextBtn.setVisible(false);
		answer.setVisible(false);
		correctLabel.setVisible(false);
		incorrectLabel.setVisible(false);
		accuracy.setVisible(false);
		textField.setVisible(false);
		textField1.setVisible(false);
		textField2.setVisible(false);
		textField3.setVisible(false);
		finishMessage.setVisible(false);
		finish1.setVisible(false);
		finish2.setVisible(false);
		finish3.setVisible(false);
		finish4.setVisible(false);
		textField_1.setVisible(false);
		textField_2.setVisible(false);
		textField_3.setVisible(false);
		textField_4.setVisible(false);
		exitBtn.setVisible(false);
	}
}