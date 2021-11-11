package app;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class ProcesadorDeTexto {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			MarcoProcesador mimarco=new MarcoProcesador(); 
			
			mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}

	}

	class MarcoProcesador extends JFrame{
		
		private static final long serialVersionUID = 1L;

		public MarcoProcesador(){
			
			LaminaProcesador miprocesador=new LaminaProcesador();
			
			add(miprocesador);
			
			setBounds(300, 200,500, 500);
			
			setTitle("Mi primer procesador de textos");
			Toolkit miPantalla=Toolkit.getDefaultToolkit();
			Image miIcono=miPantalla.getImage(("C:/Users/panza/Desktop/archivos/notas.jpg"));
			setIconImage(miIcono);
			setVisible(true);
			
		}
	}

	class LaminaProcesador extends JPanel{
	
		private static final long serialVersionUID = 1L;

		public LaminaProcesador(){
			
			setLayout(new BorderLayout());
			
			botonGuardar= new JButton("Guardar");
			
			JPanel laminamenu=new JPanel();
			
			JMenuBar mibarra=new JMenuBar();
			
			//-----------------------------------------------------------------
			
			fuente=new JMenu("Fuente");
			
			estilo=new JMenu("Estilo");
			
			tamaño=new JMenu("Tamaño");
			
			ConfiguraMenu("Arial", "fuente", "Arial", 9, 10,"");
			
			ConfiguraMenu("Courier", "fuente", "Courier", 9, 10,"");
			
			ConfiguraMenu("Verdana", "fuente", "Verdana", 9, 10,"");
			
			ConfiguraMenu("Arial Rounded MT Bold", "fuente", "Arial Rounded MT Bold", 9, 10,"");
			//-----------------------------------------------------------------
			
			
			JCheckBoxMenuItem negrita=new JCheckBoxMenuItem("Negrita", new ImageIcon("src/negrita.gif"));
			
			JCheckBoxMenuItem cursiva=new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/cursiva.gif"));
			
			negrita.addActionListener(new StyledEditorKit.BoldAction());
			
			cursiva.addActionListener(new StyledEditorKit.ItalicAction());
			
			negrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
			
			cursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
			
			estilo.add(negrita);
			
			estilo.add(cursiva);
			//-----------------------------------------------------------------UHIVBHRBVJRBVKJBVJKBVKJBVKJBVJKBVJKBVJBVJKBVJBVJKBVJB
			
			
			ButtonGroup tamañoletra=new ButtonGroup();
			
			JRadioButtonMenuItem doce=new JRadioButtonMenuItem("12");
			
			JRadioButtonMenuItem dieciseis=new JRadioButtonMenuItem("16");
			
			JRadioButtonMenuItem veinte=new JRadioButtonMenuItem("20");
			
			JRadioButtonMenuItem veinticuatro=new JRadioButtonMenuItem("24");
			
			JRadioButtonMenuItem veinticinco=new JRadioButtonMenuItem("25");
			
			JRadioButtonMenuItem veintiocho=new JRadioButtonMenuItem("28");
			
			JRadioButtonMenuItem treinta=new JRadioButtonMenuItem("30");
			
			JRadioButtonMenuItem treintaydos=new JRadioButtonMenuItem("32");
			
			JRadioButtonMenuItem treintayseis=new JRadioButtonMenuItem("36");
			
			JRadioButtonMenuItem cuarenta=new JRadioButtonMenuItem("40");
			
			JRadioButtonMenuItem cincuenta=new JRadioButtonMenuItem("50");
			
			tamañoletra.add(doce); tamañoletra.add(dieciseis); tamañoletra.add(veinte);
			
			tamañoletra.add(veinticuatro); tamañoletra.add(veinticinco); tamañoletra.add(veintiocho);
			
			tamañoletra.add(treinta); tamañoletra.add(treintaydos); tamañoletra.add(treintayseis);
			
			tamañoletra.add(cuarenta); tamañoletra.add(cincuenta);
			
			doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 12));
			
			dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 16));
			
			veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 20));
			
			veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 24));
			
			veinticinco.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 25));
			
			veintiocho.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 28));
			
			treinta.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 30));
			
			treintaydos.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 32));
			
			treintayseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 36));
			
			cuarenta.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 40));
			
			cincuenta.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 50));
			
			veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
			
			tamaño.add(doce);
			
			tamaño.add(dieciseis); tamaño.add(veinte); tamaño.add(veinticuatro);
			
			tamaño.add(veinticinco); tamaño.add(veintiocho); tamaño.add(treinta);
			
			tamaño.add(treintaydos); tamaño.add(treintayseis); tamaño.add(cuarenta);
			
			tamaño.add(cincuenta);
			
			//-----------------------------------------------------------------
			botonGuardar.addActionListener(new AccionGuardar());
			
			
			mibarra.add(fuente);
			
			mibarra.add(estilo);
			
			mibarra.add(tamaño);
			
			laminamenu.add(mibarra);
			
			add(laminamenu, BorderLayout.NORTH);
			
			add(botonGuardar, BorderLayout.SOUTH);
			
			miarea=new JTextPane();
			
			add(miarea, BorderLayout.CENTER);
			
			//--------------------------------------------------------------
			
			barrah=new JToolBar();
			
			configuraBarra("C:/Users/panza/Desktop/archivos/negrita.gif").addActionListener(new StyledEditorKit.BoldAction());
			
			configuraBarra("C:/Users/panza/Desktop/archivos/cursiva.gif").addActionListener(new StyledEditorKit.ItalicAction());
			
			configuraBarra("C:/Users/panza/Desktop/archivos/subrayado.gif").addActionListener(new StyledEditorKit.UnderlineAction());
			
			barrah.addSeparator();
			
			configuraBarra("C:/Users/panza/Documents/").addActionListener(new StyledEditorKit.ForegroundAction("Poner azul", Color.BLUE));
			
			configuraBarra("C:/Users/panza/Desktop/archivos/bolaAmarilla.gif").addActionListener(new StyledEditorKit.ForegroundAction("Poner amarillo", Color.YELLOW));
			
			configuraBarra("C:/Users/panza/Desktop/archivos/rojo.gif").addActionListener(new StyledEditorKit.ForegroundAction("Poner rojo", Color.RED));
			
			barrah.addSeparator();
			
			configuraBarra("C:/Users/panza/Desktop/archivos/izquierda.png").addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0));
			
			configuraBarra("C:/Users/panza/Desktop/archivos/dercha.png").addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));
			
			configuraBarra("C:/Users/panza/Desktop/archivos/centrado.png").addActionListener(new StyledEditorKit.AlignmentAction("centrado", 1));
			
			configuraBarra("C:/Users/panza/Desktop/archivos/justificado.png").addActionListener(new StyledEditorKit.AlignmentAction("justificado", 3));
			
			
			
			barrah.setOrientation(1);
			
			add(barrah, BorderLayout.WEST);
		}
		
		public JButton configuraBarra(String ruta){
			
			JButton boton=new JButton(new ImageIcon(ruta));
			
			barrah.add(boton);
			
			return boton;
		}
		
	public void ConfiguraMenu(String rotulo, String menu, String tipoletra, int estilos, int tam, String rutaIcono){
			
		JMenuItem elementomenu=new JMenuItem(rotulo, new ImageIcon(rutaIcono));
		
		if(menu=="fuente"){
			
			fuente.add(elementomenu);
			
			if(tipoletra=="Arial"){
				
				elementomenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
			}else if(tipoletra=="Courier"){
				
				elementomenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Courier"));
			}else if(tipoletra=="Verdana"){
				
				elementomenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Verdana"));
			}else if(tipoletra=="Arial Rounded MT Bold"){
				
				elementomenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial Rounded MT Bold"));
			}}else if(menu=="tamaño"){
				
				tamaño.add(elementomenu);
				
				
				elementomenu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", tam));
				
			}
			
	}

		private class AccionGuardar implements ActionListener{	
			
			public void actionPerformed(ActionEvent e) {
			
				String texto=miarea.getText();
				JFileChooser selector = new JFileChooser(ruta);
			    FileNameExtensionFilter filter = new FileNameExtensionFilter("txt");
			    selector.setFileFilter(filter);
			    int returnVal = selector.showOpenDialog(getParent());
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			     
			    	rutaGuardar=selector.getSelectedFile().getAbsolutePath();
			    	
			    	
			    	try {
						escribir=new FileWriter(rutaGuardar);
						escribir.write(texto);
						escribir.close();
						
						JOptionPane.showMessageDialog(null, "Tu archivo ha sido guardado, ve a revisarllo en la ruta:" + rutaGuardar);
					} catch (IOException ex) {
					
						JOptionPane.showMessageDialog(null, "Algo salio mal y no pudimos guardar tu archivo");
					}
			    	
			    
			    			
			    }

			}
			
			String rutaGuardar;
			File ruta=new File("C:/Users/");
					
				}
				
		
		
			FileWriter escribir;
			JButton botonGuardar;
			
			JTextPane miarea;
			
			JMenu fuente, estilo, tamaño;
			
			Font letras;
			
			JButton negritaBarra,  cursivaBarra, azulBarra, rojoBarra, amarilloBarra, subrayadoBarra,
			izquierda, centradao, derecha, justificado;
			
			JToolBar barrah;
			
			
	}

