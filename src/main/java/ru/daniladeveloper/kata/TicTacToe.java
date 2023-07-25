package ru.daniladeveloper.kata;

public class TicTacToe {

    /**
     *
     * @param board
     * @return
     * -1 if the board is not yet finished AND no one has won yet (there are empty spots),
     * 1 if "X" won,
     * 2 if "O" won,
     * 0 if it's a cat's game (i.e. a draw).
     */

    public static int isSolved(int[][] board) {
        int xResult = 0;
        int oResult = 0;
        int emptyCount = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                if (board[i][j] == 0) {
                    emptyCount++;
                }
            }
        }


        for (int j = 0; j < 3; j++) {
            xResult = 0;
            oResult = 0;
            for (int i = 0; i < 3; i++) {
                if (board[j][i] == 1) {
                    xResult++;
                } else if (board[j][i] == 2) {
                    oResult++;
                }
            }
            if (xResult == 3) {
                return 1;
            } else if (oResult == 3) {
                return 2;
            }
        }

        for (int j = 0; j < 3; j++) {
            xResult = 0;
            oResult = 0;
            for (int i = 0; i < 3; i++) {
                if (board[i][j] == 1) {
                    xResult++;
                } else if (board[i][j] == 2) {
                    oResult++;
                }
            }
            if (xResult == 3) {
                return 1;
            } else if (oResult == 3) {
                return 2;
            }
        }
        xResult = 0;
        oResult = 0;

        for (int i = 0; i < 3; i++) {
            if (board[i][i] == 1) {
                    xResult++;
            } else if (board[i][i] == 2) {
                    oResult++;
            }
            if (xResult == 3) {
                return 1;
            } else if (oResult == 3) {
                return 2;
            }
        }

        xResult = 0;
        oResult = 0;

        for (int i = 3; i >= 1; i--) {
            if (board[i - 1][3 - i] == 1) {
                xResult++;
            } else if (board[i - 1][3 - i] == 2) {
                oResult++;
            }
            if (xResult == 3) {
                return 1;
            } else if (oResult == 3) {
                return 2;
            }
        }


        return emptyCount > 0 ? -1 : 0;
    }

}
