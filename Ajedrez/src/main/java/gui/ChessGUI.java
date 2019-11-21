package gui;

import java.util.LinkedList;
import java.util.List;

import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import processing.core.PApplet;
import processing.core.PImage;

/**
* Clase ChessGUI que hereda de PApplet
*
* Para crear el tablero en la interfaz gráfica Processing
*
* @see PApplet
*/
public class ChessGUI extends PApplet {

  //Atributos
  Position selected = null;
  ColorEnum turn = ColorEnum.WHITE;
  int PIXEL_SIZE = 50;
  List<Position> legalMoves = new LinkedList<>();
  Board board = Board.getInstance();
  PImage black_bishop;
  PImage black_king;
  PImage black_knight;
  PImage black_pawn;
  PImage black_queen;
  PImage black_rook;
  PImage white_bishop;
  PImage white_king;
  PImage white_knight;
  PImage white_pawn;
  PImage white_queen;
  PImage white_rook;

  /**
  * Método main para la creación del juego
  */
  public static void main(String[] args) {
    PApplet.main("gui.ChessGUI");
  }

  //Método setting para medida del marco
  @Override
  public void settings() {
    size(400, 440);
  }

  //Métdo setup para crear y acomodar las piezas
  @Override
  public void setup() {
    // legalMoves = board.getPiece(new Position(4,4)).getLegalMoves();
    //System.out.println(board.getPiece(new Position(4, 4)).getLegalMoves());
    black_bishop = loadImage(getClass().getResource("./black-bishop-50.png").getPath());
    black_king = loadImage(getClass().getResource("./black-king-50.png").getPath());
    black_knight = loadImage(getClass().getResource("./black-knight-50.png").getPath());
    black_pawn = loadImage(getClass().getResource("./black-pawn-50.png").getPath());
    black_queen = loadImage(getClass().getResource("./black-queen-50.png").getPath());
    black_rook = loadImage(getClass().getResource("./black-rook-50.png").getPath());
    white_bishop = loadImage(getClass().getResource("./white-bishop-50.png").getPath());
    white_king = loadImage(getClass().getResource("./white-king-50.png").getPath());
    white_knight = loadImage(getClass().getResource("./white-knight-50.png").getPath());
    white_pawn = loadImage(getClass().getResource("./white-pawn-50.png").getPath());
    white_queen = loadImage(getClass().getResource("./white-queen-50.png").getPath());
    white_rook = loadImage(getClass().getResource("./white-rook-50.png").getPath());
  }

  //Método draw para dibujar las piezas
  @Override
  public void draw() {
    drawBoard();
    drawPosibleMoves();
    writeTurn();
  }

  /**
  * Método writeTurn que dibuja el tablero
  */
  public void writeTurn() {
    fill(255, 255, 255);
    rect(0,400,400,40);
    textSize(20);
    fill(0, 0, 0);
    text(turn.toString().toLowerCase()+" moves", 30, 430);
  }

  /*
  * Método drawPosibleMoves
  *
  * Dibuja los movimientos posibles para la pieza
  */
  public void drawPosibleMoves() {
    stroke(255, 0, 0);
    fill(0, 0, 0, 100);
    for (Position g : legalMoves) {
      int x = g.getX();
      int y = g.getY();
      rect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
    }
    stroke(0, 0, 0);
  }

  /*
  * Método drawBoard
  *
  * Dibuja el tablero
  */
  public void drawBoard() {
    for (int i = 0; i < board.getSize(); i++) {
      for (int j = 0; j < board.getSize(); j++) {
        if (i % 2 == 0) {
          if (j % 2 == 0)
          fill(99,221, 99);
          else
          fill(255, 255, 255);
        } else {
          if (j % 2 == 0)
          fill(255, 255, 255);
          else
          fill(99,221, 99);
        }
        rect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        Piece p = board.getPiece(new Position(i, j));
        drawPiece(p);
      }
    }
  }

  /*
  * Método draw Piece que dibuja y acomoda las piezas
  *
  */
  public void drawPiece(Piece p) {
    int x = p.getPosition().getX();
    int y = p.getPosition().getY();
    switch (p.getType()) {
      case ROOK:
      if (p.getColor().equals(ColorEnum.WHITE))
      image(white_rook, x * PIXEL_SIZE, y * PIXEL_SIZE);
      if (p.getColor().equals(ColorEnum.BLACK))
      image(black_rook, x * PIXEL_SIZE, y * PIXEL_SIZE);
      break;
      case EMPTY:
      break;
      default:
      break;
    }
  }

  /*
  * Método mouseClicked que mueve la muestras los posible movimientos
  * de la pieza al darle click
  */
  @Override
  public void mouseClicked() {
    int x = mouseX / PIXEL_SIZE;
    int y = mouseY / PIXEL_SIZE;
    Position p = new Position(x, y);
    if(!p.isLegal())return;
    Piece piece = board.getPiece(p);

    if (selected == null) {

      if (!piece.getColor().equals(turn))
      return;
      this.legalMoves = piece.getLegalMoves();
      selected = p;
      return;
    } else {
      this.legalMoves = piece.getLegalMoves();
      Piece piece2 = board.getPiece(selected);
      if (!piece2.isLegalMove(p)) {
        selected = null;
        return;
      }
      if (turn.equals(ColorEnum.WHITE))
      turn = ColorEnum.BLACK;
      else
      turn = ColorEnum.WHITE;
      this.board.move(selected, new Position(x, y));
      selected = null;
    }
    this.legalMoves = new LinkedList<>();
    System.out.println(x);
    System.out.println(y);
  }

}
