package com.example.baoduy_anhthu;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    // Khi có tin nhắn gửi đến đường dẫn "/app/chat", hàm này sẽ nhận và phát lại
    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message; // Trả về tin nhắn cho tất cả những ai đang lắng nghe kênh /topic/messages
    }
}