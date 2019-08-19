import java.awt.*;

public class BoardSquare {

    ////Attributes / Fields
    //private String color = "White";
    private String gridName = "square";
    private Boolean isOccupied;
    private String gamePieceIdOnSquare;
    private Integer gridId;
    private Color color;

    //Constructor
    public BoardSquare(Color color, String gridName, Integer gridId) {
        this.color = color;
        this.gridName = gridName;
        this.gridId = gridId;
        this.isOccupied = false;

    }

    public Color getSquareColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getGridName() {
        return gridName;
    }

    public void setGridName(String gridName) {
        this.gridName = gridName;
    }

    public Boolean getIsOccupied() {
        return isOccupied;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }

    public String getGamePieceIdOnSquare() {
        return gamePieceIdOnSquare;
    }

    public void setGamePieceIdOnSquare(String gamePieceId) {
        this.gamePieceIdOnSquare = gamePieceId;
    }

    public Integer getGridId() {
        return gridId;
    }

    public void setGridId(Integer gridId) {
        this.gridId = gridId;
    }
    /*
    public String getGamePieceNameByIdOnSquare(String gamePieceIdOnSquare, GamePiece gamePiece) {
        //figure out some logic here to return the name of the gamePiece by its ID using the ID of the game piece on the square
    }
    */
}
