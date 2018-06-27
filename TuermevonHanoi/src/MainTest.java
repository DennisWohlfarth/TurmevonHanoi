import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class MainTest {
	
	private Main test;
	
	@Before
	void init() {
		test = new Main();
		test.main();
	}
	
	@Test
	void EndReihenfolgevergleichen()
    {
    	if(test.beendet==true)
    	{
    		for(int i=0;i<test.turmhoehe; i++)
        	{
        		assertEquals(test.ziel_Turm.size()-1, i);
        		test.ziel_Turm.remove(test.ziel_Turm.size()-1);
        		
        	}
    	}
    	
    	
    }
    void kleinsteScheibeObenaufTurm()
    {
    	for(int i = 0; i< test.start_Turm.size()-1; i++)
    	{
    		
    	}
    }

}
