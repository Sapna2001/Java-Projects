package heightConversion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField inchText;
	private JTextField feetText;
	private JTextField cmText;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setTitle("Height Conversion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 275);
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		JLabel ftlabel = new JLabel(" Feet ");
		ftlabel.setForeground(Color.RED);
		ftlabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		horizontalBox.add(ftlabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		horizontalBox.add(panel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.YELLOW);
		horizontalBox.add(panel_5);
		
		feetText = new JTextField();
		feetText.setAlignmentX(Component.LEFT_ALIGNMENT);
		feetText.setForeground(Color.BLACK);
		horizontalBox.add(feetText);
		feetText.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.YELLOW);
		verticalBox.add(panel_9);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		JLabel inchLabel = new JLabel(" Inch ");
		inchLabel.setForeground(Color.RED);
		inchLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		horizontalBox_2.add(inchLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		horizontalBox_2.add(panel_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.YELLOW);
		horizontalBox_2.add(panel_7);
		
		inchText = new JTextField();
		horizontalBox_2.add(inchText);
		inchText.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.YELLOW);
		verticalBox.add(panel_10);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_4);
		
		JButton convertBtn = new JButton("Convert");
		convertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double feet,inch,cm;
				feet = Double.parseDouble(feetText.getText());
				inch = Double.parseDouble(inchText.getText());
				cm = (feet*12+inch)*2.54;
				cmText.setText(String.valueOf(cm));
			}
		});
		convertBtn.setBackground(Color.BLUE);
		convertBtn.setForeground(Color.WHITE);
		convertBtn.setFont(new Font("Tahoma", Font.PLAIN, 35));
		horizontalBox_4.add(convertBtn);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		horizontalBox_4.add(panel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.YELLOW);
		horizontalBox_4.add(panel_4);
		
		JLabel cmLabel = new JLabel(" cm ");
		cmLabel.setForeground(Color.RED);
		cmLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		horizontalBox_4.add(cmLabel);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.YELLOW);
		horizontalBox_4.add(panel_6);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.YELLOW);
		horizontalBox_4.add(panel_8);
		
		cmText = new JTextField();
		horizontalBox_4.add(cmText);
		cmText.setColumns(5);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.YELLOW);
		verticalBox.add(panel_11);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				feetText.setText("");
				inchText.setText("");
				cmText.setText("");
			}
		});
		clearBtn.setBackground(Color.BLUE);
		clearBtn.setForeground(Color.WHITE);
		clearBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_1.add(clearBtn);
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.setBackground(Color.BLUE);
		exitBtn.setForeground(Color.WHITE);
		exitBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.BLACK);
		horizontalBox_1.add(panel_3);
		horizontalBox_1.add(exitBtn);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.YELLOW);
		verticalBox.add(panel_12);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
