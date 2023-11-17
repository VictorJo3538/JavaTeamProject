package chat.room;

import java.awt.*;

import javax.swing.*;

public class ContentPane extends JPanel {
	Image backgroundImg;
	String fname = "포켓몬.jpeg";
	
	public ContentPane() {
		// 배경이미지 생성
		backgroundImg = new ImageIcon(fname).getImage();

		
		// 보더 레이아웃으로 설정
		setLayout(new BorderLayout());

//		add(new JButton("센터"), BorderLayout.CENTER);

		add(new LeftPanel(), BorderLayout.LINE_START);

		add(new JButton("오른쪽"), BorderLayout.LINE_END);

		add(new TopPanel(), BorderLayout.PAGE_START);

		add(new JButton("아래"), BorderLayout.PAGE_END);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// 이미지를 그립니다.
		g.drawImage(backgroundImg, 0, 0, getWidth(), getHeight(), this);
	}
}