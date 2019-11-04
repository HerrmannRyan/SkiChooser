import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class HeightInput extends JFrame implements ActionListener {
	
	private JLabel labelQuestion;
	private JLabel labelFeet;
	private JTextField fieldFeet;
	private JLabel labelInch;
	private JTextField fieldInch;
	private JButton toContinue;
	
	static double theHeightInFeet;
	static double theHeightInInches;
	
	public HeightInput()
	{
		super("Getting Your Height");
		
		initComponents();
		
		setSize(250, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	private void initComponents()
	{
		
		labelQuestion = new JLabel ("Please put your height in FEET and INCHES");
		labelFeet = new JLabel ("Feet:");
		fieldFeet = new JTextField(3);
		labelInch = new JLabel ("Inches:");
		fieldInch = new JTextField(3);
		toContinue = new JButton("Continue");
		
		setLayout(new FlowLayout());
		
		add(labelQuestion);
		add(labelFeet);
		add(fieldFeet);
		add(labelInch);
		add(fieldInch);
		add(toContinue);
		
		toContinue.addActionListener(this);
		
	}
	
	public void actionPerformed (ActionEvent event)
	{
		
		float heightInFeet =  Float.parseFloat(fieldFeet.getText());
		float heightInInches = Float.parseFloat(fieldInch.getText());
		
		//Many Manipulations
		
		String heightInFeetString = String.valueOf(heightInFeet);
		String heightInInchString = String.valueOf(heightInInches);
		
		theHeightInFeet = Double.parseDouble(heightInFeetString);
		theHeightInInches= Double.parseDouble(heightInInchString);
		
		//System.out.println(theHeightInFeet + " " + theHeightInInches);
		
	}
	
	public static void main(String[] args)
		{
			new HeightInput().setVisible(true);
			//System.out.println(theHeightInFeet + " " + theHeightInInches);
		}

	

}
