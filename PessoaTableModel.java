import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import java.util.List;
public class PessoaTableModel extends AbstractTableModel{
    private String [] = {"pessoas", "esportes"};
    private List <Pessoa> pessoas;
    private List <Pessoa> obtemPessoas ( ){
        try{
            PessoasDAO dao = new PessoasDAO ( );
this.pessoas = dao.listar ( );
}
catch (Exception e){
    JOptionPane.showMessageDialog (null, "falhou");
}
}
public PessoaTableModel ( ){
	this.obtemPessoas();
}
@Override
public int getColumnCount() {
	return 2;
}
@Override
public int getRowCount() {
	return pessoas.size();
}
@Override
public Object getValueAt(int rowIndex, int columnIndex) {
	switch (columnIndex){
    case 0:
        return pessoas.get(rowIndex).getPessoas();
        break;
    case 1:
        return pessoas.get(rowIndex).getEsportes();
        break;
	}
	
	
};
}

