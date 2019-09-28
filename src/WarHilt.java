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

    public static void main(String[] args)
    {
        System.out.println("Welcome to War Hilt.  A simple war game.");

        GameBoard gameBoard = new GameBoard(Color.WHITE, Color.BLACK);

        //Make the Frame
        JFrame frame = new JFrame("War Hilt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setMinimumSize(new Dimension(600, 600));

        //Make the panel
        JPanel panel = new JPanel((new GridLayout(8,8)));

        //Make the MenuBar
        JMenuBar menuBar = new JMenuBar();

        //MenuBar File Menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        fileMenu.getAccessibleContext().setAccessibleDescription("This is the file menu for managing the file");
        menuBar.add(fileMenu);

        JMenuItem fileMenu_NewGame = new JMenuItem("New Game", KeyEvent.VK_N);
        fileMenu_NewGame.getAccessibleContext().setAccessibleDescription("Start a new game");
        fileMenu_NewGame.setToolTipText("Start a new game");
        fileMenu_NewGame.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                //NEED TO SET UP A WINDOW HERE FOR PLAYER TO CHOOSE THEIR COLOR
                Player player1 = new Player(Color.BLACK);
                //THEN INITIATE NEXT WINDOW WITH STUFF BELOW THIS POINT (EVENTUALLY SEPARATE THESE WINDOWS
                //INTO SEPARATE CLASSES)...

                int totalPieceCount = 2;

                JFrame newGameSetUpFrame1 = new JFrame("New Game Set Up - Player 1");
                newGameSetUpFrame1.setSize(250, 350);
                newGameSetUpFrame1.setMinimumSize(new Dimension(250, 350));

                JPanel newGameSetUpPanel = new JPanel(new GridBagLayout());
                GridBagConstraints c = new GridBagConstraints();

                JLabel kingCountLabel = new JLabel("King:");
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 0;
                newGameSetUpPanel.add(kingCountLabel, c);

                JLabel kingCount = new JLabel(Integer.valueOf(player1.getKingCountNumber()).toString());
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 1;
                c.gridy = 0;
                newGameSetUpPanel.add(kingCount, c);

                JLabel kingCountResult = new JLabel(Integer.valueOf(player1.getKingCountNumber()).toString());
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 2;
                c.gridy = 0;
                newGameSetUpPanel.add(kingCountResult, c);

                JLabel archerCount = new JLabel("Archers:");
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 1;
                newGameSetUpPanel.add(archerCount, c);

                JTextField archerCountTextField = new JTextField(3);
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 1;
                c.gridy = 1;
                newGameSetUpPanel.add(archerCountTextField, c);

                JLabel archerCountResult = new JLabel(Integer.valueOf(player1.getArcherCountNumber()).toString());
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 2;
                c.gridy = 1;
                newGameSetUpPanel.add(archerCountResult, c);

                JLabel assassinCount = new JLabel("Assassins:");
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 2;
                newGameSetUpPanel.add(assassinCount, c);

                JTextField assassinCountTextField = new JTextField(3);
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 1;
                c.gridy = 2;
                newGameSetUpPanel.add(assassinCountTextField, c);

                JLabel assassinCountResult = new JLabel(Integer.valueOf(player1.getAssassinCountNumber()).toString());
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 2;
                c.gridy = 2;
                newGameSetUpPanel.add(assassinCountResult, c);

                JLabel calvaryCount = new JLabel("Calvary:");
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 3;
                newGameSetUpPanel.add(calvaryCount, c);

                JTextField calvaryCountTextField = new JTextField(3);
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 1;
                c.gridy = 3;
                newGameSetUpPanel.add(calvaryCountTextField, c);

                JLabel calvaryCountResult = new JLabel(Integer.valueOf(player1.getCalvaryCountNumber()).toString());
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 2;
                c.gridy = 3;
                newGameSetUpPanel.add(calvaryCountResult, c);

                JLabel clericCount = new JLabel("Clerics:");
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 4;
                newGameSetUpPanel.add(clericCount, c);

                JTextField clericCountTextField = new JTextField(3);
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 1;
                c.gridy = 4;
                newGameSetUpPanel.add(clericCountTextField, c);

                JLabel clericCountResult = new JLabel(Integer.valueOf(player1.getClericCountNumber()).toString());
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 2;
                c.gridy = 4;
                newGameSetUpPanel.add(clericCountResult, c);

                JLabel infantryCount = new JLabel("Infantry:");
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 5;
                newGameSetUpPanel.add(infantryCount, c);

                JTextField infantryCountTextField = new JTextField(3);
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 1;
                c.gridy = 5;
                newGameSetUpPanel.add(infantryCountTextField, c);

                JLabel infantryCountResult = new JLabel(Integer.valueOf(player1.getInfantryCountNumber()).toString());
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 2;
                c.gridy = 5;
                newGameSetUpPanel.add(infantryCountResult, c);

                JLabel jesterCount = new JLabel("Jesters:");
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 6;
                newGameSetUpPanel.add(jesterCount, c);

                JTextField jesterCountTextField = new JTextField(3);
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 1;
                c.gridy = 6;
                newGameSetUpPanel.add(jesterCountTextField, c);

                JLabel jesterCountResult = new JLabel(Integer.valueOf(player1.getJesterCountNumber()).toString());
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 2;
                c.gridy = 6;
                newGameSetUpPanel.add(jesterCountResult, c);

                JLabel pawnCount = new JLabel("Pawns:");
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 7;
                newGameSetUpPanel.add(pawnCount, c);

                JTextField pawnCountTextField = new JTextField(3);
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 1;
                c.gridy = 7;
                newGameSetUpPanel.add(pawnCountTextField, c);

                JLabel pawnCountResult = new JLabel(Integer.valueOf(player1.getPawnCountNumber()).toString());
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 2;
                c.gridy = 7;
                newGameSetUpPanel.add(pawnCountResult, c);

                JLabel poleArmCount = new JLabel("Pole Arms:");
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 8;
                newGameSetUpPanel.add(poleArmCount, c);

                JTextField poleArmCountTextField = new JTextField(3);
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 1;
                c.gridy = 8;
                newGameSetUpPanel.add(poleArmCountTextField, c);

                JLabel poleArmCountResult = new JLabel(Integer.valueOf(player1.getPoleArmCountNumber()).toString());
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 2;
                c.gridy = 8;
                newGameSetUpPanel.add(poleArmCountResult, c);

                JLabel queenCountLabel = new JLabel("Queen:");
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 9;
                newGameSetUpPanel.add(queenCountLabel, c);

                JLabel queenCount = new JLabel(Integer.valueOf(player1.getQueenCountNumber()).toString());
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 1;
                c.gridy = 9;
                newGameSetUpPanel.add(queenCount, c);

                JLabel queenCountResult = new JLabel(Integer.valueOf(player1.getQueenCountNumber()).toString());
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 2;
                c.gridy = 9;
                newGameSetUpPanel.add(queenCountResult, c);

                JLabel totalPieceCountLabel = new JLabel("Total:");
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 11;
                newGameSetUpPanel.add(totalPieceCountLabel, c);

                JLabel totalPieceCountLabel2 = new JLabel(Integer.valueOf(player1.getTotalPieceNumber()).toString());
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 2;
                c.gridy = 11;
                newGameSetUpPanel.add(totalPieceCountLabel2, c);

                JLabel note = new JLabel("  (16 pieces total)  ");
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = 12;
                newGameSetUpPanel.add(note, c);

                //Handle action events of text fields
                archerCountTextField.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        archerCountResult.setText(archerCountTextField.getText());
                        player1.setArcherCountNumber(Integer.parseInt(archerCountTextField.getText()));
                        totalPieceCountLabel2.setText(Integer.valueOf(player1.getTotalPieceNumber()).toString());
                    }
                });

                assassinCountTextField.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        assassinCountResult.setText(assassinCountTextField.getText());
                        player1.setAssassinCountNumber(Integer.parseInt(assassinCountTextField.getText()));
                        totalPieceCountLabel2.setText(Integer.valueOf(player1.getTotalPieceNumber()).toString());
                    }
                });

                calvaryCountTextField.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        calvaryCountResult.setText(calvaryCountTextField.getText());
                        player1.setCalvaryCountNumber(Integer.parseInt(calvaryCountTextField.getText()));
                        totalPieceCountLabel2.setText(Integer.valueOf(player1.getTotalPieceNumber()).toString());
                    }
                });

                clericCountTextField.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        clericCountResult.setText(clericCountTextField.getText());
                        player1.setClericCountNumber(Integer.parseInt(clericCountTextField.getText()));
                        totalPieceCountLabel2.setText(Integer.valueOf(player1.getTotalPieceNumber()).toString());
                    }
                });

                infantryCountTextField.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        infantryCountResult.setText(infantryCountTextField.getText());
                        player1.setInfantryCountNumber(Integer.parseInt(infantryCountTextField.getText()));
                        totalPieceCountLabel2.setText(Integer.valueOf(player1.getTotalPieceNumber()).toString());
                    }
                });

                jesterCountTextField.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        jesterCountResult.setText(jesterCountTextField.getText());
                        player1.setJesterCountNumber(Integer.parseInt(jesterCountTextField.getText()));
                        totalPieceCountLabel2.setText(Integer.valueOf(player1.getTotalPieceNumber()).toString());
                    }
                });

                pawnCountTextField.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        pawnCountResult.setText(pawnCountTextField.getText());
                        player1.setPawnCountNumber(Integer.parseInt(pawnCountTextField.getText()));
                        totalPieceCountLabel2.setText(Integer.valueOf(player1.getTotalPieceNumber()).toString());
                    }
                });

                poleArmCountTextField.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        poleArmCountResult.setText(poleArmCountTextField.getText());
                        player1.setPoleArmCountNumber(Integer.parseInt(poleArmCountTextField.getText()));
                        totalPieceCountLabel2.setText(Integer.valueOf(player1.getTotalPieceNumber()).toString());
                    }
                });

                newGameSetUpFrame1.getContentPane().add(BorderLayout.CENTER, newGameSetUpPanel);
                newGameSetUpFrame1.setVisible(true);
            }
        });

        fileMenu.add(fileMenu_NewGame);

        JMenuItem fileMenu_Open = new JMenuItem("Open", KeyEvent.VK_O);
        fileMenu_Open.getAccessibleContext().setAccessibleDescription("Open a saved game");
        fileMenu_Open.setToolTipText("Open a saved game");
        fileMenu.add(fileMenu_Open);

        JMenuItem fileMenu_Save = new JMenuItem("Save", KeyEvent.VK_S);
        fileMenu_Save.getAccessibleContext().setAccessibleDescription("Save the current game");
        fileMenu_Save.setToolTipText("Save the current game");
        fileMenu.add(fileMenu_Save);

        JMenuItem fileMenu_Exit = new JMenuItem("Exit", KeyEvent.VK_E);
        fileMenu_Exit.getAccessibleContext().setAccessibleDescription("Exit the game");
        fileMenu_Exit.setToolTipText("Exit the game");
        fileMenu_Exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(fileMenu_Exit);

        //Options Menu
        JMenu optionsMenu = new JMenu("Options");
        optionsMenu.setMnemonic(KeyEvent.VK_T);
        optionsMenu.getAccessibleContext().setAccessibleDescription("This is the options menu for the game settings");

        JMenu optionsMenu_Colors = new JMenu("Colors");
        optionsMenu_Colors.getAccessibleContext().setAccessibleDescription("Color settings");
        optionsMenu_Colors.setToolTipText("Change colors of game");
        optionsMenu.add(optionsMenu_Colors);

        JRadioButtonMenuItem whiteBlack = new JRadioButtonMenuItem("White & Black", true);
        optionsMenu_Colors.add(whiteBlack);
        JRadioButtonMenuItem redBlack = new JRadioButtonMenuItem("Red & Black", false);
        optionsMenu_Colors.add(redBlack);
        JRadioButtonMenuItem whiteBlue = new JRadioButtonMenuItem("White & Blue", false);
        optionsMenu_Colors.add(whiteBlue);
        JRadioButtonMenuItem whiteGreen = new JRadioButtonMenuItem("White & Green", false);
        optionsMenu_Colors.add(whiteGreen);
        JRadioButtonMenuItem greenBlack = new JRadioButtonMenuItem("Green & Black", false);
        optionsMenu_Colors.add(greenBlack);
        JRadioButtonMenuItem grayBlack = new JRadioButtonMenuItem("Gray & Black", false);
        optionsMenu_Colors.add(grayBlack);
        JRadioButtonMenuItem goldPurple = new JRadioButtonMenuItem("Gold & Purple", false);
        optionsMenu_Colors.add(goldPurple);
        JRadioButtonMenuItem slate = new JRadioButtonMenuItem("Slate Theme", false);
        optionsMenu_Colors.add(slate);
        JRadioButtonMenuItem brown = new JRadioButtonMenuItem("Brown Theme", false);
        optionsMenu_Colors.add(brown);

        //Make a Button Group for color settings
        ButtonGroup colorBG = new ButtonGroup();

        colorBG.add(whiteBlack);
        whiteBlack.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gameBoard.setColors(Color.WHITE, Color.BLACK);
                refreshSquareColors(gameBoard, Color.WHITE, Color.BLACK, panel);
                drawButtons(gameBoard, panel);
            }
        });

        colorBG.add(redBlack);
        redBlack.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gameBoard.setColors(Color.RED, Color.BLACK);
                refreshSquareColors(gameBoard, Color.RED, Color.BLACK, panel);
                drawButtons(gameBoard, panel);
            }
        });

        colorBG.add(whiteBlue);
        whiteBlue.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gameBoard.setColors(Color.WHITE, Color.BLUE);
                refreshSquareColors(gameBoard, Color.WHITE, Color.BLUE, panel);
                drawButtons(gameBoard, panel);
            }
        });

        colorBG.add(whiteGreen);
        whiteGreen.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gameBoard.setColors(Color.WHITE, new Color(0, 100, 0));
                refreshSquareColors(gameBoard, Color.WHITE, new Color(0, 100, 0), panel);
                drawButtons(gameBoard, panel);
            }
        });

        colorBG.add(greenBlack);
        greenBlack.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gameBoard.setColors(new Color(0, 100, 0), Color.BLACK);
                refreshSquareColors(gameBoard, new Color(0, 100, 0), Color.BLACK, panel);
                drawButtons(gameBoard, panel);
            }
        });

        colorBG.add(grayBlack);
        grayBlack.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gameBoard.setColors(new Color(192, 192, 192), Color.BLACK);
                refreshSquareColors(gameBoard, new Color(192, 192, 192), Color.BLACK, panel);
                drawButtons(gameBoard, panel);
            }
        });

        colorBG.add(goldPurple);
        goldPurple.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gameBoard.setColors(new Color(218, 165, 32), new Color(128, 0, 128));
                refreshSquareColors(gameBoard, new Color(218, 165, 32), new Color(128, 0, 128), panel);
                drawButtons(gameBoard, panel);
            }
        });

        colorBG.add(slate);
        slate.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gameBoard.setColors(new Color(240, 248, 255), new Color(47, 79, 79));
                refreshSquareColors(gameBoard, new Color(240, 248, 255), new Color(47, 79, 79), panel);
                drawButtons(gameBoard, panel);
            }
        });

        colorBG.add(brown);
        brown.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gameBoard.setColors(new Color(238, 232, 170), new Color(165, 42, 42));
                refreshSquareColors(gameBoard, new Color(238, 232, 170), new Color(165, 42, 42), panel);
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

    private static GameBoard drawButtons(GameBoard gameBoard, JPanel panel)
    {

        //Add buttons to frame
        for(int i=0; i < 64; i++)
        {
            String buttonName = Integer.toString(i);

            //Icon testing
            //ImageIcon king = new ImageIcon("./icons/pieces/black/kingT_40px_h.png");
            King king = new King("black", "king","black");
            king.setIcon(new ImageIcon(getImageIconPath(king)));

            //This will probably need to be in the loop the game board is drawn in
            JButton button = new JButton(buttonName, king.getIcon());
            // this will need to set the GamePiece.icon for each piece chosen dependent on colors chosen
            //probably here in main code not in the individual pieces

            button.setName(buttonName);

            //Add buttons with correct color
            for (int row = 0; row < gameBoard.getBoard().length; row++)
            {
                for (int col = 0; col < gameBoard.getBoard()[row].length; col++)
                {
                    if (button.getName().equals(gameBoard.getSquare(row, col).getGridId().toString()))
                    {
                        String gridId = gameBoard.getSquare(row, col).getGridId().toString();
                        String gamePieceIdOnSquare = gameBoard.getSquare(row, col).getGamePieceIdOnSquare();
                        String gridName = gameBoard.getSquare(row, col).getGridName();
                        Color defaultColor = gameBoard.getSquare(row, col).getSquareColor();
                        button.setBackground(defaultColor);
                        /*
                        Have tool tip to tell you the name of the game piece on the current square along with grid name
                        button.setToolTipText(gameBoard.getSquare(row, col).getGamePieceNameByIdOnSquare());
                        */
                        button.setToolTipText(gameBoard.getSquare(row, col).getGridName());

                        System.out.println(gameBoard.getSquare(row, col).getSquareColor().toString());
                        button.addActionListener(new ActionListener()
                        {
                            @Override
                            public void actionPerformed(ActionEvent e)
                            {
                                System.out.println();
                                System.out.println("gridId " + gridId + " was pressed.");
                                System.out.println("gamePieceIdOnSquare " + gamePieceIdOnSquare + " was pressed.");
                                System.out.println("gridName " + gridName + " was pressed.");
                                System.out.println("squareColor is " + defaultColor);

                                if (button.getBackground() == Color.cyan)
                                {
                                    //change to normal color
                                    button.setBackground(defaultColor);
                                }
                                else
                                {
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

    private static GameBoard refreshSquareColors(GameBoard gameBoard, Color color1, Color color2, JPanel panel)
    {

        panel.removeAll();

        for (int row = 0; row < gameBoard.getBoard().length; row++)
        {
            if (row % 2 == 0)
            {
                for (int col = 0; col < gameBoard.getBoard()[row].length; col++)
                {
                    if (Integer.valueOf(gameBoard.getSquare(row, col).getGridId()) % 2 == 0)
                    {
                        gameBoard.getSquare(row, col).setColor(color1);
                        System.out.println("gridId of square [" + row + "][" + col + "] is " + gameBoard.getSquare(row, col).getGridId());
                        System.out.println("color of refreshed square is " + gameBoard.getSquare(row, col).getSquareColor().toString());
                    }
                    else if (Integer.valueOf(gameBoard.getSquare(row, col).getGridId()) % 2 == 1)
                    {
                        gameBoard.getSquare(row, col).setColor(color2);
                        System.out.println("gridId of square [" + row + "][" + col + "] is " + gameBoard.getSquare(row, col).getGridId());
                        System.out.println("color of refreshed square is " + gameBoard.getSquare(row, col).getSquareColor().toString());
                    }
                }
            }
            else if (row % 2 == 1)
            {
                for (int col = 0; col < gameBoard.getBoard()[row].length; col++)
                {
                    if (Integer.valueOf(gameBoard.getSquare(row, col).getGridId()) % 2 == 1)
                    {
                        gameBoard.getSquare(row, col).setColor(color1);
                        System.out.println("gridId of square [" + row + "][" + col + "] is " + gameBoard.getSquare(row, col).getGridId());
                        System.out.println("color of refreshed square is " + gameBoard.getSquare(row, col).getSquareColor().toString());
                    }
                    else  if (Integer.valueOf(gameBoard.getSquare(row, col).getGridId()) % 2 == 0)
                    {
                        gameBoard.getSquare(row, col).setColor(color2);
                        System.out.println("gridId of square [" + row + "][" + col + "] is " + gameBoard.getSquare(row, col).getGridId());
                        System.out.println("color of refreshed square is " + gameBoard.getSquare(row, col).getSquareColor().toString());
                    }
                }
            }
            panel.revalidate();
            panel.repaint();
        }
        return gameBoard;
    }

    public static String getImageIconPath(GamePiece gamePiece)
    {
        //get the path to image icon dependent on colors chosen and piece name
        return "./icons/pieces/" + gamePiece.getColor() + "/" + gamePiece.name + "T_40px_h.png";
    }

}
