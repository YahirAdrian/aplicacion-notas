package app;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
public class Aplicacion {

	public static void main(String[] args) {
		JFrame marco = new JFrame("Notas");
		Dimension tama�oPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Contenido contenido = new Contenido();  
		System.out.println("Tama�o de la pantalla: " + tama�oPantalla);
		marco.add(contenido);
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setExtendedState(6);
		
		marco.setVisible(true);
	}

}
