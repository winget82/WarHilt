import java.awt.*;

public class Player {
    //This will be the object for the player(s) 1 or 2 player

    private Color playerColor;
    private int kingCountNumber = 1;
    private int archerCountNumber = 0;
    private int assassinCountNumber = 0;
    private int calvaryCountNumber = 0;
    private int clericCountNumber = 0;
    private int infantryCountNumber = 0;
    private int jesterCountNumber = 0;
    private int pawnCountNumber = 0;
    private int poleArmCountNumber = 0;
    private int queenCountNumber = 1;
    private int totalPieceNumber = 2;

    Player(Color playerColor) {
        this.playerColor = playerColor;
    };

    Player(Color playerColor, int archerCountNumber, int assassinCountNumber, int calvaryCountNumber,
                  int clericCountNumber, int infantryCountNumber, int jesterCountNumber, int pawnCountNumber,
                  int poleArmCountNumber) {
        this.playerColor = playerColor;
        this.archerCountNumber = archerCountNumber;
        this.assassinCountNumber = assassinCountNumber;
        this.calvaryCountNumber = calvaryCountNumber;
        this.clericCountNumber = clericCountNumber;
        this.infantryCountNumber = infantryCountNumber;
        this.jesterCountNumber = jesterCountNumber;
        this.pawnCountNumber = pawnCountNumber;
        this.poleArmCountNumber = poleArmCountNumber;
    }

    public int getTotalPieceNumber() {
        return this.archerCountNumber + this.assassinCountNumber + this.calvaryCountNumber + this.clericCountNumber
                + this.infantryCountNumber + this.jesterCountNumber + this.kingCountNumber + this.pawnCountNumber
                + this.poleArmCountNumber + this.queenCountNumber;
    }

    public void setPlayerColor(Color playerColor) {
        this.playerColor = playerColor;
    }

    public Color getPlayerColor() {
        return playerColor;
    }

    public int getArcherCountNumber() {
        return archerCountNumber;
    }

    public int getAssassinCountNumber() {
        return assassinCountNumber;
    }

    public int getCalvaryCountNumber() {
        return calvaryCountNumber;
    }

    public int getClericCountNumber() {
        return clericCountNumber;
    }

    public int getInfantryCountNumber() {
        return infantryCountNumber;
    }

    public int getJesterCountNumber() {
        return jesterCountNumber;
    }

    public int getKingCountNumber() {
        return kingCountNumber;
    }

    public int getPawnCountNumber() {
        return pawnCountNumber;
    }

    public int getPoleArmCountNumber() {
        return poleArmCountNumber;
    }

    public int getQueenCountNumber() {
        return queenCountNumber;
    }

    public void setArcherCountNumber(int archerCountNumber) {
        this.archerCountNumber = archerCountNumber;
    }

    public void setAssassinCountNumber(int assassinCountNumber) {
        this.assassinCountNumber = assassinCountNumber;
    }

    public void setCalvaryCountNumber(int calvaryCountNumber) {
        this.calvaryCountNumber = calvaryCountNumber;
    }

    public void setClericCountNumber(int clericCountNumber) {
        this.clericCountNumber = clericCountNumber;
    }

    public void setInfantryCountNumber(int infantryCountNumber) {
        this.infantryCountNumber = infantryCountNumber;
    }

    public void setJesterCountNumber(int jesterCountNumber) {
        this.jesterCountNumber = jesterCountNumber;
    }

    public void setKingCountNumber(int kingCountNumber) {
        this.kingCountNumber = kingCountNumber;
    }

    public void setPawnCountNumber(int pawnCountNumber) {
        this.pawnCountNumber = pawnCountNumber;
    }

    public void setPoleArmCountNumber(int poleArmCountNumber) {
        this.poleArmCountNumber = poleArmCountNumber;
    }

    public void setQueenCountNumber(int queenCountNumber) {
        this.queenCountNumber = queenCountNumber;
    }
}
