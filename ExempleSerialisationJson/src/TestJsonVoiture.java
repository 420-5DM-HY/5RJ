
public class TestJsonVoiture {
	public static void main(String args[]) {
		
		Voiture v1 = new Voiture("Acura", "Legend", "Manuelle",
				"Blanche Perle", "A0001", 1995, 113329);
		
		String v1Json =v1.toJson();
		
		Voiture v2 = Voiture.fromJson(v1Json);
		
		System.out.print(v2==v1?"pareil":"différent");  // Même contenu, mais instances différentes!
	}
}
