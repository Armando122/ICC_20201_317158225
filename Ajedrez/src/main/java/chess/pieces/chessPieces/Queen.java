package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;

import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
* Clase Queen que hereda de Rook
*
* @see Rook
*/
public class Queen extends Rook {

  /**
  * Constructor para Queen
  *
  * @param una posición de la clase Position
  *
  * @param un color de ColorEnum
  */
  public Queen(Position p1, ColorEnum color1) {
    super(p1, color1);
    this.type = PiecesTypeEnum.QUEEN;
  }

  /**
  * Método getLegalMoves
  *
  * @return una lista de posciciones de Position
  */
  public List<Position> getLegalMoves(){
    //Movimientos de Rook
    super.getLegalMoves();

    //Movimientos para Queen
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
