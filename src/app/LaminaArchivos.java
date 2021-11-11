package app;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
public class LaminaArchivos extends JPanel{

	private static final long serialVersionUID = 1L;
	Box panel = new  Box(BoxLayout.Y_AXIS);
	JTabbedPane tabNotas = new JTabbedPane();
	JPanel panelNotas = new JPanel();
	JPanel panelApuntes = new JPanel();
	
	public LaminaArchivos()
	{
		panel.setPreferredSize(new Dimension(400, 630));
		panel.setBorder(BorderFactory.createEtchedBorder());
		tabNotas.addTab("Notas", panelNotas);
		tabNotas.addTab("Apuntes", panelApuntes);
		crearPanelNotas();
		crearPanelApuntes();
		panel.add(tabNotas);
		add(panel);
	}
	
	public void crearPanelNotas()
	{
		panelNotas.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelNotas.add(new JLabel("Por el momento no hay notas"));
	}
	
	public void crearPanelApuntes()
	{
		panelApuntes.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelApuntes.add(new JLabel("Por el momento no hay apuntes"));
	}

	
}
