import javax.swing.*;

public abstract class GamePiece {

    //Attributes / Fields
    private String color;
    public String name;
    private Boolean isActive;
    private String currentGridCellColor;
    private Integer gamePieceId;//need to generate a unique ID for each game piece to be identified during game from 1-32
    private static Integer currentGamePieceId = 1;
    private ImageIcon icon;

    //Constructor
    public GamePiece(String color, String name, String currentGridCellColor, ImageIcon gamePieceIcon) {
        this.color = color;
        this.name = name;
        this.currentGridCellColor = currentGridCellColor;
        this.icon = gamePieceIcon;
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

    abstract void movement();
        //movement of piece, could be dependent on currentGridCellColor also, to simplify things

}
