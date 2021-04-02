package shapesSVG;
/**
* Clase que modela un triángulo
* @author Armando Ramírez González
*/
public class Triangulo extends Shape implements Funcion{
  //Atributos
  private Vector2 a;
  private Vector2 b;
  private Vector2 c;

  /**
  * Constructor de un triángulo que no recibe parametros
  * Crea un Triangulo con:
  * a = (1.0,1.0)
  * b = (3.0,1.0)
  * c = (2.0,2.0)
  */
  public Triangulo(){
    this.a = new Vector2(1.0,1.0);
    this.b = new Vector2(3.0,1.0);
    this.c = new Vector2(2.0,2.0);
    this.perimetro = (this.a).distancia(this.b) + (this.c).distancia(this.a) + (this.c).distancia(this.b);
    this.area = ((this.a).distancia(this.b) * (this.c).distancia((this.a).puntoMedio(this.b)))/2.0;
  }

  /**
  * Constructor de un triángulo que recibe
  * @param a1 de la clase Vector2
  * @param b1 de la clase Vector2
  * @param c1 de la clase Vector2
  */
  public Triangulo(Vector2 v1, Vector2 v2, Vector2 v3){
    this.a = new Vector2(v1);
    this.b = new Vector2(v2);
    this.c = new Vector2(v3);
    this.perimetro = (this.a).distancia(this.b) + (this.c).distancia(this.a) + (this.c).distancia(this.b);
    double w = (this.a).getX() * ((this.b).getY() - (this.c).getY());
    double d = (this.b).getX() * ((this.c).getY() - (this.a).getY());
    double s = (this.c).getX() * ((this.a).getY() - (this.b).getY());
    this.area = Math.abs((w + d + s)/2.0);
  }

  /**
  * Constructor de un triángulo que Recibe
  * @param x1 número real
  * @param y1 número real
  * @param x2 número real
  * @param y2 número real
  * @param x3 número real
  * @param y3 número real
  *
  */
  public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3){
    this.a = new Vector2(x1,y1);
    this.b = new Vector2(x2,y2);
    this.c = new Vector2(x3,y3);
    this.perimetro = (this.a).distancia(this.b) + (this.c).distancia(this.a) + (this.c).distancia(this.b);
    double w = x1 * (y2 - y3);
    double d = x2 * (y3 - y1);
    double s = x3 * (y1 - y2);
    this.area = Math.abs((w + d + s)/2.0);
  }

  /**
   * Método para regresar el triángulo en formato SVG
   * @see Circulo para stroke, stroke-width y fill.
   * polygon points es de la forma x1,y1 x2,y2 x3,y3
   */
  public String toSVG(){
    String aux3 = "<polygon points='"+Double.toString(a.getX())+", "
                   +Double.toString(a.getY())+" "+Double.toString(b.getX())+", "
                   +Double.toString(b.getY())+" "+Double.toString(c.getX())+", "
                   +Double.toString(c.getY())
                   +"' fill='green' stroke-width='3' stroke='RoyalBlue' />";
    return aux3;
  }

  /**
  * Método para devolver los atributos del triángulo
  * en formato String
  */
  @Override
  public String toString(){
    String p = new String("Vector 1: "+a.getX()+", "+a.getY()+", \n"
    +"Vector 2: "+b.getX()+", "+b.getY()+", \n"
    +"Vector 3: "+c.getX()+", "+c.getY()+", \n"
    +"Perímetro: "+this.perimetro+", Área: " +this.area);
    return p;
  }

  /**
  * Método equals para comparar dos objetos de la clase Rectangulo
  * Devuelve True si son iguales False en caso contrario
  */
  @Override
  public boolean equals(Object ob3){
    if(ob3 instanceof Triangulo){
      Triangulo trin = (Triangulo)ob3;
      if(trin.equals(trin)) return true;
      return false;
    } else return false;
  }

  /**
  * Método transforma, que toma un Vector del triangulo y lo modifica.
  *
  * @param f un vector de la clase Vector2
  */
  @Override
  public void transforma(Vector2 f){
    this.a = new Vector2(f);
  }

}
