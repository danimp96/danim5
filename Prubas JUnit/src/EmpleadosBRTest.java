import static org.junit.Assert.*;

import org.junit.Test;


public class EmpleadosBRTest {

	EmpleadosBR e=new EmpleadosBR();
	
	@Test
	public void testCalculosalariobruto() {
		assertEquals("Resultado esperado: 1360",1360,e.calculosalariobruto(0, 2000, 8),0.5);
	}
	@Test
	public void testCalculosalariobruto1() {
		assertEquals("Resultado esperado: 1260",1260,e.calculosalariobruto(0, 1500, 3),0.5);
	}
	@Test
	public void testCalculosalariobruto2() {
		assertEquals("Resultado esperado: 1100",1100,e.calculosalariobruto(0, (float)(1499.99), 0),0.5);
	}
	@Test
	public void testCalculosalariobruto3() {
		assertEquals("Resultado esperado: 1760",1760,e.calculosalariobruto(1, 1250, 8),0.5);
	}
	@Test
	public void testCalculosalariobruto4() {
		assertEquals("Resultado esperado: 1600",1600,e.calculosalariobruto(1, 1000, 0),0.5);
	}
	@Test
	public void testCalculosalariobruto5() {
		assertEquals("Resultado esperado: 1560",1560,e.calculosalariobruto(1, (float)(999.99), 3),0.5);
	}
	@Test
	public void testCalculosalariobruto6() {
		assertEquals("Resultado esperado: 500",500,e.calculosalariobruto(1, 500, 0),0.5);
	}
	@Test
	public void testCalculosalariobruto7() {
		assertEquals("Resultado esperado: 1660",1660,e.calculosalariobruto(1, 0, 8),0.5);
	}
	

	@Test
	public void testCalcularsalarioneto() {
		assertEquals("Resultado esperado: 1640",1640,e.calcularsalarioneto(2000),0.5);
	}
	@Test
	public void testCalcularsalarioneto1() {
		assertEquals("Resultado esperado: 1230",1230,e.calcularsalarioneto(1500),0.5);
	}
	@Test
	public void testCalcularsalarioneto2() {
		assertEquals("Resultado esperado: 1259.9916",(float)(1259.9916),e.calcularsalarioneto((float)(1499.99)),0.5);
	}
	
	@Test
	public void testCalcularsalarioneto3() {
		assertEquals("Resultado esperado: 1050",1050,e.calcularsalarioneto(1250),0.5);
	}
	@Test
	public void testCalcularsalarioneto4() {
		assertEquals("Resultado esperado: 840",840,e.calcularsalarioneto(1000),0.5);
	}
	@Test
	public void testCalcularsalarioneto5() {
		assertEquals("Resultado esperado: 999.99",(float)(999.99),e.calcularsalarioneto((float)(999.99)),0.5);
	}
	@Test
	public void testCalcularsalarioneto6() {
		assertEquals("Resultado esperado: 500",500,e.calcularsalarioneto(500),0.5);
	}
	@Test
	public void testCalcularsalarioneto7() {
		assertEquals("Resultado esperado: 0",0,e.calcularsalarioneto(0),0.5);
	}
	

}
