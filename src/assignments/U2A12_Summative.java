package assignments;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;

public class U2A12_Summative {

	private JFrame frame;
	private JTextField roundField;
	
	int round = 0;
	private static JTextField botScoreField;
	private static JTextField playerScoreField;
	
	int userAnswers[] = new int[0];
	int botAnswers[] = new int[0];
	int winList[] = new int[0];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A12_Summative window = new U2A12_Summative();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public U2A12_Summative() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		
		final Image optionImgs[] = {ImageIO.read(getClass().getResource("/resources/rock.png")), ImageIO.read(getClass().getResource("/resources/paper.png")),ImageIO.read(getClass().getResource("/resources/scissors.png"))};
		
		int playerScore = 0;
		int botScore = 0;
		
		frame = new JFrame();
		frame.setBounds(100, 100, 985, 746);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rock, Paper, Scissors!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(265, 11, 532, 80);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel botAnsField = new JLabel("");
		botAnsField.setBounds(831, 309, 128, 128);
		frame.getContentPane().add(botAnsField);
		
		JLabel winLabel = new JLabel("");
		winLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		winLabel.setBounds(462, 377, 393, 45);
		frame.getContentPane().add(winLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SCORE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBounds(421, 658, 161, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("You Chose:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(214, 163, 161, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Computer Chose:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(607, 163, 184, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("VS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel_4.setBounds(534, 316, 73, 50);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("NEXT ROUND");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnNewButton.setBounds(679, 602, 257, 45);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("GO!");
		lblNewLabel_5.setForeground(new Color(128, 255, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel_5.setBounds(395, 316, 250, 161);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(827, 136, 80, 80);
		frame.getContentPane().add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/resources/robot.png")).getScaledInstance(lblNewLabel_6.getWidth(), lblNewLabel_6.getHeight(), Image.SCALE_SMOOTH)));
		
		botScoreField = new JTextField();
		botScoreField.setHorizontalAlignment(SwingConstants.CENTER);
		botScoreField.setText("0");
		botScoreField.setFont(new Font("Tahoma", Font.BOLD, 33));
		botScoreField.setEditable(false);
		botScoreField.setColumns(10);
		botScoreField.setBounds(850, 658, 86, 38);
		frame.getContentPane().add(botScoreField);
		
		playerScoreField = new JTextField();
		playerScoreField.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreField.setText("0");
		playerScoreField.setFont(new Font("Tahoma", Font.BOLD, 33));
		playerScoreField.setEditable(false);
		playerScoreField.setColumns(10);
		playerScoreField.setBounds(30, 658, 86, 38);
		frame.getContentPane().add(playerScoreField);
		
		JLabel userAns = new JLabel("");
		userAns.setBounds(214, 228, 300, 300);
		frame.getContentPane().add(userAns);
		
		JLabel botAns = new JLabel("");
		botAns.setBounds(607, 228, 300, 300);
		frame.getContentPane().add(botAns);
		
		JButton rockBtn = new JButton("");
		rockBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveAnswer(0, userAnswers, round);
				botAns(botAnswers, round);
				outputWinner(checkWin(winList, userAnswers, botAnswers, round), userAnswers, botAnswers, round, optionImgs, winLabel, userAns, botAns);
				updateScore(winList, playerScore, botScore, round);
				btnNewButton.setVisible(true);
				lblNewLabel_2.setVisible(true);
				lblNewLabel_3.setVisible(true);
				lblNewLabel_4.setVisible(true);
				lblNewLabel_5.setVisible(true);
			}
		});
		rockBtn.setBounds(30, 136, 128, 128);
		frame.getContentPane().add(rockBtn);
		setScaledImg(optionImgs[0], rockBtn);
		
		JButton paperBtn = new JButton("");
		paperBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveAnswer(1, userAnswers, round);
				botAns(botAnswers, round);
				outputWinner(checkWin(winList, userAnswers, botAnswers, round), userAnswers, botAnswers, round, optionImgs, winLabel, userAns, botAns);
				updateScore(winList, playerScore, botScore, round);
				btnNewButton.setVisible(true);
				lblNewLabel_2.setVisible(true);
				lblNewLabel_3.setVisible(true);
				lblNewLabel_4.setVisible(true);
				lblNewLabel_5.setVisible(true);
			}
		});
		paperBtn.setBounds(30, 316, 128, 128);
		frame.getContentPane().add(paperBtn);
		setScaledImg(optionImgs[1], paperBtn);
		
		JButton scissorsBtn = new JButton("");
		scissorsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				userAnswers = saveAnswer(2, userAnswers, round);
				botAnswers = botAns(botAnswers, round);
				
				for(int i = 0; i < userAnswers.length; i++) System.out.println(userAnswers[i]);
				for(int i = 0; i < botAnswers.length; i++) System.out.println(botAnswers[i]);
				for(int i = 0; i < winList.length; i++) System.out.println(winList[i]);

				int a = checkWin(winList, userAnswers, botAnswers, round);
				outputWinner(a, userAnswers, botAnswers, round, optionImgs, winLabel, userAns, botAns);
				updateScore(winList, playerScore, botScore, round);
				btnNewButton.setVisible(true);
				lblNewLabel_2.setVisible(true);
				lblNewLabel_3.setVisible(true);
				lblNewLabel_4.setVisible(true);
				lblNewLabel_5.setVisible(true);
			}
		});
		scissorsBtn.setBounds(30, 494, 128, 128);
		frame.getContentPane().add(scissorsBtn);
		setScaledImg(optionImgs[2], scissorsBtn);
		
		JLabel optionsLbl = new JLabel("Choose one:");
		optionsLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		optionsLbl.setBounds(30, 102, 128, 23);
		frame.getContentPane().add(optionsLbl);
		
		JTextArea startMsg = new JTextArea();
		startMsg.setFont(new Font("Monospaced", Font.BOLD, 41));
		startMsg.setText("Play Rock, Paper, Scissors against the computer!\r\nFirst to 3 wins, takes it all!");
		startMsg.setEditable(false);
		startMsg.setWrapStyleWord(true);
		startMsg.setLineWrap(true);
		startMsg.setBounds(57, 102, 850, 169);
		frame.getContentPane().add(startMsg);
		
		JLabel roundLbl = new JLabel("Round: ");
		roundLbl.setFont(new Font("Tahoma", Font.BOLD, 24));
		roundLbl.setBounds(747, 53, 93, 38);
		frame.getContentPane().add(roundLbl);
		
		roundField = new JTextField();
		roundField.setEditable(false);
		roundField.setFont(new Font("Tahoma", Font.BOLD, 24));
		roundField.setHorizontalAlignment(SwingConstants.CENTER);
		roundField.setBounds(850, 53, 86, 38);
		frame.getContentPane().add(roundField);
		roundField.setColumns(10);
		
		JButton startBtn = new JButton("PLAY");
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rockBtn.setVisible(true);
				paperBtn.setVisible(true);
				scissorsBtn.setVisible(true);
				optionsLbl.setVisible(true);
				roundLbl.setVisible(true);
				roundField.setVisible(true);
				lblNewLabel_5.setVisible(true);
				lblNewLabel_1.setVisible(true);
				playerScoreField.setVisible(true);
				botScoreField.setVisible(true);
				
				startBtn.setVisible(false);
				startMsg.setVisible(false);
				
				roundField.setText((round+1)+"");
			}
		});
		startBtn.setFont(new Font("Tahoma", Font.BOLD, 78));
		startBtn.setBounds(265, 377, 421, 155);
		frame.getContentPane().add(startBtn);
		
		rockBtn.setVisible(false);
		paperBtn.setVisible(false);
		scissorsBtn.setVisible(false);
		optionsLbl.setVisible(false);
		roundLbl.setVisible(false);
		roundField.setVisible(false);
		btnNewButton.setVisible(false);
		lblNewLabel_1.setVisible(false);
		playerScoreField.setVisible(false);
		botScoreField.setVisible(false);
		lblNewLabel_2.setVisible(false);
		lblNewLabel_3.setVisible(false);
		lblNewLabel_4.setVisible(false);
		lblNewLabel_5.setVisible(false);
	}
	
	public static void setScaledImg(Image img, JButton btn) 
	{
		img = img.getScaledInstance(btn.getWidth() - 20, btn.getHeight() - 20, Image.SCALE_SMOOTH);
		
		btn.setIcon(new ImageIcon(img));
	}
	
	public static int[] saveAnswer(int choice, int[] userAnsList, int count) 
	{
		int tempAns[] = new int[userAnsList.length + 1];
    	for(int n = 0; n < userAnsList.length; n++) 
    	{
    		tempAns[n] = userAnsList[n];
    	}
    	tempAns[count] = choice;
    	return tempAns;
	}
	
	public static int[] botAns(int[] botAnsList, int count) 
	{
		int botChoice = (int)(Math.random() * 3);
		int tempAns[] = new int[botAnsList.length + 1];
    	for(int n = 0; n < botAnsList.length; n++) 
    	{
    		tempAns[n] = botAnsList[n];
    	}
		tempAns[count] = botChoice;
		return tempAns;
	}
	
	public static int checkWin(int[] winnerList, int[] userAnsList, int[] botAnsList, int count) 
	{
		if((userAnsList[count] == 0 && botAnsList[count] == 1) || (userAnsList[count] == 1 && botAnsList[count] == 2) || (userAnsList[count] == 2 && botAnsList[count] == 0)) 
		{
			int tempList[] = new int[winnerList.length + 1];
	    	for(int n = 0; n < winnerList.length; n++) 
	    	{
	    		tempList[n] = winnerList[n];
	    	}
	    	tempList[count] = -1;
	    	winnerList = tempList;
			return -1; //bot win
		}
		else if((userAnsList[count] == 0 && botAnsList[count] == 2) || (userAnsList[count] == 1 && botAnsList[count] == 0) || (userAnsList[count] == 2 && botAnsList[count] == 1)) 
		{
			int tempList[] = new int[winnerList.length + 1];
	    	for(int n = 0; n < winnerList.length; n++) 
	    	{
	    		tempList[n] = winnerList[n];
	    	}
	    	tempList[count] = 1;
	    	winnerList = tempList;
			return 1; //player win
		}
		int tempList[] = new int[winnerList.length + 1];
    	for(int n = 0; n < winnerList.length; n++) 
    	{
    		tempList[n] = winnerList[n];
    	}
    	tempList[count] = 0;
    	winnerList = tempList;
		return 0; //tie
	}
	
	public static void outputWinner(int winner, int[] userAnsList, int[] botAnsList, int count, Image[] imageList, JLabel label, JLabel userLbl, JLabel botLbl) 
	{
		userLbl.setIcon(new ImageIcon(imageList[userAnsList[count]].getScaledInstance(userLbl.getWidth(), userLbl.getHeight(), Image.SCALE_SMOOTH)));
		botLbl.setIcon(new ImageIcon(imageList[botAnsList[count]].getScaledInstance(botLbl.getWidth(), botLbl.getHeight(), Image.SCALE_SMOOTH)));
		
		if(winner == 1) 
		{
			label.setText("YOU WIN!");
			label.setForeground(Color.GREEN);
		}
		else if(winner == -1) 
		{
			label.setText("COMPUTER WINS!");
			label.setForeground(Color.ORANGE);
		}
		else 
		{
			label.setText("TIE!!!");
			label.setForeground(Color.BLACK);
		}
	}
	
	public static void updateScore(int[] winnerList, int pScore, int bScore, int count) 
	{
		if(winnerList[count] == 1) 
		{
			pScore++;
			playerScoreField.setText(pScore+"");
		}
		else if(winnerList[count] == -1) 
		{
			bScore++;
			botScoreField.setText(bScore+"");
		}
	}
}
