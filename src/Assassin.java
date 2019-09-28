import javax.swing.*;

public class Assassin extends GamePiece
{

    //Attributes / Fields

    //Constructor
    public Assassin(String color, String name, String currentGridCellColor)//, ImageIcon gamePieceIcon)
    {
        super(color, name, currentGridCellColor);//, gamePieceIcon);
    }

    @Override
    void possibleMoves()
    {
        //movement of piece

        /*
        The Assassin and Archer may "jump" over pieces.  The assassin jumps over one square and defeats pieces it jumps
        over, but it cannot land on another piece.  Only one can be used per player. The assassin can do up to a double jump
        */

        //get current square of piece
        //determine possible moves
    }
}
