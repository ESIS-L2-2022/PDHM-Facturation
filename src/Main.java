public class Main {
    public static void main(String[] args) {
        Facture facture1 = new Facture();
        Facture facture2 = new Facture();
        Facture facture3 = new Facture();
        Facture facture4 = new Facture();

        Client client = new Client();
        client.setNom("Katele");

        Client.Addresse addresse = client.new Addresse();
        addresse.setAvenue("Femme Katangaise");
        addresse.setCommune("Lubumbashi");
        addresse.setNumero("5");
        addresse.setQuartier("Salama");
        addresse.setVille("Lubumbashi");
        addresse.setPays("RDC");

    }
}
