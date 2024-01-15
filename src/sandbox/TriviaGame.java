package sandbox;

import java.util.Arrays;
import java.awt.EventQueue;
//need to import for error pop up
import javax.swing.JOptionPane;

//networking
import java.net.*;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTable;

public class TriviaGame {
	
	static Socket socket = null;
	static DataOutputStream dataOutput = null;
	static OutputStream output = null;
	static DataInputStream dataInput = null;
	static InputStream input = null;
	String serverIP = "169.254.231.101";
	int serverPort = 7777;
	
	private JFrame frame;
	private JTextField nameField;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	JButton nextBtn;
	JButton submitBtn;
	JButton backBtn;
	JButton finishBtn;
	JButton backBtn2;
	DefaultTableModel defTable;
	
	Object[] row;
	String name;
	String score;
	String names[];
	String scores[];
	int index = 0;
	double correct = 0;
	int incorrect = 0;
	boolean loadedList = false;
	
	final String QUESTIONS[] = {"What is Java?", "What is an IDE?", "What are variables in Java?", "What function can you use to compare two strings?", "What do the functions 'try' and 'catch' do?", "How do you convert a String to a Double?", "How should you name a constant variable?", "How do you convert a double to an integer?", "What is an exception in Java?"};
	final String OPTION_1[] = {"a) A type of coffee", "a) A type of computer", "a) A data types used to store different data", "a) Scanner.toString()", "a) Takes a String and catches it as an integer", "a) myString = Double.toString(myDouble);", "a) MY_CONSTANT_VARIABLE", "a) myInteger = Integer.toDouble(myDouble);", "a) A special type of loop"};
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
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TriviaGame window = new TriviaGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void LoadList()
	{
		try 
		{
			socket = new Socket(serverIP, serverPort);
			System.out.println("Connected!");
			
			// get the output stream from the socket.
	        output = socket.getOutputStream();
	        // create a data output stream from the output stream so we can send data through it
	        dataOutput = new DataOutputStream(output);
	        
	        // get the input stream from the connected socket
		    input = socket.getInputStream();
		    // create a DataInputStream so we can read data from it
		    dataInput = new DataInputStream(input);
			
	        dataOutput.writeUTF(name);
	        dataOutput.flush(); // send name
	        System.out.println("Sent name: "+ name);
	        
	        dataOutput.writeUTF(score);
	        dataOutput.flush(); // send score
	        System.out.println("Sent score: "+ score);
	        
	        // read names from the socket  
		    String namesFull = dataInput.readUTF();
		    System.out.println("Recieved names from server");
		    
		    // read scores from the socket  
		    String scoresFull = dataInput.readUTF();
		    System.out.println("Recieved scores from server");
		    
		    names = namesFull.split(",");
		    scores = scoresFull.split(",");
		    for(int i = 0; i < names.length; i++) 
		    {
		    	row[0] = names[i];
	    		row[1] = ("    "+ scores[i]);
	    		defTable.addRow(row);
		    }
		    
		    System.out.println("Loaded list successfully!");
		    
		    dataInput.close();
		    dataOutput.close();
		    socket.close();
		    System.out.println("Connection Terminated");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
        
	}
	
	public void UpdateList()
	{
		try 
		{
			socket = new Socket(serverIP, serverPort);
			System.out.println("\nReconnected!");
	        
	        // get the input stream from the connected socket
		    input = socket.getInputStream();
		    // create a DataInputStream so we can read data from it
		    dataInput = new DataInputStream(input);
	        
	        // read the list from the socket  
		    String namesFull = dataInput.readUTF();
		    System.out.println("Recieved new names data from server");
		    
		    String scoresFull = dataInput.readUTF();
		    System.out.println("Recieved new scores data from server");
		    
		    for(int n = table.getRowCount(); n > 0; n--) {
	            defTable.removeRow(0);
	        }
		    System.out.println("Cleared list");
		    
		    names = namesFull.split(",");
		    scores = scoresFull.split(",");
		    for(int i = 0; i < names.length; i++) 
		    {
		    	row[0] = names[i];
	    		row[1] = ("    "+ scores[i]);
	    		defTable.addRow(row);
		    }
		    
		    System.out.println("Reloaded list successfully!");
		    
		    dataInput.close();
		    socket.close();
		    System.out.println("Connection Terminated");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
        
	}

	/**
	 * Create the application.
	 */
	public TriviaGame() throws IOException
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws IOException{
		
		frame = new JFrame();
		frame.setBounds(100, 100, 595, 753);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel nameLabel = new JLabel("Enter your name to view the Scoreboard:");
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		nameLabel.setBounds(36, 271, 503, 29);
		frame.getContentPane().add(nameLabel);
		
		nameField = new JTextField();
		nameField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		nameField.setBounds(36, 311, 352, 28);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		final JLabel finish4 = new JLabel("Accuracy:");
		finish4.setFont(new Font("Tahoma", Font.BOLD, 22));
		finish4.setBounds(10, 508, 213, 40);
		frame.getContentPane().add(finish4);
		
		final JLabel finish3 = new JLabel("Score:");
		finish3.setFont(new Font("Tahoma", Font.BOLD, 22));
		finish3.setBounds(10, 585, 213, 40);
		frame.getContentPane().add(finish3);
		
		JLabel lblNewLabel = new JLabel("Computer Science Trivia");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel.setBounds(53, 11, 486, 87);
		frame.getContentPane().add(lblNewLabel);
		
		final JTextArea startMessage = new JTextArea();
		startMessage.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 32));
		startMessage.setText("The following "+ QUESTIONS.length +" questions will test your knowledge in Java programming");
		startMessage.setLineWrap(true);
		startMessage.setWrapStyleWord(true);
		startMessage.setEditable(false);
		startMessage.setBounds(36, 98, 503, 162);
		frame.getContentPane().add(startMessage);
		
		final JLabel correctLabel = new JLabel("Correct:");
		correctLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		correctLabel.setBounds(304, 561, 183, 28);
		frame.getContentPane().add(correctLabel);
		
		final JLabel incorrectLabel = new JLabel("Incorrect:");
		incorrectLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		incorrectLabel.setBounds(304, 612, 183, 28);
		frame.getContentPane().add(incorrectLabel);
		
		final JLabel accuracy = new JLabel("Accuracy:");
		accuracy.setFont(new Font("Tahoma", Font.BOLD, 18));
		accuracy.setBounds(304, 665, 183, 28);
		frame.getContentPane().add(accuracy);
		
		textField1 = new JTextField();
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField1.setEditable(false);
		textField1.setBounds(464, 566, 75, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField2.setEditable(false);
		textField2.setColumns(10);
		textField2.setBounds(464, 617, 75, 20);
		frame.getContentPane().add(textField2);
		
		textField3 = new JTextField();
		textField3.setHorizontalAlignment(SwingConstants.CENTER);
		textField3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField3.setEditable(false);
		textField3.setColumns(10);
		textField3.setBounds(464, 670, 75, 20);
		frame.getContentPane().add(textField3);
		
		final JLabel answer = new JLabel("Answer:");
		answer.setFont(new Font("Tahoma", Font.BOLD, 21));
		answer.setBounds(10, 559, 118, 28);
		frame.getContentPane().add(answer);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBounds(137, 566, 56, 20);
		frame.getContentPane().add(textField);
		
		final JLabel question = new JLabel("Question 1:");
		question.setFont(new Font("Tahoma", Font.BOLD, 30));
		question.setBounds(36, 98, 399, 52);
		frame.getContentPane().add(question);
		
		final JLabel questionField = new JLabel("Question");
		questionField.setFont(new Font("Tahoma", Font.BOLD, 19));
		questionField.setBounds(36, 173, 543, 28);
		frame.getContentPane().add(questionField);
		
		final JLabel optionA = new JLabel("A");
		optionA.setFont(new Font("Tahoma", Font.BOLD, 22));
		optionA.setBounds(36, 232, 543, 28);
		frame.getContentPane().add(optionA);
		
		final JLabel optionB = new JLabel("B");
		optionB.setFont(new Font("Tahoma", Font.BOLD, 22));
		optionB.setBounds(36, 298, 543, 28);
		frame.getContentPane().add(optionB);
		
		final JLabel optionC = new JLabel("C");
		optionC.setFont(new Font("Tahoma", Font.BOLD, 22));
		optionC.setBounds(36, 363, 543, 28);
		frame.getContentPane().add(optionC);
		
		final JLabel optionD = new JLabel("D");
		optionD.setFont(new Font("Tahoma", Font.BOLD, 22));
		optionD.setBounds(36, 427, 543, 28);
		frame.getContentPane().add(optionD);
		
		final JTextArea message = new JTextArea();
		message.setWrapStyleWord(true);
		message.setText("Message");
		message.setLineWrap(true);
		message.setFont(new Font("Monospaced", Font.BOLD, 26));
		message.setEditable(false);
		message.setBounds(36, 483, 503, 65);
		frame.getContentPane().add(message);
		
		final JLabel[] options = {optionA, optionB, optionC, optionD};
		
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
					optionA.setForeground(Color.BLACK);
					optionB.setForeground(Color.BLACK);
					optionC.setForeground(Color.BLACK);
					optionD.setForeground(Color.BLACK);
					
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
					optionA.setText(OPTION_1[index]);
					optionB.setText(OPTION_2[index]);
					optionC.setText(OPTION_3[index]);
					optionD.setText(OPTION_4[index]);
					
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
					optionA.setText(OPTION_1[index]);
					optionB.setText(OPTION_2[index]);
					optionC.setText(OPTION_3[index]);
					optionD.setText(OPTION_4[index]);
					
					if(index == 1) backBtn.setVisible(true);
					
					textField.setText("");
					textField.setEditable(true);
					message.setVisible(false);
					nextBtn.setEnabled(false);
					submitBtn.setEnabled(true);
					optionA.setForeground(Color.BLACK);
					optionB.setForeground(Color.BLACK);
					optionC.setForeground(Color.BLACK);
					optionD.setForeground(Color.BLACK);
					
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
		
		final JButton start = new JButton("START");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				start.setVisible(false);
				startMessage.setVisible(false);
				nameLabel.setVisible(false);
				nameField.setVisible(false);
				
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
				optionA.setText(OPTION_1[index]);
				optionB.setText(OPTION_2[index]);
				optionC.setText(OPTION_3[index]);
				optionD.setText(OPTION_4[index]);	
			}
		});
		start.setFont(new Font("Tahoma", Font.BOLD, 40));
		start.setBounds(120, 450, 335, 142);
		frame.getContentPane().add(start);
		
		backBtn = new JButton("<- BACK");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Back method
				optionA.setForeground(Color.BLACK);
				optionB.setForeground(Color.BLACK);
				optionC.setForeground(Color.BLACK);
				optionD.setForeground(Color.BLACK);
				
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
				optionA.setText(OPTION_1[index]);
				optionB.setText(OPTION_2[index]);
				optionC.setText(OPTION_3[index]);
				optionD.setText(OPTION_4[index]);
				
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
		
		final JTextArea finishMessage = new JTextArea();
		finishMessage.setWrapStyleWord(true);
		finishMessage.setText("Great Job! You have completed the Trivia. Here are your results:");
		finishMessage.setLineWrap(true);
		finishMessage.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 32));
		finishMessage.setEditable(false);
		finishMessage.setBounds(36, 98, 503, 142);
		frame.getContentPane().add(finishMessage);
		
		final JLabel finish1 = new JLabel("Correct:");
		finish1.setFont(new Font("Tahoma", Font.BOLD, 22));
		finish1.setBounds(10, 351, 213, 40);
		frame.getContentPane().add(finish1);
		
		final JLabel finish2 = new JLabel("Incorrect:");
		finish2.setFont(new Font("Tahoma", Font.BOLD, 22));
		finish2.setBounds(10, 432, 213, 40);
		frame.getContentPane().add(finish2);
		
		final JButton exitBtn = new JButton("QUIT");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		exitBtn.setBounds(436, 656, 133, 40);
		frame.getContentPane().add(exitBtn);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_1.setBounds(146, 365, 86, 28);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_2.setColumns(10);
		textField_2.setBounds(146, 441, 86, 28);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_3.setColumns(10);
		textField_3.setBounds(147, 594, 86, 28);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_4.setColumns(10);
		textField_4.setBounds(146, 517, 86, 28);
		frame.getContentPane().add(textField_4);
		
		table = new JTable();
		table.setBounds(354, 271, 215, 214);
		frame.getContentPane().add(table);
		table.setRowHeight(25);
		table.setAutoCreateRowSorter(true);
		table.setEnabled(false);
		defTable = new DefaultTableModel();
		Object[] columns = {"Name", "Score"};
		defTable.setColumnIdentifiers(columns);
		table.setModel(defTable);
		table.getColumnModel().getColumn(1).setPreferredWidth(10);
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		table.getTableHeader().setResizingAllowed(false);
		table.getTableHeader().setReorderingAllowed(false);
		
		row = new Object[2];
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.setForeground(Color.RED);
		scroll.setBackground(Color.WHITE);
		scroll.setBounds(299,298,270,327);
		frame.getContentPane().add(scroll);
		
		JButton refreshBtn = new JButton("refresh");
		refreshBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateList();
			}
		});
		refreshBtn.setBounds(480, 271, 89, 23);
		frame.getContentPane().add(refreshBtn);
		
		JButton sendNameBtn = new JButton("---->");
		sendNameBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Send name method
				
				if(nameField.getText().equals("")) JOptionPane.showMessageDialog(null, "Please enter your name!");
				else if(nameField.getText().length() > 20) JOptionPane.showMessageDialog(null, "Name is too long! Max 20 characters");
				else 
				{
					name = nameField.getText();
					LoadList();
					loadedList = true;
					
					sendNameBtn.setVisible(false);
					nameLabel.setVisible(false);
					nameField.setVisible(false);
					
					refreshBtn.setVisible(true);
					scroll.setVisible(true);
				}
			}
		});
		sendNameBtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		sendNameBtn.setBounds(398, 311, 89, 28);
		frame.getContentPane().add(sendNameBtn);
		
		finishBtn = new JButton("FINISH ->");
		finishBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Finish method
				question.setVisible(false);
				questionField.setVisible(false);
				optionA.setVisible(false);
				optionB.setVisible(false);
				optionC.setVisible(false);
				optionD.setVisible(false);
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
				
				if(!loadedList) 
				{
					nameLabel.setVisible(true);
					nameField.setVisible(true);
					sendNameBtn.setVisible(true);
				}
				else 
				{
					refreshBtn.setVisible(true);
					scroll.setVisible(true);
					UpdateList();
				}
				
				textField_1.setText(textField1.getText());
				textField_2.setText(textField2.getText());
				textField_3.setText((int)correct +"/"+ QUESTIONS.length);
				textField_4.setText(textField3.getText());
				
				score = textField_3.getText();
			}
		});
		
		sendNameBtn.setVisible(false);
		finishBtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		finishBtn.setBounds(146, 656, 133, 40);
		frame.getContentPane().add(finishBtn);
		
		backBtn2 = new JButton("<- BACK");
		backBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Back from finish page
				question.setVisible(true);
				questionField.setVisible(true);
				optionA.setVisible(true);
				optionB.setVisible(true);
				optionC.setVisible(true);
				optionD.setVisible(true);
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
				sendNameBtn.setVisible(false);
				refreshBtn.setVisible(false);
				scroll.setVisible(false);
				nameLabel.setVisible(false);
				nameField.setVisible(false);
			}
		});
		backBtn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		backBtn2.setBounds(10, 656, 133, 40);
		frame.getContentPane().add(backBtn2);
		
		backBtn2.setVisible(false);
		finishBtn.setVisible(false);
		refreshBtn.setVisible(false);
		scroll.setVisible(false);
		nameLabel.setVisible(false);
		nameField.setVisible(false);
		
		question.setVisible(false);
		questionField.setVisible(false);
		optionA.setVisible(false);
		optionB.setVisible(false);
		optionC.setVisible(false);
		optionD.setVisible(false);
		message.setVisible(false);
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