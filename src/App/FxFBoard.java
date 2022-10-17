package App;

public class FxFBoard implements GameBoard{

    private int gameBoard[][] = new int[5][5];
    private int pRow,pCol;

    public int[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(int[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public void clearGameBoard() {
        for(int i = 0;i < 5;i++)
        {
            for(int j = 0;j < 5;j++)
                gameBoard[i][j] = 0;
        }
    }

    @Override
    public void printBoard() {

    }
}
