package chat.room;

import java.awt.*;
import javax.swing.*;

public class TopPanel extends JPanel {
	JButton logout = new JButton("로그아웃");
	JButton profile = new JButton("프로필 설정");
	JButton makeroom = new JButton("채팅방 만들기");
	
	public TopPanel() {
		JButton[] buttons = {logout, profile, makeroom};
		setLayout(new FlowLayout());
		for (JButton button: buttons) {
			add(button);
		}
	}
}
