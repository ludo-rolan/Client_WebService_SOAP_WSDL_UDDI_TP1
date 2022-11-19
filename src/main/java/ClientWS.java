import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {

    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println("Conversion: " + stub.convert(7600));
        Compte cp = stub.getCompte(8);
        System.out.println("Code: " + cp.getCode());
        System.out.println("Solde: " + cp.getSolde());
    }

}
