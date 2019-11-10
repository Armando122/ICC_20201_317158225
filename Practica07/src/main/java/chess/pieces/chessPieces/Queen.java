package chess.pieces.chessPieces;
import java.util.LinkedList;
import java.util.List;

import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
* @see Piece and Rook
*
* Creation of class Queen
*/
public class Queen extends Rook{

  /**
  * Constructor of Queen
  *
  * @param p = position of class Position
  *
  * @param color = a color of class ColorEnum
  */
  public Queen (Position p, ColorEnum color) {
    super(p,color);
    this.type = PiecesTypeEnum.QUEEN;
  }

  /**
  *
  */
  public List<Position> getLegalMoves(){
    return super.getLegalMoves();
    //this.legalMoves.add(nextLegalPosition);
  }
}
