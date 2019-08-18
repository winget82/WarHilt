public class Archer extends GamePiece {

    /*
    The Archer can jump and land on a piece up to 3 squares away in any direction.  When not jumping, it can only move
    one square in any direction per turn.  Up to 2 can be chosen to start with.
    */

    //Attributes / Fields

    //Constructor
    public Archer(String color, String name, String currentGridCellColor) {
        super(color, name, currentGridCellColor);
    }

    @Override
    void movement() {
        //movement of piece
    }
}
