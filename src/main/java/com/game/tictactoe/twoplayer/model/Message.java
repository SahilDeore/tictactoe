package com.game.tictactoe.twoplayer.model;

import java.util.List;

public class Message {

    public Message() {

    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    private String receiver;

    private String sender;

    private List<String> state;

    private String next;

    public List<String> getState() {
        return state;
    }

    public void setState(List<String> state) {
        this.state = state;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "\n\n" +
                "[ sender : " + sender + ",\n" +
                "receiver : " + receiver + ",\n" +
                "state : " + state + ",\n" +
                "next : " + next + "\n" +
                "]";
    }

}
