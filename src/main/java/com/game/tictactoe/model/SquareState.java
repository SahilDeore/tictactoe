package com.game.tictactoe.model;


import java.util.ArrayList;
import java.util.List;

public class SquareState {

    public SquareState() {
        this.state = new ArrayList<>();
    }

    public SquareState(List<String> state) {
        this.state = state;
    }

    private List<String> state;

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    private String next;

    public List<String> getState() {
        return state;
    }

    public void setState(List<String> state) {
        this.state = state;
    }

}
