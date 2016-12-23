package game.data;

/**
 * Created by arıoğlu on 12/16/2016.
 */
public class TileMap{
    private int[][] map;
    private int[][] currentMap;
    private int numCols;
    private int numRows;
    private int curCols;
    private int curRows;

    public TileMap(){
    }

    public int getNumCols() {
        return numCols;
    }

    public int getNumRows() {
        return numRows;
    }

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }

    public int[][] getCurrentMap() {
        return currentMap;
    }

    public void setCurrentMap(int[][] currentMap) {
        this.currentMap = currentMap;
    }

    public void setNumCols(int numCols) {
        this.numCols = numCols;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getCurCols() {
        return curCols;
    }

    public void setCurCols(int curCols) {
        this.curCols = curCols;
    }

    public int getCurRows() {
        return curRows;
    }

    public void setCurRows(int curRows) {
        this.curRows = curRows;
    }
}