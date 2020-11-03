package fontes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Checkbox;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class T_dois extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T_dois frame = new T_dois();
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
	public T_dois() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN EFETUADO COM SUCESSO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(227, 11, 331, 103);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(152, 251, 152));
		panel.setBounds(0, 0, 175, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("APS 2020-02");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setIcon(new ImageIcon(T_dois.class.getResource("/res/language.png")));
		lblNewLabel_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 175, 120);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(144, 238, 144));
		panel_1.setBounds(0, 120, 175, 40);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(50, 11, 75, 20);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(144, 238, 144));
		panel_2.setBounds(0, 160, 175, 40);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(50, 11, 75, 20);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(144, 238, 144));
		panel_3.setBounds(0, 200, 175, 40);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setFont(new Font("Rockwell", Font.PLAIN, 14));
		label.setBounds(50, 11, 75, 20);
		panel_3.add(label);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(144, 238, 144));
		panel_4.setBounds(0, 240, 175, 40);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setFont(new Font("Rockwell", Font.PLAIN, 14));
		label_1.setBounds(50, 11, 75, 20);
		panel_4.add(label_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(144, 238, 144));
		panel_5.setLayout(null);
		panel_5.setBounds(0, 280, 175, 40);
		panel.add(panel_5);
		
		JLabel lblSignOut = new JLabel("SIGN OUT");
		lblSignOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSignOut.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				TelaLogin exibir = new TelaLogin();
				exibir.setVisible(true);
				
				setVisible(false);
				
			}
		});
		lblSignOut.setFont(new Font("Rockwell", Font.PLAIN, 14));
		lblSignOut.setBounds(50, 11, 75, 20);
		panel_5.add(lblSignOut);
		
		JButton btn_voltar = new JButton("voltar");
		btn_voltar.setBounds(0, 338, 89, 23);
		panel.add(btn_voltar);
		btn_voltar.setVisible(false);
		btn_voltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaLogin exibir = new TelaLogin();
				exibir.setVisible(true);
				
				setVisible(false);
			}
		});
	}
}
