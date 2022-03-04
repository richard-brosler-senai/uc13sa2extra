package br.com.senaibauru.classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestConversorTemperatura {
	private ConversorTemperatura cv;
	
	@BeforeEach
	public void setUpBeforeClass() throws Exception {
		this.cv = new ConversorTemperatura();
	}

	@AfterEach
	public void tearDownAfterClass() throws Exception {
		
	}

	@DisplayName("Teste de verificação tipo temperatura origem válida")
	@Test
	void testTempOrigemValida() {
		assertDoesNotThrow(()->{
			this.cv.setTempOrigem("C");
		});
	}

	@DisplayName("Teste de verificação tipo temperatura origem inválida")
	@Test
	void testTempOrigemInvalida() {
		assertThrows(IllegalArgumentException.class, 
		()->{
			this.cv.setTempOrigem("X");
		});
	}

	@DisplayName("Teste de verificação tipo temperatura destino válida")
	@Test
	void testTempDestinoValida() {
		assertDoesNotThrow(()->{
			this.cv.setTempDestino("C");
		});
	}

	@DisplayName("Teste de verificação tipo temperatura destino inválida")
	@Test
	void testTempDestinoInvalida() {
		assertThrows(IllegalArgumentException.class, 
		()->{
			this.cv.setTempDestino("X");
		});
	}
	
	@DisplayName("Teste de conversão C->F 32 graus")
	@Test
	void testConversaoC2F() {
		this.cv.setTempOrigem("C");
		this.cv.setTempDestino("F");
		this.cv.setTemperatura(32.00);
		assertEquals(89.6, this.cv.getTemperaturaDestino());
	}

	@DisplayName("Teste de conversão C->K 32 graus")
	@Test
	void testConversaoC2K() {
		this.cv.setTempOrigem("C");
		this.cv.setTempDestino("K");
		this.cv.setTemperatura(32.00);
		assertEquals(305.15, this.cv.getTemperaturaDestino());
	}

	@DisplayName("Teste de conversão F->C 32 graus")
	@Test
	void testConversaoF2C() {
		this.cv.setTempOrigem("F");
		this.cv.setTempDestino("C");
		this.cv.setTemperatura(32.00);
		assertEquals(0, this.cv.getTemperaturaDestino());
	}
	
	@DisplayName("Teste de conversão F->K 32 graus")
	@Test
	void testConversaoF2K() {
		this.cv.setTempOrigem("F");
		this.cv.setTempDestino("K");
		this.cv.setTemperatura(32.00);
		assertEquals(273.15, this.cv.getTemperaturaDestino());
	}

	@DisplayName("Teste de conversão K->C 32 graus")
	@Test
	void testConversaoK2C() {
		this.cv.setTempOrigem("K");
		this.cv.setTempDestino("C");
		this.cv.setTemperatura(32.00);
		assertEquals(-241.15, this.cv.getTemperaturaDestino());
	}

	@DisplayName("Teste de conversão K->F 32 graus")
	@Test
	void testConversaoK2F() {
		this.cv.setTempOrigem("K");
		this.cv.setTempDestino("F");
		this.cv.setTemperatura(32.00);
		assertEquals(-402.07, this.cv.getTemperaturaDestino());
	}
	
}
