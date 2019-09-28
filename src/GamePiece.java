import javax.swing.*;

public abstract class GamePiece
{

    //Attributes / Fields
    private String color;
    public String name;
    private Boolean isActive;
    private String currentGridCellColor;
    private Integer gamePieceId;//need to generate a unique ID for each game piece to be identified during game from 1-32
    private static Integer currentGamePieceId = 1;
    private ImageIcon icon;
    private BoardSquare currentBoardSquare;

    //Constructor
    public GamePiece(String color, String name, String currentGridCellColor)
    {
        this.color = color;
        this.name = name;
        this.currentGridCellColor = currentGridCellColor;
        this.isActive = true;
        this.gamePieceId = currentGamePieceId++;
    }

    //Behaviors
    public Integer getGamePieceId() {
        return gamePieceId;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BoardSquare getCurrentBoardSquare() { return currentBoardSquare; }

    public ImageIcon getIcon() { return icon; }

    public void setIcon(ImageIcon icon) {this.icon = icon;}

    public void setCurrentBoardSquare(BoardSquare boardSquare) {
        this.currentBoardSquare = boardSquare;
    }

    abstract void possibleMoves();
        //possible moves of piece

    public void move()
    {
        //move piece, could be dependent on currentGridCellColor also, to simplify things
    }
}
