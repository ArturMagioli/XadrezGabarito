package boardgame;

public class Piece {

	protected Position position; //protected irá garantir que o valor seja acessado somente por classes de mesmo pacote e subclasses. (veja as subclasses no UML)
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}
	
	protected Board getBoard() {
		return board;
	}
}
