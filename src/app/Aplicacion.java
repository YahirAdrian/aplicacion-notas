package app;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
public class Aplicacion {

	public static void main(String[] args) {
		JFrame marco = new JFrame("Notas");
		Dimension tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Contenido contenido = new Contenido();  
		System.out.println("Tamaño de la pantalla: " + tamañoPantalla);
		marco.add(contenido);
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setExtendedState(6);
		
		marco.setVisible(true);
	}

}
