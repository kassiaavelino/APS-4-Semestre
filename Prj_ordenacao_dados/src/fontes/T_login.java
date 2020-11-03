package fontes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;

import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class T_login extends JFrame {

	private JPanel contentPane;
	private JTextField txtDigiteSeuLogin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T_login frame = new T_login();
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
	public T_login() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Acesso ao Sistema");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		lblNewLabel.setBounds(117, 25, 199, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kassi\\Desktop\\aps-3-semestre\\user.png"));
		lblNewLabel_1.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblNewLabel_1.setBounds(144, 90, 24, 25);
		contentPane.add(lblNewLabel_1);
		
		txtDigiteSeuLogin = new JTextField();
		txtDigiteSeuLogin.setToolTipText("");
		txtDigiteSeuLogin.setFont(new Font("Rockwell", Font.PLAIN, 12));
		txtDigiteSeuLogin.setBounds(178, 90, 100, 25);
		contentPane.add(txtDigiteSeuLogin);
		txtDigiteSeuLogin.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\kassi\\Desktop\\aps-3-semestre\\lock.png"));
		lblNewLabel_2.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblNewLabel_2.setBounds(144, 132, 24, 25);
		contentPane.add(lblNewLabel_2);
		
		JButton btn_entrar = new JButton("ENTRAR");
		btn_entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				T_dois exibir = new T_dois();
				exibir.setVisible(true);
				
				setVisible(false);
			}
		});
		btn_entrar.setFont(new Font("Rockwell", Font.BOLD, 14));
		btn_entrar.setBounds(97, 202, 100, 30);
		contentPane.add(btn_entrar);
		
		JButton btn_sair = new JButton("SAIR");
		btn_sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn_sair) {
					System.exit(0);
				}
			}
		});
		btn_sair.setFont(new Font("Rockwell", Font.BOLD, 14));
		btn_sair.setBounds(227, 202, 100, 30);
		contentPane.add(btn_sair);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(178, 132, 100, 25);
		contentPane.add(passwordField);
	}
}
