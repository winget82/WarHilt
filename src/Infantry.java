import javax.swing.*;

public class Infantry extends GamePiece
{

    //Attributes / Fields

    //Constructor
    public Infantry(String color, String name, String currentGridCellColor, ImageIcon gamePieceIcon)
    {
        super(color, name, currentGridCellColor, gamePieceIcon);
    }

    @Override
    void possibleMoves()
    {
        //movement of piece

        /*
        The Infantry is like a Pawn except it can move 2 squares in any direction or combination of directions, but cannot
        move further than when it defeats another piece (it can only defeat one piece per turn).  Up to 2 can be chosen per
        player to start with.
        */

        //get current square of piece
        //determine possible moves
    }
}
