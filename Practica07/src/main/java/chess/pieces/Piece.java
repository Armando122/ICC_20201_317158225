package chess.pieces;
import java.util.List;
import chess.items.Board;
import chess.items.Position;

/**
* Creation of abstract class Piece
*/
public abstract class Piece{

  //Attributes
  protected Position position;
  protected List<Position> legalMoves = null;
  protected PiecesTypeEnum type;
  protected ColorEnum color;
  //protected Board board;// = Board.getInstance();

  /**
  * Constructor of Piece
  *
  * @param p = position of class Position
  *
  * @param color = element of class ColorEnum
  */
  public Piece(Position p, ColorEnum color) {
    this.position = p;
    this.color = color;
  }

  /**
  * Method getPosition
  *
  * @return a object of Position
  */
  public Position getPosition(){
    return this.position;
  }

  /**
  * Method getColor
  *
  * @return a object (color) of class ColorEnum
  */
  public ColorEnum getColor(){
    return this.color;
  }

  /**
  * Method moveTo what moves the piece
  *
  * @param p = a position of class Position
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
  * Abstract method getLegalMoves
  *
  * @return a list of positions
  */
  public abstract List<Position> getLegalMoves();

  /**
  * Method isLegalMove
  *
  * @param p = a position of class Position
  *
  * @return true if p is a legal move else false
  */
  public boolean isLegalMove(Position p) {
    List<Position> moves = this.getLegalMoves();
    return (moves.contains(p)) ? true : false;
  }

  /**
  * Method toString
  *
  * @return a String with type of piece
  */
  @Override
  public String toString() {
    return this.type.toString();
  }

  /**
  * Abstract method: equals
  *
  * @return true if one piece equals to another false in other case
  */
  @Override
  public abstract boolean equals(Object obj);
}
