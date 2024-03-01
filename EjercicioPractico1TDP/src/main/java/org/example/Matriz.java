package org.example;

public class Matriz {
    private int[][] datos;

    // Constructor que crea la matriz con los datos proporcionados
    public Matriz(int[][] datos) {
        this.datos = datos;
    }

    // Método para imprimir la matriz
    public void imprimir() {
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para calcular y devolver la transpuesta de la matriz
    public Matriz transpuesta() {
        int filas = datos.length;
        int columnas = datos[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = datos[i][j];
            }
        }

        return new Matriz(transpuesta);
    }

    // Método main para probar la clase Matriz
    public static void main(String[] args) {
        Matriz m = new Matriz(new int[][]{{1, 2}, {3, 4}});
        System.out.println("Matriz original:");
        m.imprimir();

        Matriz mTranspuesta = m.transpuesta();
        System.out.println("Matriz transpuesta:");
        mTranspuesta.imprimir();
    }
}
