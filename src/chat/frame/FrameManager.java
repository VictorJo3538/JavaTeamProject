package chat.frame;

import java.util.*;

import javax.swing.JFrame;

public class FrameManager {
	// 객체를 담을 해쉬맵 생성
    private static Map<String, Object> frames = new HashMap<>();
    
    public static void init() {
    	frames.put("ChatRoom", new ChatRoomFrame());
    	frames.put("LogIn", new LogInFrame());
    }
    
    public static JFrame getChatRoomFrame() {
    	return (JFrame) frames.get("ChatRoom");
    }
    
    public static JFrame getLogInFrame() {
    	return (JFrame) frames.get("LogIn");
    }
}
