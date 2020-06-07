import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Cleric extends GamePiece
{

    //Attributes / Fields

    //Constructor
    public Cleric(String color, String name, String currentGridCellColor, String gridName)
    {
        super(color, name, currentGridCellColor, gridName);
    }

    @Override
    public Collection<BoardSquare> possibleMoves(GameBoard gameBoard)
    {
        //movement of piece

        /*
        The Cleric is like the Bishop in chess.  Two can be chosen per player.
        */

        //get current square of piece
        BoardSquare location = this.getCurrentBoardSquare();

        //determine possible moves
        /*
        Something to the effect of (while less than gameboard size and >= 0)
        [row-1, col+1], [row+1, col+1], [row-1, col-1], [row+1, col-1]
         */

        //possible moves of piece
        List<BoardSquare> possibleMoves = new ArrayList<>();

        int a = location.convertGrid()[0];//location.convertGrid() + gameBoard.getSquare(move[0], move[1])
        int b = location.convertGrid()[1];

        for (int i = 0; i<=7; i++)
        {
            int c = a + i;
            int d = b + i;

            if ((c >= 0 && c <= 7) && (d >= 0 && d <= 7))
            {
                BoardSquare possibleMove = gameBoard.getSquare(c, d);
                possibleMoves.add(possibleMove);
            }
        }

        for (int i = 0; i<=7; i++) {
            int c = a - i;
            int d = b - i;

            if ((c >= 0 && c <= 7) && (d >= 0 && d <= 7)) {
                BoardSquare possibleMove = gameBoard.getSquare(c, d);
                possibleMoves.add(possibleMove);
            }
        }

        for (int i = 0; i<=7; i++)
        {
            int c = a - i;
            int d = b + i;

            if ((c >= 0 && c <= 7) && (d >= 0 && d <= 7))
            {
                BoardSquare possibleMove = gameBoard.getSquare(c, d);
                possibleMoves.add(possibleMove);
            }
        }

        for (int i = 0; i<=7; i++) {
            int c = a + i;
            int d = b - i;

            if ((c >= 0 && c <= 7) && (d >= 0 && d <= 7)) {
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
