package chess;
import chess.items.Board;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.chessPieces.*;
import chess.items.*;

/*
* Clase Game que prueba y crea el tablero
*/
public class Game{

  public static void main(String[] args) {
    Board board = Board.getInstance();
    System.out.println(board.toString());
    Queen p = new Queen(new Position(0,0), ColorEnum.BLACK);
    System.out.println(p.getLegalMoves());
  }
}
