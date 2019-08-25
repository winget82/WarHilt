import javax.swing.*;

public class Calvary extends GamePiece{

    /*
    The Calvary piece can defeat two game pieces directly in front of it (2 squares in front of it). 2 can be chosen per
    player.  It can only move forward.  Once it is moved to the end of the board it becomes an Infantry piece.
    */

    //Attributes / Fields

    //Constructor
    public Calvary(String color, String name, String currentGridCellColor, ImageIcon gamePieceIcon) {
        super(color, name, currentGridCellColor, gamePieceIcon);
    }

    @Override
    void movement() {
        //movement of piece
    }
}
