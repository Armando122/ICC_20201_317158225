import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.nio.file.Path;

/**
* Clase Writter para leer y escribir a escribir en archivos
* en java a su vez que se manejan excepciones
*
* @version 21 de noviembre 2019
*
* @author Armando Ramírez González
*/
class Writter {

  public static void main(String[] args) {
    try{
      //Archivo de entrada
      Path path = Paths.get("csv.txt");

      //Archivo de salida
      Path pathO = Paths.get("csvPolar.txt");
      List<String> lines = Files.readAllLines(path);
      String m = "";
      for (String string : lines) {
        String row[] = string.split(",");

        // Coordenadas x,y
        float f = Float.parseFloat(row[0]);
        float f1 = Float.parseFloat(row[1]);

        //Coordenadas en forma polar
        double r = Math.sqrt((f * f) + (f1 * f1));
        double theta = Math.atan2(f1,f);

        //String cadenita = String.valueOf(r);
        System.out.println("x: " + f + " y: " + row[1]);
        System.out.println("r: " + r + ", Ángulo: " + theta );
        m += ("r: " + r + ", Ángulo: " + theta +"\n");
      }
      Files.write(pathO, (m).getBytes());
    }
    catch(IOException e){
      System.err.println(e.getMessage());
    }
  }
}
