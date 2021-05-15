package jeugame.core.controller;

import java.util.Scanner;

import jeugame.core.model.joueur;
import jeugame.core.view.vu;

public class controller {
	String choix = "y";
	Scanner klavye = new Scanner(System.in);
private static controller c = new controller();
	
	private controller() {}
	
    public static controller kreyeobje(){
    	return c;       
    }
    
	public void demare_jwet() {
		
	
		
		vu v1= new vu();
    	joueur j1= new joueur();
    	
    	j1.setNom1(v1.antrenom());
    	j1.setNom2(v1.antrenom());
    	try {
    	j1.antre_done();
    	}catch(Exception e){
    		System.out.print("Saw rantre a pa bon \n");
    	}
    	System.out.println("voulez vous recommencer ?(Y/N)" );
    	choix = klavye.nextLine();
    	switch(choix) {
    	case "y":
    		c.demare_jwet();
    	case "n":
    		System.out.println("ok");
    	}
	}
   

}
