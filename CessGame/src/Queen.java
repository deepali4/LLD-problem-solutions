public class Queen extends Piece {
    public Queen(boolean b) {
        super(b);
    }

    @Override
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}
