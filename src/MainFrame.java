import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.LayoutManager;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JLabel;


public class MainFrame {

	private JFrame frame;
	
	private JPanel panel_1;
	
	private MigLayout migLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		migLayout = new MigLayout("", "[100px][grow]", "[grow][40px]");
		frame.getContentPane().setLayout(new MigLayout("", "[100px][grow]", "[grow][40px]"));
		
		panel_1 = new JPanel();
		panel_1.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				int h = panel_1.getHeight();
				panel_1.setSize(new Dimension(h,h));
				migLayout = (MigLayout)frame.getContentPane().getLayout();
				migLayout.setColumnConstraints("[" + h + "][grow]");
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
				
			}
		});
		panel_1.setBackground(Color.RED);
		frame.getContentPane().add(panel_1, "cell 0 0 1 2,grow");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel_2, "cell 1 0,grow");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		frame.getContentPane().add(panel, "cell 1 1,grow");
	}

}
