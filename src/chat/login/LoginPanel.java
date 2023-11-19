package chat.login;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;

import chat.frame.ChatRoomFrame;
import chat.frame.FrameManager;
import chat.frame.LogInFrame;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;

public class LoginPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;
	

	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		setBounds(0, 0, 728, 560);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("로그인용 패널");
		lblNewLabel.setBounds(0, 0, 728, 287);
		lblNewLabel.setIcon(new ImageIcon(LoginPanel.class.getResource("/Img/loginCat.png")));
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 287, 728, 273);
		add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
		textField.setBounds(173, 65, 262, 46);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(173, 31, 75, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(173, 115, 104, 24);
		panel.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("로그인Go!");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(204, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameManager.getLogInFrame().dispose();
				FrameManager.getChatRoomFrame().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btnNewButton.setBounds(447, 65, 130, 125);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Go!Bat의 회원이 아니라면?");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(14, 218, 263, 24);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("회원가입Go!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((LogInFrame) FrameManager.getLogInFrame()).showRegisterPanel();
			}
		});
		btnNewButton_1.setBackground(new Color(240, 252, 255));
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton_1.setBounds(12, 240, 104, 23);
		panel.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("굴림", Font.PLAIN, 20));
		passwordField.setBounds(173, 144, 262, 46);
		panel.add(passwordField);

	}
}
