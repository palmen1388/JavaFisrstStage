package Lesson3.Task2;

public class Step {
    private int[][] field = {{0, 1, 1, 0, 0},
                             {1, 1, 0, 1, 1},
                             {0, 1, 1, 1, 0},
                             {1, 0, 1, 1, 0},
                             {0, 1, 1, 1, 0}};


    Step() {

    }

    public int[][] doStep() {
        int[][] board = this.field;
        int[][] newField = new int[board.length][board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (this.checkSurrounding(board, i, j) == 3 && board[i][j] == 0) {
                    newField[i][j] = 1;
                }
                if ((this.checkSurrounding(board, i, j) == 3 || this.checkSurrounding(board, i, j) == 2) && board[i][j] == 1) {
                    newField[i][j] = board[i][j];
                }
                if ((this.checkSurrounding(board, i, j) > 3 || this.checkSurrounding(board, i, j) < 2) && board[i][j] == 1) {
                    newField[i][j] = 0;
                } else {
                    newField[i][j] = board[i][j];
                }
            }
        }
        return newField;
    }

    public int checkSurrounding(int[][] field, int row, int column) {
        int counter = 0;
        if (row - 1 < 0) {
            row = 1;
        }
        if (column - 1 < 0) {
            column = 1;
        }
        for (int i = row - 1; i <= row - 1 && i < field.length; i++) {
            for (int j = column - 1; i <= column - 1 && j < field.length; j++) {
                if (field[i][j] == 1 && !(row == i && column == j)) {
                    counter++;
                }
            }
        }
        return counter;
    }
//    public void stopTheGame(){
//        while (doStep() == 0){
//            doStep();
//        }
//    }
}


