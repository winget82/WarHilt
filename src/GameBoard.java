import java.awt.*;

public class GameBoard
{

    //Attributes / Fields
    Color color1;
    Color color2;
    BoardSquare[][] board = new BoardSquare[8][8];

    //Constructor
    public GameBoard(Color color1, Color color2)
    {

        //Row 8
        board[0][0] = new BoardSquare(color1,"a8", 0);
        board[0][1] = new BoardSquare(color2,"b8", 1);
        board[0][2] = new BoardSquare(color1,"c8", 2);
        board[0][3] = new BoardSquare(color2,"d8", 3);
        board[0][4] = new BoardSquare(color1,"e8", 4);
        board[0][5] = new BoardSquare(color2,"f8", 5);
        board[0][6] = new BoardSquare(color1,"g8", 6);
        board[0][7] = new BoardSquare(color2,"h8", 7);

        //Row 7
        board[1][0] = new BoardSquare(color2,"a7", 8);
        board[1][1] = new BoardSquare(color1,"b7", 9);
        board[1][2] = new BoardSquare(color2,"c7", 10);
        board[1][3] = new BoardSquare(color1,"d7", 11);
        board[1][4] = new BoardSquare(color2,"e7", 12);
        board[1][5] = new BoardSquare(color1,"f7", 13);
        board[1][6] = new BoardSquare(color2,"g7", 14);
        board[1][7] = new BoardSquare(color1,"h7", 15);

        //Row 6
        board[2][0] = new BoardSquare(color1,"a6", 16);
        board[2][1] = new BoardSquare(color2,"b6", 17);
        board[2][2] = new BoardSquare(color1,"c6", 18);
        board[2][3] = new BoardSquare(color2,"d6", 19);
        board[2][4] = new BoardSquare(color1,"e6", 20);
        board[2][5] = new BoardSquare(color2,"f6", 21);
        board[2][6] = new BoardSquare(color1,"g6", 22);
        board[2][7] = new BoardSquare(color2,"h6", 23);

        //Row 5
        board[3][0] = new BoardSquare(color2,"a5", 24);
        board[3][1] = new BoardSquare(color1,"b5", 25);
        board[3][2] = new BoardSquare(color2,"c5", 26);
        board[3][3] = new BoardSquare(color1,"d5", 27);
        board[3][4] = new BoardSquare(color2,"e5", 28);
        board[3][5] = new BoardSquare(color1,"f5", 29);
        board[3][6] = new BoardSquare(color2,"g5", 30);
        board[3][7] = new BoardSquare(color1,"h5", 31);

        //Row 4
        board[4][0] = new BoardSquare(color1,"a4", 32);
        board[4][1] = new BoardSquare(color2,"b4", 33);
        board[4][2] = new BoardSquare(color1,"c4", 34);
        board[4][3] = new BoardSquare(color2,"d4", 35);
        board[4][4] = new BoardSquare(color1,"e4", 36);
        board[4][5] = new BoardSquare(color2,"f4", 37);
        board[4][6] = new BoardSquare(color1,"g4", 38);
        board[4][7] = new BoardSquare(color2,"h4", 39);

        //Row 3
        board[5][0] = new BoardSquare(color2,"a3", 40);
        board[5][1] = new BoardSquare(color1,"b3", 41);
        board[5][2] = new BoardSquare(color2,"c3", 42);
        board[5][3] = new BoardSquare(color1,"d3", 43);
        board[5][4] = new BoardSquare(color2,"e3", 44);
        board[5][5] = new BoardSquare(color1,"f3", 45);
        board[5][6] = new BoardSquare(color2,"g3", 46);
        board[5][7] = new BoardSquare(color1,"h3", 47);

        //Row 2
        board[6][0] = new BoardSquare(color1,"a2", 48);
        board[6][1] = new BoardSquare(color2,"b2", 49);
        board[6][2] = new BoardSquare(color1,"c2", 50);
        board[6][3] = new BoardSquare(color2,"d2", 51);
        board[6][4] = new BoardSquare(color1,"e2", 52);
        board[6][5] = new BoardSquare(color2,"f2", 53);
        board[6][6] = new BoardSquare(color1,"g2", 54);
        board[6][7] = new BoardSquare(color2,"h2", 55);

        //Row 1
        board[7][0] = new BoardSquare(color2,"a1", 56);
        board[7][1] = new BoardSquare(color1,"b1", 57);
        board[7][2] = new BoardSquare(color2,"c1", 58);
        board[7][3] = new BoardSquare(color1,"d1", 59);
        board[7][4] = new BoardSquare(color2,"e1", 60);
        board[7][5] = new BoardSquare(color1,"f1", 61);
        board[7][6] = new BoardSquare(color2,"g1", 62);
        board[7][7] = new BoardSquare(color1,"h1", 63);

    }

    public BoardSquare[][] getBoard() {
        return board;
    }

    public BoardSquare getSquare(int row, int column){
        return board[row][column];
    }

    public void setColors(Color color1, Color color2)
    {
        this.color1 = color1;
        this.color2 = color2;
    }

    /*can access the squares color or gridname, etc like this:
    GameBoard.getSquare(1,3).getColor()
    GameBoard.getSquare(1,3).getGridName()
    GameBoard.getSquare(1,3).setOccupied()
    */

    /*
    SEE THIS FOR IDEAS OF HOW TO GET MOVES
    https://impythonist.wordpress.com/2017/01/01/modeling-a-chessboard-and-mechanics-of-its-pieces-in-python/
     */
}
