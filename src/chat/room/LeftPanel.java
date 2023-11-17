package chat.room;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LeftPanel extends JPanel {
	JButton exit = new JButton("X");
	JButton rooms[];
	ImageIcon icon;
	int index = 0;

	public LeftPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		exit.setBackground(Color.RED);
		add(exit);
	}
	
	public void createRoom() {
		createRoom("채팅방 "+(index+1));
	}
	
	public void createRoom(String rname) {
		JButton button = new JButton(rname);
		rooms[index++] = button;
	}
}