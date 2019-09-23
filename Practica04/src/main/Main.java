package main;
import shapesSVG.*;

/*
* Clase main para probar el paquete SVG
*/
public class Main{
  public static void main(String[] args){
    //Creación del lienzo
    String inicio = "<svg heigth='700' width='700'>";
    String cierre = "</svg>";

    //Creación de las figuras
    //Línea
    Vector2 v1 = new Vector2(10,10);
    Vector2 v2 = new Vector2(250,300);
    Linea l = new Linea(v1,v2);
    System.out.println(inicio);
    System.out.println(l.toSVG());
    System.out.println(cierre);

    //Rectángulo
    Vector2 vr = new Vector2(10,10);
    Rectangulo r = new Rectangulo(vr,100,80);
    System.out.println(inicio);
    System.out.println(r.toSVG());
    System.out.println(cierre);

    //Triángulo
    Vector2 a = new Vector2(10,10);
    Vector2 b = new Vector2(100,10);
    Vector2 c = new Vector2(100,90);
    Triangulo t = new Triangulo(a,b,c);
    System.out.println(inicio);
    System.out.println(t.toSVG());
    System.out.println(cierre);

    //Círculo
    Vector2 cent = new Vector2(60,60);
    Circulo circ = new Circulo(cent,50);
    System.out.println(inicio);
    System.out.println(circ.toSVG());
    System.out.println(cierre);
  }
}
