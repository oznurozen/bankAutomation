package bankAutomation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JTextField Tc;
	private JPasswordField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\bankacilikOtomasyonu\\bankAutomation\\img\\bank32.png"));
		lblNewLabel.setBounds(84, 7, 33, 46);
		getContentPane().add(lblNewLabel);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BANKAMANKA");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD, 25));
		lblNewLabel_1.setBounds(127, 22, 199, 29);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("T.C. Kimlik Numaran\u0131z\u0131 Giriniz : ");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(50, 141, 331, 34);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u015Eifrenizi Giriniz :");
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(50, 259, 331, 34);
		getContentPane().add(lblNewLabel_2_1);
		
		Tc = new JTextField();
		Tc.setBounds(65, 204, 276, 34);
		getContentPane().add(Tc);
		Tc.setColumns(10);
		
		Password = new JPasswordField();
		Password.setBounds(65, 318, 276, 34);
		getContentPane().add(Password);
		
		JButton giris = new JButton("Giri\u015F");
		giris.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String tcNo="12345678912";
				String sifreGir="12345678";
				
				if(Tc.getText().equals(tcNo) && Password.getText().equals(sifreGir)) {
					Hesaplar hesap = new Hesaplar();
					dispose();
					hesap.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(giris, "TC veya þifre hatalý");
				}
			}
		});
		giris.setFont(new Font("Tahoma", Font.BOLD, 15));
		giris.setBounds(125, 386, 136, 27);
		getContentPane().add(giris);
		
		JButton sifremiUnuttum = new JButton("\u015Eifremi Unuttum");
		sifremiUnuttum.setFont(new Font("Tahoma", Font.BOLD, 15));
		sifremiUnuttum.setBounds(114, 440, 159, 27);
		getContentPane().add(sifremiUnuttum);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 563);
		getContentPane().setLayout(null);
		JLabel background = new JLabel(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\bankacilikOtomasyonu\\bankAutomation\\img\\bluebackground.jpg"));
		background.setText("");
		background.setLocation(0, 0);
		background.setSize(429,526);
		getContentPane().add(background);
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}
}
