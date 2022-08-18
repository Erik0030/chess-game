package am.aua.chess;

import am.aua.chess.cli.ChessConsole;
import am.aua.chess.ui.ChessUI;

public class Main {
    public static void main(String[] args){
        if (args.length == 0) {
            ChessUI ui = new ChessUI();
        } else if (args[0].equals("-console")) {
            ChessConsole chessConsole = new ChessConsole();
            chessConsole.run();
        }
    }
}
