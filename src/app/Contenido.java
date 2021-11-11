package app;
import java.awt.BorderLayout;

import javax.swing.*;
public class Contenido extends JPanel{

	private static final long serialVersionUID = 1L;

	public Contenido() {
		
	setLayout(new BorderLayout());
	
	add(new LaminaSuperior(), BorderLayout.WEST);
	add(new LaminaArea(), BorderLayout.CENTER);
	add(new LaminaBarra(), BorderLayout.NORTH);
	
	
	
	}
}
