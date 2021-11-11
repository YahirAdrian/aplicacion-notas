package app;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import eventos.EventoColor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
public class LaminaHerramientas extends JPanel{

	private static final long serialVersionUID = 1L;
	ArrayList<JMenuItem> itemsBotones = new ArrayList<JMenuItem>(10);
	JToolBar barraHerramientas = new JToolBar();
	JMenuBar barra = new JMenuBar();
	
	
	
	String rotulosBotones [] = {"Rojo", "Negro", "Azul", "Color",
								"Negrita", "Cursiva", "Subrayado",
								"Centrado", "Justificado", "Left", "Right"};
	
	ImageIcon imgRojo = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/rojo.png");
	Icon iconoRojo = new ImageIcon(imgRojo.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	ImageIcon imgAzul = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/azul.png");
	Icon iconoAzul = new ImageIcon(imgAzul.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	ImageIcon imgNegro = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/negro.png");
	Icon iconoNegro = new ImageIcon(imgNegro.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	ImageIcon imgColor = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/colores.png");
	Icon iconoColor = new ImageIcon(imgColor.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	
	ImageIcon imgNegrita = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/negrita.png");
	Icon iconoNegrita = new ImageIcon(imgNegrita.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	ImageIcon imgCursiva = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/cursiva.png");
	Icon iconoCursiva = new ImageIcon(imgCursiva.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	ImageIcon imgSubrayado = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/subrayado.png");
	Icon iconoSubrayado = new ImageIcon(imgSubrayado.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	
	ImageIcon imgCentrado = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/centrado.png");
	Icon iconoCentrado = new ImageIcon(imgCentrado.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	ImageIcon imgJustificado = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/justificado.png");
	Icon iconoJustificado = new ImageIcon(imgJustificado.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	ImageIcon imgLeft = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/left.png");
	Icon iconoLeft = new ImageIcon(imgLeft.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	ImageIcon imgRight = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/right.png");
	Icon iconoRight = new ImageIcon(imgRight.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	
	ImageIcon imgImg = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/image.png");
	Icon iconoImage = new ImageIcon(imgImg.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	ImageIcon imgMath = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/math.png");
	Icon iconoMath = new ImageIcon(imgMath.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	ImageIcon imgCanvas = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/canvas.png");
	Icon iconoCanvas = new ImageIcon(imgCanvas.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	ImageIcon imgLink = new ImageIcon("C:/Users/panza/Documents/JavaDev/Java/AplicacionNotas/src/sources/link.png");
	Icon iconoLink = new ImageIcon(imgLink.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	
	Icon iconos [] = {iconoRojo, iconoNegro, iconoAzul, iconoColor,
					iconoNegrita, iconoCursiva, iconoSubrayado,
					iconoCentrado, iconoJustificado, iconoLeft, iconoRight,
					iconoImage, iconoMath, iconoCanvas, iconoLink
	};
	JMenu menu1 = new JMenu("Menu principal");
	JMenuItem btnRojo = new JMenuItem("Rojo", iconoRojo), btnNegro = new JMenuItem("Negro", iconoNegro), btnAzul = new JMenuItem("Azul", iconoAzul), btnColor = new JMenuItem("Color", iconoColor);
	JMenuItem btnNegrita = new JMenuItem("Negrita", iconoNegrita), btnCursiva = new JMenuItem("Cursiva", iconoCursiva), btnSubrayado = new JMenuItem("Subrayado", iconoSubrayado);
	JMenuItem btnCentrado = new JMenuItem("Centrado", iconoCentrado), btnJustificado = new JMenuItem("Justificado", iconoJustificado), btnLeft = new JMenuItem("Left", iconoLeft), btnRight = new JMenuItem("Right", iconoRight);
	JMenuItem listaBotones [] = { btnRojo, btnAzul, btnNegro,
								btnNegrita, btnCursiva, btnSubrayado, 
								btnCentrado, btnJustificado, btnLeft, btnRight};
	/*Lista de los botones:
	 *  COLORES: ROJO, NEGRO, AZU, CUSTOM
	 *  ESTILOS DE TEXTO: NEGRITA, CURSIVA, SUBRAYADO(COLOR-SUBRAYADO[COLOR_MARCATEXTO])
	 *  ALINEAMIENTO DE TEXTO: CENTRADO, JUSTIFICADO, IZQUIERDA, DERECHA
	 *  HERRAMIENTAS EXTRA: IMAGENES, FORMULA MATEMATICAS, CANVAS, LINKS, CUADROS DE TEXTO*/
	
	
	public LaminaHerramientas()
	{
		construirBarra();
		
		add(barraHerramientas);
	}
	
	public void construirBarra()
	{	
		Dimension tamañoSeparador = new Dimension(30, 20);
		barraHerramientas.setOrientation(1);
		barraHerramientas.setFloatable(false);
		
		barraHerramientas.add(new JLabel("Color"));
		barraHerramientas.add(btnRojo);
		barraHerramientas.add(btnNegro);
		barraHerramientas.add(btnAzul);
		barraHerramientas.add(btnColor);
		
		
		barraHerramientas.addSeparator(tamañoSeparador);
		barraHerramientas.add(new JLabel("Estilo"));
		barraHerramientas.add(btnNegrita);
		barraHerramientas.add(btnCursiva);
		barraHerramientas.add(btnSubrayado);
		
		barraHerramientas.addSeparator(tamañoSeparador);
		barraHerramientas.add(new JLabel("Alineamiento"));
		barraHerramientas.add(btnCentrado);
		barraHerramientas.add(btnJustificado);
		barraHerramientas.add(btnLeft);
		barraHerramientas.add(btnRight);
		gestionarEventos();
		
	}
	
	public void construirListaBotones()
	{
		itemsBotones.add(btnRojo); itemsBotones.add(btnAzul); itemsBotones.add(btnNegro);
		itemsBotones.add(btnNegrita); itemsBotones.add(btnCursiva); itemsBotones.add(btnSubrayado);
		itemsBotones.add(btnCentrado); itemsBotones.add(btnJustificado); itemsBotones.add(btnLeft);
		itemsBotones.add(btnRight);
	}
	
	public void gestionarEventos()
	{
		btnRojo.addActionListener(new StyledEditorKit.ForegroundAction("color", Color.RED));
		btnAzul.addActionListener(new StyledEditorKit.ForegroundAction("color", Color.BLUE));
		btnNegro.addActionListener(new StyledEditorKit.ForegroundAction("color", Color.BLACK));
		btnColor.addActionListener(new EventoColor());
		
		btnNegrita.addActionListener(new StyledEditorKit.BoldAction());
		btnCursiva.addActionListener(new StyledEditorKit.ItalicAction());
		btnSubrayado.addActionListener(new StyledEditorKit.UnderlineAction());
		
		btnCentrado.addActionListener(new StyledEditorKit.AlignmentAction("centrado",1));
		btnJustificado.addActionListener(new StyledEditorKit.AlignmentAction("justificado", 4));
		btnLeft.addActionListener(new StyledEditorKit.AlignmentAction("left", 3));
		btnRight.addActionListener(new StyledEditorKit.AlignmentAction("right", 2));
	}
}