import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

   static {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
      } 
      catch (ClassNotFoundException e) {
         throw new RuntimeException(e);
      }
   }

   public static Connection obtemConexao() throws SQLException {
      String servidor = "localhost";
      String porta = "3306";
      String database = "pessoas";
      String usuario = "root";
      String senha = "vamosinter";
      return DriverManager.getConnection("jdbc:mysql://"+servidor+":"+porta+"/"+database+"?user="+usuario+"&password="+senha);
   }
}