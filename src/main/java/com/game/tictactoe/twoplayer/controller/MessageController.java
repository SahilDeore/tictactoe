package com.game.tictactoe.twoplayer.controller;

import com.game.tictactoe.twoplayer.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    private final SimpMessagingTemplate messagingTemplate;

    public MessageController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/play")
    public void forwardMessage(Message message) throws  Exception {
        System.out.println("Received message: " + message);
        System.out.println("Sending to : " + message.getReceiver());
        messagingTemplate.convertAndSendToUser(message.getReceiver(), "/next", message);

    }

}
