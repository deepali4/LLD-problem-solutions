import java.util.List;

public class Board {
    final char[][] board;
    int size;

    public Board(int size){
        this.size = size;
        board = new char[size][size];
    }

    public boolean addPiece(int row, int column,char symbol) {

        if(board[row][column] != ' ') {
            return false;
        }
        board[row][column] = symbol;
        return true;
    }

    public List<int[]> getFreeCells() {
        return null;
    }

    // get fress cells
    // print board

}
