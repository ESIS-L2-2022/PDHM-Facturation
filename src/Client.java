import java.util.List;

public class Client {
    // association client-factures
    private List<Facture> factures;

    private String nom;

    // composition client-addresse
    class Addresse {
        private String avenue;
        private String numero;
        private String quartier;
        private String ville;
        private String commune;
        private String pays;

        public Addresse() {
        }

        public Addresse(String avenue, String numero, String quartier, String ville, String commune, String pays) {
            this.avenue = avenue;
            this.numero = numero;
            this.quartier = quartier;
            this.ville = ville;
            this.commune = commune;
            this.pays = pays;
        }

        public String getAvenue() {
            return avenue;
        }

        public void setAvenue(String avenue) {
            this.avenue = avenue;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getQuartier() {
            return quartier;
        }

        public void setQuartier(String quartier) {
            this.quartier = quartier;
        }

        public String getVille() {
            return ville;
        }

        public void setVille(String ville) {
            this.ville = ville;
        }

        public String getCommune() {
            return commune;
        }

        public void setCommune(String commune) {
            this.commune = commune;
        }

        public String getPays() {
            return pays;
        }

        public void setPays(String pays) {
            this.pays = pays;
        }
    }

    public List<Facture> getFactures() {

        return factures;
    }

    public void setFactures(List<Facture> factures) {

        this.factures = factures;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return this.nom;
    }
}
