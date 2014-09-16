import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LireInventaire {

	public static void main(String args[]) {

		try {

			File file = new File("/java/fichierInventaire.json");
			if (!file.exists()) {
				System.out.println("Erreur, fichier absent!");
			} else {

				FileReader fr = new FileReader(file.getCanonicalFile());

				BufferedReader bufferedReader = new BufferedReader(fr);

				// Lecture du fichier
				String line;
				StringBuilder sb = new StringBuilder();
				while ((line = bufferedReader.readLine()) != null)
					sb.append(line);

				bufferedReader.close();

				String contenuDuFichier = sb.toString();

				// Définition de la structure du fichier JSON, "Collection" de
				// "Voiture"
				Type typeInventaireVoiture = new TypeToken<Collection<Voiture>>() {
				}.getType();

				// Création des instances Ã  partir du fichier, groupÃ©s en une
				// Collection
				Gson gson = new Gson();
				Collection<Voiture> inventaire = gson.fromJson(
						contenuDuFichier, typeInventaireVoiture);

				// Affiche la Collection
				for (Voiture v : inventaire)
					System.out.println(v);

			}
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
