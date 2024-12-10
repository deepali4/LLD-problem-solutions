public class Block {
    private int x;
    private int y;
    private Piece piece;

    public Block(int x ,int y , Piece piece)
    {
        this.x = x;
        this.y = y;
        this.piece = piece;
    }
    public Piece getPiece(){
        return piece;
    }
    public void setPiece(Piece piece){
        this.piece = piece;
    }

}
