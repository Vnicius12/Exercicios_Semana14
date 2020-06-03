import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TestePessoas {

	public static void main(String[] args) {
		PessoaTableModel funcModel = new PessoaTableModel();

	    JTable table = new JTable(funcModel);
	    JScrollPane scrollPane = new JScrollPane(table);

	    JFrame frame = new JFrame();
	    frame.getContentPane().add(scrollPane); 
	    frame.pack();
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLocationRelativeTo(null);
	}
}
