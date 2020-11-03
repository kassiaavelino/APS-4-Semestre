package fontes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.ComponentOrientation;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Frame;
import java.awt.Toolkit;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblLoginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new LineBorder(new Color(204, 255, 255), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Acesso ao Sistema");
		lblNewLabel.setBorder(null);
		lblNewLabel.setBounds(125, 11, 300, 69);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 24));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(150, 101, 250, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			
			public void focusGained(FocusEvent arg0) {
				if(txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
				else {
					txtUsername.selectAll();
				}
			}

			public void focusLost(FocusEvent arg0) {
				if(txtUsername.getText().equals(""))
					txtUsername.setText("Username");
			}
		});
		txtUsername.setMargin(new Insets(5, 5, 5, 5));
		txtUsername.setFont(new Font("Rockwell", Font.PLAIN, 12));
		txtUsername.setText("Username");
		txtUsername.setBounds(10, 11, 190, 30);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblIconUsername = new JLabel("");
		lblIconUsername.setIcon(new ImageIcon(TelaLogin.class.getResource("/res/user.png")));
		lblIconUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconUsername.setBounds(200, 0, 50, 50);
		panel.add(lblIconUsername);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(150, 174, 250, 50);
		contentPane.add(panel_1);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			
			public void focusGained(FocusEvent arg0) {
				if(txtPassword.getText().equals("Password")) {
					txtPassword.setEchoChar('●');
					txtPassword.setText("");
				}
				else {
					txtPassword.selectAll();
				}
			}
			
			public void focusLost(FocusEvent arg0) {
				if(txtPassword.getText().equals(""))
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)'●');
			}
		});
		txtPassword.setEchoChar((char)0);
		txtPassword.setMargin(new Insets(5, 5, 5, 5));
		txtPassword.setText("Password");
		txtPassword.setBounds(10, 11, 190, 30);
		panel_1.add(txtPassword);
		
		JLabel lblIconPassword = new JLabel("");
		lblIconPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconPassword.setIcon(new ImageIcon(TelaLogin.class.getResource("/res/lock.png")));
		lblIconPassword.setBounds(200, 0, 50, 50);
		panel_1.add(lblIconPassword);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setContentAreaFilled(false);
		btnEntrar.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent arg0) {
				if(txtUsername.getText().equals("admin") && txtPassword.getText().equals("admin123")) {
					//lblLoginMessage.setText("");					
					btnEntrar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							T_dois exibir = new T_dois();
							exibir.setVisible(true);							
							setVisible(false);							
						}
					});
				}
				else if(txtUsername.getText().equals("") || txtUsername.getText().equals("Username") ||
						txtPassword.getText().equals("") || txtPassword.getText().equals("Password")) {
					lblLoginMessage.setText("Por favor preencha todos os campos corretamente!");
				}
				else {
					lblLoginMessage.setText("Usuário ou senha incorreto.");
				}					
			}		
		});
		btnEntrar.setFont(new Font("Rockwell", Font.BOLD, 14));
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar.setBorder(new LineBorder(new Color(152, 251, 152), 2, true));
		btnEntrar.setBounds(150, 282, 100, 30);
		contentPane.add(btnEntrar);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSair.setContentAreaFilled(false);
		btnSair.setFont(new Font("Rockwell", Font.BOLD, 14));
		btnSair.setBorder(new LineBorder(new Color(152, 251, 152), 2));
		btnSair.setBounds(300, 282, 100, 30);
		contentPane.add(btnSair);
		lblLoginMessage.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblLoginMessage.setForeground(new Color(204, 0, 0));
		lblLoginMessage.setFont(new Font("Rockwell", Font.PLAIN, 12));
		lblLoginMessage.setBounds(125, 241, 300, 14);
		contentPane.add(lblLoginMessage);
		
		JLabel lblEnter = new JLabel("ENTER");
		lblEnter.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblEnter.setBorder(new LineBorder(new Color(152, 251, 152), 2));
		lblEnter.setBackground(new Color(204, 255, 204));
		lblEnter.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEnter.setBounds(0, 0, 100, 30);
		
	}
}