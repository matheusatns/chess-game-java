package application;

import chess.ChessMatch;

public class Main {

	public static void main(String[] args) {
		ChessMatch ch = new ChessMatch();
		UI.printBoard(ch.getPieces());
	}

}
