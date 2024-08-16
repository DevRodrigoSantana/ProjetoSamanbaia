package socket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import socket.WebSocketService;

@RestController
public class WebSocketController {

    @Autowired
    private WebSocketService webSocketService;

    @PostMapping("/api/send")
    public String sendMessageToWebSocket(@RequestBody String message) {
        webSocketService.sendMessage(message);
        return "Mensagem enviada para o WebSocket com sucesso!";
    }
}
