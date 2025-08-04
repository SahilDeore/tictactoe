package com.game.tictactoe.twoplayer.service;

import com.game.tictactoe.twoplayer.model.JoinSessionResponse;
import com.game.tictactoe.twoplayer.model.StatusConstants;
import org.springframework.stereotype.Service;

import static com.game.tictactoe.twoplayer.model.MatchSession.matchSessions;

@Service
public class JoinSessionService {

    public JoinSessionResponse joinSession(String sessionId) {

        JoinSessionResponse joinSessionResponse = new JoinSessionResponse();

        if(matchSessions.containsKey(sessionId)) {
            matchSessions.get(sessionId).setSessionStatus(StatusConstants.SESSION_STATUS_001);

            joinSessionResponse.setPlayerId(matchSessions.get(sessionId).getPlayerTwoId());
            joinSessionResponse.setSessionStatus(matchSessions.get(sessionId).getSessionStatus());
        }
        else {
            joinSessionResponse.setSessionStatus(StatusConstants.ERROR_STATUS_000);
        }

        return joinSessionResponse;
    }

}
