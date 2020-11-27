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
		
		int nbCompte;
		int nbCompteSus = 0;
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			line = sc.nextLine();
			text = text + " " + line;
		}
		
		tab = text.split(" ");
		nbCompte = Integer.parseInt(tab[1]);
		
		
		
		for (int i = 2 ; i <= nbCompte+1 ; i++){
		    isSuspect = true;
		    for(int j = (tab[i].length()-5) ; j < tab[i].length() ; j++){
		        
		        if(!Character.isDigit(tab[i].charAt(j))){
		            
		            isSuspect = false;
		            
		        }
		        
		    }
		    
		    if(isSuspect){
		        
		        nbCompteSus++;
		        
		    }
		    
		}
		
		System.out.println(nbCompteSus);

	}
}