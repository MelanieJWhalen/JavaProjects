import com.esri.sde.sdk.client.*;

public class Main {
	
	private static SeConnection conn;

	public static void main(String[] args) {

		/*Direct connection to an Oracle geodatabase*/
		String server = "skhadke.esri.com", database = "", user = "sde", password = "sde@skhadke/theburrow";
		String instance = "sde:oracle11g";
		//System.out.println("Library Path = " + System.getProperty("java.library.path") );
		
		try 
		{
			System.out.println("\n\nConnecting to server " + server + ", instance " + instance);
			conn = new SeConnection(server, instance, database, user, password);
			System.out.println("Connection successful!");
		}
		catch(SeException e) 
		{
			e.printStackTrace();
			return;
		}
	}
}
