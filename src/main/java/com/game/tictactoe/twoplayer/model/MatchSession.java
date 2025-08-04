package com.game.tictactoe.twoplayer.model;

import java.util.HashMap;

public class MatchSession {

    public String getSessionId() {
        return sessionId;
    }

    public MatchSession() {

        do {
            this.sessionId = generateUniqueId();
            this.playerOneId = generateUniqueId();
            this.playerTwoId = generateUniqueId();
        } while(matchSessions.containsKey(this.sessionId) || this.playerOneId.equals(this.playerTwoId));

        this.sessionStatus = StatusConstants.SESSION_STATUS_000;

        matchSessions.put(this.sessionId, this);
    }

    public String generateUniqueId() {
        return (int)(Math.random()*1000000) + "";
    }

    private String sessionId;

    public String getSessionStatus() {
        return sessionStatus;
    }

    public void setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    private String sessionStatus;

    public String getPlayerOneId() {
        return playerOneId;
    }

    private String playerOneId;

    public String getPlayerTwoId() {
        return playerTwoId;
    }

    private String playerTwoId;

    public static HashMap<String, MatchSession> matchSessions= new HashMap<>();

}
