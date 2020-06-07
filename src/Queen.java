import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Queen extends GamePiece
{

    //Attributes / Fields

    //Constructor
    public Queen(String color, String name, String currentGridCellColor, String gridName)
    {
        super(color, name, currentGridCellColor, gridName);
    }

    @Override
    public Collection<BoardSquare> possibleMoves(GameBoard gameBoard)
    {
        //movement of piece

        /*
        The Queen moves like the Queen in chess.  Only one can be chosen per player for the game.
        */

        //get current square of piece
        BoardSquare location = this.getCurrentBoardSquare();

        //determine possible moves
        /*
        utilize moves from polearm and cleric (rook and bishop)
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

        for (int i = 0; i<=7; i++)
        {
            int c = a + i;
            int d = b;

            if ((c >= 0 && c <= 7) && (d >= 0 && d <= 7))
            {
                BoardSquare possibleMove = gameBoard.getSquare(c, d);
                possibleMoves.add(possibleMove);
            }
        }

        for (int i = 0; i<=7; i++) {
            int c = a - i;
            int d = b;

            if ((c >= 0 && c <= 7) && (d >= 0 && d <= 7)) {
                BoardSquare possibleMove = gameBoard.getSquare(c, d);
                possibleMoves.add(possibleMove);
            }
        }

        for (int i = 0; i<=7; i++)
        {
            int c = a;
            int d = b + i;

            if ((c >= 0 && c <= 7) && (d >= 0 && d <= 7))
            {
                BoardSquare possibleMove = gameBoard.getSquare(c, d);
                possibleMoves.add(possibleMove);
            }
        }

        for (int i = 0; i<=7; i++) {
            int c = a;
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
