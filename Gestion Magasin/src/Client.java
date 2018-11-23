import java.util.ArrayList;
import java.util.List;

public class Client {

	private String nom;
	private String prenom;
	private float budget;
	private List<Produit> ListProduit = new ArrayList<Produit>();

	public Client(String nom, String prenom, float budget) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.budget = budget;
	}

	public Client() {

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public float getBudget() {
		return budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", budget=" + budget + ", produit=" + ListProduit + "]";
	}

	public float verser(float x) {
	
	    return budget += x;
    }
	
	public float retrait(float x) 
	{
		return budget -= x;
	}
	
	public void acheter(Produit produit) {
		
		ListProduit.add(produit);
	}
	
	public void annuler(Produit produit) {
		
		ListProduit.remove(produit);
	}
}