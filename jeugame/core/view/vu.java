package jeugame.core.view;

import java.util.Scanner;

public class vu {
	
	int [][] gri_an = new int[3][3];
	
	public String antrenom() {
		System.out.println(" antre nom'w: ");
		Scanner klavye = new Scanner(System.in);
		String name= klavye.nextLine();
		return name;
	}
	
	public void griy_jwet_lan(){
		int [][] matris = new int [3][3];
		for( int linn = 0; linn < matris.length; linn++ ){
	        for( int kolonn = 0; kolonn < matris[linn].length; kolonn++ ){
	                System.out.print("."+linn+kolonn);
	        }
	        System.out.println("");
	    }
	}
	

}
