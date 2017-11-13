package coding;

import java.awt.EventQueue;
//import java.util.Calendar;
//import java.util.GregorianCalendar;

import javax.swing.JFrame;
//import javax.swing.JToggleButton;
//import java.awt.BorderLayout;
import javax.swing.JSlider;
import javax.swing.SpringLayout;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;

public class SensorInputs implements ChangeListener{

	//private static final String JSlider = null;
	private JFrame frame;
	private int minimumTime = 0;
	private int maximumTime = 24;
	JSlider temp = new JSlider();
	JSlider time = new JSlider(minimumTime, maximumTime);
	JSlider windSpeed = new JSlider();
	//private JSlider source = (JSlider).getSource();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SensorInputs window = new SensorInputs();
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
	public SensorInputs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//GregorianCalendar time = new GregorianCalendar();
		//SensorInputs window = new SensorInputs();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		//window.frame.setVisible(true);
		
		//JSlider temp = new JSlider();
		springLayout.putConstraint(SpringLayout.NORTH, temp, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, temp, 105, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(temp);
		
		JLabel lblTemperature = new JLabel("Temperature");
		springLayout.putConstraint(SpringLayout.NORTH, lblTemperature, 6, SpringLayout.SOUTH, temp);
		springLayout.putConstraint(SpringLayout.WEST, lblTemperature, 165, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblTemperature);
		
		//JSlider time = new JSlider(minimumTime, maximumTime);
		springLayout.putConstraint(SpringLayout.NORTH, time, 64, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, time, 0, SpringLayout.EAST, temp);
		frame.getContentPane().add(time);
		
		JLabel lblNewLabel = new JLabel("Time");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.SOUTH, time);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 189, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);
		
		//JSlider windSpeed = new JSlider();
		springLayout.putConstraint(SpringLayout.NORTH, windSpeed, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, windSpeed, 0, SpringLayout.WEST, temp);
		frame.getContentPane().add(windSpeed);
		
		JLabel lblWindSpeed = new JLabel("Wind Speed");
		springLayout.putConstraint(SpringLayout.NORTH, lblWindSpeed, 6, SpringLayout.SOUTH, windSpeed);
		springLayout.putConstraint(SpringLayout.EAST, lblWindSpeed, 0, SpringLayout.EAST, lblTemperature);
		frame.getContentPane().add(lblWindSpeed);
		
		JLabel label = new JLabel("0");
		springLayout.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, temp);
		springLayout.putConstraint(SpringLayout.EAST, label, -4, SpringLayout.WEST, temp);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("100");
		springLayout.putConstraint(SpringLayout.NORTH, label_1, 0, SpringLayout.NORTH, temp);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("00");
		springLayout.putConstraint(SpringLayout.NORTH, label_2, 0, SpringLayout.NORTH, time);
		springLayout.putConstraint(SpringLayout.EAST, label_2, 0, SpringLayout.EAST, label);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("24");
		springLayout.putConstraint(SpringLayout.WEST, label_1, 0, SpringLayout.WEST, label_3);
		springLayout.putConstraint(SpringLayout.NORTH, label_3, 0, SpringLayout.NORTH, time);
		springLayout.putConstraint(SpringLayout.WEST, label_3, 1, SpringLayout.EAST, time);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("0");
		springLayout.putConstraint(SpringLayout.NORTH, label_4, 0, SpringLayout.NORTH, windSpeed);
		springLayout.putConstraint(SpringLayout.WEST, label_4, 0, SpringLayout.WEST, label);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("100");
		springLayout.putConstraint(SpringLayout.NORTH, label_5, 0, SpringLayout.NORTH, label_4);
		springLayout.putConstraint(SpringLayout.WEST, label_5, 0, SpringLayout.WEST, label_1);
		frame.getContentPane().add(label_5);
		
		temp.addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent e) {
	        	JSlider source = (JSlider)e.getSource();
	        	if (!source.getValueIsAdjusting()) {
	        		System.out.println(((JSlider) e.getSource()).getValue());
	        	  }
	        }
	    });
		
		time.addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent e) {
	        	 JSlider source = (JSlider)e.getSource();
	        	  if (!source.getValueIsAdjusting()) {
	        		  System.out.println(((JSlider) e.getSource()).getValue());
	        	  }
	        }
	    });
		
		windSpeed.addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent e) {
	        	JSlider source = (JSlider)e.getSource();
	        	if (!source.getValueIsAdjusting()) {
	        		  System.out.println(((JSlider) e.getSource()).getValue());
	        	  }
	        }
	    });
			//System.out.print("Time : " + time.get(Calendar.HOUR) +"."+ time.get(Calendar.MINUTE));
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public int getTemp(){
		return temp.getValue();
	}
	
	public int getTime(){
		return time.getValue();
	}
	
	public int getWindSpeed(){
		return windSpeed.getValue();
	}
	
}
