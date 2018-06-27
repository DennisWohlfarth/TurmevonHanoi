import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class MainTest {
	
	private Main test;
	
	@Before
	void init() {
		test = new Main();
		test.start();
		
	}
	
	@Test
	
	void EndReihenfolgevergleichen()
    {
			init();
    		for(int i=test.turmhoehe-1;i>0; i--)
        	{    			
        		assertEquals(test.ziel_Turm.size()-1, i);
        		test.ziel_Turm.remove(test.ziel_Turm.size()-1);
        		
        	}
    	
    	
    }
	
	@Test 
	

}
