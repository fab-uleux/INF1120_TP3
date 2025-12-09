public class Etudiant {
    private String matricule;
    private String prenom;
    private String nom;
    private char cote;
    private double achat;
    private double paye;

    public Etudiant(String matricule, String prenom, String nom, char cote, double achat, double paye) {
        this.matricule = matricule;
        this.prenom = prenom;
        this.nom = nom;
        this.cote = cote;
        this.achat = achat;
        this.paye = paye;
    }

    public String getMatricule(){
        return matricule;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getNom(){
        return nom;
    }
    public char getCote(){
        return cote;
    }
    public Double getAchat(){
        return achat;
    }
    public Double getPaye(){
        return paye;
    }

    @Override
    public String toString() {
        return "Etudiant "+"matricule= "+matricule+", prenom= "+prenom+", nom= "+nom+", cote= "+cote+", achat= "+achat+", paye= "+paye;
    }

    public static void appliquerBonus(){}
    public static void appliquerPenalite(){}
}