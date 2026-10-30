package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import gt.edu.umes.proy.calculo.LogicaDelNegocio;

class CalculoSegundosTest {

    @Test
    void parametrosConLetrasLanzanExcepcion() {
        String[] parametros = {"1", "3", "a", "20", "1"};

        IllegalArgumentException excepcion = assertThrows(
                IllegalArgumentException.class,
                () -> LogicaDelNegocio.calcularSegundos(parametros));

        assertTrue(excepcion.getMessage().contains("5 numeros enteros"));
    }

    @Test
    void calculaSegundosCorrectamente() {
        String[] parametros = {"1", "3", "6", "20", "1"};

        assertEquals(4996860L,
                LogicaDelNegocio.calcularSegundos(parametros));
    }
}