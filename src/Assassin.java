import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Assassin extends GamePiece
{

    //Attributes / Fields

    //Constructor
    public Assassin(String color, String name, String currentGridCellColor, String gridName)
    {
        super(color, name, currentGridCellColor, gridName);
    }

    @Override
    public Collection<BoardSquare> possibleMoves(GameBoard gameBoard)
    {
        //movement of piece

        /*
        The Assassin and Archer may "jump" over pieces.  The assassin jumps over one square and defeats pieces it jumps
        over, but it cannot land on another piece.  Only one can be used per player. The assassin can do up to a double jump
        */

        //get current square of piece
        BoardSquare location = this.getCurrentBoardSquare();

        //possible moves of piece
        List<BoardSquare> possibleMoves = new ArrayList<>();
        int[][] moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

        for(int[] move : moves) {
            int a = location.convertGrid()[0];//location.convertGrid() + gameBoard.getSquare(move[0], move[1])
            int b = location.convertGrid()[1];

            int c = a + move[0];
            int d = b + move[1];

            if ((c >= 0 && c <= 7) && (d >= 0 && d <= 7))
            {
                BoardSquare possibleMove = gameBoard.getSquare(c, d);
                possibleMoves.add(possibleMove);
            }
        }

        for (BoardSquare possibleMove : possibleMoves)
        {
            System.out.println("Possible move: " + possibleMove.getGridName());
        }

        return possibleMoves;
    }
}
