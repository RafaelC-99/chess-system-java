package boardgame;

public class Board {
    
    private int rows;
    private int columnns;
    private Piece[][] pieces;

    public Board(int rows, int columnns) {
        this.rows = rows;
        this.columnns = columnns;
        pieces = new Piece[rows][columnns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumnns() {
        return columnns;
    }

    public void setColumnns(int columnns) {
        this.columnns = columnns;
    }

    
}
