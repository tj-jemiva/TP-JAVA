import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface InterfServiceDistant extends Remote {
	public Date getServerDate() throws RemoteException;
	public double convertEuroToDH(double montant) throws RemoteException;
}
