public class IntAndString{

    /* Método producto, que multiplica dos números recibidos. */
    private static int producto(int a, int b){
        return a*b;
    }

    /* Método division que divide dos números recibidos. */
    private static int division(int a, int b){
      if (b == 0) {
        return 0;
      }
        return a/b;
    }

    /* Método suma, que suma dos números recibidos. */
    private static int suma(int a, int b){
        return a+b;
    }

    /*
     * Método potencia, eleva el primer número recibido al
     * segundo número recibido.
     */
    private static double potencia(double a, double b){
        return Math.pow(a, b);
    }

    /* Método raizCuadrada, regresa la raíz cuadrada del número recibido. */
    private static double raizCuadrada(double a){
        return Math.sqrt(a);
    }

    /*
     * Método chicharronera, que recibe los tres coeficientes de un polinomio
     * de grado dos y regresa una raíz.
     */
    private static double chicharronera(double a, double b, double c){
        double ind = Math.pow(b, 2.0)-(4*a*c);
        double root = Math.sqrt(ind);
        double fin = (-b + root)/2*a;
        return fin;
    }

    /*
     * Método hipotenusa, que recibe dos números correspondientes a los dos catetos
     * de un triángulo rectángulo y regresa la hipotenusa del triángulo.
     */
    private static double hipotenusa(double a, double b){
        double cat1 = Math.pow(a, 2);
        double cat2 = Math.pow(b, 2);
        return Math.sqrt(cat1 + cat2);
    }

    /*
     * Método concatenacion, recibe dos cadenas de tipo String y regresa
     * la concatenación.
     */
    private static String concatenacion(String a, String b){
        return a + b;
    }

    /*
     * Método ultimaLetra, recibe una cadena de tipo String y devuelve
     * la última letra de la cadena.
     */
    private static char ultimaLetra(String string){
        int longitud = string.length();
        return string.charAt(longitud - 1);
    }

    /* Método longiud, recibe una cadena de tipo String y regresa su longitud. */
    private static int longitud(String string){
        int longitud = string.length();
        return longitud;
    }

    /*
     * Método reemplazaLasA, recibe una cadena de texto y una cadena.
     * Regresa la cadena con las letras a reemplazadas por el segundo parametro recibido.
     */
    private static String reemplazaLasA(String string,String reemplazo){
        String cadena = string.replaceAll("a", reemplazo);
        return cadena;
    }

    /*
     * Método parte.
     * Recibe una cadena de texto y regresa las palabras separadas por espacios.
     */
    private static String[] parte(String string, String separador){
        return string.split(separador);
    }

    /*
     * Método quitaEspacios.
     * Que recibe una cadena y quita los espacios que tiene al principio y al final.
     */
    private static String quitaEspacios(String string){
        return string.trim();
    }

    /* Pruebas unitarias. */
    public static void main(String[] args) {
        if(producto(5,5)!=25) System.out.println("Error en producto");else System.out.println("Producto bien");
        if(division(25,5)!=5) System.out.println("Error en division");else System.out.println("division bien");
        if(suma(5,6)!=11) System.out.println("Error en suma");else System.out.println("Suma bien");
        if(potencia(2,2)!=4) System.out.println("Error en potencia");else System.out.println("Potencia bien");
        if(raizCuadrada(25)!=5) System.out.println("Error en raiz");else System.out.println("Raiz bien");
        if(chicharronera(1,-8,16)!=4) System.out.println("Error en chicharronera");else System.out.println("chicharronera bien");
        if(hipotenusa(3, 4)!=5) System.out.println("Error en hipotenusa");else System.out.println("Hipotenusa bien");
        if(!concatenacion("Hola ","mundo").equals("Hola mundo")) System.out.println("Error en concatenacion");else System.out.println("concatenacion bien");
        if(ultimaLetra("Hola")!='a') System.out.println("Error en ultima letra");else System.out.println("Ultima letra bien");
        if(longitud("hola")!=4) System.out.println("Error en longiud");else System.out.println("longitud bien");
        if(!reemplazaLasA("Hola munda","o").equals("Holo mundo")) System.out.println("Error en reemplazar");else System.out.println("Reemplazar bien");
        if(parte("palabras,separadas,por,comas",",").length!=4) System.out.println("Error en partir");else System.out.println("Partir bien");
        if(!quitaEspacios("             Hola mundo         ").equals("Hola mundo")) System.out.println("Error en quitar espacios");else System.out.println("Quitar espacios bien");
    }
}
