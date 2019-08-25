import javax.swing.*;

public class Cleric extends GamePiece {

    /*
    The Cleric is like the Bishop in chess.  Two can be chosen per player.
    */

    //Attributes / Fields

    //Constructor
    public Cleric(String color, String name, String currentGridCellColor, ImageIcon gamePieceIcon) {
        super(color, name, currentGridCellColor, gamePieceIcon);
    }

    @Override
    void movement() {
        //movement of piece
    }
}
