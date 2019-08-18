public class Infantry extends GamePiece {

    /*
    The Infantry is like a Pawn except it can move 2 squares in any direction or combination of directions, but cannot
    move further than when it defeats another piece (it can only defeat one piece per turn).  Up to 2 can be chosen per
    player to start with.
    */

    //Attributes / Fields

    //Constructor
    public Infantry(String color, String name, String currentGridCellColor) {
        super(color, name, currentGridCellColor);
    }

    @Override
    void movement() {
        //movement of piece
    }
}
