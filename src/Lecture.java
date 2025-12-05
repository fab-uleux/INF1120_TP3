import java.io.*;
public class Lecture {
    public static void main(String[] args) {
        try {
            BufferedReader lire = new BufferedReader(
                    new FileReader("Etudiants.csv"));
            String ligne;
            int cpt=0;
            while((ligne=lire.readLine())!=null)
            {    cpt++;
                String[] tab = ligne.split(";");
                System.out.println("Etudiant numéro "+cpt);
                for(int i=0; i< tab.length;i++) {
                    System.out.println(tab[i]);
                }
            }
            lire.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
 