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

    public int[] convertGrid(){
        int[] grid = new int[2];
        int a=0,b=1,c=2,d=3,e=4,f=5,g=6,h=7;
        int alphaNum = 0, gridInt = 0;
        char alpha = gridName.charAt(0);
        int num = Character.getNumericValue(gridName.charAt(1));

        //Alpha
        if (alpha == 'a')
        {
            alphaNum = a;
        }
        else if (alpha == 'b')
        {
            alphaNum = b;
        }
        else if (alpha == 'c')
        {
            alphaNum = c;
        }
        else if (alpha == 'd')
        {
            alphaNum = d;
        }
        else if (alpha == 'e')
        {
            alphaNum = e;
        }
        else if (alpha == 'f')
        {
            alphaNum = f;
        }
        else if (alpha == 'g')
        {
            alphaNum = g;
        }
        else
        {
            alphaNum = h;
        }

        grid[1] = alphaNum;

        //Numeric
        if (num == 1)
        {
            gridInt = 7;
        }
        else if (num == 2)
        {
            gridInt = 6;
        }
        else if (num == 3)
        {
            gridInt = 5;
        }
        else if (num == 4)
        {
            gridInt = 4;
        }
        else if (num == 5)
        {
            gridInt = 3;
        }
        else if (num == 6)
        {
            gridInt =  2;
        }
        else if (num == 7)
        {
            gridInt = 1;
        }
        else
        {
            gridInt = 0;
        }

        grid[0] = gridInt;

        return grid;
    }
}
