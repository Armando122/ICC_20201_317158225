//Importando processing como biblioteca
import processing.core.PApplet;

public class Clase extends PApplet{
  int ancho = 45;
  int color = 0;
  public static void main(String[] args){
    PApplet.main("Clase");
  }

  public void settings(){
    size(400,400);
  }

  public void setup(){
    fill(120,50,240);
  }

  public void draw(){
    for(int i = 0; i < 8; i++){
      for(int j = 0; j < 8; j++){
        fill(255);
        rect(i*ancho+10, j*ancho+10,ancho,ancho);
      }
    }
  }
}
