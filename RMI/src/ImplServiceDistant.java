import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class ImplServiceDistant extends UnicastRemoteObject implements InterfServiceDistant {

	public ImplServiceDistant() throws RemoteException {
		
	}
	public Date getServerDate() throws RemoteException {
		return new Date();
	}
	public double convertEuroToDH(double montant) throws RemoteException {
		return montant*4802.0;
	}

}
