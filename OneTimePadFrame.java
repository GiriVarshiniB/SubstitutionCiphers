import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

public class OneTimePadFrame extends JFrame{

	JPanel contentPane;
	JTextField textField;
	JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OneTimePadFrame frame = new OneTimePadFrame();
					frame.setTitle("Onetime pad - Encryption Decryption");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public OneTimePadFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 900, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ONETIME PAD");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(219, 57, 453, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Input Text here..");
		lblNewLabel_1.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(219, 148, 211, 30);
		contentPane.add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Calibri", Font.BOLD, 18));
		textField_3.setBounds(219, 189, 453, 48);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("CIPHER TEXT GENERATED AFTER ENCRYPTION");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(220, 333, 379, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ONETIME PAD KEY GENERATED IS");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(219, 386, 380, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("PLAIN TEXT GENERATED AFTER DECRYPTION");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(219, 442, 380, 30);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Calibri", Font.BOLD, 18));
		textField_2.setBounds(608, 307, 160, 48);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Calibri", Font.BOLD, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(609, 366, 160, 43);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Calibri", Font.BOLD, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(609, 420, 160, 46);
		contentPane.add(textField_5);
		
		JButton Generate_Buttton = new JButton("GENERATE");
		Generate_Buttton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input_text = textField_3.getText();
				String[] output_text = OneTimePad.encrypt(input_text);
				textField_2.setText(output_text[2]);
				textField_4.setText(output_text[1]);
				textField_5.setText(output_text[0]);
			}
		});
		Generate_Buttton.setFont(new Font("Calibri", Font.BOLD, 24));
		Generate_Buttton.setBounds(339, 259, 197, 48);
		contentPane.add(Generate_Buttton);
		
	}
}