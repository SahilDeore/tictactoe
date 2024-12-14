package com.game.tictactoe.controller;

import com.game.tictactoe.model.SquareState;
import com.game.tictactoe.service.PlayerService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/")
public class PlayerController {

    PlayerService player = new PlayerService();

    @PostMapping("/play")
    @ResponseBody
    public SquareState play(@RequestBody SquareState state) {

        return player.playEasy(state);
    }

}
