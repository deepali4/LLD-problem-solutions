public class Board {

    private Block[][] board;

    public Board() {
        board = new Block[8][8];
        initializeBoard();
    }
    private void initializeBoard(){
        //
        board[0][0] = new Block(0,0,new Rook(true));
        board[0][1] = new Block(0,1,new Knight(true));
        board[0][2] = new Block(0,2,new Bishop(true));
        board[0][3] = new Block(0,3,new Queen(true));
        board[0][4] = new Block(0,4,new King(true));
        board[0][5] = new Block(0,5,new Bishop(true));
        board[0][6] = new Block(0,6,new Knight(true));
        board[0][7] = new Block(0,7,new Rook(true));
        for(int j=0; j<8 ; j++){
            board[1][j] = new Block(1,j,new Pawn(true));
        }
        //Setting Black Pieces
        board[7][0] = new Block(7,0,new Rook(false));
        board[7][1] = new Block(7,1,new Knight(false));
        board[7][2] = new Block(7,2,new Bishop(false));
        board[7][3] = new Block(7,3,new Queen(false));
        board[7][4] = new Block(7,4,new King(false));
        board[7][5] = new Block(7,5,new Bishop(false));
        board[7][6] = new Block(7,6,new Knight(false));
        board[7][7] = new Block(7,7,new Rook(false));
        for(int j=0; j<8 ; j++){
            board[6][j] = new Block(6,j,new Pawn(false));
        }
        // Defining rest of the blocks having no pieces
        for(int i=2;i<6;i++){
            for( int j=0; j<8; j++){
                board[i][j] = new Block(i,j,null);
            }
        }
    }
}
