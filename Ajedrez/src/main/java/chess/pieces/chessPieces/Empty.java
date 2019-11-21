package chess.pieces.chessPieces;
import java.util.LinkedList;
import java.util.List;

import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
* Clase Empty que hereda de Piece
*
* @see Piece
*/
public class Empty extends Piece{

  /**
  * Constrcutor de Empty
  *
  * @param una posición de la clase Position
  *
  * @param una posición de la clase Position
  */
  public Empty(Position p, ColorEnum c){
    super(p,c);
    this.type = PiecesTypeEnum.EMPTY;
  }

  /**
  * Constrcutor vacío para Empty
  *
  * Con Position(0,0) y tipo EMPTY
  */
  public Empty(){
    super(new Position(0,0),ColorEnum.NONE);
    this.type = PiecesTypeEnum.EMPTY;
  }

  /**
  * Método getLegalMoves
  *
  * @return una lista con las posciciones de la pieza
  */
  @Override
  public List<Position> getLegalMoves() {
    return new LinkedList<>();
  }

  /**
  * Método equals para la clase Empty
  *
  * @return true si un objeto es vacío
  *
  * @return false en otro caso
  */
  @Override
  public boolean equals(Object obj) {
    return (obj instanceof Empty)? true: false;
  }

}
