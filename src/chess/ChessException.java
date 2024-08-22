package chess;

import boardgame.BoardException;

public class ChessException extends BoardException {
	/*
	 * ChessException como subclasse de BoardException garante que os tratamentos
	 * de exceções aninhados são aplicados tanto nas exçeções ocorridas em Board 
	 * quanto nas de Chess. Segundo o professor, lógicamente isso é correto, pois
	 * os problemas que ocorrem na camada Chess são lógicamente, também da camada 
	 * camda Board.
	 */
	private static final long serialVersionUID = 1L;
	
	public ChessException(String msg) {
		super(msg);
	}

}
