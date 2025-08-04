package com.game.tictactoe.twoplayer.model;

public class StatusConstants {

    public static final String SESSION_STATUS_000 = "SESSION000"; // When SESSION has been created for player one but player two has not joined yet
    public static final String SESSION_STATUS_001 = "SESSION001"; // When player two has joined the session and player one can play first move

    public static final String SESSION_STATUS_002 = "SESSION002"; // When player one has played a move and is waiting for player two to move

    public static final String SESSION_STATUS_003 = "SESSION003"; // When player two has played a move and is waiting for player one to move

    public static final String SESSION_STATUS_004 = "SESSION004"; // When the game has ended and waiting for both players to acknowledge before deleting session

    public static final String SESSION_STATUS_005 = "SESSION005"; // When one player has acknowledged end of game and waiting for second player acknowledgement

    public static final String ERROR_STATUS_000 = "ERROR000";

}
