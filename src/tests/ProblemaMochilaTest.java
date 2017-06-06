import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

/**
 * Created by x3727349s on 24/04/17.
 */
public class ProblemaMochilaTest {


    @Test
    @After
    public void resolverProblema() throws Exception {
        ProblemaMochila pm = new ProblemaMochila(20);
        //el peso del contenido  tiene que ser menor al peso de la motchila
        assertTrue ("El peso de la mochila supera el peso maximo",pm.pesoMochila < pm.pesoMaximo );
    }


    @Test
    public void cargarDatos() throws Exception {

        ProblemaMochila pm = new ProblemaMochila(20);

        Vector<ProblemaMochila.Elemento> almacen2 = new Vector<ProblemaMochila.Elemento>();

        almacen2.add(new ProblemaMochila.Elemento("TV",        300, 15));
        almacen2.add(new ProblemaMochila.Elemento("PS3",       100,  3));
        almacen2.add(new ProblemaMochila.Elemento("Libro Java", 10,  1));
        almacen2.add(new ProblemaMochila.Elemento("DVD Player",  5,  0.5));
        almacen2.add(new ProblemaMochila.Elemento("Blu-Ray",    50,  0.5));
        almacen2.add(new ProblemaMochila.Elemento("Balon",      30,  0.5));
        almacen2.add(new ProblemaMochila.Elemento("iPod",      150,  1));
        almacen2.add(new ProblemaMochila.Elemento("Printer",    20,  4));
        almacen2.add(new ProblemaMochila.Elemento("VideoBeam", 200,  4));
        almacen2.add(new ProblemaMochila.Elemento("LapTop",     20,  3));
        almacen2.add(new ProblemaMochila.Elemento("iPad",      150,  2));
        almacen2.add(new ProblemaMochila.Elemento("PC",        100,  5));
        almacen2.add(new ProblemaMochila.Elemento("BlackBerry",150,  0.5));

        assertEquals("Error en el tamaño del almacen!", 13, pm.almacen.size(), 0);
    }

    @Test
    public void mostrarMochila() throws Exception {
        ProblemaMochila pm = new ProblemaMochila(20);
        double peso = 13;
        assertTrue (pm.pesoMochila < peso );

    }




}