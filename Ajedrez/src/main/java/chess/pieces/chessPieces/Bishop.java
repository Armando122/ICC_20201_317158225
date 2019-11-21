package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;

import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
* Clase Bishop que hereda de Piece
*
* @see Piece
*/
class Bishop extends Piece{

  /**
  * Constructor para Bishop
  *
  * @param una posición de la clase Position
  *
  * @param un color de ColorEnum
  */
  public Bishop(Position p, ColorEnum color) {
    super(p, color);
    this.type = PiecesTypeEnum.BISHOP;
  }

  /**
  * Método getLegalMoves
  *
  * @return una lista de posciciones de Position
  */
  @Override
  public List<Position>  getLegalMoves() {
    Board board = Board.getInstance();
    this.legalMoves = new LinkedList<Position>();

    for(int i = this.position.getX() + 1; i < 8; i++) {
      for(int j = this.position.getY() + 1; j < 8; j++) {
        Position nextLegalPosition = new Position(i, j);
        if (this.isAppendable(nextLegalPosition) == -1)
        break;
        if (this.isAppendable(nextLegalPosition) == 0) {
          this.legalMoves.add(nextLegalPosition);
          break;
        }
        this.legalMoves.add(nextLegalPosition);
      }
    }

    for(int i = this.position.getX() - 1; i < 8; i--){
      for(int j = this.position.getY() + 1; i < 8; i++){
        Position nextLegalPosition = new Position(i, j);
        Piece piece = board.getPiece(nextLegalPosition);
        if (piece.getColor() == this.getColor())
        break;
        if (piece.getColor() != ColorEnum.NONE) {
          this.legalMoves.add(nextLegalPosition);
          break;
        }
        this.legalMoves.add(nextLegalPosition);
      }
    }

    for(int i = this.position.getX() - 1; i < 8; i--){
      for(int j = this.position.getY() - 1; i < 8; i--){
        Position nextLegalPosition = new Position(i, j);
        Piece piece = board.getPiece(nextLegalPosition);
        if (piece.getColor() == this.getColor())
        break;
        if (piece.getColor() != ColorEnum.NONE) {
          this.legalMoves.add(nextLegalPosition);
          break;
        }
        this.legalMoves.add(nextLegalPosition);
      }
    }

    for(int i = this.position.getX() + 1; i < 8; i++){
      for(int j = this.position.getY() - 1; i < 8; i--) {
        Position nextLegalPosition = new Position(i, j);
        Piece piece = board.getPiece(nextLegalPosition);
        if (piece.getColor() == this.getColor())
        break;
        if (piece.getColor() != ColorEnum.NONE) {
          this.legalMoves.add(nextLegalPosition);
          break;
        }
        this.legalMoves.add(nextLegalPosition);
      }
    }
    return this.legalMoves;
  }
}
