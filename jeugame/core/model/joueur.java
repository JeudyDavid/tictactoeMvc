package jeugame.core.model;


import java.io.IOException;
import java.util.Scanner;

public class joueur {

private String nom1;
private String nom2;

private static final int X = 1;
private static final int O =-1;


public static int getX() {	
	return X;
}


public String getNom1() {
	return nom1;
}
public void setNom1(String nom1) {
	this.nom1 = nom1;
}
public String getNom2() {
	return nom2;
}
public void setNom2(String nom2) {
	this.nom2 = nom2;
}

public void griy_jwet_lan(int [][]matris){
	for( int linn = 0; linn < matris.length; linn++ ){
        for( int kolonn = 0; kolonn < matris[linn].length; kolonn++ ){
            if( matris[linn][kolonn] == X )
                System.out.print("X ");
       else if(matris[linn][kolonn] == O )
                System.out.print("O ");
            else 
                System.out.print(". ");
        }
        System.out.println("");
    }

}
  
public void antre_done() {
	 Scanner klavye = new Scanner(System.in);
	 System.out.println("ak pral afwonte, que le meilleur gagne.!!!");
	 System.out.println("La grille du jeu: ");
	  int [][] gri_an = new int[3][3];
       griy_jwet_lan(gri_an);
     System.out.print("entrez yon pozisyon nan inteval 1-9:\n");
       while(genyen(gri_an) == false){

        System.out.println("jwet pou ou "+ nom1);
       
    	   int linn = 10, kolonn = 10;
    	  
           int pos = klavye.nextInt();
           switch (pos) {
           case 1:
        	   linn = 0;
        	   kolonn = 0;
        	   break;
           case 2:
        	   linn = 0;
        	   kolonn = 1;
        	   break;
           case 3:
        	   linn = 0;
        	   kolonn = 2;
        	   break;
           case 4:
        	   linn = 1;
        	   kolonn = 0;
        	   break;
           case 5:
        	   linn = 1;
        	   kolonn = 1;
        	   break;
           case 6:
        	   linn = 1;
        	   kolonn = 2;
        	   break;
           case 7:
        	   linn = 2;
        	   kolonn = 0;
        	   break;
           case 8:
        	   linn = 2;
        	   kolonn = 1;
        	   break;
           case 9:
        	   linn = 2;
        	   kolonn = 2;
        	   break;
           default:
        	   System.out.print("saw antre a pa bon\n");
        	   break;
           }
           
    	   
    	   
           if(kolonn<=2 && kolonn>= 0) 
           {
               if( gri_an[linn][kolonn] == 0)
                   gri_an[linn][kolonn] = X;
               griy_jwet_lan(gri_an);
           }
           else 
               System.out.println("pozisyon'w chwazi an pa bon:\n");
       
           
        	  if( genyen(gri_an) == true )
               break;
        	  System.out.println("jwet pou ou "+nom2);
           int pos1 = klavye.nextInt();
           switch (pos1) {
           case 1:
        	   linn = 0;
        	   kolonn = 0;
        	   break;
           case 2:
        	   linn = 0;
        	   kolonn = 1;
        	   break;
           case 3:
        	   linn = 0;
        	   kolonn = 2;
        	   break;
           case 4:
        	   linn = 1;
        	   kolonn = 0;
        	   break;
           case 5:
        	   linn = 1;
        	   kolonn = 1;
        	   break;
           case 6:
        	   linn = 1;
        	   kolonn = 2;
        	   break;
           case 7:
        	   linn = 2;
        	   kolonn = 0;
        	   break;
           case 8:
        	   linn = 2;
        	   kolonn = 1;
        	   break;
           case 9:
        	   linn = 2;
        	   kolonn = 2;
        	   break;
           }
           if(kolonn<=2 && kolonn>= 0) 
           {
               if( gri_an[linn][kolonn] == 0 )
                   gri_an[linn][kolonn] = O;                 
           griy_jwet_lan(gri_an);              
           }
           else 
               System.out.println("antre envalid");
       }
     
   }   




public boolean genyen(int matris[][]) {
   boolean val_de_retour = false;
	 //verifye leuw genyen, fason orizontal...
	
   for( int linn = 0; linn < matris.length; linn++ ){
       int sum = 0;
       for( int kolonn = 0; kolonn < matris[0].length; kolonn++ ){
           sum += matris[linn][kolonn];
       }
       if( sum == 3 ){
           System.out.println(nom1+" genyen pati an.");
           val_de_retour = true;
       } else if ( sum == -3 ) {
           System.out.println(nom2+" genyen pati an.");
           val_de_retour = true;
       }
     }

   //verifye leuw genyen, fason vetikal...
   for( int kolonn = 0; kolonn < matris[0].length; kolonn++ ){
       int sum = 0;
       for( int linn = 0; linn < matris.length; linn++ ){
           sum += matris[linn][kolonn];
       }
       if( sum == 3 ){
           System.out.println(nom1+" genyen pati an..");
           val_de_retour = true;
       } else if ( sum == -3 ) {
           System.out.println(nom2+" genyen pati an..");
           val_de_retour = true;
       }
     }

     if( (matris[0][0] + matris[1][1] + matris[2][2] == 3 )){
       System.out.println(nom1+" genyen pati a felisitasyon.");
       val_de_retour = true;
     }
     else if ( (matris[0][2] + matris[1][1] + matris[2][0] == 3 )) {
         System.out.println(nom1+" genyen pati a bravo.");
         val_de_retour = true;
       }
     
     else if( (matris[0][0] + matris[1][1] + matris[2][2] == -3 )){
         System.out.println(nom2+" genyen pati a felisitasyon");
         val_de_retour = true;
       }
     else if ( (matris[0][2] + matris[1][1] + matris[2][0] == -3 )) {
       System.out.println(nom2+" genyen pati a felisitasyon..");
       val_de_retour = true;
     }
    
 
      boolean espas = false;
      for( int linn = 0; linn < matris.length; linn++ ){
       for( int kolonn = 0; kolonn < matris[0].length; kolonn++ ){
           if( matris[linn][kolonn] == 0 ) 
               espas = true;
       }
      }
       if( espas == false ){
       System.out.println("fin");
       val_de_retour = true;
       }
       return val_de_retour;
      }






}












