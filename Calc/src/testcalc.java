
import static org.junit.Assert.*;


import org.junit.Test;

public class testcalc {
    float valor1 = 2;
    float valor2 = 5;
    
	@Test
	public void testSomar() {
		float retornoEsperado = 7;
		
		float retornoFeito = Calcular.soma(valor1,valor2);
		assertEquals(retornoEsperado, retornoFeito,0);
	}
	
	@Test
	public void testSubtrai() {
		float retornoEsperado = 3;
		
		float retornoFeito = Calcular.subtrai(valor2,valor1);
		assertEquals(retornoEsperado, retornoFeito,0);
	}
	
	@Test
	public void testMultiplica() {
		float retornoEsperado = 10;
		
		float retornoFeito = Calcular.multiplica(valor1,valor2);
		assertEquals(retornoEsperado, retornoFeito,0);
	}
	
	@Test
	public void testDivide() {
		float retornoEsperado = (float) 2.5;
		
		float retornoFeito = Calcular.divide(valor2,valor1);
		assertEquals(retornoEsperado, retornoFeito,0);
	}

}
