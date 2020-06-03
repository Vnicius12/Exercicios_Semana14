import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

public class PessoasDAO{

    public List <Pessoa> listar ( ) throws Exception{
    String sql = “SELECT * FROM tb_pessoa”;
        List <Pessoa> pessoa = new ArrayList <> ( );
    

try (Connection c = ConexaoBD.obtemConexao();
      PreparedStatement ps = c.prepareStatement(sql);
      ResultSet rs = ps.executeQuery ( ) ){
   while (rs.next ( )){
      String pessoas = rs.getString(pessoas);
      String esportes = rs.getString(esportes);
         Pessoa p = new Pessoa (pessoas, esportes);
				pessoa.add(p);
			}
		}        
    }
}