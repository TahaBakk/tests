/**
 * Created by x3727349s on 24/04/17.
 */
public class CalculEmpiric {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int n =50000000;
        int sum = n * (1 + n) / 2;
        long endTime = System.nanoTime() - startTime; // tiempo en que se ejecuta su método
        System.out.println("El temps d'execució del següent codi és:" + endTime+" milisegundos");
    }

}
