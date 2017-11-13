package coding;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//import javax.swing.JLabel;
//import java.awt.BorderLayout;
//import javax.swing.JTextArea;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.event.ChangeEvent;
//import javax.swing.text.StyleConstants;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class SensorOutputs{

	private JFrame frame;
	private int temp = 28;
	private String input = "d";
	//private JLabel aircon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SensorOutputs so = new SensorOutputs();
					so.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SensorOutputs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//SensorOutputs so = new SensorOutputs();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel aircon = new JLabel();
		if(temp > 25){
        	aircon.setText("DOWN");
        }else{
        	aircon.setText("UP");
        }
		//aircon.setText("UP");
		frame.getContentPane().add(aircon);
		
		Panel window = new Panel();
		
		if(input == "c"){
			window.setBackground(Color.WHITE);
		}else{
			window.setBackground(Color.BLACK);
		}
		
		frame.getContentPane().add(window);
		//frame.setVisible(true);
		
		/*public void actionPerformed(ActionEvent e){
			if(temp > 25){
	        	aircon.setText("DOWN");
	        }else{
	        	aircon.setText("UP");
	        }*/
		//}
		
		/*window.addComponentListener(new ComponentAdapter() {
			public void componentShown ( ComponentEvent e ){
				if(input == "c"){
					window.setBackground(Color.WHITE);
				}else{
					window.setBackground(Color.BLACK);
				}
			}
		});*/
		
			
	}


}
