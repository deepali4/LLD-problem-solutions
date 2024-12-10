public abstract class Piece {
    private boolean isWhite;
    private boolean killed;

    public Piece(Boolean isWhite){
        this.isWhite = isWhite;
    }
    public void setKilled(Boolean killed){
        this.killed = killed;
    }
    public boolean isWhite() {
        return isWhite;
    }
    public abstract boolean canMove(Board board, Block startBlock, Block endBlock);

}
