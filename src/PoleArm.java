import javax.swing.*;

public class PoleArm extends GamePiece
{

    //Attributes / Fields

    //Constructor
    public PoleArm(String color, String name, String currentGridCellColor, ImageIcon gamePieceIcon)
    {
        super(color, name, currentGridCellColor, gamePieceIcon);
    }

    @Override
    void possibleMoves()
    {
        //movement of piece

        /*
        The PoleArm moves like the rook in chess.  Up to two can be chosen per player.
        */

        //get current square of piece
        //determine possible moves
    }
}
