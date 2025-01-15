import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServeurRMI {

	public static void main(String[] args) {
		try {
			Registry registre = LocateRegistry.createRegistry(1099);
			ImplServiceDistant od = new ImplServiceDistant();
			Naming.rebind("rmi://localhost:1099/SD", od);
			System.out.println("Le serveur est prêt!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
