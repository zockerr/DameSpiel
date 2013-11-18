import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JComponent;


public class SpielfeldGUI extends JComponent {
	
	private Spielfeld spielfeld;
	private static HashMap<String, ImageIcon> icons;
	
	//static-block, um die bildresourcen einmal zu laden
	
	static{
		ImageIcon icon = new ImageIcon();
	}
	

}
