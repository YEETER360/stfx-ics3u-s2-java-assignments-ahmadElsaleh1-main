package sandbox;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Connect4 {
	
	JLabel winLabel;
	boolean turn = true; //true is blue turn false is red

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connect4 window = new Connect4();
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
	public Connect4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 968, 712);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][][][][][][][]", "[][][][][][][][][][][][][][][][][][][][][][][][]"));
		
		winLabel = new JLabel("");
		winLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(winLabel, "cell 22 23");
		
		JLabel lblNewLabel_5 = new JLabel("5");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_5, "cell 0 4");
		
		JLabel x0y5 = new JLabel("O");
		x0y5.setHorizontalAlignment(SwingConstants.CENTER);
		x0y5.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x0y5, "cell 3 4");
		
		JLabel x1y5 = new JLabel("O");
		x1y5.setHorizontalAlignment(SwingConstants.CENTER);
		x1y5.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x1y5, "cell 6 4");
		
		JLabel x2y5 = new JLabel("O");
		x2y5.setHorizontalAlignment(SwingConstants.CENTER);
		x2y5.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x2y5, "cell 9 4");
		
		JLabel x3y5 = new JLabel("O");
		x3y5.setHorizontalAlignment(SwingConstants.CENTER);
		x3y5.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x3y5, "cell 12 4");
		
		JLabel x4y5 = new JLabel("O");
		x4y5.setHorizontalAlignment(SwingConstants.CENTER);
		x4y5.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x4y5, "cell 15 4");
		
		JLabel x5y5 = new JLabel("O");
		x5y5.setHorizontalAlignment(SwingConstants.CENTER);
		x5y5.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x5y5, "cell 18 4");
		
		JLabel x6y5 = new JLabel("O");
		x6y5.setHorizontalAlignment(SwingConstants.CENTER);
		x6y5.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x6y5, "cell 21 4");
		
		JLabel lblNewLabel_4 = new JLabel("4");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_4, "cell 0 7");
		
		JLabel x0y4 = new JLabel("O");
		x0y4.setHorizontalAlignment(SwingConstants.CENTER);
		x0y4.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x0y4, "cell 3 7");
		
		JLabel x1y4 = new JLabel("O");
		x1y4.setHorizontalAlignment(SwingConstants.CENTER);
		x1y4.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x1y4, "cell 6 7");
		
		JLabel x2y4 = new JLabel("O");
		x2y4.setHorizontalAlignment(SwingConstants.CENTER);
		x2y4.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x2y4, "cell 9 7");
		
		JLabel x3y4 = new JLabel("O");
		x3y4.setHorizontalAlignment(SwingConstants.CENTER);
		x3y4.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x3y4, "cell 12 7");
		
		JLabel x4y4 = new JLabel("O");
		x4y4.setHorizontalAlignment(SwingConstants.CENTER);
		x4y4.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x4y4, "cell 15 7");
		
		JLabel x5y4 = new JLabel("O");
		x5y4.setHorizontalAlignment(SwingConstants.CENTER);
		x5y4.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x5y4, "cell 18 7");
		
		JLabel x6y4 = new JLabel("O");
		x6y4.setHorizontalAlignment(SwingConstants.CENTER);
		x6y4.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x6y4, "cell 21 7");
		
		JLabel lblNewLabel_3 = new JLabel("3");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_3, "cell 0 10");
		
		JLabel x0y3 = new JLabel("O");
		x0y3.setHorizontalAlignment(SwingConstants.CENTER);
		x0y3.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x0y3, "cell 3 10");
		
		JLabel x1y3 = new JLabel("O");
		x1y3.setHorizontalAlignment(SwingConstants.CENTER);
		x1y3.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x1y3, "cell 6 10");
		
		JLabel x2y3 = new JLabel("O");
		x2y3.setHorizontalAlignment(SwingConstants.CENTER);
		x2y3.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x2y3, "cell 9 10");
		
		JLabel x3y3 = new JLabel("O");
		x3y3.setHorizontalAlignment(SwingConstants.CENTER);
		x3y3.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x3y3, "cell 12 10");
		
		JLabel x4y3 = new JLabel("O");
		x4y3.setHorizontalAlignment(SwingConstants.CENTER);
		x4y3.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x4y3, "cell 15 10");
		
		JLabel x5y3 = new JLabel("O");
		x5y3.setHorizontalAlignment(SwingConstants.CENTER);
		x5y3.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x5y3, "cell 18 10");
		
		JLabel x6y3 = new JLabel("O");
		x6y3.setHorizontalAlignment(SwingConstants.CENTER);
		x6y3.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x6y3, "cell 21 10");
		
		JLabel lblNewLabel_2 = new JLabel("2");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_2, "cell 0 13");
		
		JLabel x0y2 = new JLabel("O");
		x0y2.setHorizontalAlignment(SwingConstants.CENTER);
		x0y2.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x0y2, "cell 3 13");
		
		JLabel x1y2 = new JLabel("O");
		x1y2.setHorizontalAlignment(SwingConstants.CENTER);
		x1y2.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x1y2, "cell 6 13");
		
		JLabel x2y2 = new JLabel("O");
		x2y2.setHorizontalAlignment(SwingConstants.CENTER);
		x2y2.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x2y2, "cell 9 13");
		
		JLabel x3y2 = new JLabel("O");
		x3y2.setHorizontalAlignment(SwingConstants.CENTER);
		x3y2.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x3y2, "cell 12 13");
		
		JLabel x4y2 = new JLabel("O");
		x4y2.setHorizontalAlignment(SwingConstants.CENTER);
		x4y2.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x4y2, "cell 15 13");
		
		JLabel x5y2 = new JLabel("O");
		x5y2.setHorizontalAlignment(SwingConstants.CENTER);
		x5y2.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x5y2, "cell 18 13");
		
		JLabel x6y2 = new JLabel("O");
		x6y2.setHorizontalAlignment(SwingConstants.CENTER);
		x6y2.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x6y2, "cell 21 13");
		
		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_1, "cell 0 16");
		
		JLabel x0y1 = new JLabel("O");
		x0y1.setHorizontalAlignment(SwingConstants.CENTER);
		x0y1.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x0y1, "cell 3 16");
		
		JLabel x1y1 = new JLabel("O");
		x1y1.setHorizontalAlignment(SwingConstants.CENTER);
		x1y1.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x1y1, "cell 6 16");
		
		JLabel x2y1 = new JLabel("O");
		x2y1.setHorizontalAlignment(SwingConstants.CENTER);
		x2y1.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x2y1, "cell 9 16");
		
		JLabel x3y1 = new JLabel("O");
		x3y1.setHorizontalAlignment(SwingConstants.CENTER);
		x3y1.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x3y1, "cell 12 16");
		
		JLabel x4y1 = new JLabel("O");
		x4y1.setHorizontalAlignment(SwingConstants.CENTER);
		x4y1.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x4y1, "cell 15 16");
		
		JLabel x5y1 = new JLabel("O");
		x5y1.setHorizontalAlignment(SwingConstants.CENTER);
		x5y1.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x5y1, "cell 18 16");
		
		JLabel x6y1 = new JLabel("O");
		x6y1.setHorizontalAlignment(SwingConstants.CENTER);
		x6y1.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x6y1, "cell 21 16");
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel, "cell 0 19");
		
		JLabel x0y0 = new JLabel("O");
		x0y0.setFont(new Font("Gadugi", Font.BOLD, 51));
		x0y0.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(x0y0, "cell 3 19");
		
		JLabel x1y0 = new JLabel("O");
		x1y0.setHorizontalAlignment(SwingConstants.CENTER);
		x1y0.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x1y0, "cell 6 19");
		
		JLabel x2y0 = new JLabel("O");
		x2y0.setHorizontalAlignment(SwingConstants.CENTER);
		x2y0.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x2y0, "cell 9 19");
		
		JLabel x3y0 = new JLabel("O");
		x3y0.setHorizontalAlignment(SwingConstants.CENTER);
		x3y0.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x3y0, "cell 12 19");
		
		JLabel x4y0 = new JLabel("O");
		x4y0.setHorizontalAlignment(SwingConstants.CENTER);
		x4y0.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x4y0, "cell 15 19");
		
		JLabel x5y0 = new JLabel("O");
		x5y0.setHorizontalAlignment(SwingConstants.CENTER);
		x5y0.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x5y0, "cell 18 19");
		
		JLabel x6y0 = new JLabel("O");
		x6y0.setHorizontalAlignment(SwingConstants.CENTER);
		x6y0.setFont(new Font("Gadugi", Font.BOLD, 51));
		frame.getContentPane().add(x6y0, "cell 21 19");
		
		final JLabel[][] grid = {
		        {x0y0, x0y1, x0y2, x0y3, x0y4, x0y5},
		        {x1y0, x1y1, x1y2, x1y3, x1y4, x1y5},
		        {x2y0, x2y1, x2y2, x2y3, x2y4, x2y5},
		        {x3y0, x3y1, x3y2, x3y3, x3y4, x3y5},
		        {x4y0, x4y1, x4y2, x4y3, x4y4, x4y5},
		        {x5y0, x5y1, x5y2, x5y3, x5y4, x5y5},
		        {x6y0, x6y1, x6y2, x6y3, x6y4, x6y5}
		};
		
		for(int i = 0; i < 7; i++) 
		{
			for(int j = 0; j < 6; j++) 
			{
				grid[i][j].setForeground(Color.BLACK);
			}
		}
		
		JLabel lblNewLabel_6 = new JLabel("0");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_6, "cell 3 23");
		
		JLabel lblNewLabel_7 = new JLabel("1");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_7, "cell 6 23");
		
		JLabel lblNewLabel_8 = new JLabel("2");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_8, "cell 9 23");
		
		JLabel lblNewLabel_9 = new JLabel("3");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_9, "cell 12 23");
		
		JLabel lblNewLabel_10 = new JLabel("4");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_10, "cell 15 23");
		
		JLabel lblNewLabel_11 = new JLabel("5");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_11, "cell 18 23");
		
		JLabel lblNewLabel_12 = new JLabel("6");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel_12, "cell 21 23");
		
		JButton x0Btn = new JButton("New button");
		x0Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlaceChip(grid, 0);
			}
		});
		frame.getContentPane().add(x0Btn, "cell 3 2");
		
		JButton x1Btn = new JButton("New button");
		x1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlaceChip(grid, 1);
			}
		});
		frame.getContentPane().add(x1Btn, "cell 6 2");
		
		JButton x2Btn = new JButton("New button");
		x2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlaceChip(grid, 2);
			}
		});
		frame.getContentPane().add(x2Btn, "cell 9 2");
		
		JButton x3Btn = new JButton("New button");
		x3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlaceChip(grid, 3);
			}
		});
		frame.getContentPane().add(x3Btn, "cell 12 2");
		
		JButton x4Btn = new JButton("New button");
		x4Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlaceChip(grid, 4);
			}
		});
		frame.getContentPane().add(x4Btn, "cell 15 2");
		
		JButton x5Btn = new JButton("New button");
		x5Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlaceChip(grid, 5);
			}
		});
		frame.getContentPane().add(x5Btn, "cell 18 2");
		
		JButton x6Btn = new JButton("New button");
		x6Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlaceChip(grid, 6);
			}
		});
		frame.getContentPane().add(x6Btn, "cell 21 2");
	}
	
	void PlaceChip(JLabel[][] grid, int x) 
	{
		int count = 1;
		int y = 0;
		
		//Place chip
		for(int i = 0; i < 6; i++) 
		{
			if(grid[x][i].getForeground().equals(Color.BLACK)) 
			{
				grid[x][i].setForeground(GetPlayerColour(turn));
				y = i;
				
				//Check win
				//x axis
				for(int j = 1; x-j >= 0; j++)
				{
					if(grid[x-j][i].getForeground().equals(GetPlayerColour(turn))) count++;
					else break;
				}
				for(int j = 1; x+j <= 6; j++)
				{
					if(grid[x+j][i].getForeground().equals(GetPlayerColour(turn))) count++;
					else break;
				}
				if(count >= 4) 
				{
					winLabel.setText(GetPlayerColourName(turn)+" WINS!");
					winLabel.setForeground(GetPlayerColour(turn));
					break;
				}
				else count = 1;
				
				//y axis
				for(int j = 1; i-j >= 0; j++)
				{
					if(grid[x][i-j].getForeground().equals(GetPlayerColour(turn))) count++;
					else break;
				}
				for(int j = 1; i+j <= 5; j++)
				{
					if(grid[x][i+j].getForeground().equals(GetPlayerColour(turn))) count++;
					else break;
				}
				if(count >= 4) 
				{
					winLabel.setText(GetPlayerColourName(turn)+" WINS!");
					winLabel.setForeground(GetPlayerColour(turn));
					break;
				}
				else count = 1;
				
				//positive diagonal
				for(int j = 1; i-j >= 0 && x-j >= 0; j++)
				{
					if(grid[x-j][i-j].getForeground().equals(GetPlayerColour(turn))) count++;
					else break;
				}
				for(int j = 1; i+j <= 5 && x+j <= 6; j++)
				{
					if(grid[x+j][i+j].getForeground().equals(GetPlayerColour(turn))) count++;
					else break;
				}
				if(count >= 4) 
				{
					winLabel.setText(GetPlayerColourName(turn)+" WINS!");
					winLabel.setForeground(GetPlayerColour(turn));
					break;
				}
				else count = 1;
				
				//negative diagonal
				for(int j = 1; x-j >= 0 && i+j <= 5; j++)
				{
					if(grid[x-j][i+j].getForeground().equals(GetPlayerColour(turn))) count++;
					else break;
				}
				for(int j = 1; x+j <= 6 && i-j >= 0; j++)
				{
					if(grid[x+j][i-j].getForeground().equals(GetPlayerColour(turn))) count++;
					else break;
				}
				if(count >= 4) 
				{
					winLabel.setText(GetPlayerColourName(turn)+" WINS!");
					winLabel.setForeground(GetPlayerColour(turn));
					break;
				}
				
				turn = !turn;
				break;
			}
		}
	}
	
	Color GetPlayerColour(boolean turn) 
	{
		if(turn) return Color.BLUE;
		else return Color.RED;
	}
	
	String GetPlayerColourName(boolean turn) 
	{
		if(turn) return "BLUE";
		else return "RED";
	}
}
