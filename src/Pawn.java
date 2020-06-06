import javax.swing.*;
import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Pawn extends GamePiece
{

    //Attributes / Fields

    //Constructor
    public Pawn(String color, String name, String currentGridCellColor, String gridName)
    {
        super(color, name, currentGridCellColor, gridName);
    }

    @Override
    public Collection<BoardSquare> possibleMoves(GameBoard gameBoard)
    {
        //movement of piece

        /*
        The pawn moves like king in chess.  Up to 8 can be chosen to start with.  Nothing is awarded for making it to the
        other end of board.
        */

        //get current square of piece
        BoardSquare location = this.getCurrentBoardSquare();

        //determine possible moves
        /*
        Something to the effect of
        [row-1, col], [row+1, col], [row, col-1], [row, col+1]
        [row-1, col-1], [row-1, col+1], [row+1, col-1], [row+1, col+1]
         */

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
