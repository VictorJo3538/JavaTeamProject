package chat.frame;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatLightLaf;

import chat.login.LoginPanel;
import chat.login.RegisterPanel;

import java.awt.CardLayout;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	// CardLayout을 사용할 패널 생성
    private static CardLayout cardLayout = new CardLayout();
    private static JPanel cards = new JPanel(cardLayout);

	// 어플리케이션 실행
	public static void main(String[] args) {
		// flatlaf 테마 적용
		try {
		    UIManager.setLookAndFeel( new FlatLightLaf() );
		} catch( Exception ex ) {
		    System.err.println( "Failed to initialize LaF" );
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// 프레임 제작
	public Frame() {
		setTitle("고양이뱃살(Go!Bat)");
		setResizable(false);  // 창변경금지
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 스크린 사이즈 가져와서 프레임이 중앙으로 오게 설정
		int frameWidth = 728, frameHeight = 560; // 기본 프레임 크기 설정
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screenSize.width - frameWidth) / 2;
		int y = (screenSize.height - frameHeight) / 2;
		
		setBounds(x, y, 728, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel loginPanel = new LoginPanel();
		JPanel RegisterPanel = new RegisterPanel();
		
		cards.add("LoginPanel", loginPanel);  // 로그인 패널 추가
		cards.add("RegisterPanel", RegisterPanel);  // 회원가입 패널 추가
		
		contentPane.add(cards);
		
	}
	
	public static void showRegisterPanel( ) {
		cardLayout.show(cards, "RegisterPanel");
	}
	
	public static void showLoginPanel() {
		cardLayout.show(cards, "LoginPanel");
	}
}
