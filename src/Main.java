public class Main {
    public static void main(String[] args) {

        int nbEtudiant = Lecture.cptLigne();
        System.out.println(nbEtudiant);
        Etudiant[] etudiantTab = new Etudiant[nbEtudiant];
        Lecture.transfereLigne(etudiantTab);
    }
}