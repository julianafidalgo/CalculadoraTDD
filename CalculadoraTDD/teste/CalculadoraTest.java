import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void diferencia() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.diferencia(3,2);
        assertEquals(resultado,1);
    }

    @Test
    void divisao(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.divisao(10,5);
        assertEquals(resultado, 2);
    }

    @Test
    void produto() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.produto(1,2);
        assertEquals(resultado, 2);
    }

    @Test
    void soma() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.soma(1,2);
        assertEquals(resultado, 3);
    }
}