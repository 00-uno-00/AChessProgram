import java.util.Arrays;
/**
 * FenMatrix
 */
public class FenMatrix {

    public static char[][] FenMatrix(char[][] M, String FEN) {
        String POS = subString(cleanFEN(NumbersToVoid(FEN)));
        M = MatrixConverter(POS);
        return M;
    }
    
    public static String cleanFEN(String FEN) {//FEN notation without castling, turn indicator and number of moves
        int i = FEN.indexOf(' ', 0);
        String replaced = FEN.substring(i, FEN.length());
        return FEN.replace(replaced, "/");
    }

    public static String subString(String POS) {//FEN notation without separators
        String SUM = "";
        for (int i = 0; i < POS.length(); i++) {
            int n = POS.indexOf('/', i);
            SUM += POS.substring(i, n);
            i = n;
        }
        return SUM;
    }
    private static char[][] MatrixConverter(String FEN) {
        char[][] O = new char[8][8];
        char[] CFen = new char[FEN.length()];
        FEN.getChars(0, FEN.length(), CFen, 0);
        int Findex = 0;
        for (int i = 0; i < O.length; i++) {
            for (int j = 0; j < O[i].length; j++) {
                O[i][j] = CFen[Findex];
                Findex++;
            }
        }
        return O;
    }
    
    public static String NumbersToVoid(String FEN) {
        for (int i = 0; i < 9; i++) {
            char n = (char) (i + 48);
            String num = String.valueOf(i);
            String empty = new String(new char[i]).replace('\0', '0');
            FEN = FEN.replaceAll(num, empty);
        }
        return FEN;
    }

    public static void main(String[] args) {//testing purposes only
        char[][] M = new char[8][8];
        M = FenMatrix(M,"r1bq1rk1/pp3ppp/3n4/2p1N3/2B5/7P/PPP2PP1/R1BQR1K1 w");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}