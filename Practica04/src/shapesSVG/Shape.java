package shapesSVG;

/**
* Clase abstracta Shape.
* @author Armando Ramirez González
*/
public abstract class Shape implements Comparable<Shape>{

    /* Área de la figura. */
    protected double area;
    /* Perímetro de la figura. */
    protected double perimetro;

    /**
     * Método toSVG.
     * @return una cadena con el formato de la figura en SVG.
     */
    public abstract String toSVG();

    /**
     * Método getArea para obtener el área de la figura.
     * @return double el área de la figura.
     */
    public double getArea(){
      return this.area;
    }

    /**
     * Método getPerimetro que devuelve el perímetro de la figura.
     * @return double el perímetro de la figura.
     */
    public double getPerimetro(){
      return this.perimetro;
    }

    /**
     * Método compareTo
     * @param figura figura con la que se va a comparar.
     * @return 1 si el área que compara es mayor a la de figura
     * 0 si las áreas son iguales y -1 si el área de figura es mayor a la que recibe.
     */
    public int compareTo(Shape figura){
      if((this.area - s.getArea()) > 0)return 1;
      if((this.area - s.getArea()) == 0) return 0;
      if((this.area - s.getArea()) < 0) return -1;
      return 0;
    }
}
