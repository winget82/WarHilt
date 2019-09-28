import javax.swing.*;

public class Queen extends GamePiece
{

    //Attributes / Fields

    //Constructor
    public Queen(String color, String name, String currentGridCellColor, String gridName)
    {
        super(color, name, currentGridCellColor, gridName);
    }

    @Override
    void possibleMoves()
    {
        //movement of piece

        /*
        The Queen moves like the Queen in chess.  Only one can be chosen per player for the game.
        */

        //get current square of piece
        //determine possible moves
    }
}
