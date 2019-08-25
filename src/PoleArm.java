import javax.swing.*;

public class PoleArm extends GamePiece {

    /*
    The PoleArm moves like the rook in chess.  Up to two can be chosen per player.
    */
    //Attributes / Fields

    //Constructor
    public PoleArm(String color, String name, String currentGridCellColor, ImageIcon gamePieceIcon) {
        super(color, name, currentGridCellColor, gamePieceIcon);
    }

    @Override
    void movement() {
        //movement of piece
    }
}
