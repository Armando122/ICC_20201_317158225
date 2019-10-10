import java.util.ArrayList;
import java.util.Arrays;

/**
*
* Clase que resuelve diferentes algoritmos
*
* @author Armando Ramírez
*
* @version 1
*
*/
public class Control{

  //Problema 1: Saber si una palabra es palíndromo.
  public static boolean problema1(String palabra){
    String p = palabra;
    int l = p.length()-1;
    for(int i = 0; i<p.length(); i++){
      if(p.charAt(i) != p.charAt(l-i)){
        return false;
      }
    }
    return true;
  }

  /*
  *Problema 2: Dado un arreglo A y un número K,
  *determinar si hay 2 números en el arreglo que sumen K.
  */
  public static boolean problema2(int[] arreglo, int k){
    for (int i = 0; i<arreglo.length; i++) {
      for (int j = 0; j<arreglo.length-1-i; j++) {
        if (arreglo[i] != arreglo[j]) {
          if (arreglo[i] +  arreglo[j] == k) {
            return true;
          }
        }
      }
    }
    return false;
  }

  //Problema 3: Dado un arreglo A, retornar el mismo arreglo pero ordenado.
  public static void problema3(int[] arreglo){
    int aux = 0;
    for (int i = 0; i<arreglo.length; i++) {
      for (int j = 0; j<arreglo.length-1-i; j++) {
        if (arreglo[j] > arreglo[j+1]) {
          aux = arreglo[j];
          arreglo[j] = arreglo[j+1];
          arreglo[j+1] = aux;
        }
      }
    }
    return;
  }

  /*
  * Problema 4: Búsqueda binaria.
  * Dado un arreglo ordenado A, buscar un número K
  * y regresar true si está, false en otro caso.
  */
  public static boolean problema4(int[] arreglo, int buscando){
    for (int i = 0; i<arreglo.length; i++) {
      if (arreglo[i] == buscando) {
        return true;
      }
    }
    return false;
  }

  //Problema 5: Saber si un número K es primo
  public static boolean problema5(int n){
    if(n == 1) return true;
    for(int i = 2; i<n; i++){
      if(n%i == 0)return false;
    }
    return true;
  }

  //Problema 6:: Regresa todos los números primos menores a N.
  public static int[] problema6(int n){
    int a=0;
    int[] arr = new int[10000];
    for(int i = 2; i<n; i++){
      if(problema5(i)){
        arr[a]=i;
        a++;
      }
    }

    int def[] = new int[a];
    for (int i=0; i<a; i++){
      def[i]=arr[i];
    }
    return def;
  }

  public static void main(String[] args){
    String resultado = "";
    int[] desordenado = {9,8,7,6,5,4,3,2,1};
    int[] ordenado    = {1,2,3,4,5,6,7,8,9};
    int[] primos10 = {2,3,5,7};
    if(problema1("oso")==true && problema1("palabra")==false)resultado+="P1 bien\n";else resultado+="P1 mal\n";
    if(problema2(desordenado, 17)==true) resultado+="P2 bien\n";else resultado+="P2 mal\n";
    problema3(desordenado);
    if(Arrays.equals(desordenado,ordenado) == true)resultado+="P3 bien\n";else resultado+="P3 mal\n";
    if(problema4(desordenado,2)== true && problema4(desordenado,18)== false)resultado+="P4 bien\n";else resultado+="P4 mal\n";
    if(problema5(7)==true && problema5(6)==false)resultado+="P5 bien\n";else resultado+="P5 mal\n";
    if(Arrays.equals(problema6(10), primos10) == true)resultado+="P6 bien\n";else resultado+="P6 mal\n";
    System.out.println(resultado);
  }
}
