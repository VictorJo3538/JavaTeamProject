package chat.login;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.GridBagLayout;
import javax.swing.SpringLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import chat.frame.LogInFrame;

public class RegisterPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_3;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	
	private LogInFrame loginFrame = LogInFrame.getObject();  // 로그인 프레임 가져오기

	/**
	 * Create the panel.
	 */
	public RegisterPanel() {
		setLayout(null);
		setBounds(0, 0, 728, 560);

		// 패널 생성
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 728, 560);
		add(panel);

		// 고양이 이미지 생성
		JLabel lblNewLabel = new JLabel("고양이이미지");
		lblNewLabel.setBounds(0, 0, 728, 287);
		lblNewLabel.setIcon(new ImageIcon(LoginPanel.class.getResource("/Img/loginCat.png")));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디 입력");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(406, 318, 116, 24);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
		textField.setBounds(406, 352, 262, 46);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호 입력");
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(57, 408, 162, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1_1_1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(406, 408, 162, 24);
		panel.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(57, 352, 262, 46);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("사용자명");
		lblNewLabel_1_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(57, 318, 116, 24);
		panel.add(lblNewLabel_1_2);
		
		JButton btnNewButton_1_1 = new JButton("취소");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginFrame.showLoginPanel();
			}
		});
		btnNewButton_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(569, 512, 100, 38);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("완료");
		btnNewButton_1.setBounds(457, 512, 100, 38);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(57, 442, 262, 46);
		panel.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(406, 442, 262, 46);
		panel.add(passwordField_2);
	}
}
