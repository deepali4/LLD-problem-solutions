public class Rook extends Piece {
    public Rook(boolean b) {
        super(b);
    }

    @Override
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}
