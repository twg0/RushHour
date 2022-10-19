package Model;

public class FxFBoard implements GameBoard{

    private static final int gameBoard[][] = new int[5][5];

    private FxFBoard()
    {
        clearGameBoard();
    }

    public static int[][] getGameBoard() {
        return gameBoard;
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
        for(int i = 0;i < 5;i++)
        {
            for (int j = 0; j < 5; j++) {
                System.out.print(gameBoard[i][j] + ' ');
            }
            System.out.println();
        }
    }
}
