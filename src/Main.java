import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbEtudiant = Lecture.cptLigne();
        System.out.println("Nombre d'étudiants "+nbEtudiant);
        Etudiant[] etudiantTab = new Etudiant[nbEtudiant];
        Lecture.lireFichierEtudiants(etudiantTab);

        for(int i = 0; i < etudiantTab.length; i++){
            System.out.println(etudiantTab[i].toString());
        }

        Menu.menu();
        int choixMenu = sc.nextInt();
        sc.nextLine();
        System.out.println(choixMenu);
        if (choixMenu>6 || choixMenu<=0){
            System.out.println("Veuillez choisir une option valide");
        }
    }
}