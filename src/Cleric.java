import javax.swing.*;

public class Cleric extends GamePiece
{

    //Attributes / Fields

    //Constructor
    public Cleric(String color, String name, String currentGridCellColor, ImageIcon gamePieceIcon)
    {
        super(color, name, currentGridCellColor, gamePieceIcon);
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
    }
}
