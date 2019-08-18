public class Jester extends GamePiece {

    /*
    The Jester can only block pieces, it cannot capture or defeat a piece, but can move 3 squares in any combination of
    directions.  Up to two can be chosen per player to start game with.  If the jester makes it to the other end of the
    game board, it becomes an assassin.
    */

    //Attributes / Fields

    //Constructor
    public Jester(String color, String name, String currentGridCellColor) {
        super(color, name, currentGridCellColor);
    }

    @Override
    void movement() {
        //movement of piece
    }
}
