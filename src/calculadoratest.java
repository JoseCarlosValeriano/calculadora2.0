import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoratest {
    @Test
    public void testCreacionObjet() {
        calculadora calculo = new calculadora(3, 4, 1);

        assertNotNull(calculo);
    }

    @Test
    public void testSumar() {
        calculadora calculo = new calculadora(3, 4, 1);
        assertEquals(7, calculo.sumar(3, 4));
    }

    @Test
    public void testRestar() {
        calculadora calculo = new calculadora(4, 3, 1);
        assertEquals(-1, calculo.restar(3, 4));
    }

    @Test
    public void testMultiplicar() {
        calculadora calculo = new calculadora(3, 4, 1);
        assertEquals(12, calculo.multiplicar(3, 4));
    }

    @Test
    public void testDividir() {
        calculadora calculo = new calculadora(20, 10, 1);
        assertEquals(2, calculo.divisor(20, 10));
    }

    @Test
    public void testValorObsoluto() {
        calculadora calculo = new calculadora(5, 5, 1);
        assertEquals(5, calculo.valorAbsolute(5, 5));
    }

    @Test
    public void testElevado() {
        calculadora calculo = new calculadora(2, 4, 1);
        assertEquals(16, calculo.elevado(2, 4));
    }

    @Test
    public void testPositivo() {
        calculadora calculo = new calculadora(2, 4, 1);
        assertFalse(calculo.espositivo(-2));
    }
}