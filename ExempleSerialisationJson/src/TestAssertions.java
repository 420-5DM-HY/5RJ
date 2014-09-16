
public class TestAssertions {

	
	public static void main(String args[]) {
		Voiture voiture1 = new Voiture("Acura", "Legend", "Manuelle",
				"Blanche Perle", "A0001", 1795, 113329);
		Voiture voiture2 = new Voiture("Chevrolet", "Cobalt", "Manuelle",
				"Noir", "A0002", 2006, -134000);
		Voiture voiture3 = new Voiture("Saturn", "SC2", "Automatique",
				"Gris Moustachu", "A0003", 1997, 235653);
		
		System.out.print("Voitures: "+voiture1+voiture2+voiture3);
	}
}
