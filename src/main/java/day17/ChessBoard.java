package day17;

public class ChessBoard {
    private ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    public void print(){
        for (ChessPiece[] chessPiece : chessPieces) {
            for (int j = 0; j < chessPieces.length; j++) {
                System.out.print(chessPiece[j].getName());
            }
            System.out.println();
        }
    }
}
