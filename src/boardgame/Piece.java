package boardgame;

public class Piece {
	protected Position position; /* Posição da matriz, não ficar acessível para a camada de xadrez */
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;

	}

	protected Board getBoard() {
		return board;
	}

}
