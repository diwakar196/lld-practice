package Patterns.Structural.Flyweight;

public class Board {
    private Symbol[][] board;
    public Board() {
        this.board = new Symbol[3][3];
    }

    public Symbol getSymbol(int x, int y) {
        return board[x][y];
    }

    public void putSymbol(int x, int y, Symbol symbol) {
        board[x][y] = symbol;
    }
}
