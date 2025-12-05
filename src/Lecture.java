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
            String entete;
            int cpt = 0;
            //Assigne la première ligne a entete
            entete = lire.readLine();
            System.out.println("Entête | "+entete);
            while((ligne=lire.readLine())!=null){
                cpt++;
                String[] tab = ligne.split(";");
                //Remplace , avec . pour pas crée d'erreur au double
                tab[4] = tab[4].replace(",", ".");
                tab[5] = tab[5].replace(",", ".");
                //TODO comment convertir un String tab[] en char
                //  -l'index 0 de charAt pointe vers le premier index de tab[3] pas d'etudiant au complet. Donc, index 0 de la string contenue a tab[3] est le char que tu cherche!!!
                Etudiant etudiant = new Etudiant(tab[0],tab[1],tab[2],tab[3].charAt(0),Double.parseDouble(tab[4]),Double.parseDouble(tab[5]));
                System.out.println("Étudiant numéro "+cpt+" | "+etudiant);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
 