import javax.swing.*;

public class King extends GamePiece
{

    //Attributes / Fields

    //Constructor
    public King(String color, String name, String currentGridCellColor, String gridName)
    {
        super(color, name, currentGridCellColor, gridName);
    }

    @Override
    void possibleMoves()
    {
        //movement of piece

        /*
        The King moves exactly like the King in chess.  Only one must be used per player.
        */

        //get current square of piece
        //determine possible moves
        /*
        Something to the effect of
        [row-1, col], [row+1, col], [row, col-1], [row, col+1]
        [row-1, col-1], [row-1, col+1], [row+1, col-1], [row+1, col+1]
         */
    }
}
