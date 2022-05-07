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

public class PlayFairFrame extends JFrame {

	JPanel contentPane;
	JTextField textField;
	JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_2;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayFairFrame frame = new PlayFairFrame();
					frame.setTitle("Playfair Cipher - Encryption Decryption");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public PlayFairFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 900, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PLAYFAIR CIPHER");
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
		textField_3.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_3.setBounds(219, 189, 273, 48);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("The Output Text for given input is..");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(219, 356, 300, 30);
		contentPane.add(lblNewLabel_1_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(219, 404, 453, 48);
		contentPane.add(textField_4);

		JLabel lblNewLabel_1_2 = new JLabel("Enter Keyword");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(517, 148, 145, 30);
		contentPane.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Calibri", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(517, 189, 145, 48);
		contentPane.add(textField_2);
		
		JButton Encrypt_Button = new JButton("ENCRYPT");
		Encrypt_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input_text = textField_3.getText();
				String keyword = textField_2.getText();
				PlayFairCipher.setKey(keyword);
				PlayFairCipher.KeyGen();
				String output_text = PlayFairCipher.Encrypt(input_text);
				textField_4.setText(output_text);			
			}
		});
		Encrypt_Button.setFont(new Font("Calibri", Font.BOLD, 24));
		Encrypt_Button.setBounds(219, 276, 197, 48);
		contentPane.add(Encrypt_Button);
		
		JButton Decrypt_Buttton = new JButton("DECRYPT");
		Decrypt_Buttton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input_text = textField_3.getText();
				String output_text = PlayFairCipher.Decrypt(input_text);
				textField_4.setText(output_text);
			}
		});
		Decrypt_Buttton.setFont(new Font("Calibri", Font.BOLD, 24));
		Decrypt_Buttton.setBounds(472, 276, 197, 48);
		contentPane.add(Decrypt_Buttton);
		
	}
}
