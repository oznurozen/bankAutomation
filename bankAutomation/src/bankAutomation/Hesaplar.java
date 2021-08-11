package bankAutomation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hesaplar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hesaplar frame = new Hesaplar();
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
	public Hesaplar() {
		JLabel lblNewLabel = new JLabel("Hesaplar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 255, 224));
		lblNewLabel.setBounds(36, 10, 98, 19);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hesap Bilgilerim");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 224));
		lblNewLabel_1.setBounds(36, 37, 162, 25);
		getContentPane().add(lblNewLabel_1);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 563);
		getContentPane().setLayout(null);
		JLabel background = new JLabel(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\bankacilikOtomasyonu\\bankAutomation\\img\\bluebackground.jpg"));
		background.setText("");
		background.setLocation(0, 0);
		background.setSize(429,62);
		getContentPane().add(background);
		
		JButton btnNewButton = new JButton("Hesap Bilgileri");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(16, 331, 118, 26);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Kur D\u00F6n\u00FC\u015F\u00FCm\u00FC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(153, 334, 118, 21);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Banka Verileri");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.setBounds(301, 334, 118, 21);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("En Yak\u0131n Merkez");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_3.setBounds(16, 378, 118, 21);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u0130leti\u015Fim");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_4.setBounds(153, 378, 118, 21);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u00C7\u0131k\u0131\u015F");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_5.setBounds(301, 378, 118, 21);
		getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_2 = new JLabel("TR 5651612 12345 6789123 1234");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(56, 112, 282, 17);
		getContentPane().add(lblNewLabel_2);
		
		JButton detay = new JButton("Detay");
		detay.setFont(new Font("Tahoma", Font.BOLD, 13));
		detay.setBounds(217, 139, 82, 21);
		getContentPane().add(detay);
		
		JButton paylas = new JButton("Payla\u015F");
		paylas.setFont(new Font("Tahoma", Font.BOLD, 13));
		paylas.setBounds(309, 139, 90, 21);
		getContentPane().add(paylas);
		
		JLabel lblNewLabel_2_1 = new JLabel("TR 5651612 12345 6789123 1234");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(56, 205, 282, 17);
		getContentPane().add(lblNewLabel_2_1);
		
		JButton detay_1 = new JButton("Detay");
		detay_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		detay_1.setBounds(217, 232, 82, 21);
		getContentPane().add(detay_1);
		
		JButton paylas_1 = new JButton("Payla\u015F");
		paylas_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		paylas_1.setBounds(309, 232, 90, 21);
		getContentPane().add(paylas_1);
		
		JLabel lblNewLabel_3 = new JLabel("User Profile");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(140, 72, 159, 13);
		getContentPane().add(lblNewLabel_3);
		
	
		
		
		
		
	}

}
