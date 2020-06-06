import java.awt.*;

public class BoardSquare
{

    ////Attributes / Fields
    //private String color = "White";
    private String gridName = "square";
    private Boolean isOccupied;
    private Integer gamePieceIdOnSquare;
    private String gamePieceNameOnSquare;
    private Integer gridId;
    private Color color;

    //Constructor
    public BoardSquare(Color color, String gridName, Integer gridId)
    {
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

    public Integer getGamePieceIdOnSquare() {
        return gamePieceIdOnSquare;
    }

    public void setGamePieceIdOnSquare(Integer gamePieceIdOnSquare) {
        this.gamePieceIdOnSquare = gamePieceIdOnSquare;
    }

    public Integer getGridId() {
        return gridId;
    }

    public void setGridId(Integer gridId) {
        this.gridId = gridId;
    }

    public String getGamePieceNameOnSquare()
    {
        return gamePieceNameOnSquare;
    }

    public void setGamePieceNameOnSquare(String gamePieceNameOnSquare) {
        this.gamePieceNameOnSquare = gamePieceNameOnSquare;
    }
}
