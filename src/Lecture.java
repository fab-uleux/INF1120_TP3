import java.io.*;
public class Lecture {
    public static void main(String[] args) {

        int nbEtudiant = cptLigne();
        System.out.println(nbEtudiant);

        Etudiant[] etudiantTab = new Etudiant[nbEtudiant];
        {
//            int i = 0;
//            String[] tab = ligne.split(";");
//            //.parseDouble(tab[]) pour les 2 dernier index, pas sur pour char
//            Etudiant etudiant = new Etudiant(tab[0],tab[1],tab[2],tab[3],tab[4],tab[5]);
//            etudiantTab[i] = etudiant;
//            System.out.println(etudiant);
        }
    }

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
}
 