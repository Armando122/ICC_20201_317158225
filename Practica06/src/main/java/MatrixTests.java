
/*
* Clase MatrixText para probar la clase MatrixTest
*/
public class MatrixTests{
  public static void scalarProduct_test(){
    int[][] arreglo = {{1,2},{2,1}};
    Matrix a = new Matrix(arreglo);
    int [][] fin = {{2,4},{4,2}};
    Matrix f = new Matrix(fin);
    Matrix n = new Matrix(a.scalarProduct(2));
    if(f.equals(n) == true){
      System.out.println("scalarProduct: succeed");
    } else System.out.println("scalarProduct: failed");
  }

  public static void add_test(){
    int[][] arreglo1 = {{1,3,2},{1,0,0},{1,2,2}};
    int[][] arreglo2 = {{1,1,1},{2,2,2},{3,3,3}};
    int[][] resul = {{2,4,3},{3,2,2},{4,5,5}};
    Matrix a1 = new Matrix(arreglo1);
    Matrix a2 = new Matrix(arreglo2);
    Matrix r = new Matrix(resul);
    Matrix n = new Matrix(a1.add(a2));
    if(r.equals(n) == true){
      System.out.println("add: succeed");
    }else System.out.println("add: failed");
  }

  public static void matrixProduct_test(){
    int[][] arreglo1 = {{1,0,2},{2,1,2}};
    int[][] arreglo2 = {{1,2},{1,2},{1,2}};
    int[][] resultado = {{3,6},{5,10}};
    Matrix a1 = new Matrix(arreglo1);
    Matrix a2 = new Matrix(arreglo2);
    Matrix resul = new Matrix(resultado);
    if(resul.equals(a1.matrixProduct(a2)) == true){
      System.out.println("matrixProduct: succeed");
    } else System.out.println("matrixProduct: failed");
  }

  public static void setElement_test(){
    int[][] arreglo = {{1,0,2},{1,1,1}};
    int[][] cambio = {{1,0,3},{1,1,1}};
    Matrix a = new Matrix(arreglo);
    Matrix c = new Matrix(cambio);
    Matrix n = new Matrix(a.setElement(0,2,3));
    if(c.equals(n) == true){
      System.out.println("setElement: succeed");
    } else System.out.println("setElement: failed");
  }

  public static void getElement_test(){
    int[][] arreglo = {{1,0,2},{1,1,1}};
    Matrix a = new Matrix(arreglo);
    int busqueda = 2;
    if(a.getElement(0,2) == busqueda){
      System.out.println("get_element: succeed");
    } else System.out.println("getElement: failed");
  }

  public static void determinant_test(){
    int[][] arreglo = {{1,1},{2,2}};
    Matrix a = new Matrix(arreglo);
    int r = 0;
    if(a.determinant() == r){
      System.out.println("Determinant: succeed");
    } else System.out.println("Determinant: failed");
  }

  public static void equals_test(){
    int[][] p = {{1,0},{2,1}};
    int[][] l = {{1,0},{2,1}};
    Matrix n = new Matrix(p);
    Matrix m = new Matrix(l);
    if(n.equals(m) == true){
      System.out.println("equals: succeed");
    } else System.out.println("equals: failed");
  }

  public static void main(String[] args) {
    scalarProduct_test();
    add_test();
    matrixProduct_test();
    setElement_test();
    getElement_test();
    determinant_test();
    equals_test();
  }
}
