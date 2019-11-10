package shapesSVG;
/**
* Clase que modela un círculo
* @author Armando Ramírez González
*/
public class Circulo extends Shape{
  //Atributos
  private Vector2 centro;
  private double radio;

  /**
  * Constructor de un círculo que no recibe parámetros.
  * @param centro = (60.0,60.0)
  * @param radio = 50.0
  */
  public Circulo(){
    this.centro = new Vector2(60.0,60.0);
    this.radio = 50.0;
    this.perimetro = 2.0 * this.radio + Math.PI;
    this.area = (Math.PI*Math.pow(this.radio,2))/2.0;
  }

  /**
  * Constructor de un círculo que recibe:
  * @param centro1 = Vector de la clase Vector2
  * @param radio1 = un número real
  *
  */
  public Circulo(Vector2 centro1, double radio1){
    this.centro = new Vector2(centro1);
    this.radio = radio1;
    this.perimetro = 2.0 * this.radio + Math.PI;
    this.area = (Math.PI*Math.pow(this.radio,2))/2.0;
  }

  /**
  * Constructor de un circulo que recibe:
  * @param x1 número real
  * @param y1 número real
  * @param radio1 número real
  *
  */
  public Circulo(double x1, double y1, double radio1){
    this.centro = new Vector2(x1,y1);
    this.radio = radio1;
    this.perimetro = 2.0 * this.radio + Math.PI;
    this.area = (Math.PI*Math.pow(this.radio,2))/2.0;
  }

  /**
  * Método que regresa los valores del círculo en formato SVG
  *
  */
  public String toSVG(){
    String aux2 = "<circle cx='"+Double.toString(centro.getX())+"' cy='"
    +Double.toString(centro.getY())+"' r='"
    +Double.toString(this.radio)+"' stroke='green' stroke-width='4' fill='yellow' />";
    return aux2;
  }

  /**
  * Método para devolver los atributos del círculo
  * en formato String
  *
  */
  @Override
  public String toString(){
    String p = new String(centro.getX()+" "+centro.getY()+", "+this.radio+", \n"
    +"Perímetro: "+this.perimetro+". Área: "+this.area);
    return p;
  }

  /**
  * Método equals para comparar dos objetos de la clase Vector2
  * Devuelve True si son iguales False en caso contrario
  */
  @Override
  public boolean equals(Object ob5){
    if(ob5 instanceof Circulo){
      Circulo circ = (Circulo)ob5;
      if(circ.equals(circ)) return true;
      return false;
    } else return false;
  }
}
