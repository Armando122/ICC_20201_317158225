package shapesSVG;

/**
* Clase Linea que modela una línea
* @author Armando Ramírez González
*/
public class Linea extends Shape{

    /* Punto inicial de la línea. */
    private Vector2 v1;
    /* Punto final de la línea. */
    private Vector2 v2;
    /* Longitud de la línea. */
    private double longitud;

    /**
     * Constructor de una línea que no recibe parámetros.
     * Se define al punto inicial como (10.0,10.0) y al final como (120.0,120.0).
     */
    public Linea(){
      this.v1 = new Vector2(10.0,10.0);
      this.v2 = new Vector2(120.0,120.0);
      this.longitud = 5;
    }

    /**
     * Constructor de una línea que recibe dos vectores de la clase Vector2.
     * @param v1 vector inicial de la recta.
     * @param v2 vector final de la recta.
     */
    public Linea(Vector2 v1, Vector2 v2){
      this.v1 = new Vector2(v1);
      this.v2 = new Vector2(v2);
      this.longitud = (this.v1).distancia(this.v2);
    }

    /**
     * Constructor de una línea que recibe cuatro números
     * @param x1 abscisa del vector inicial.
     * @param y1 ordenada del vector inicial.
     * @param x2 abscisa del vector final.
     * @param y2 ordenada del vector final.
     */
    public Linea(double x1, double y1, double x2, double y2){
      this.v1 = new Vector2(x1,y1);
      this.v2 = new Vector2(x2,y2);
      this.longitud = (this.v1).distancia(this.v2);
    }

    /**
     * Método toSVG.
     * Regresa una cadena con el formato SVG de la línea.
     * @return String cadena con el círculo en SVG.
     * @see Círculo para las definiciones de stroke y stroke-width.
     * x1,y1 indican el vector incial de la línea.
     * x2,y2 indican el vector final de la línea.
     */
    public String toSVG(){
      String aux1 = ("<line x1='" + Double.toString(v1.getX())
                     + "' y1='" + Double.toString(v1.getY())
                     + "' x2='" + Double.toString(v2.getX())
                     + "' y2='" + Double.toString(v2.getY())
                     + "' stroke-width='3' stroke='Gold'/>");
      return aux1;
    }

    /**
     * Método toString.
     * Devuelve los atributos de la línea.
     * @return String cadena con las coordenadas iniciales y finales de la línea.
     */
    @Override public String toString(){
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
