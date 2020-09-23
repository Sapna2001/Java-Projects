package wordCount;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WourdCount extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField totalCountTextfield;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WourdCount frame = new WourdCount();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WourdCount() {
		setTitle("Word Count");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 246);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel wordCountPanel = new JPanel();
		wordCountPanel.setBackground(Color.ORANGE);
		contentPane.add(wordCountPanel, BorderLayout.CENTER);
		
		Box verticalBox_1 = Box.createVerticalBox();
		wordCountPanel.add(verticalBox_1);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.ORANGE);
		verticalBox_1.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.ORANGE);
		verticalBox_1.add(panel_11);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox);
		
		JLabel typeLabel = new JLabel("Type your words");
		typeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		typeLabel.setBackground(Color.GREEN);
		horizontalBox.add(typeLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		horizontalBox.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		horizontalBox.add(panel_1);
		
		textField = new JTextField();
		horizontalBox.add(textField);
		textField.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.ORANGE);
		verticalBox_1.add(panel_9);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.ORANGE);
		verticalBox_1.add(panel_8);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_1);
		
		JButton countButton = new JButton("Count your words");
		countButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentences = textField.getText();
				int count = 1,i;
				for(i=0;i<sentences.length();i++) {
					if(sentences.charAt(i)==' ')
						count++;
				}
				if(sentences.length()==0)
					totalCountTextfield.setText(String.valueOf(sentences.length()));
				else
					totalCountTextfield.setText(String.valueOf(count));
			}
		});
		countButton.setForeground(Color.WHITE);
		countButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		countButton.setBackground(Color.BLUE);
		horizontalBox_1.add(countButton);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.ORANGE);
		verticalBox_1.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.ORANGE);
		verticalBox_1.add(panel_13);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_2);
		
		JLabel totalWordLabel = new JLabel("Total words");
		totalWordLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		totalWordLabel.setBackground(Color.GREEN);
		horizontalBox_2.add(totalWordLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.ORANGE);
		horizontalBox_2.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.ORANGE);
		horizontalBox_2.add(panel_4);
		
		totalCountTextfield = new JTextField();
		horizontalBox_2.add(totalCountTextfield);
		totalCountTextfield.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.ORANGE);
		verticalBox_1.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.ORANGE);
		verticalBox_1.add(panel_15);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_3);
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalCountTextfield.setText("");
				textField_4.setText("");
				
			}
		});
		clearBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		clearBtn.setForeground(Color.WHITE);
		clearBtn.setBackground(Color.BLUE);
		horizontalBox_3.add(clearBtn);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.ORANGE);
		horizontalBox_3.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.ORANGE);
		horizontalBox_3.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.ORANGE);
		horizontalBox_3.add(panel_7);
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		exitBtn.setForeground(Color.WHITE);
		exitBtn.setBackground(Color.BLUE);
		horizontalBox_3.add(exitBtn);
		
		
	}

}
