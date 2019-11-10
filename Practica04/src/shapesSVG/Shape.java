package shapesSVG;

/**
* Creación de la clase abstracta Shape
*/
public abstract class Shape implements Comparable <Shape>{
  protected double area;
  protected double perimetro;

  public abstract String toSVG();

  /**
  * Método para obtener el área
  */
  public double getArea(){
    return this.area;
  }

  /**
  * Método para obtener el perímetro
  */
  public double getPerimetro(){
    return this.perimetro;
  }

  /**
  * Método compareTo
  * @param s = objeto de la clase Shape
  * @return 1 si el área que compara es mayor a la de s
  * @return 0 si las áreas son iguales
  * @return -1 si el área de s es mayor a la que recibe
  */
  public int compareTo(Shape s){
    if((this.area - s.getArea()) > 0)return 1;
    if((this.area - s.getArea()) == 0) return 0;
    if((this.area - s.getArea()) < 0) return -1;
    return 0;
  }
}
