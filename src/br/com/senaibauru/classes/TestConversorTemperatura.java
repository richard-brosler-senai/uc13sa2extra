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

	@DisplayName("Teste de verifica��o tipo temperatura origem v�lida")
	@Test
	void testTempOrigemValida() {
		assertDoesNotThrow(()->{
			this.cv.setTempOrigem("C");
		});
	}

	@DisplayName("Teste de verifica��o tipo temperatura origem inv�lida")
	@Test
	void testTempOrigemInvalida() {
		assertThrows(IllegalArgumentException.class, 
		()->{
			this.cv.setTempOrigem("X");
		});
	}

	@DisplayName("Teste de verifica��o tipo temperatura destino v�lida")
	@Test
	void testTempDestinoValida() {
		assertDoesNotThrow(()->{
			this.cv.setTempDestino("C");
		});
	}

	@DisplayName("Teste de verifica��o tipo temperatura destino inv�lida")
	@Test
	void testTempDestinoInvalida() {
		assertThrows(IllegalArgumentException.class, 
		()->{
			this.cv.setTempDestino("X");
		});
	}
	
	@DisplayName("Teste de convers�o C->F 32 graus")
	@Test
	void testConversaoC2F() {
		this.cv.setTempOrigem("C");
		this.cv.setTempDestino("F");
		this.cv.setTemperatura(32.00);
		assertEquals(89.6, this.cv.getTemperaturaDestino());
	}
	
}
