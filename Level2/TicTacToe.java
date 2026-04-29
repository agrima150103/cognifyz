import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    // Initialize the board with empty spaces
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Print the current game board
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Check if the board is full (draw)
    public static boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ') return false;
            }
        }
        return true;
    }

    // Check for a win
    public static boolean checkWin() {
        // Rows and Columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer &&
                board[i][1] == currentPlayer &&
                board[i][2] == currentPlayer)
                return true;

            if (board[0][i] == currentPlayer &&
                board[1][i] == currentPlayer &&
                board[2][i] == currentPlayer)
                return true;
        }

        // Diagonals
        if (board[0][0] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][2] == currentPlayer)
            return true;

        if (board[0][2] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][0] == currentPlayer)
            return true;

        return false;
    }

    // Switch players
    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Run the game
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            initializeBoard();
            currentPlayer = 'X';
            boolean gameEnded = false;

            while (!gameEnded) {
                printBoard();
                System.out.println("Player " + currentPlayer + ", enter your move (row [1-3] and column [1-3]): ");
                int row = scanner.nextInt() - 1;
                int col = scanner.nextInt() - 1;

                // Check for valid input
                if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                    System.out.println("Invalid move. Try again.");
                    continue;
                }

                // Make the move
                board[row][col] = currentPlayer;

                // Check for win
                if (checkWin()) {
                    printBoard();
                    System.out.println("🎉 Player " + currentPlayer + " wins!");
                    gameEnded = true;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameEnded = true;
                } else {
                    switchPlayer();
                }
            }

            // Ask to play again
            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
        }

        scanner.close();
        System.out.println("Thanks for playing!");
    }

    public static void main(String[] args) {
        playGame();
    }
}
