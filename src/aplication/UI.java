package aplication;

import chess.ChessPiece;

public class UI {
	
	/* O professor costuma utilizar o chessPiece para referenciar até 
	 * as posições das peças no tabuleiro. Isso indicaria que não se
	 * deve referenciar diretamente quaisquer classes da camada "boardGame"? */
	
	public static void printBoard(ChessPiece[][] pieces) {
		for (int i = 0; i < pieces.length; i++) {
			System.out.print( (8 - i) + " ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	public static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
	
	//Aplicação muito interessante de métodos estáticos.
}
