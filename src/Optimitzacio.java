import java.util.Random;
import java.util.Scanner;

/**
 * Created by taha on 23/04/2017.
 */
public class Optimitzacio {

    private static int matrix[][];
    private static int N;
    private static int suma;

    public static void main(String[] args) {
        System.out.print("Introdueix el nombre d'elements del costat del quadrat ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        matrix = new int[N][N];

       llenarMatriz();
       imprimir();
       sumar();
    }

    private static void llenarMatriz() {
        modeEjecucion(0);
    }

    private static void imprimir() {
        modeEjecucion(1);
    }

    private static void sumar() {
        modeEjecucion(2);
        System.out.print("La suma de la diagonal és: ");
        System.out.println(suma);
    }

    private static void modeEjecucion(int mode) {

        int modo = mode;
        suma = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (modo == 0) {//llenar matriz con numeros aleatorios
                    Random rn = new Random();
                    int numAleatori = rn.nextInt(9) + 1;
                    if (i == j) matrix[i][j] = numAleatori;
                }
                if (modo == 1) {//imprimir matriz por pantalla
                    System.out.print(matrix[i][j] + " ");
                    if (j==N-1){System.out.println("");}
                }
                if (modo == 2) {//Realizar la suma de la matriz
                    suma = suma + matrix[i][j];
                }
            }
        }
    }
}