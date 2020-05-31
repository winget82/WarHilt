import javax.swing.*;

public class Cleric extends GamePiece
{

    //Attributes / Fields

    //Constructor
    public Cleric(String color, String name, String currentGridCellColor, String gridName)
    {
        super(color, name, currentGridCellColor, gridName);
    }

    @Override
    void possibleMoves()
    {
        //movement of piece

        /*
        The Cleric is like the Bishop in chess.  Two can be chosen per player.
        */

        //get current square of piece
        //determine possible moves
        /*
        Something to the effect of (while less than gameboard size and >= 0)
        [row-1, col+1], [row+1, col+1], [row-1, col-1], [row+1, col-1]
         */
    }
}
