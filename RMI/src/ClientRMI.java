import java.rmi.Naming;

public class ClientRMI {

	public static void main(String[] args) {
		try {
			InterfServiceDistant od =
			(InterfServiceDistant)Naming.lookup("rmi://localhost:1099/SD");
			System.out.println("Date du serveur: "+od.getServerDate());
			System.out.println("35 euro vaut "+od.convertEuroToDH(35)+" Ariary");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
