public class Main {
    public static void main(String[] args) {
        Facture facture1 = new Facture();
        Facture facture2 = new Facture();
        Facture facture3 = new Facture();
        Facture facture4 = new Facture();

        // instanciation de la classe client
        Client client = new Client();
        client.setNom("Katele");

        // creation de l'addresse grace à la classe interne Addresse()
        Client.Addresse addresse = client.new Addresse("Femme Katangaise", "Lubumbashi", "5", "Salama", "Lubumbashi", "RDC");

        // attribution des factures au client
        facture1.setClient(client);
        facture2.setClient(client);
        facture3.setClient(client);
        facture4.setClient(client);

        // la liste des factures
        Facture[] facturesKatele = new Facture[4];
        facturesKatele[0] = facture1;
        facturesKatele[1] = facture2;
        facturesKatele[2] = facture3;
        facturesKatele[3] = facture4;

        // attribution des factures via le setter setFactures(Factures[])
        client.setFactures(facturesKatele);

    }
}
