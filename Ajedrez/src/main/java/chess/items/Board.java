package chess.items;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.chessPieces.*;

/**
* Clase Board
*/
public class Board{

  //Atributos
  public int SIZE = 8;
  public Piece[][] matrix;
  private static Board instance = null;

  /**
  * Constructor de Board
  *
  * Crea una matrix bidimensional de 8x8
  */
  private Board(){
    this.matrix = new Piece[SIZE][SIZE];
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        this.matrix[i][j] = new Empty(new Position(i, j), ColorEnum.NONE);
      }
    }
    this.matrix[4][0] = new Rook(new Position(4, 0), ColorEnum.WHITE);
    this.matrix[7][0] = new Rook(new Position(7, 0), ColorEnum.BLACK);
    this.matrix[4][4] = new Rook(new Position(4, 4), ColorEnum.BLACK);
  }

  /**
  * Método getInstance()
  *
  * @return un objeto de la clase Board
  */
  public static Board getInstance(){
    if(instance == null)
    instance = new Board();
    return instance;
  }

  /**
  * Métod getSize que regresa el tamaño del tablero
  *
  * @return un número entero
  */
  public int getSize(){
    return this.SIZE;
  }

  /**
  * Método move() que mueve a Pieza elegida a la posicion p y q
  *
  * @param una posicion p de la clase Position
  *
  * @param una posicion de la clase Position
  */
  public void move(Position p, Position q){
    if(!p.isLegal() || !q.isLegal())return;
    Piece piece = this.getPiece(p);
    if(!piece.isLegalMove(q))return;
    piece.moveTo(q);
    this.matrix[p.getX()][p.getY()] = new Empty(p,ColorEnum.NONE);
    this.matrix[q.getX()][q.getY()] = piece;
  }

  /**
  * Método getPiece
  *
  * @param una posicion p de la clase Position
  *
  * @return una objeto de la clase Piece
  */
  public Piece getPiece(Position p){
    //if(p.isOutOfBoard(SIZE))return null;
    return this.matrix[p.getX()][p.getY()];
  }

  /**
  * Método toString
  *
  * @return un String con el tablero
  */
  @Override
  public String toString(){
    var result = "";
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        result = " "+ this.matrix[i][j]+" "+result;
      }
      result += '\n';
    }
    return result;
  }

}
