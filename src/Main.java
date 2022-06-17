import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Facture facture1 = new Facture();
        Facture facture2 = new Facture();
        Facture facture3 = new Facture();
        Facture facture4 = new Facture();
        Facture facture5 = new Facture();

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
        List<Facture> facturesKatele = new ArrayList();
        facturesKatele.add(facture1);
        facturesKatele.add(facture2);
        facturesKatele.add(facture3);
        facturesKatele.add(facture4);
        facturesKatele.add(facture5);

        // attribution des factures via le setter setFactures(Factures[])
        client.setFactures(facturesKatele);

    }
}
