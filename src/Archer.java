import javax.swing.*;

public class Archer extends GamePiece
{

    //Attributes / Fields

    //Constructor
    public Archer(String color, String name, String currentGridCellColor, ImageIcon gamePieceIcon)
    {
        super(color, name, currentGridCellColor, gamePieceIcon);
    }

    @Override
    void possibleMoves()
    {
        //movement of piece

        /*
        The Archer can jump and land on a piece up to 3 squares away in any direction.  When not jumping, it can only move
        one square in any direction per turn.  Up to 2 can be chosen to start with.
        */

        //get current square of piece
        //determine possible moves
    }
}
