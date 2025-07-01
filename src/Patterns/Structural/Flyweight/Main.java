package Patterns.Structural.Flyweight;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        SymbolX x = new SymbolX();
        SymbolY y = new SymbolY();
        board.putSymbol(0,0,x);
        board.putSymbol(1,1,y);
        String ans = board.getSymbol(1,1).getSymbol();
        System.out.println(ans);
    }
}
