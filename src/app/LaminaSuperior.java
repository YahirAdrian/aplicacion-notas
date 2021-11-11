package app;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class LaminaSuperior extends JPanel{

	private static final long serialVersionUID = 1L;

	public LaminaSuperior()
	{
		setLayout(new BorderLayout());
		//add(new LaminaBarra(), BorderLayout.NORTH);
		add(new LaminaArchivos(), BorderLayout.WEST);
		add(new LaminaHerramientas(), BorderLayout.EAST);
	}
	
}
