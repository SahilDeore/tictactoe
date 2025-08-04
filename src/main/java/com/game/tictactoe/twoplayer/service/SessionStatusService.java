package com.game.tictactoe.twoplayer.service;

import com.game.tictactoe.twoplayer.model.StatusConstants;
import org.springframework.stereotype.Service;

import static com.game.tictactoe.twoplayer.model.MatchSession.matchSessions;

@Service
public class SessionStatusService {

    public String getSessionStatus(String sessionId) {
        if(matchSessions.containsKey(sessionId)) {
            return matchSessions.get(sessionId).getSessionStatus();
        }
        else {
            return StatusConstants.ERROR_STATUS_000;
        }
    }

}
