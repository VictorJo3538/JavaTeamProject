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
import java.awt.GridBagLayout;
import javax.swing.SpringLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import chat.frame.Frame;

public class RegisterPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		lblNewLabel_1.setFont(new Font("HY엽서M", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(406, 318, 116, 24);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(406, 352, 262, 46);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(57, 442, 262, 46);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호 입력");
		lblNewLabel_1_1.setFont(new Font("HY엽서M", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(57, 408, 162, 24);
		panel.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(406, 442, 262, 46);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1_1_1.setFont(new Font("HY엽서M", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(406, 408, 162, 24);
		panel.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(57, 352, 262, 46);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("사용자명");
		lblNewLabel_1_2.setFont(new Font("HY엽서M", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(57, 318, 116, 24);
		panel.add(lblNewLabel_1_2);
		
		JButton btnNewButton_1_1 = new JButton("취소");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.showLoginPanel();
			}
		});
		btnNewButton_1_1.setFont(new Font("HY엽서M", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(569, 512, 100, 38);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("완료");
		btnNewButton_1.setBounds(457, 512, 100, 38);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("HY엽서M", Font.BOLD, 12));
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(711, 0, 17, 48);
		panel.add(scrollBar);
	}
}
