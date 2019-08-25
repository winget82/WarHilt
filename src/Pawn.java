import javax.swing.*;

public class Pawn extends GamePiece {

    /*
    The pawn moves like king in chess.  Up to 8 can be chosen to start with.  Nothing is awarded for making it to the
    other end of board.
    */

    //Attributes / Fields

    //Constructor
    public Pawn(String color, String name, String currentGridCellColor, ImageIcon gamePieceIcon) {
        super(color, name, currentGridCellColor, gamePieceIcon);
    }

    @Override
    void movement() {
        //movement of piece
    }
}
