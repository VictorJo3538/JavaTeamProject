package chat.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import chat.room.ChatRoomPanel;

public class ChatRoomFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
    private static ChatRoomFrame staticFrame;  // 프레임을 담을 스태틱 변수

	/**
	 * Create the frame.
	 */
	public ChatRoomFrame() {
		staticFrame = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();

		setContentPane(contentPane);
		
		JPanel chatRoomPanel = new ChatRoomPanel();
		contentPane.add(chatRoomPanel);
	}
	
	public ChatRoomFrame getObject() {
		return staticFrame;
	}
}
