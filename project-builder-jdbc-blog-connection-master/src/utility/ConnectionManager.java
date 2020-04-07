package utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	
	public static Connection getConnection() {
		Properties prop;
		Connection con=null;
		try {
			prop = loadPropertiesFile();

		String driverClass = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");

		Class.forName(driverClass);

		con = DriverManager.getConnection(url, username, password);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	public static Properties loadPropertiesFile() throws IOException {
		
		Properties prop = new Properties();	
		InputStream in =  ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close(); 
		return prop;

		
	}
	
	
}
