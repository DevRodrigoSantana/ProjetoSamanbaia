package socket;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyWebSocketHandler extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, org.springframework.web.socket.TextMessage message) throws Exception {
        String payload = message.getPayload();
        System.out.println("Mensagem recebida: " + payload);
        session.sendMessage(new org.springframework.web.socket.TextMessage("Echo: " + payload));
    }
}