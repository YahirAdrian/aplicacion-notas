package app;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.BoldAction;
public class LaminaArea extends JPanel{

	private static final long serialVersionUID = 1L;
	JTextPane areaTexto = new JTextPane();
	public LaminaArea()
	{
		areaTexto.setPreferredSize(new Dimension(700, 630));
		areaTexto.setFont(new Font("Arial", Font.PLAIN, 20));
		add(areaTexto);
	}

}
