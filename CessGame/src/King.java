public class King extends Piece{

    public King(Boolean white){
        super(white);
    }
    @Override
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}
