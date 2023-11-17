package chat.main;

import java.awt.*;
import javax.swing.*;

import chat.room.ContentPane;

public class Frame extends JFrame{
	// 스크린 사이즈 가져와서 프레임이 중앙으로 오게 설정
	int frameWidth = 600, frameHeight = 500;  // 기본 프레임 크기 설정
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int screen_x = (screenSize.width - frameWidth) / 2;
	int screen_y = (screenSize.height - frameHeight) / 2;
	
	// 컨텐트판 생성
	Container contentPane = new ContentPane();
	
	public Frame() {
		setSize(frameWidth, frameHeight);
		setLocation(screen_x, screen_y);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		setTitle("채팅방");  
		
		// 컨텐트판 붙이기
		setContentPane(contentPane);
		
		setVisible(true);
	}
}
