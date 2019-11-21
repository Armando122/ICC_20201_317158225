package chess.items;

/**
* Clase Position
*/
public class Position{
  //Atributos
  private int x;
  private int y;

  /**
  * Constructor de Position
  *
  * @param un número entero
  *
  * @param un número entero
  */
  public Position(int x, int y){
    this.x = x;
    this.y = y;
  }

  /**
  * Método getX
  *
  * @return el valor de x
  */
  public int getX() {
    return x;
  }

  /**
  * Método isLegal
  *
  * @return true si el valor de x es menor a 8 y mayor a -1 y además
  *
  * @return true si y es menor a 8 y mayor a -1
  *
  * @return false en otro caso
  */
  public boolean isLegal(){
    return (this.x < 8 && this.x > -1 && this.y < 8 && this.y > -1 )? true: false;
  }

  /**
  * Método getY
  *
  * @return el valor de y
  */
  public int getY() {
    return y;
  }

  /**
  * Método equals para Position
  *
  * @return true si dos posciciones tienen el mismo valor en x e y
  */
  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Position))return false;
    Position p = (Position)obj;
    return (p.getX()==this.getX() && p.getY()== this.getY())? true: false;
  }

  /**
  * Método toString para Position
  * @return los valores x e y de una posicion
  */
  @Override
  public String toString() {
    return "  ||x:"+this.getX()+" y:"+this.getY()+"||";
  }

  /**
  * Método isOutOfBoard
  *
  * @return false cuando: el valor de y sea mayor o igual a la longitud
  * del tablero o cuando sea menor a cero
  *
  * @return false cuando:
  * el valor de x sea mayor o igual a la longitud del tablero
  * o cuando x sea menor a 0
  *
  */
  public boolean isOutOfBoard(int board_size){
    if(this.y >= board_size)return false;
    if(this.x >= board_size)return false;
    if(this.y < 0)return false;
    if(this.x < 0)return false;
    return true;
  }
}
