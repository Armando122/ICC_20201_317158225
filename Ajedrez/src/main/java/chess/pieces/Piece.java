package chess.pieces;
import java.util.List;
import chess.items.Board;
import chess.items.Position;

/**
* Clase abstracta Piece
*/
public abstract class Piece{

  //Atributos
  protected Position position;
  protected List<Position> legalMoves = null;
  protected PiecesTypeEnum type;
  protected ColorEnum color;
  protected Board board;

  /**
  * Constructor para Piece
  *
  * @param una posicion de la clase Position
  *
  * @param una posicion de la clase Position
  */
  public Piece(Position p, ColorEnum color) {
    this.position = p;
    this.color = color;
  }

  /**
  * Métod isAppendable
  *
  * @param una posicion de la clase Position
  *
  * @return un número entero
  */
  public int isAppendable(Position p){
    Board board = Board.getInstance();
    Piece piece = board.getPiece(p);
    if(piece.getColor() == this.getColor())return -1;
    if(piece.getColor() != ColorEnum.NONE)return 0;
    return 1;
  }

  /**
  * Método getPosition
  *
  * @return un objeto de la clase Position
  */
  public Position getPosition(){
    return this.position;
  }

  /**
  * Método getColor
  *
  * @return el colo de la pieza
  */
  public ColorEnum getColor(){
    return this.color;
  }

  /**
  * Método PiecesTypeEnum
  *
  * @return el tipo de pieza que es
  *
  * @see PiecesTypeEnum
  */
  public PiecesTypeEnum getType(){
    return this.type;
  }

  /**
  * Método moveTo*
  * @param una posición de la clase Position
  */
  public void moveTo(Position p) {
    if (isLegalMove(p)) {
      this.position = p;
      this.legalMoves = null;
      return;
    } else
    return;
  }

  /**
  * Método abstracto getLegalMoves
  *
  * @return una lista con posciciones de la clase Position
  */
  public abstract List<Position> getLegalMoves();

  /**
  * Método isLegalMove
  *
  * @param una posición de la clase Position
  *
  * @return true si los movimientos están en p
  *
  * @return false en otro caso
  */
  public boolean isLegalMove(Position p) {
    List<Position> moves = this.getLegalMoves();
    return (moves.contains(p)) ? true : false;
  }

  /**
  * Método toString
  * @return un String con el nombre de la pieza
  */
  @Override
  public String toString() {
    return this.type.toString();
  }

  /**
  * Método equals
  *
  * @return true si dos piezas están en la misma posición
  *
  * @return false en otro caso
  */
  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Piece))return false;
    Piece p = (Piece)obj;
    if(p.getType().equals(this.type)
        && p.getColor().equals(this.getColor())
        && p.getPosition().equals(this.position))
    return true;
    return false;
  }
}
