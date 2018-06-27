import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class Main {


    /**
     * Bewegt n Scheiben von Turm a nach Turm c und benutzt als
     * Zwischenspeicher Turm h.
     */
	//List<Integer> list = new ArrayList<Integer>();
	public List<Integer> start_Turm, hilfs_Turm, ziel_Turm;	// Unsere 3 Türme
	public int turmhoehe= 15;
	public boolean beendet=false;
    private void bewege (String start, String hilfsturm, String ziel, int n)
    {
	if (n == 1){
		
		int zahl=0;
		if (start == "Startturm")
		{			
			zahl = start_Turm.get(start_Turm.size()-1);
			start_Turm.remove(start_Turm.size()-1);
		}
		else if(start=="Hilfsturm")
		{
			zahl = hilfs_Turm.get(hilfs_Turm.size()-1);
			hilfs_Turm.remove(hilfs_Turm.size()-1);
		}
		else if(start=="Zielturm")
		{
			zahl = ziel_Turm.get(ziel_Turm.size()-1);
			ziel_Turm.remove(ziel_Turm.size()-1);
		}
		
		if(ziel=="Startturm")
		{
			start_Turm.add(zahl);
		}
		else if(ziel=="Hilfsturm")
		{
			hilfs_Turm.add(zahl);
		}
		else if(ziel == "Zielturm")
		{
			ziel_Turm.add(zahl);
		}
		
		System.out.println("Lege die oberste Scheibe" + zahl + "von " + start + " auf " + ziel + ".");
		//Elemente verschieben 
		
		
	}
	    
	
	else {
            bewege(start, ziel, hilfsturm, n-1);// um 1 verkleinerten Turm von start auf b verschieben
            bewege(start, hilfsturm, ziel, 1);//verschiebe oberste Scheibe von start nach c
            bewege(hilfsturm, start, ziel, n-1);// um 1 verkleinerten Turm von b auf c verschieben
	}
    }

    public void main (String[] args)
    {
    	
    	start_Turm = new ArrayList<Integer>();
    	hilfs_Turm = new ArrayList<Integer>();
    	ziel_Turm = new ArrayList<Integer>();
    	for (int i =0; i<turmhoehe; i++){
    		start_Turm.add(i);	
    	}
    	
	  bewege("Startturm", "Hilfsturm", "Zielturm", 15);
	  beendet = true;
	  System.out.println(ziel_Turm.toString());
    }
    
    

}
