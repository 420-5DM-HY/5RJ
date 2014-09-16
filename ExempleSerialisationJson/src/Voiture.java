
public class Voiture {

	public String marque, modele;
	//public Transmission transmission;
	public String transmission, couleur, noSerie;
	public int annee, kilometrage;
	/*
	public String attributSerialisable1 = "autre attribut serialisable";
	public final String attributSerialisable2 = "un attribut final est aussi sérialisé";
	
	public transient String attributNonSerialisable1 = "transient";
	public static String attributNonSerialisable2 = "static";
	*/
	public Voiture(String marque, 
			String modele, String transmission, 
			String couleur, String noSerie, 
			int annee, int kilometrage){
		this.marque = marque;
		this.modele = modele;
		this.transmission = transmission;
		this.couleur = couleur;
		this.noSerie = noSerie;
		this.annee = annee;
		this.kilometrage = kilometrage;
	}
	@Override
	public String toString(){
		return "Voiture :" + marque + " " + "Modele : " + modele + " " + "Transmission : " + transmission;
	}
}
