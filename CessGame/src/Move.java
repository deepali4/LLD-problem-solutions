public class Move {
    private Block startBlock;
    private Block endBlock;

    public Move(Block startBlock , Block endBlock){
        this.startBlock = startBlock;
        this.endBlock = endBlock;
    }
    //-- JUst to check if source and destination dont have same colour Piece
    public  boolean isValid()
    {
        return !(startBlock.getPiece().isWhite() == startBlock.getPiece().isWhite());
    }
    public Block getStartBlock()
    {
        return this.startBlock;
    }
    public  Block getEndBlock(){
        return this.endBlock;
    }

}
