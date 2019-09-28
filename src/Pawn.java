import javax.swing.*;

public class Pawn extends GamePiece
{

    //Attributes / Fields

    //Constructor
    public Pawn(String color, String name, String currentGridCellColor)//, ImageIcon gamePieceIcon)
    {
        super(color, name, currentGridCellColor);//, gamePieceIcon);
    }

    @Override
    void possibleMoves()
    {
        //movement of piece

        /*
        The pawn moves like king in chess.  Up to 8 can be chosen to start with.  Nothing is awarded for making it to the
        other end of board.
        */

        //get current square of piece
        //determine possible moves
    }
}
