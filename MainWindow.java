import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
					frame.setTitle("Classical Substitutional Ciphers");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {

		//frame.setTitle("Classical Substitutional Ciphers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setBounds(200, 100, 900, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	    
		JButton btnCeaserCipher = new JButton("CEASER CIPHER");
		btnCeaserCipher.setFont(new Font("Calibri", Font.BOLD, 16));
		btnCeaserCipher.setBackground(Color.LIGHT_GRAY);
		btnCeaserCipher.setBounds(314, 89, 217, 36);
		btnCeaserCipher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CeaserFrame ceaser_frame  = new CeaserFrame();
				ceaser_frame.show();
				//dispose();
			}
		});
		contentPane.add(btnCeaserCipher);
		
		JButton btnMonoalphabeticCipher = new JButton("MONOALPHABETIC CIPHER");
		btnMonoalphabeticCipher.setFont(new Font("Calibri", Font.BOLD, 16));
		btnMonoalphabeticCipher.setBackground(Color.LIGHT_GRAY);
		btnMonoalphabeticCipher.setBounds(314, 147, 217, 36);
		
		btnMonoalphabeticCipher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MonoAlphabeticFrame monoalpha_frame  = new MonoAlphabeticFrame();
				monoalpha_frame.show();
				//dispose();
			}
		});
		contentPane.add(btnMonoalphabeticCipher);
		
		JButton btnPlayfairCipher = new JButton("PLAYFAIR CIPHER");
		btnPlayfairCipher.setFont(new Font("Calibri", Font.BOLD, 16));
		btnPlayfairCipher.setBackground(Color.LIGHT_GRAY);
		btnPlayfairCipher.setBounds(314, 205, 217, 36);
		btnPlayfairCipher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayFairFrame playfair_frame  = new PlayFairFrame();
				playfair_frame.show();
				//dispose();
			}
		});
		contentPane.add(btnPlayfairCipher);
		
		JButton btnPolyalphabeticCipher = new JButton("POLYALPHABETIC CIPHER");
		btnPolyalphabeticCipher.setFont(new Font("Calibri", Font.BOLD, 16));
		btnPolyalphabeticCipher.setBackground(Color.LIGHT_GRAY);
		btnPolyalphabeticCipher.setBounds(314, 264, 217, 36);
		btnPolyalphabeticCipher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PolyAlphabeticFrame polyalpha_frame  = new PolyAlphabeticFrame();
				polyalpha_frame.show();
				//dispose();
			}
		});
		contentPane.add(btnPolyalphabeticCipher);
		
		JButton btnOnetimePadding = new JButton("ONETIME PADDING");
		btnOnetimePadding.setFont(new Font("Calibri", Font.BOLD, 16));
		btnOnetimePadding.setBackground(Color.LIGHT_GRAY);
		btnOnetimePadding.setBounds(314, 321, 217, 36);
		
		btnOnetimePadding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OneTimePadFrame oneTimePadFrame = new OneTimePadFrame();
				oneTimePadFrame.show();
				//dispose();
			}
		});
		contentPane.add(btnOnetimePadding);

	}
}
