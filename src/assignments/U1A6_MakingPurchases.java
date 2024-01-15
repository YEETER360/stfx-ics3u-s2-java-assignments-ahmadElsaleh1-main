package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U1A6_MakingPurchases {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField taxValue;
	private JTextField subtotalValue;
	private JTextField totalValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U1A6_MakingPurchases window = new U1A6_MakingPurchases();
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
	public U1A6_MakingPurchases() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.setBounds(100, 100, 557, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BEST BUY");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel.setBounds(173, 12, 159, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BEST BUY");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblNewLabel_1.setBounds(173, 11, 184, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Keyboard ($39.99):");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(38, 179, 131, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Monitor ($169.99):");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(38, 260, 131, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Laptop ($749.99):");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(38, 338, 131, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("1TB Hard Drive ($34.99):");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_3.setBounds(38, 413, 159, 14);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Webcam ($19.99):");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_4.setBounds(38, 483, 131, 14);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		JTextArea txtrEnterTheNumber = new JTextArea();
		txtrEnterTheNumber.setEditable(false);
		txtrEnterTheNumber.setWrapStyleWord(true);
		txtrEnterTheNumber.setLineWrap(true);
		txtrEnterTheNumber.setFont(new Font("Tahoma", Font.ITALIC, 24));
		txtrEnterTheNumber.setText("Enter the number of products you would like to purchase and click 'Calculate Cost' to view the cost and the tax amount");
		txtrEnterTheNumber.setBounds(10, 56, 521, 91);
		frame.getContentPane().add(txtrEnterTheNumber);
		
		
		JButton minus1 = new JButton("-");
		minus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Integer.parseInt(textField1.getText()) > 0){
					textField1.setText(Integer.toString(Integer.parseInt(textField1.getText()) - 1));
				}
				calculate();
			}
		});
		minus1.setFont(new Font("Tahoma", Font.BOLD, 18));
		minus1.setBounds(199, 158, 44, 23);
		frame.getContentPane().add(minus1);
		
		JButton plus1 = new JButton("+");
		plus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField1.getText().equals("")) {
					textField1.setText("1");
				}
				else textField1.setText(Integer.toString(Integer.parseInt(textField1.getText()) + 1));
				calculate();
			}
		});
		plus1.setFont(new Font("Tahoma", Font.BOLD, 11));
		plus1.setBounds(241, 158, 44, 23);
		frame.getContentPane().add(plus1);
		
		JButton minus2 = new JButton("-");
		minus2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Integer.parseInt(textField2.getText()) > 0){
					textField2.setText(Integer.toString(Integer.parseInt(textField2.getText()) - 1));
				}
				calculate();
			}
		});
		minus2.setFont(new Font("Tahoma", Font.BOLD, 18));
		minus2.setBounds(199, 238, 44, 23);
		frame.getContentPane().add(minus2);
		
		JButton plus2 = new JButton("+");
		plus2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField2.getText().equals("")) {
					textField2.setText("1");
				}
				else textField2.setText(Integer.toString(Integer.parseInt(textField2.getText()) + 1));
				calculate();
			}
		});
		plus2.setFont(new Font("Tahoma", Font.BOLD, 11));
		plus2.setBounds(241, 238, 44, 23);
		frame.getContentPane().add(plus2);
		
		JButton minus3 = new JButton("-");
		minus3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Integer.parseInt(textField3.getText()) > 0){
					textField3.setText(Integer.toString(Integer.parseInt(textField3.getText()) - 1));
				}
				calculate();
			}
		});
		minus3.setFont(new Font("Tahoma", Font.BOLD, 18));
		minus3.setBounds(199, 316, 44, 23);
		frame.getContentPane().add(minus3);
		
		JButton plus3 = new JButton("+");
		plus3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField3.getText().equals("")) {
					textField3.setText("1");
				}
				else textField3.setText(Integer.toString(Integer.parseInt(textField3.getText()) + 1));
				calculate();
			}
		});
		plus3.setFont(new Font("Tahoma", Font.BOLD, 11));
		plus3.setBounds(241, 316, 44, 23);
		frame.getContentPane().add(plus3);
		
		JButton minus4 = new JButton("-");
		minus4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Integer.parseInt(textField4.getText()) > 0){
					textField4.setText(Integer.toString(Integer.parseInt(textField4.getText()) - 1));
				}
				calculate();
			}
		});
		minus4.setFont(new Font("Tahoma", Font.BOLD, 18));
		minus4.setBounds(199, 391, 44, 23);
		frame.getContentPane().add(minus4);
		
		JButton plus4 = new JButton("+");
		plus4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField4.getText().equals("")) {
					textField4.setText("1");
				}
				else textField4.setText(Integer.toString(Integer.parseInt(textField4.getText()) + 1));
				calculate();
			}
		});
		plus4.setFont(new Font("Tahoma", Font.BOLD, 11));
		plus4.setBounds(241, 391, 44, 23);
		frame.getContentPane().add(plus4);
		
		JButton minus5 = new JButton("-");
		minus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Integer.parseInt(textField5.getText()) > 0){
					textField5.setText(Integer.toString(Integer.parseInt(textField5.getText()) - 1));
				}
				calculate();
			}
		});
		minus5.setFont(new Font("Tahoma", Font.BOLD, 18));
		minus5.setBounds(199, 461, 44, 23);
		frame.getContentPane().add(minus5);
		
		JButton plus5 = new JButton("+");
		plus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField5.getText().equals("")) {
					textField5.setText("1");
				}
				else textField5.setText(Integer.toString(Integer.parseInt(textField5.getText()) + 1));
				calculate();
			}
		});
		plus5.setFont(new Font("Tahoma", Font.BOLD, 11));
		plus5.setBounds(241, 461, 44, 23);
		frame.getContentPane().add(plus5);
		
		textField1 = new JTextField();
		textField1.setBounds(199, 180, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		textField1.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                plus1.setVisible(true);
                minus1.setVisible(true);
            }

            @Override
            public void focusLost(FocusEvent e) {
            	plus1.setVisible(false);
                minus1.setVisible(false);
            }
        });
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(199, 260, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                plus2.setVisible(true);
                minus2.setVisible(true);
            }

            @Override
            public void focusLost(FocusEvent e) {
            	plus2.setVisible(false);
                minus2.setVisible(false);
            }
        });
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(199, 338, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                plus3.setVisible(true);
                minus3.setVisible(true);
            }

            @Override
            public void focusLost(FocusEvent e) {
            	plus3.setVisible(false);
                minus3.setVisible(false);
            }
        });
		
		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBounds(199, 413, 86, 20);
		frame.getContentPane().add(textField4);
		textField4.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                plus4.setVisible(true);
                minus4.setVisible(true);
            }

            @Override
            public void focusLost(FocusEvent e) {
            	plus4.setVisible(false);
                minus4.setVisible(false);
            }
        });
		
		textField5 = new JTextField();
		textField5.setColumns(10);
		textField5.setBounds(199, 483, 86, 20);
		frame.getContentPane().add(textField5);
		
		JButton btnNewButton = new JButton("Calculate Cost");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculate();
			}
		});
		btnNewButton.setBounds(354, 319, 124, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Tax (13%):");
		lblNewLabel_3.setBounds(323, 372, 60, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		taxValue = new JTextField();
		taxValue.setEditable(false);
		taxValue.setBounds(408, 369, 86, 20);
		frame.getContentPane().add(taxValue);
		taxValue.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Subtotal:");
		lblNewLabel_4.setBounds(323, 426, 60, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Grand Total:");
		lblNewLabel_5.setBounds(323, 483, 75, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		subtotalValue = new JTextField();
		subtotalValue.setEditable(false);
		subtotalValue.setColumns(10);
		subtotalValue.setBounds(408, 423, 86, 20);
		frame.getContentPane().add(subtotalValue);
		
		totalValue = new JTextField();
		totalValue.setEditable(false);
		totalValue.setColumns(10);
		totalValue.setBounds(408, 481, 86, 20);
		frame.getContentPane().add(totalValue);
		textField5.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                plus5.setVisible(true);
                minus5.setVisible(true);
            }

            @Override
            public void focusLost(FocusEvent e) {
            	plus5.setVisible(false);
                minus5.setVisible(false);
            }
        });
		
		plus1.setVisible(false);
		plus2.setVisible(false);
		plus3.setVisible(false);
		plus4.setVisible(false);
		plus5.setVisible(false);
		minus1.setVisible(false);
		minus2.setVisible(false);
		minus3.setVisible(false);
		minus4.setVisible(false);
		minus5.setVisible(false);
	}
	
	public void calculate() {
		if(textField1.getText().equals("") || Float.parseFloat(textField1.getText()) < 1) {
			textField1.setText("0");
		}
		if(textField2.getText().equals("") || Float.parseFloat(textField2.getText()) < 1) {
			textField2.setText("0");
		}
		if(textField3.getText().equals("") || Float.parseFloat(textField3.getText()) < 1) {
			textField3.setText("0");
		}
		if(textField4.getText().equals("") || Float.parseFloat(textField4.getText()) < 1) {
			textField4.setText("0");
		}
		if(textField5.getText().equals("") || Float.parseFloat(textField5.getText()) < 1) {
			textField5.setText("0");
		}
		
		float subtotal = (Math.round(Float.parseFloat(textField1.getText()) * 39.99f * 100.0f) / 100.0f) + (Math.round(Float.parseFloat(textField2.getText()) * 169.99f * 100.0f) / 100.0f) + (Math.round(Float.parseFloat(textField3.getText()) * 749.99f * 100.0f) / 100.0f) + (Math.round(Float.parseFloat(textField4.getText()) * 34.99f * 100.0f) / 100.0f) + (Math.round(Float.parseFloat(textField5.getText()) * 19.99f * 100.0f) / 100.0f);
		
		subtotalValue.setText(Float.toString(subtotal));
		taxValue.setText(Float.toString(Math.round(subtotal * 0.13f * 100.0f) / 100.0f));
		totalValue.setText(Float.toString(Math.round(subtotal * 1.13f * 100.0f) / 100.0f));
	}
}
