package app;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

//import java.awt.*;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.StyledEditorKit.ForegroundAction;

@SuppressWarnings("serial")
public class LaminaBarra extends JPanel{
	JMenuBar miBarra = new JMenuBar();
	JMenu archivos = new JMenu("Archivos");
	JMenu vista = new JMenu("Vista");
	JMenu objetos = new JMenu("Objetos");
	JMenu herramientas = new JMenu("Herramientas");
	JMenuItem guardar = new JMenuItem("Guardar");
	JMenuItem nuevo = new JMenuItem("Crear nuevo..");
	JMenuItem  elementos= new JMenuItem("Elementos");
	JMenuItem barra = new JMenuItem("Barra");
	JMenuItem  canvas = new JMenuItem("Lienzo");
	JMenuItem imagen = new JMenuItem("Imagen");
	
	
	//ARCHIVOS, VISTA, HERRAMIENTAS, +
	//JMENUBAR, JMENU, JMENUITEM
	public LaminaBarra()
	{
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		archivos.add(guardar); archivos.add(nuevo);
		vista.add(elementos); vista.add(barra);
		objetos.add(canvas); objetos.add(imagen);
		herramientas.add(objetos);
		miBarra.add(archivos);
		miBarra.add(vista);
		miBarra.add(herramientas);
		//gestionarEventos();
		add(miBarra);
	}

	/*public void gestionarEventos()
	{
		elementos.addActionListener(new StyledEditorKit.ForegroundAction("color", Color.RED));
		barra.addActionListener(new StyledEditorKit.ForegroundAction("color", Color.BLUE));
		imagen.addActionListener(new StyledEditorKit.ForegroundAction("color", Color.BLACK));
		guardar.addActionListener(new StyledEditorKit.ItalicAction());
	}*/

}

