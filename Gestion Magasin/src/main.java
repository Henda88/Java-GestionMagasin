import java.text.ParseException;

public class main {

	public static void main(String[] args) {
		
		// ***** 1- Créer un produit vide *****////
		Produit p1 = new Produit(); 
		
		// ***** 2 Créer des nouveaux produits *****/////
		Produit p2 = new Produit(1021,"Lait","Delice");
		Produit p3 = new Produit(2510,"Yaourt","Vitalait");
		Produit p4 = new Produit(3250,"Tomate","Sicam", 1.200);
		
		// ***** 3 afficher les détails de chaque produit ****/////////
		p1.afficher();
		p2.afficher();
		p3.afficher();
		p4.afficher();
		
		// ***** 4 modifier prix et afficher le nouveau pduit ****/////////  
		p2.setPrix(0.7);
		p2.afficher();
		
		// ***** 5 compléter les infos manquantes 
		p1.setId(4050);
		p1.setLibelle("Beurre");
		p1.setMarque("Natilait");
		p1.setPrix(1.5);
	    p3.setPrix(0.5);
	    
	    // **** 6 afficher les produits modifiés 
	    p1.afficher();
	    p3.afficher();
	    
	    // **** 7 methode toString 
	    
	    System.out.println(p1.toString());  
	    System.out.println(p2.toString()); 
	    System.out.println(p3.toString()); 
	    System.out.println(p4.toString());  
		
	    // **** 8 ajout date 

	    try {
			p1.setDate("12-12-2019");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    System.out.println(p1.toString());
	    
	    
	    Client c1 = new Client("Ben Jbara", "Haythem", 250);
	    
	    System.out.println(c1.toString());
	    
	    c1.verser(50);
	    System.out.println(c1.toString());
	    
	    c1.retrait(100);
	    System.out.println(c1.toString());
	    
	    c1.acheter(p1);
	    c1.acheter(p2);
	    System.out.println(c1.toString());
	    
	    c1.annuler(p1);
	    System.out.println(c1.toString());
	    
	}
}
