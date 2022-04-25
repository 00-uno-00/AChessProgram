package FenMatrix;

public class BitBoards {
    
    private long[] WhiteBoard = new long[8];
    private long[] BlackBoard = new long[8];

    public void wBoard(String FEN) {
        char[] W = {'p', 'n', 'b', 'r', 'q','k'};
        for (char c : W) {
            WhiteBoard[c] = FenMatrix.PieceFilter(FEN, c);
        }
        
    }

    public void bBoard(String FEN) {
        char[] W = {'P', 'N', 'B', 'R', 'Q','K'};
        for (char c : W) {
            BlackBoard[c] = FenMatrix.PieceFilter(FEN, c);
        }
    }
}
