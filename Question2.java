/*******
 * Read input from System.in
 * Use: System.out.println to ouput your result to STDOUT.
 * Use: System.err.println to ouput debugging information to STDERR.
 * ***/
package com.isograd.exercise;
import java.util.*;

public class IsoContest {
    public static void main( String[] argv ) throws Exception {
		String  line;
		String text = "";
		String[] tab;
		
		boolean isSuspect;
		
		double nbCompte;
		double nbCompteSus = 0;
		double moy;
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			line = sc.nextLine();
			text = text + " " + line;
		}
		
		tab = text.split(" ");
		nbCompte = Integer.parseInt(tab[1]);
		
		
		for(int i = 2 ; i <= nbCompte ; i++){
		    
		    if((Integer.parseInt(tab[i].split(":")[0]) > 20 && Integer.parseInt(tab[i].split(":")[0]) <=23) || (Integer.parseInt(tab[i].split(":")[0]) >= 0 && Integer.parseInt(tab[i].split(":")[0])  <= 7)){
		        nbCompteSus++;
		        
		    }
		    
		    
		}
		
		moy = (nbCompteSus/nbCompte);
		
		if(moy > 0.5){
		    
		    System.out.println("SUSPICIOUS");
		    
		}else{
		    
		    System.out.println("OK");
		    
		}
		
		
	}
}