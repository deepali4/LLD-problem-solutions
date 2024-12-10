public class Knight extends Piece {
    public Knight(boolean b) {
        super(b);
    }

    @Override
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}
