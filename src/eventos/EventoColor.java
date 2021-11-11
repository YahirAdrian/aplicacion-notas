package eventos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.text.StyledEditorKit;

import color.ColorPicker;

public class EventoColor implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Color colorSeleccionado;
		ColorPicker color = new ColorPicker();
		System.out.println(color.toString());
		//colorSeleccionado = new Color(10,10,01);
		
	}

}
