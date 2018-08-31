

package Control;

import Interfaz.Interfaz;
import Modelo.Persona;
import javafx.scene.Node;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;

/**
 *
 * @author andreachacon
 */
public class Control {

	public static ArrayList<Persona> personas = new ArrayList<Persona>();
	//Interfaz interfaz = new Interfaz();
	
	public Control() {

	}

	public boolean agregarPersona(Persona p) {
		if (!buscarPersona(p)) {
			personas.add(p);
			return true;
		} else {
			return false;
		}

	}

	public boolean buscarPersona(Persona p) {

		if (personas.contains(p)) {
			return true;
		}
		return false;

	}

	public void imprimeLista() {
		for (Persona persona : personas) {
			//persona.toString();
                        System.out.println(persona.getIdentificacion());
                        System.out.println(persona.getNombre());
                        System.out.println(persona.getApellido());
                        System.out.println(persona.getDireccion());
                        System.out.println(persona.getTelefono());
                      
                        
		}
	}

}