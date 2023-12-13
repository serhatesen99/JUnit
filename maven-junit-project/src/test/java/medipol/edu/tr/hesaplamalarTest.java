package medipol.edu.tr;

import static org.junit.Assert.*;

import org.junit.Test;

public class hesaplamalarTest {

	@Test
	public void testFaktoriyelRec() {
	int sonuc = hesaplamalar.faktoriyelRec(6);
	assertEquals(720, sonuc);
	}

	@Test
	public void testFaktoriyelLoop() {
	int sonuc = hesaplamalar.faktoriyelLoop(6);
	assertEquals(720, sonuc);
	}
	
    @Test
    public void testTopla() {
    int sonuc = hesaplamalar.topla(12 , 88);
    assertEquals(100, sonuc);	
    }
    
    @Test
    public void testCikart() {
    int sonuc = hesaplamalar.cikart(100 , 99);
    assertEquals(1, sonuc);	
    }
    
    @Test
    public void testCarpma() {
    int sonuc = hesaplamalar.carpma(10 , 6);
    assertEquals(60, sonuc);	
    }
	


}
