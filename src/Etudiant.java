public class Etudiant {
    private String matricule;
    private String prenom;
    private String nom;
    private String cote;
    private String achat;
    private String paye;

    public Etudiant(String matricule, String prenom, String nom, String cote, String achat, String paye) {
        this.matricule = matricule;
        this.prenom = prenom;
        this.nom = nom;
        this.cote = cote;
        this.achat = achat;
        this.paye = paye;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "matricule='" + matricule + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", cote=" + cote +
                ", achat=" + achat +
                ", paye=" + paye +
                '}';
    }
}