public class Bishop extends Piece {
    public Bishop(boolean b) {
        super(b);
    }

    @Override
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}
