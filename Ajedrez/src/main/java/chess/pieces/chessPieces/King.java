package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;

import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
* Clase King que hereda de Piece
*
* @see clase Piece
*/
class King extends Piece {

  /**
  * Constuctor para King
  *
  * @param una posición de la clase Position
  *
  * @param un color de ColorEnum
  */
  public King(Position p, ColorEnum color) {
    super(p, color);
    this.type = PiecesTypeEnum.KING;
  }

  /**
  * Método getLegalMoves
  *
  * @return una lista de posciciones de Position
  */
  @Override
  public List<Position> getLegalMoves(){
    Board board = Board.getInstance();
    this.legalMoves = new LinkedList<Position>();

    for (int i = this.position.getX() + 1; i < 2; i++) {
      Position nextLegalPosition = new Position(i, this.position.getY());
      if (this.isAppendable(nextLegalPosition) == -1)
      break;
      if (this.isAppendable(nextLegalPosition) == 0) {
        this.legalMoves.add(nextLegalPosition);
        break;
      }
      this.legalMoves.add(nextLegalPosition);
    }

    for (int i = this.position.getX() - 1; i > 2; i--) {
      Position nextLegalPosition = new Position(i, this.position.getY());
      Piece piece = board.getPiece(nextLegalPosition);
      if (piece.getColor() == this.getColor())
      break;
      if (piece.getColor() != ColorEnum.NONE) {
        this.legalMoves.add(nextLegalPosition);
        break;
      }
      this.legalMoves.add(nextLegalPosition);
    }

    for (int i = this.position.getY() + 1; i < 2; i++) {
      Position nextLegalPosition = new Position(this.position.getX(), i);
      Piece piece = board.getPiece(nextLegalPosition);
      if (piece.getColor() == this.getColor())
      break;
      if (piece.getColor() != ColorEnum.NONE) {
        this.legalMoves.add(nextLegalPosition);
        break;
      }
      this.legalMoves.add(nextLegalPosition);
    }

    for (int i = this.position.getY() - 1; i > 2; i--) {
      Position nextLegalPosition = new Position(this.position.getX(), i);
      Piece piece = board.getPiece(nextLegalPosition);
      if (piece.getColor() == this.getColor())
      break;
      if (piece.getColor() != ColorEnum.NONE) {
        this.legalMoves.add(nextLegalPosition);
        break;
      }
      this.legalMoves.add(nextLegalPosition);
    }
    return this.legalMoves;
  }

}
