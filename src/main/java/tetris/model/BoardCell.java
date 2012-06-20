package tetris.model;

import java.util.Arrays;

public class BoardCell {

	private final PieceType pieceType;
	
	private BoardCell() {
		pieceType = null;
	}

	private BoardCell(PieceType type) {
		pieceType = type;
	}
	
	public boolean isEmpty() {
		return pieceType == null;
	}
	
	public PieceType getPieceType() {
		return pieceType;
	}
	
	public static BoardCell getEmptyCell() {
		return new BoardCell();
	}
	
	public static BoardCell getFullCell(PieceType pieceType) {
		return new BoardCell(pieceType);
	}
	
	public static BoardCell[] getEmptyArray(int size) {
		BoardCell[] cells = new BoardCell[size];
		Arrays.fill(new BoardCell[size], new BoardCell());
		return cells;
	}
	
}