package com.game.tictactoe.twoplayer.controller;

import com.game.tictactoe.twoplayer.model.*;
import com.game.tictactoe.twoplayer.service.CreateSessionService;
import com.game.tictactoe.twoplayer.service.JoinSessionService;
import com.game.tictactoe.twoplayer.service.SessionStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TwoPlayerController {

    @Autowired
    CreateSessionService createSessionService;

    @Autowired
    SessionStatusService sessionStatusService;

    @Autowired
    JoinSessionService joinSessionService;

    @GetMapping("/check")
    public HealthCheckResponse healthCheck() {
        return new HealthCheckResponse("TTT200");
    }

    @GetMapping("/createSession")
    public CreateSessionResponse createSession() {

        return createSessionService.createNewSession();
    }

    @PostMapping("/sessionStatus")
    public String sessionStatus(@RequestBody SessionStatusRequest sessionStatusRequest) {

        return sessionStatusService.getSessionStatus(sessionStatusRequest.getSessionId());
    }

    @PostMapping("/joinSession")
    public JoinSessionResponse joinSession(@RequestBody JoinSessionRequest joinSessionRequest) {

        return joinSessionService.joinSession(joinSessionRequest.getSessionId());
    }

}
