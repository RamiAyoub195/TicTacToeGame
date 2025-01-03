import java.util.*;

public class TicTacToeModel {


    public static final int SIZE = 3;
    public static final boolean X = true;
    public static final boolean O = false;
    private List<TicTacModelView> views;

    public enum Status {X_WON, O_WON, TIE, UNDECIDED};

    private char[][] grid;
    private boolean turn;
    private Status status;


    public TicTacToeModel() {
        grid = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = ' ';
            }
        }
        turn = X;
        status = Status.UNDECIDED;
        this.views = new ArrayList<TicTacModelView>();

    }
    public void addTicTacToeView(TicTacModelView view){
        this.views.add(view);
    }

    public void removeTicTacToeView(TicTacModelView view){
        this.views.remove(view);
    }

    private void changeTurn() {

        turn = !turn;
    }

    public Status getStatus() {
        return status;}

    private void updateStatus() {
        // Check rows and columns
        for (int i = 0; i < SIZE; i++) {
            // Check rows
            if (grid[i][0] != ' ' && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
                status = (grid[i][0] == 'X') ? Status.X_WON : Status.O_WON;
                return;
            }
            // Check columns
            if (grid[0][i] != ' ' && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
                status = (grid[0][i] == 'X') ? Status.X_WON : Status.O_WON;
                return;
            }
        }

        // Check diagonals
        if (grid[0][0] != ' ' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            status = (grid[0][0] == 'X') ? Status.X_WON : Status.O_WON;
            return;
        }
        if (grid[0][2] != ' ' && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
            status = (grid[0][2] == 'X') ? Status.X_WON : Status.O_WON;
            return;
        }

        // Check for tie
        boolean isFull = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (grid[i][j] == ' ') {
                    isFull = false;
                    break;
                }
            }
        }

        if (isFull) {
            status = Status.TIE;
        } else {
            status = Status.UNDECIDED;
        }
    }

    public boolean getTurn() {
        return turn;
    }

    public void play(int x, int y) {
        if (grid[x][y] != ' ') return;
        grid[x][y] = turn? 'X' : 'O';
        updateStatus();
        for (TicTacModelView view: views){
            view.handleTicTacToeStatusUpdate(new TicTacToeEvent(this,status, x, y));
        }
        changeTurn();
    }
}

