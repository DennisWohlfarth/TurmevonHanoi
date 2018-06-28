import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class MainTest {
	
	private Main test;
	
	@Before
	void init() {
		test = new Main();
		test.start();		// Turme von Hanoi durchlaufen lassen
		
	}
	
	@Test		// Test wird automatisch gestartet
	
	void EndReihenfolgevergleichen()		// Es wird getestet ob der Zielturm, den wir nach Programmablauf erhalten, richtig angeordnet wurde
    {
			init(); // initialisierung ausführen und Programm starten
    		for(int i=test.turmhoehe-1;i>0; i--)		// Schleife mit Turmhöhe - 1 durchlaufen, da unsere größte Scheibe schon 0 ist und die kleiste somit Turmhöhe -1
        	{    			
        		assertEquals(test.ziel_Turm.size()-1, i);	// Oberstes Zielturmelement muss gleich der Turmhöhe entsprechen, weil 0 die größte scheibe ist
        		test.ziel_Turm.remove(test.ziel_Turm.size()-1); // Oberstes Zieltumelemet entfernen und durch die Schleife mit dem daruter weiter vergleichen
        		
        	}
    	
    	
    }
	
	//@Test 
	

}
