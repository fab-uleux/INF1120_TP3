public class Main {
    public static void main(String[] args) {

        int nbEtudiant = Lecture.cptLigne();
        System.out.println("Nombre d'étudiants "+nbEtudiant);
        Etudiant[] etudiantTab = new Etudiant[nbEtudiant];
        System.out.println("Taille du tableau crée "+ etudiantTab.length);
        Lecture.lisLigne(etudiantTab);

        for(int i = 0; i < etudiantTab.length; i++){
            System.out.println(etudiantTab[i]);
            //Tous les étudiants sont dans etudiantTab[]
        }
    }
}