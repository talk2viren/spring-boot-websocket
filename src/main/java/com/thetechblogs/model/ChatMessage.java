package com.thetechblogs.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;
    public enum MessageType{
        CHAT,LEAVE,JOIN
    }
}
