import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


    /**
     * Bewegt n Scheiben von Turm a nach Turm c und benutzt als
     * Zwischenspeicher Turm h.
     */
	//List<Integer> list = new ArrayList<Integer>();
	public List<Integer> start_Turm, hilfs_Turm, ziel_Turm;	// Unsere 3 Türme deklarieren
	public int turmhoehe;									// Turmhöhe kann später vom Benutzer eingegeben werden
    private void bewege (String start, String hilfsturm, String ziel, int n)
    {
	if (n == 1){
		
		//Wenn n gleich 1 ist wird eine Scheibe von einem Turm der in der variablen start steht, auf den Turm der in der Vaiablen ziel steht verschoben
		//Bedeutet die Variable start kan auch nach dem n-ten Durchgang für den Hilfsturm stehen
		//Wir ordnen die Variable start zu und schreiben die letzte Zahl des Turmes in eine Zwischenvaliable "zahl"
		// Anschließend wird das oberste Element von dem jeweiligen Turm entfernt 
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
		
		//Wir weisen die Zwischenvaiable "zahl" nun dem Turm mit der Variablen "ziel" zu und fügen sie sozsagen auf den jeweiligen Turm drauf
		// Auch hier handelt es sich nach n-tem Durchgang nicht immer um den Zielturm
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
		
		System.out.println("Lege die oberste Scheibe (" + zahl + ") von " + start + " auf " + ziel + ".");
		//Elemente verschieben 
		
		
	}
	    
	
	else {
            bewege(start, ziel, hilfsturm, n-1);// um 1 verkleinerten Turm von start auf hilfsturm verschieben
            bewege(start, hilfsturm, ziel, 1);//verschiebe oberste Scheibe von start nach ziel
            bewege(hilfsturm, start, ziel, n-1);// um 1 verkleinerten Turm von hilfsturm auf ziel verschieben
	}
    }

    public void start ()
    {
    	//Turmhöhe durch Scanner einlesen
    	Scanner scanner = new Scanner(System.in);
		System.out.print("Die Größte Scheibe ist 0 und je größer sie Zahl desto kleiner die Scheibe! \n\nAnzhal der Scheiben eingeben:");
		turmhoehe = scanner.nextInt();
		scanner.close();
		
		
		// Die 3 Türme als ArrayList deklarieren
    	start_Turm = new ArrayList<Integer>();
    	hilfs_Turm = new ArrayList<Integer>();
    	ziel_Turm = new ArrayList<Integer>();
    	
    	// Den Startturm mit dem Werten von 0 bis Turmhöhe-1 versehen.
    	// Bedeutet 0 ist die größte und Turmhöhe -1 die kleinste Scheibe und die Scheiben werden also von 0 bis Turmhöhe -1 immer größer
    	for (int i =0; i<turmhoehe; i++){
    		start_Turm.add(i);	
    	}
    	
	  bewege("Startturm", "Hilfsturm", "Zielturm", turmhoehe);
	  // Am Ende die Werte des Zielturms ausgeben
	  // Hier muss nun die selbe Reihenfolge wie bei Startturm sein, ansonsten würde der Algorytmus nicht stimmen
	  System.out.println(ziel_Turm.toString());
    }
    
    

}
