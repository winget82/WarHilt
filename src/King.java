import javax.swing.*;

public class King extends GamePiece {

    /*
    The King moves exactly like the King in chess.  Only one must be used per player.
    */

    //Attributes / Fields

    //Constructor
    public King(String color, String name, String currentGridCellColor, ImageIcon gamePieceIcon) {
        super(color, name, currentGridCellColor, gamePieceIcon);
    }

    @Override
    void movement() {
        //movement of piece
    }
}
