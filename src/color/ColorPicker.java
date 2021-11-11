package color;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorPicker {
	static JFrame mimarco;
	static final int WIDTH = 350, HEIGHT = 280;
	
	public ColorPicker() {
		// TODO Auto-generated method stub
		
		mimarco = new JFrame("Seleccionar color...");
		Lamina milamina = new Lamina();
		mimarco.add(milamina);
		mimarco.setBounds(600,100, WIDTH, HEIGHT);
		mimarco.setVisible(true);
		mimarco.setResizable(false);
		
		
	}



 private class Lamina extends JPanel{

	private static final long serialVersionUID = 1L;
	Color color = new Color(0,0,0);
	JSlider redSlider, greenSlider, blueSlider;
	JTextField campo_rgb, campo_hex;
	JPanel laminaCentral;
	JButton botonGuardar;
	public Lamina() {
		//CREACION DE LAMINAS
		setLayout(new BorderLayout());
		laminaCentral =  new JPanel();
		JPanel laminaInferior = new JPanel(new BorderLayout());
		//CONFIGURACION DE EL BOTON GUARDAR
		botonGuardar  = new JButton("Listo");
		botonGuardar.setBackground(new Color(179, 194, 255));
		botonGuardar.addActionListener(new AccionGuardar());
		
		//	CREACION DE LOS SLIDERS
		redSlider = new JSlider(1,0, 255, 12);
		greenSlider = new JSlider(1,0, 255, 97);
		blueSlider = new JSlider(1,0, 255, 83);
		//CREACION DE LOS LABELS SEGUIDO DE SU TEXTFIELD
		campo_rgb = new JTextField(10);
		campo_rgb.setText("rgb(12, 97, 83)");
		campo_hex = new JTextField(10);
		campo_hex.setText("Hex: #0b5153");
		//HACER QUE NO SE MUEVAN SI NO SE HA PULSADO EN EL CENTRO
		redSlider.setSnapToTicks(true);
		greenSlider.setSnapToTicks(true);
		blueSlider.setSnapToTicks(true);
		//AGREGARLES UN EVENT LISTENER
		redSlider.addChangeListener(new Cambio());
		greenSlider.addChangeListener(new Cambio());
		blueSlider.addChangeListener(new Cambio());
		//CAMBIAR EL COLOR DE FONDO AL INICIO
		cambiarFondo(12, 97, 83);
		redSlider.setBackground(new Color(12, 97, 83));
		greenSlider.setBackground(new Color(12, 97, 83));
		blueSlider.setBackground(new Color(12, 97, 83));
		//AGREGARLOS A LA LAMINA
		
		laminaCentral.add(redSlider); laminaCentral.add(greenSlider);
		laminaCentral.add(blueSlider); laminaCentral.add(campo_rgb);
		
		laminaInferior.add(botonGuardar, BorderLayout.CENTER);
		add(laminaCentral, BorderLayout.CENTER);
		add(laminaInferior, BorderLayout.SOUTH);
		campo_rgb.setEditable(false);
		campo_rgb.setBorder(null);
		campo_rgb.setFont(new Font("sans-serif", Font.BOLD, 16));
		
	}
	
	public void cambiarFondo(int red, int green, int blue) {
		
		cambiarCampo(red, green , blue);
		int gradient = 5;
		laminaCentral.setBackground(new Color(red, green, blue));
		
		if(red <=5 || green <=5 || blue <=5) {
			 gradient = 0;
		}
		//CREANDO UN DEGRADADO PARA LOS COMPONEMNTES
		redSlider.setBackground(new Color(red -gradient, green -gradient, blue -gradient));
		greenSlider.setBackground(new Color(red -gradient, green -gradient, blue -gradient));
		blueSlider.setBackground(new Color(red -gradient, green -gradient, blue -gradient));
		campo_rgb.setBackground(new Color(red -gradient, green -gradient, blue -gradient));
		campo_hex.setBackground(new Color(red -gradient, green -gradient, blue -gradient));
		
		setColor(new Color(red, green, blue));
	}
	
	public void cambiarCampo(int red, int green, int blue) {
		String color = "rgb(" + red + ","+ green + "," + blue + ")";
		int sumatoria_color = red + green + blue;
		campo_rgb.setText(color);
		
		if(sumatoria_color <= 300) {
			campo_rgb.setForeground(Color.WHITE);
			campo_hex.setForeground(Color.WHITE);
		}else {
			campo_rgb.setForeground(Color.BLACK);
			campo_hex.setForeground(Color.BLACK);
		}
	}
	
	public  void setColor(Color color)
	{
		this.color = color;
	}
	
	public  Color getColor()
	{
		return this.color;
	}
	
	
	private class Cambio implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			int r, g, b;
			r = redSlider.getValue();
			g = greenSlider.getValue();
			b = blueSlider.getValue();
			cambiarFondo(r, g, b);
		}
		
	}
	
	private class AccionGuardar implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			 Color color = new Color(getColor().getRed(), getColor().getGreen(), getColor().getBlue());	
			 System.out.println(color);
			 ColorPicker.mimarco.setVisible(false);
			 
			
		}
		
	}
	

}
}