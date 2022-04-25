/**
 * Board
 */
public class Board {
    //values
    private int Queen = 0;
    private int Rooks = 0;
    private int Bishops = 0;
    private int Knights = 0;
    private int Pawn = 0;

    //number of elements
    private int NQ = 0;
    private int NR = 0;
    private int NB = 0;
    private int NK = 0;
    private int NP = 0;


    //positions
    private String[] Q = new String[NQ];
    private String[] R = new String[NR];
    private String[] B = new String[NB];
    private String[] K = new String[NK];
    private String[] P = new String[NP];

    public void SetboardQ(int Q, int nq, String[] pos) {
        Queen = Q * nq;
        NQ = nq;
        this.Q = pos;
    }

    public void SetboardR(int R, int nr, String[] pos) {
        Rooks = R;
        NR = nr;
        this.R = pos;
    }

    public void SetboardB(int B, int nb, String[] pos) {
        Bishops = B;
        NB = nb;
        this.B = pos;
    }

    public void SetboardK(int K, int nk, String[] pos) {
        Knights = K;
        NK = nk;
        this.K = pos;
    }

    public void SetboardP(int P, int np, String[] pos) {
        Pawn = P;
        NP = np;
        this.P = pos;
    }
    
}