package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculadoraTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void resta() {
        Calculadora calculadora = new Calculadora();
        assertEquals(7, calculadora.resta(6, 3));
    }

    @Test
    void suma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6, Calculadora.suma(3,3));
    }
}