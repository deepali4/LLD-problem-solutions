import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    public void initializeGame(){
        Player player1 = new Player("Player1", 'O');
        Player player2 = new Player("Player2", 'X');
        board = new Board(3);
        currentPlayer = player1;
    }

    public String startGame() {
          Boolean noWinner = true;
          while (noWinner){
              // if board is full noWinner = false continue;
              List<int[]> freeSpaces =  board.getFreeCells();
              if(freeSpaces.isEmpty()) {
                  noWinner = false;
                  continue;
              }
              Scanner scanner = new Scanner(System.in);
              String s = scanner.nextLine();
              String[] input = s.split(",");
              int inputRow = Integer.valueOf(input[0]);
              int inputColumn = Integer.valueOf(input[1]);

              // -- add this piece to the board
             boolean isSucesfullMove =  board.addPiece(inputRow , inputColumn , currentPlayer.getSymbol());
              if(!isSucesfullMove){
                  System.out.println("Invalid Move");
              }
              boolean isThereWinner = isThereWinner(inputColumn , inputColumn);
              if(isThereWinner) return currentPlayer.getName();
              currentPlayer = currentPlayer == player1 ? player2 : player1;
          }
          return "tie";
    }

    private boolean isThereWinner(int col, int row) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i=0;i<board.size;i++) {

            if(board.board[row][i] == ' ' || board.board[row][i] != board.board[row][col]) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<board.size;i++) {

            if(board.board[i][col] == ' ' || board.board[i][col] != board.board[row][col]) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<board.size;i++,j++) {
            if (board.board[i][j] == ' ' || board.board[i][j] != board.board[row][col]) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=board.size-1; i<board.size;i++,j--) {
            if (board.board[i][j] == ' ' || board.board[i][j] != board.board[row][col]) {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }

}
