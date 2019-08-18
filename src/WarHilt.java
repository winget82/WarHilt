//https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class WarHilt {

    //Concepted, written, and designed by Nathaniel Flesher 8/10/2019

    /*
    DO NOT UPLOAD THIS TO GITHUB, YOU WILL COPYRIGHT THIS GAME WHEN FINISHED AND 3D PRINT THE PIECES

    This game program will be to demo the game before finalizing it for production.
    */

    /*
    Game is played on an 8x8 board, styled like chess or checkers.
    This game will be a game somewhat of a mix between checkers and chess.  The player will be given a choice between
    pieces and allowed to choose a total of 16 game pieces to start with, but limited to only 2 pieces of each type.
    Only one King, one Queen, and one Assassin can be used though.  Up to 8 pawns maybe be chosen by each player.
    The object is to defeat the King similar to chess.  There will not be check or checkmate though.  You must simply
    defeat the king.  The next player does not get the opportunity to move the king out of what would be check, instead
    they lose the game.  The Assassin and Archer may "jump" over pieces.  The assassin jumps over one square and defeats
    pieces it jumps over, but it cannot land on another piece.  The Assassin can jump up to a double jump only.
    The Archer can jump and land on a piece up to 3 squares away.  When not
    jumping, the archer can only move one square in any direction per turn. The
    Calvary piece can defeat two game pieces directly in front of it (2 squares in front of it).  The Queen, &
    King move exactly like in chess.  The Cleric is like the Bishop in chess.  The pawn moves like a king in chess.
    The Infantry is like a Pawn except it can move 2 squares in any direction or combination of directions, but cannot
    move further than when it defeats another piece (it can only defeat one piece per turn).  The Jester can only block
    pieces, it cannot capture or defeat a piece, but can move 3 squares in any combination of directions.  If the jester
    makes it to the other end of the game board, it becomes and assassin.  This is the only way to obtain more than one
    assassin by a player in the game.  The polearm moves like the rook in chess. Player must choose one king.
     */

    public static void main(String[] args) {
        System.out.println("Welcome to War Hilt.  A simple war game.");

        GameBoard gameBoard = new GameBoard(Color.WHITE, Color.BLACK);

        //Make the Frame
        JFrame frame = new JFrame("War Hilt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        //Make the panel
        JPanel panel = new JPanel((new GridLayout(8,8)));

        //Make the MenuBar
        JMenuBar menuBar = new JMenuBar();

        //MenuBar File Menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        fileMenu.getAccessibleContext().setAccessibleDescription("This is the file menu for managing the file");
        menuBar.add(fileMenu);

        JMenuItem fileMenu_Open = new JMenuItem("Open", KeyEvent.VK_O);
        fileMenu_Open.getAccessibleContext().setAccessibleDescription("Open a saved file");
        fileMenu.add(fileMenu_Open);

        JMenuItem fileMenu_Save = new JMenuItem("Save", KeyEvent.VK_S);
        fileMenu_Save.getAccessibleContext().setAccessibleDescription("Save the current file");
        fileMenu.add(fileMenu_Save);

        JMenuItem fileMenu_Exit = new JMenuItem("Exit", KeyEvent.VK_E);
        fileMenu_Exit.getAccessibleContext().setAccessibleDescription("Exit the current file");
        fileMenu.add(fileMenu_Exit);

        //Options Menu
        JMenu optionsMenu = new JMenu("Options");
        optionsMenu.setMnemonic(KeyEvent.VK_T);
        optionsMenu.getAccessibleContext().setAccessibleDescription("This is the options menu for the game settings");

        JMenu optionsMenu_Colors = new JMenu("Colors");
        optionsMenu_Colors.getAccessibleContext().setAccessibleDescription("Color settings");
        optionsMenu.add(optionsMenu_Colors);

        JRadioButtonMenuItem whiteBlack = new JRadioButtonMenuItem("White & Black", true);
        optionsMenu_Colors.add(whiteBlack);
        JRadioButtonMenuItem redBlack = new JRadioButtonMenuItem("Red & Black", false);
        optionsMenu_Colors.add(redBlack);
        JRadioButtonMenuItem whiteBlue = new JRadioButtonMenuItem("White & Blue", false);
        optionsMenu_Colors.add(whiteBlue);

        //Make a Button Group for color settings
        ButtonGroup colorBG = new ButtonGroup();
        colorBG.add(whiteBlack);
        whiteBlack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameBoard.setColors(Color.WHITE, Color.BLACK);
                //method to set square colors because the above only sets board colors
                refreshSquareColors(gameBoard, Color.WHITE, Color.BLACK);
                drawButtons(gameBoard, panel);
            }
        });

        colorBG.add(redBlack);
        redBlack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameBoard.setColors(Color.RED, Color.BLACK);
                //method to set square colors because the above only sets board colors
                refreshSquareColors(gameBoard, Color.RED, Color.BLACK);
                drawButtons(gameBoard, panel);
            }
        });

        colorBG.add(whiteBlue);
        whiteBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameBoard.setColors(Color.WHITE, Color.BLUE);
                refreshSquareColors(gameBoard, Color.WHITE, Color.BLUE);
                //method to set square colors because the above only sets board colors
                drawButtons(gameBoard, panel);
            }
        });

        menuBar.add(optionsMenu);

        //Add MenuBar to the frame
        frame.setJMenuBar(menuBar);

        //Draw the game board
        WarHilt.drawButtons(gameBoard, panel);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.NORTH, menuBar);

        //Make frame visible
        frame.setVisible(true);
    }

    private static GameBoard drawButtons(GameBoard gameBoard, JPanel panel){
        //Add buttons to frame
        for(int i=0; i < 64; i++) {
            String buttonName = Integer.toString(i);
            JButton button = new JButton(buttonName);
            button.setName(buttonName);

            //Add buttons with correct color
            for (int row = 0; row < gameBoard.getBoard().length; row++){
                for (int col = 0; col < gameBoard.getBoard()[row].length; col++) {
                    if (button.getName().equals(gameBoard.getSquare(row, col).getGridId().toString())) {
                        String gridId = gameBoard.getSquare(row, col).getGridId().toString();
                        String gamePieceIdOnSquare = gameBoard.getSquare(row, col).getGamePieceIdOnSquare();
                        String gridName = gameBoard.getSquare(row, col).getGridName();
                        Color defaultColor = gameBoard.getSquare(row, col).getSquareColor();
                        button.setBackground(defaultColor);
                        System.out.println(gameBoard.getSquare(row, col).getSquareColor().toString());
                        button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                System.out.println();
                                System.out.println("gridId " + gridId + " was pressed.");
                                System.out.println("gamePieceIdOnSquare " + gamePieceIdOnSquare + " was pressed.");
                                System.out.println("gridName " + gridName + " was pressed.");
                                System.out.println("squareColor is " + defaultColor);

                                if (button.getBackground() == Color.cyan) {
                                    //change to normal color
                                    button.setBackground(defaultColor);
                                } else {
                                    button.setBackground(Color.cyan);
                                }
                            }
                        });
                    }
                    panel.add(button);
                }
            }
        }
        return gameBoard;
    }

    private static GameBoard refreshSquareColors(GameBoard gameBoard, Color color1, Color color2){
        for (int row = 0; row < gameBoard.getBoard().length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < gameBoard.getBoard()[row].length; col++) {
                    if (Integer.valueOf(gameBoard.getSquare(row, col).getGridId()) % 2 == 0) {
                        gameBoard.getSquare(row, col).setColor(color1);
                        System.out.println("gridId of square [" + row + "][" + col + "] is " + gameBoard.getSquare(row, col).getGridId());
                        System.out.println("color of refreshed square is " + gameBoard.getSquare(row, col).getSquareColor().toString());
                    } else if (Integer.valueOf(gameBoard.getSquare(row, col).getGridId()) % 2 == 1) {
                        gameBoard.getSquare(row, col).setColor(color2);
                        System.out.println("gridId of square [" + row + "][" + col + "] is " + gameBoard.getSquare(row, col).getGridId());
                        System.out.println("color of refreshed square is " + gameBoard.getSquare(row, col).getSquareColor().toString());
                    }
                }
            } else if (row % 2 == 1) {
                    for (int col = 0; col < gameBoard.getBoard()[row].length; col++) {
                        if (Integer.valueOf(gameBoard.getSquare(row, col).getGridId()) % 2 == 1) {
                            gameBoard.getSquare(row, col).setColor(color1);
                            System.out.println("gridId of square [" + row + "][" + col + "] is " + gameBoard.getSquare(row, col).getGridId());
                            System.out.println("color of refreshed square is " + gameBoard.getSquare(row, col).getSquareColor().toString());
                        } else  if (Integer.valueOf(gameBoard.getSquare(row, col).getGridId()) % 2 == 0) {
                            gameBoard.getSquare(row, col).setColor(color2);
                            System.out.println("gridId of square [" + row + "][" + col + "] is " + gameBoard.getSquare(row, col).getGridId());
                            System.out.println("color of refreshed square is " + gameBoard.getSquare(row, col).getSquareColor().toString());
                        }
                    }
            }
        }
        return gameBoard;
        /*this is updating the color of the game board squares, but need to actually change previous buttons rather than
        drawing new additional ones below.  Also need to change the logic because evens and odds make a straight line of
        the same color rather than staggering it.  You wrote notes about this somewhere.  Look them up B&W grid paper.
        */
    }
}
