package com.game.tictactoe.twoplayer.model;

public class HealthCheckResponse {

    public HealthCheckResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;


}
