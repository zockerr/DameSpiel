import java.net.URL;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class SpielfeldGUI extends JPanel {
	
	private Spielfeld spielfeld;
	private HashMap<String, ImageIcon> icons;
	
	
	public SpielfeldGUI(){
		
		//Bilder laden
		URL s = SpielfeldGUI.class.getClassLoader().getResource("res/img/schwarz_leer.png");
		ImageIcon icon = new ImageIcon(getClass().getResource("/res/img/schwarz_leer.png"));
		icons.put("schwarz_leer", icon);
		
		icon = new ImageIcon(getClass().getResource("/res/img/schwarz_voll.png"));
		icons.put("schwarz_voll", icon);
		
		icon = new ImageIcon(getClass().getResource("/res/img/schwarz_dame.png"));
		icons.put("schwarz_dame", icon);
		
		icon = new ImageIcon(getClass().getResource("/res/img/weiss_leer.png"));
		icons.put("weiss_leer", icon);
		
		icon = new ImageIcon(getClass().getResource("/res/img/weiss_voll.png"));
		icons.put("weiss_voll", icon);
		
		icon = new ImageIcon(getClass().getResource("/res/img/weiss_dame.png"));
		icons.put("weiss_dame", icon);
		
		
	}

}
