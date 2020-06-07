import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Calvary extends GamePiece
{

    //Attributes / Fields

    //Constructor
    public Calvary(String color, String name, String currentGridCellColor, String gridName)
    {
        super(color, name, currentGridCellColor, gridName);
    }

    @Override
    public Collection<BoardSquare> possibleMoves(GameBoard gameBoard)
    {
        //movement of piece

        /*
        The Calvary piece can defeat two game pieces directly in front of it (2 squares in front of it). 2 can be chosen per
        player.  It can only move forward up to two squares.  Once it is moved to the end of the
        board it becomes an Infantry piece.
        */

        //get current square of piece
        BoardSquare location = this.getCurrentBoardSquare();

        //determine possible moves
        /*
        Something to the effect of
        [row-2, col] or [row+2, col]
         */
        //possible moves of piece
        List<BoardSquare> possibleMoves = new ArrayList<>();
        int[][] moves = {{-2, 0}, {2, 0}, {-1, 0}, {1, 0}};

        //will need to update this depending on which player or side of the board started on

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
