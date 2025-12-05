import java.io.*;
public class Lecture {

    public static int cptLigne() {
        try {
            BufferedReader lire = new BufferedReader(new FileReader("Etudiants.csv"));
            int nbLigne = -1;
            while (lire.readLine() != null) {
                nbLigne++;
            }
            lire.close();
            return nbLigne;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            //Besoin de retourner un int en cas d'erreur
            return -999;
        }
    }

    public static void transfereLigne(Etudiant[] etudiantTab){
        try{
            BufferedReader lire = new BufferedReader(new FileReader("Etudiants.csv"));
            String ligne;
            //lit de la première ligne sans = ligne
            lire.readLine();
            while((ligne=lire.readLine())!=null){
                String[] tab = ligne.split(";");
                tab[4] = tab[4].replace(",", ".");
                tab[5] = tab[5].replace(",", ".");
                Etudiant etudiant = new Etudiant(tab[0],tab[1],tab[2],tab[3],Double.parseDouble(tab[4]),Double.parseDouble(tab[5]));
                System.out.println(etudiant);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
 