package shapesSVG;
/**
* Clase que modela un punto
* @author Armando Ramírez González
*/
public class Vector2 extends Shape{
  //Atributos
  private double x;
  private double y;
  private double magnitud;

  /**
  * Constructor Vector2
  * @param x = 0
  * @param y = 0
  *
  */

  public Vector2(){
    this.x = 0.0;
    this.y = 0.0;
  }

  /**
  * Constructor Vector2
  * @param x1 un número real
  * @param y1 un número real
  *
  */
  public Vector2(double x1, double y1){
    this.x = x1;
    this.y = y1;
  }

  /**
  * Constructor espejo Vector2
  * @param otro un objeto de la clase Vector2
  */
  public Vector2(Vector2 otro){
    this.x = otro.getX();
    this.y = otro.getY();
  }

  /**
  * Métodos para la obtención de las coordenadas X y Y del punto
  */
  public double getX(){
    return this.x;
  }

  public double getY(){
    return this.y;
  }

  /**
  * Método para calcular la distancia a otro vector
  * @param Recibe un vector de la clase Vector2
  */
  public double distancia(Vector2 ob2){
    double r = Math.pow((this.x - ob2.getX()),2);
    double s = Math.pow((this.y - ob2.getY()),2);
    double d = Math.sqrt(r + s);
    return d;
  }

  /**
  * Método para calcular las coordenadas del punto medio de dos puntos
  * @param a objeto de la clase Vector2
  */
  public Vector2 puntoMedio(Vector2 a){
    double r = (this.x + a.getX())/2.0;
    double s = (this.y + a.getY())/2.0;
    Vector2 q = new Vector2(r,s);
    return q;
  }

  /**
  * Método para regresar la figura en formato SVG
  *
  */
  public String toSVG(){
    String aux = "<circle cx='"+Double.toString(this.x)+"' cy='"+Double.toString(this.y)+"' r='"+Double.toString(this.magnitud)+"' fill='RoyalBlue'/>";
    return aux;
  }

  /**
  * Método para devolver las coordenadas del punto
  * en formato String
  */
  public String toString(){
    String p = new String(this.x+" "+this.y);
    return p;
  }

  /**
  * Método equals para comparar dos objetos de la clase Vector2
  * Devuelve True si son iguales False en caso contrario
  */
  @Override
  public boolean equals(Object ob1){
    if(ob1 instanceof Vector2){
      Vector2 vec = (Vector2)ob1;
      if(vec.equals(vec)) return true;
      return false;
    } else return false;
  }
}
