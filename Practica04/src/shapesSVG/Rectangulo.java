package shapesSVG;
/**
* Clase que modela un rectángulo
* @author Armando Ramírez González
*/
public class Rectangulo extends Shape{
  //Atributos
  private Vector2 a;
  private double ancho;
  private double alto;

  /**
  * Constructor de un rectángulo que no recibe parametros
  * @param a = (1.0,1.0)
  * @param ancho = 2
  * @param alto = 1
  * @param perimetro = 6
  * @param area = 2
  */
  public Rectangulo(){
    this.a = new Vector2(1.0,1.0);
    this.ancho = 2.0;
    this.alto = 1.0;
    this.perimetro = 6.0;
    this.area = 2.0;
  }

  /**
  * Constructor de un rectángulo que Recibe
  * @param Vector2 de la clase Vector2
  * @param ancho número real
  * @param alto número real
  */
  public Rectangulo(Vector2 nuevo, double ancho1, double alto1){
    this.a = new Vector2(nuevo);
    this.ancho = ancho1;
    this.alto = alto1;
  }

  /**
  * Constructor de un rectángulo que Recibe
  * @param x número real
  * @param y número real
  * @param ancho número real
  * @param alto número real
  */
  public Rectangulo(double x, double y, double ancho1, double alto1){
    this.a = new Vector2(x,y);
    this.ancho = ancho1;
    this.alto = alto1;
  }

  /**
  * Método para regresar el rectángulo en formato SVG
  * @see Círculo para definir stroke, stroke-width y fill.
  * x,y indican la coordenada de la esquina superior izquierda
  *     del rectangulo.
  * width indica el ancho del rectangulo.
  * height indica la altura del rectangulo.
  */
  public String toSVG(){
    String aux2 = ("<rect x='"+Double.toString(a.getX())
                   +"' y='"+Double.toString(a.getY())
                   +"' width='"+Double.toString(this.ancho)
                   +"' height='"+Double.toString(this.alto)
                   +"' fill='RoyalBlue'/>");
    return aux2;
  }

  /**
  * Método para devolver los atributos del rectángulo
  * en formato String
  */
  @Override
  public String toString(){
    String p = new String(a.getX()+" "+a.getY()+", "+this.ancho+", "+this.alto);
    return p;
  }

  /**
  * Método equals para comparar dos objetos de la clase Rectangulo
  * Devuelve True si son iguales False en caso contrario
  */
  @Override
  public boolean equals(Object ob2){
    if(ob2 instanceof Rectangulo){
      Rectangulo rec = (Rectangulo)ob2;
      if(rec.equals(rec)) return true;
      return false;
    } else return false;
  }
}
