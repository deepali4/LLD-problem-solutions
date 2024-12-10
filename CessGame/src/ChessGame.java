public class ChessGame {
    private Board board;
    private Player player1;
    private Player player2;
    boolean isWhiteTern;
    private Status status;

    public ChessGame(Player player1 , Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
        isWhiteTern = true;
        this.status = Status.ACTIVE;
    }

    public void startGame(){
        while(status == Status.ACTIVE){
            if(isWhiteTern){
                //makeMove(new Move(starBlock , endBlock ) ,player1));
            }else {
                //makeMove(new Move(starBlock , endBlock) ,player1));
            }
        }
    }
    public void makeMove (Move move , Player player){
        // isvalid check if source and destination dont contains the same colour
        if(move.isValid()){
            // -- If move is valid then check the if source piece can move to destination
            Piece sourcePiece = move.getStartBlock().getPiece();
            if(sourcePiece.canMove( this.board , move.getStartBlock() , move.getEndBlock())) {
                Piece detinationPiece = move.getEndBlock().getPiece();
                if(detinationPiece != null)
                {
                    if (detinationPiece instanceof King  && isWhiteTern) {
                        status = Status.WHITE_WIN;
                        return;
                    }
                    if (detinationPiece instanceof King  && !isWhiteTern) {
                        status = Status.BLACK_WIN;
                        return;
                    }
                }
                detinationPiece.setKilled(true);
            }
        }
        move.getEndBlock().setPiece(move.getStartBlock().getPiece());
        move.getStartBlock().setPiece(null);
        isWhiteTern = !isWhiteTern;
    }

}
