package Stratego;


import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenniferbueso
 */
public class VillanosTablero {
   // Matriz que almacena las posiciones de los villanos
    private int[][] Posicion_Villano;

    // Constructor de la clase
    public VillanosTablero() {
        // Inicialización de la matriz y contador de villanos
        Posicion_Villano = new int[4][10];
        int contvillanos = 0;

        // Bucle para llenar la matriz con números del -1 al -40
        for (int i = 0; i < Posicion_Villano.length; i++) {
            for (int j = 0; j < Posicion_Villano[i].length; j++) {
                Posicion_Villano[i][j] = --contvillanos;
            }
        }

        // Llamada al método para imprimir la matriz
        imprimirMatriz();
    }

    // Método privado para imprimir la matriz de manera formateada
    private void imprimirMatriz() {
        for (int i = 0; i < Posicion_Villano.length; i++) {
            System.out.println(Arrays.toString(Posicion_Villano[i]));
        }
    }

    // Método getter para obtener la matriz de posiciones de villanos
    public int[][] getPosicion_Villano() {
        return Posicion_Villano;
    }

    // Método main para probar la funcionalidad de la clase
    public static void main(String[] args) {
        new VillanosTablero();
    } 
}
