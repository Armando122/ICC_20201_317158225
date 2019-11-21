package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;

import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
* Clase Knight que hereda de Piece
*
* @see clase Piece
*/
public class Knight extends Piece {

  /**
  * Constuctor para Knight
  *
  * @param una posición de la clase Position
  *
  * @param un color de ColorEnum
  */
  public Knight(Position p, ColorEnum color) {
    super(p, color);
    this.type = PiecesTypeEnum.KNIGHT;
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

    for (int i = this.position.getX() + 1; i < 3; i++) {
      if(i == 2){
        Position nextLegalPosition = new Position(i, this.position.getY() + 1);
        if (this.isAppendable(nextLegalPosition) == -1)
        break;
        if (this.isAppendable(nextLegalPosition) == 0) {
          this.legalMoves.add(nextLegalPosition);
          break;
        }
        this.legalMoves.add(nextLegalPosition);
      }
      if(i == 2){
        Position nextLegalPosition = new Position(i, this.position.getY() - 1);
        if (this.isAppendable(nextLegalPosition) == -1)
        break;
        if (this.isAppendable(nextLegalPosition) == 0) {
          this.legalMoves.add(nextLegalPosition);
          break;
        }
        this.legalMoves.add(nextLegalPosition);
      }
    }

    for (int i = this.position.getX() - 1; i > 3; i--) {
      if(i == 2){
        Position nextLegalPosition = new Position(i, this.position.getY() + 1);
        Piece piece = board.getPiece(nextLegalPosition);
        if (piece.getColor() == this.getColor())
        break;
        if (piece.getColor() != ColorEnum.NONE) {
          this.legalMoves.add(nextLegalPosition);
          break;
        }
        this.legalMoves.add(nextLegalPosition);
      }

      if(i == 2){
        Position nextLegalPosition = new Position(i, this.position.getY() - 1);
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

    for (int i = this.position.getY() + 1; i < 3; i++) {
      if(i == 2){
        Position nextLegalPosition = new Position(this.position.getX() + 1, i);
        Piece piece = board.getPiece(nextLegalPosition);
        if (piece.getColor() == this.getColor())
        break;
        if (piece.getColor() != ColorEnum.NONE) {
          this.legalMoves.add(nextLegalPosition);
          break;
        }
        this.legalMoves.add(nextLegalPosition);
      }

      if(i == 2){
        Position nextLegalPosition = new Position(this.position.getX() - 1, i);
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

    for (int i = this.position.getY() - 1; i > 3; i--) {
      if(i == 2){
        Position nextLegalPosition = new Position(this.position.getX() + 1, i);
        Piece piece = board.getPiece(nextLegalPosition);
        if (piece.getColor() == this.getColor())
        break;
        if (piece.getColor() != ColorEnum.NONE) {
          this.legalMoves.add(nextLegalPosition);
          break;
        }
        this.legalMoves.add(nextLegalPosition);
      }

      if(i == 2){
        Position nextLegalPosition = new Position(this.position.getX() - 1, i);
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
