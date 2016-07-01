package com.epam.tictactoe.player;

import com.epam.tictactoe.board.IPosition;
import com.epam.tictactoe.enums.Sign;


/**
 * Created by Grzesiek on 2016-06-26.
 */
public interface IPlayer {
    public Sign sign();
    public void saveTurn(IPosition position);
    public IPosition lastTurn();
}
