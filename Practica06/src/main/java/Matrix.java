import java.util.Iterator;

/**
* Clase que modela una matriz
*
* @author Armando Ramírez
*/
public class Matrix implements Iterable<Matrix>{
  //Atributos
  private int[][] matriz;

  public Iterator<Matrix> iterator() {
    Iterator i = new MatrixIterator();
    return i;
  }

  /**
  * Constructor para una matriz vacía de n filas por m columnas que recibe:
  *
  * @param n = número entero
  *
  * @param m = número entero
  */
  public Matrix(int n, int m){
    this.matriz = new int[n][m];
  }

  /**
  * Constructor de una matriz dado un arreglo
  *
  * @param array = un arreglo
  */
  public Matrix(int[][] array){
    this.matriz = array;
  }

  /**
  *
  */
  protected class MatrixIterator implements Iterator<Matrix>{
    protected int posicionArray;

    public MatrixIterator(){
      this.posicionArray = 0;
    }

    public boolean hasNext(){
      boolean resul;
      if(this.posicionArray < (matriz[0]).length){
        resul = true;
      } else {
        resul = false;
      }
      return resul;
    }

    public Matrix next(){
      this.posicionArray++;
      int[][] aux = new int[0][this.posicionArray-1];
      return new Matrix(aux);
    }

    public void remove(){
      throw new UnsupportedOperationException("No disponible.");
    }
  }

  /**
  * Función que calcula producto escalar
  *
  * @param scalar = número entero
  */
  public int[][] scalarProduct(int scalar){
    for (int i = 0; i<this.matriz.length; i++) {
      for (int j = 0; j<this.matriz[0].length; j++) {
        this.matriz[i][j] = this.matriz[i][j] * scalar;
      }
    }
    return this.matriz;
  }

  /**
  * Función add que calcula la suma de dos matrices
  * @param m = objeto de la clase Matrix
  */
  public int[][] add(Matrix m){
    for(int i = 0; i<this.matriz.length; i++){
      for(int j = 0; j<this.matriz[0].length; j++){
        this.matriz[i][j] = this.matriz[i][j] + m.getElement(i,j);
      }
    }
    return this.matriz;
  }

  /**
  * Función matrixProduct que calcula producto de matrices
  * @param m = una matriz de la clase Matrix
  */
  public Matrix matrixProduct(Matrix m){
    Matrix n = new Matrix(matriz.length, m.matriz[0].length);
    for(int i = 0; i<n.matriz.length; i++){
      for(int j = 0; j<n.matriz[0].length; j++){
        for(int k = 0; k<matriz[0].length; k++){
          n.matriz[i][j] += (matriz[i][k] * m.matriz[k][j]);
        }
      }
    }
    return n;
  }

  /**
  * Función que obtiene el elemento i j
  * @param i = número entero (fila)
  * @param j = número entero (columna)
  */
  public int getElement(int i, int j){
    return this.matriz[i][j];
  }

  /**
  * Function set element que cambia un elemento en la
  * posición i, j por e. Que recibe:
  * @param i = fila
  * @param j = columna
  * @param e = nuevo número entero
  */
  public int[][] setElement(int i, int j, int e){
    this.matriz[i][j] = e;
    //Matrix n = new Matrix(this.matriz);
    return this.matriz;
  }

  /**
  * Función que calcula el determinante de una matriz de nxn
  *
  * @return entero
  */
  public int determinant(){
    if((this.matriz.length == 2) && (this.matriz[0].length == 2)){
      int n = (this.matriz[0][0] * this.matriz[1][1]) - (this.matriz[0][1] * this.matriz[1][0]);
      return n;
    } else return 0;
  }

  /**
  * Función equals que te dice si 2 matrices son iguales
  */
  @Override
  public boolean equals(Object o){
    if(o instanceof Matrix){
      Matrix max = (Matrix)o;
      for(int i = 0; i<max.matriz.length; i++){
        for(int j = 0; j<max.matriz[0].length; j++){
          if(max.getElement(i,j) != this.getElement(i,j)){
            return false;
          }
        }
      }return true;
    } else return false;
  }
}
