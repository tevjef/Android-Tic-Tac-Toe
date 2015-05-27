package com.tevinjeffrey.tictactoe.game.board.impl;

import com.tevinjeffrey.tictactoe.game.board.Cell;

import static com.tevinjeffrey.tictactoe.game.board.Cell.CellState.BLANK;
import static com.tevinjeffrey.tictactoe.game.board.Cell.CellState.PLAYER_ONE;
import static com.tevinjeffrey.tictactoe.game.board.Cell.CellState.PLAYER_TWO;

//A generic cell implementation. It's used in the "possible games" evaluated by the AI's minimax
// algorithm.
public class CellImpl implements Cell {
    int index;
    int value;
    CellState cellState;

    public CellImpl(Cell cell) {
        this.index = cell.getIndex();
        this.value = cell.getValue();
        this.cellState = cell.getState();
    }

    @Override
    public boolean isTaken() {
        return getState() != BLANK;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean isPlayerOne() {
        return cellState == PLAYER_ONE;
    }

    @Override
    public boolean isPlayerTwo() {
        return cellState == PLAYER_TWO;
    }

    @Override
    public boolean isBlank() {
        return cellState == BLANK;
    }

    @Override
    public void setState(CellState cellState) {
        this.cellState = cellState;
    }

    @Override
    public CellState getState() {
        return this.cellState;
    }

    @Override
    public String toString() {
        return "(Index: "+ getIndex() + ", Score: " + getValue() + ", State: " + getState() + ")";
    }
}
