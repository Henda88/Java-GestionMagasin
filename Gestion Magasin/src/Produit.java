import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Produit {

	private int id; 
	private String libelle; 
	private String marque; 
	private double prix;
	private Date date_exp;



	public Produit() {

    }
	
	public Produit(int id, String libelle, String marque, double prix) {
		this.id = id; 
		this.libelle = libelle; 
		this.marque = marque; 
		this.prix = prix; 
	}
	
	public Date getDate() {
		return date_exp;
	}

	public void setDate(String date_exp) throws ParseException {
		this.date_exp = new SimpleDateFormat("d-m-yyyy").parse(date_exp);
	}

	public Produit(int id, String libelle, String marque) {
		this.id = id; 
		this.libelle = libelle; 
		this.marque = marque; 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public String getMarque() {
		return marque;
	}
	
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	} 
	
	public void afficher() {
		System.out.println("Identifiant: " + this.id + "\nLibellé: " + this.libelle + "\nMarque: " + this.marque + "\nPrix: " + this.prix + "\nDate expiration: " + this.date_exp+  "\n ***********");
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + ", date_exp="
				+ date_exp + "]";
	}
	

}
