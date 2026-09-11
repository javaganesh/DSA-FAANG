package com.LLD;
class Board{
    private char[][] board;
    private int size;

    public Board(int size){
        this.size=size;
        this.board=new char[size][size];
        initialize();

    }

    private void initialize() {
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                board[i][j]='-';
            }
        }
    }
    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.println(board[i][j]+" ");

            }
        }
    }
    public boolean isCellEmpty(int row, int col) {
        return board[row][col] == '-';
    }
    public boolean placeSymbol(int row, int col, char symbol) {

        if (!isCellEmpty(row, col)) {
            return false;
        }

        board[row][col] = symbol;
        return true;
    }

    public boolean isBoardFull() {

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                if (board[i][j] == '-') {
                    return false;
                }

            }
        }

        return true;
    }


    public char getCell(int row, int col) {
        return board[row][col];
    }

    public int getSize() {
        return size;
    }



}

public class BoradGame {
}
