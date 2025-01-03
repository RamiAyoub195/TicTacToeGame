import static org.junit.Assert.*;

public class TicTacToeModelTest {

    @org.junit.Test
    public void getStatus() {
        TicTacToeModel model = new TicTacToeModel();
        assertEquals(TicTacToeModel.Status.UNDECIDED, model.getStatus());

        model.play(0, 0);

        model.play(0, 1);

        model.play(1, 0);

        model.play(1, 1);

        model.play(2, 0);

        assertEquals(TicTacToeModel.Status.X_WON, model.getStatus());

    }
}