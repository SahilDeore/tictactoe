package com.game.tictactoe.twoplayer.service;

import com.game.tictactoe.twoplayer.model.CreateSessionResponse;
import com.game.tictactoe.twoplayer.model.MatchSession;
import org.springframework.stereotype.Service;

import static com.game.tictactoe.twoplayer.model.MatchSession.matchSessions;

@Service
public class CreateSessionService {


    public CreateSessionResponse createNewSession() {

        CreateSessionResponse createSessionResponse;

        MatchSession newSession = new MatchSession();

        System.out.println("Current match: " + newSession.getSessionId());
        System.out.println("Current player one: " + newSession.getPlayerOneId());
        System.out.println("Current player two: " + newSession.getPlayerTwoId());
        System.out.println("Current match status: " + newSession.getSessionStatus());
        System.out.println("Active matches: " + matchSessions.size());
        System.out.println();

        createSessionResponse = new CreateSessionResponse(newSession.getSessionId());
        createSessionResponse.setPlayerId(newSession.getPlayerOneId());

        return createSessionResponse;
    }



}
