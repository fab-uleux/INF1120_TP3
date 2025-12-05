import java.io.*;
public class Lecture {
    public static void main(String[] args) {
        try {
            BufferedReader lire = new BufferedReader(
                    new FileReader("Etudiants.csv"));
            String ligne;
            int cpt=0;
            Etudiant[] etudiantTab = new Etudiant[100];
            while((ligne=lire.readLine())!=null)
            {    cpt++;
                String[] tab = ligne.split(";");
                Etudiant etudiant = new Etudiant(tab[0],tab[1],tab[2],tab[3],tab[4],tab[5]);
//                System.out.println("Etudiant numéro "+cpt);
//                for(int i=0; i< tab.length;i++) {
//                    System.out.println(tab[i]);
//                }
                etudiantTab[cpt] = etudiant;
                System.out.println(etudiant);
            }
            lire.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
 