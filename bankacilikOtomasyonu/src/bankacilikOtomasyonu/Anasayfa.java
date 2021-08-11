package bankacilikOtomasyonu;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;

public class Anasayfa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField password;
	private JTextField tc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anasayfa frame = new Anasayfa();
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
	public Anasayfa() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 546);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		JLabel background = new JLabel(new ImageIcon("/arkaplan.jpg"));
		background.setSize(477,443);
		getContentPane().add(background);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("T.C. Kimlik Numaran\u0131z\u0131 Giriniz:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(88, 105, 283, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u015Eifrenizi Giriniz:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(88, 217, 229, 22);
		contentPane.add(lblNewLabel_2_1);
		
		password = new JPasswordField();
		password.setToolTipText("**********");
		password.setBounds(89, 260, 228, 36);
		contentPane.add(password);
		
		tc = new JTextField();
		tc.setBounds(88, 158, 229, 36);
		contentPane.add(tc);
		tc.setColumns(10);
		
		Button button = new Button("Giri\u015F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hesaplar hesap = new hesaplar();
				dispose();
				hesap.setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setBackground(Color.RED);
		button.setBounds(250, 339, 79, 28);
		contentPane.add(button);
		
		Button button_1 = new Button("\u015Eifremi Unuttum");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(208, 387, 163, 28);
		contentPane.add(button_1);
	}
	
}