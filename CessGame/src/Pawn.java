public class Pawn extends Piece {
    public Pawn(boolean b) {
        super(b);
    }

    @Override
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}
