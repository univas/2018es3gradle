package br.edu.univas.si5.es3.helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	private Calculadora calculadora = new Calculadora();

	@Test
	public void sumTwoZeroes() {
		int result = calculadora.somar(0, 0);
		assertEquals(0, result);
	}

	@Test
	public void sumPositiveNumbers() {
		int result = calculadora.somar(5, 10);
		assertEquals(15, result);
	}

}
