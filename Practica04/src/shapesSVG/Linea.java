package shapesSVG;

/**
* Clase que modela una línea
* @author Armando Ramírez González
*/
public class Linea extends Shape{
  //Atributos
  private Vector2 v1;
  private Vector2 v2;
  private double longitud;

  /**
  * Constructor de una línea que no recibe parámetros.
  * @param v1 = (10.0,10.0)
  * @param v2 = (120.0,120.0)
  * @param longitud = 5
  */
  public Linea(){
    this.v1 = new Vector2(10.0,10.0);
    this.v2 = new Vector2(120.0,120.0);
    this.longitud = 5;
  }

  /**
  * Constructor de una línea que recibe dos vectores de la clase Vector2.
  * @param v1 = Vector de la clase Vector2
  * @param v2 = Vector de la clase Vector2
  * @param longitud = Número real
  */
  public Linea(Vector2 v1, Vector2 v2){
    this.v1 = new Vector2(v1);
    this.v2 = new Vector2(v2);
    this.longitud = (this.v1).distancia(this.v2);
  }

  /**
  * Constructor de una línea que recibe cuatro números
  * @param x1 número real
  * @param y1 número real
  * @param x2 número real
  * @param y2 número real
  *
  */
  public Linea(double x1, double y1, double x2, double y2){
    this.v1 = new Vector2(x1,y1);
    this.v2 = new Vector2(x2,y2);
    this.longitud = (this.v1).distancia(this.v2);
  }

  /**
  * Método para regresar la linea en formato SVG
  *
  */
  public String toSVG(){
    String aux1 = "<line x1='"+Double.toString(v1.getX())+"' y1='"+Double.toString(v1.getY())+"' x2='"+Double.toString(v2.getX())+"' y2='"+Double.toString(v2.getY())+"' stroke-width='3' stroke='Gold'/>";
    return aux1;
  }

  /**
  * Método para devolver los atributos de la línea
  * en formato String
  */
  @Override
  public String toString(){
    String p = new String(v1.getX()+" "+v1.getY()+", "+v2.getX()+", "+v2.getY());
    return p;
  }

  /**
  * Método equals para comparar dos objetos de la clase Vector2
  * Devuelve True si son iguales False en caso contrario
  */
  @Override
  public boolean equals(Object ob2){
    if(ob2 instanceof Linea){
      Linea linea = (Linea)ob2;
      if(linea.equals(linea)) return true;
      return false;
    } else return false;
  }
}
