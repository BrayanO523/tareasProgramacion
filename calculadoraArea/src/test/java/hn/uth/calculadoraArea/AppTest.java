package hn.uth.calculadoraArea;
import static org.junit.Assert.*;
import org.junit.*;



/**
 * Unit test for simple App.
 */
public class AppTest 

{
	@BeforeClass
    public static void Inicio() {
        System.out.println("Método de tipo Setup, se ejecuta antes de cada prueba");
    }
	//PruebaareaCirculo
		@Test
		public void areaCirculo1() {assertEquals(App.areaCirculo(5.0), 78.54, 0.0001);}
		@Test
		public void areaCirculo2() {assertEquals(App.areaCirculo(6.0), 113.0976, 0.0001);}
		@Test
		public void areaCirculo3() {assertTrue(App.areaCirculo(0.0) == 0); }
		@Test
		public void areaCirculo4() {assertFalse(App.areaCirculo(6.5)==0);}
		//areacuadrado
		@Test
		public void areaCuadrado1() {assertFalse(App.areaCuadrado(6.5)==0);
		}@Test
		public void areaCuadrado2() {assertEquals(App.areaCuadrado(230.0), 52900.0, 0.0001);}
		@Test
		public void areaCuadradoo3() {assertTrue(App.areaCuadrado(0.0) == 0);
		}
		//areaRectangulo
		@Test
		public void areaRectangulo1() {assertFalse(App.areaRectangulo(6.5,523.2)==0);}
		@Test
		public void areaRectangulo2() {assertEquals(App.areaRectangulo(5,3),15,0.0001);
		}
		@Test
		public void areaRectangulo3() {assertEquals(App.areaRectangulo(9,8),72,0.0001);
		}
		//areaTriangulo
		@Test
		public void areaTriangulo1() {assertTrue(App.areaTriangulo(23.5,7)==82.25);}

		@Test
		public void areaTriangulo2() {assertFalse(App.areaRectangulo(6.5,523.2)==0);}
		
		@Test
	    public void areaTriangulo3 () {assertNotNull(App.areaTriangulo(13.5,16.8));}
		
@AfterClass
    public static void finalizacionPruebas() {
        System.out.println("Método de tipo TearDown, se ejecuta despues de cada prueba");
        
    }
}
