package com.game.tictactoe.service;

import com.game.tictactoe.model.SquareState;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayerService {

    public SquareState playEasy(SquareState inputState) {
        SquareState outputState = updateRandom(inputState);
        updateNext(inputState,outputState);
        return outputState;
    }

    private void updateNext(SquareState inputState, SquareState outputState) {
        if (inputState.getNext().equals("X")) {
            outputState.setNext("O");
        }
        if (inputState.getNext().equals("O")) {
            outputState.setNext("X");
        }
    }

    private SquareState updateRandom(SquareState inputState) {
        SquareState outputState = new SquareState();

        int nullCount = 0;
        //count null
        for(String currSquare : inputState.getState()) {
            if(currSquare == null) nullCount++;
        }

        if(nullCount == 0) return inputState;

        Random random = new Random();
        int targetNullIndex = random.nextInt(nullCount);
        System.out.println("Randomly set " + targetNullIndex);
        int currNull = 0;
        List<String> inputStrings = inputState.getState();
        List<String> outputStrings = new ArrayList<>();

        for (String currSquare: inputStrings) {
            String updatedSquare = currSquare;
            if (currSquare == null) {
                if (currNull == targetNullIndex) {
                    updatedSquare = inputState.getNext();
                }
                currNull++;
            }
            outputStrings.add(updatedSquare);
        }
        outputState.setState(outputStrings);
        return outputState;
    }

}
