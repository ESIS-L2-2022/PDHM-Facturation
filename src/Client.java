public class Client {
    // association client-factures
    private Facture[] factures;

    private String nom;

    // composition client-addresse
    class Addresse {
        private String avenue;
        private String numero;
        private String quartier;
        private String ville;
        private String commune;
        private String pays;

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

    public Facture[] getFactures() {
        return factures;
    }

    public void setFactures(Facture[] factures) {
        this.factures = factures;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
