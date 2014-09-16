import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EcrireInventaire {
	public static void main(String args[]) {
		String nomDuFichier = "/java/fichierInventaire.json";

		// Donn�es de test
		Voiture voiture = new Voiture("Acura", "Legend", "Manuelle",
				"Blanche Perle", "A0001", 1995, 113329);
		Voiture voiture2 = new Voiture("Chevrolet", "Cobalt", "Manuelle",
				"Noir", "A0002", 2006, 134000);
		Voiture voiture3 = new Voiture("Saturn", "SC2", "Automatique",
				"Gris Moustachu", "A0003", 1997, 235653);

		Voiture[] inventaire = { voiture, voiture2, voiture3 };

		// Initialisation du s�rialiseur JSON
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Gson gson = builder.create();

		// S�rialisation
		String inventaireEnJson = gson.toJson(inventaire);	
		
		System.out.println(inventaireEnJson);

		// �criture des donn�es dans un fichier
		try {

			File file = new File(nomDuFichier);

			// Cr�er le fichier si n�cessaire
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(inventaireEnJson);
			bw.close();
		} catch (IOException e) {
			System.out.println("Erreur � l'�criture du fichier :"+nomDuFichier);
		}

	}

}
