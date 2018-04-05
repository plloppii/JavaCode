import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Swing1 extends JFrame{


	public Swing1(){
		this.setSize(500,500); //Creates a frame that is 500px by 500px 


		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();

		System.out.println("Screen Width: "+dim.width);
		System.out.println("Screen Height: "+dim.height);

		int xPos= (dim.width/2)-(this.getWidth()/2); 
		int yPos= (dim.height/2)-(this.getHeight()/2); 

		this.setLocation(xPos,yPos); //location of the frame (0,0) top left of frame
		this.setResizable(false); //makes sure you cant resize screen.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //kills application when user exits frame
		this.setTitle("My First Frame"); //sets title of frame
		
		JPanel thePanel = new JPanel(); //Creates Panel
		JLabel label1 = new JLabel("Noah Pan"); //Creates Label
		thePanel.add(label1); //Adds label to Panel
		label1.setText("Noah Pan Frying Pan");
		label1.setToolTipText("The Best Person in the World");


		JButton button1 = new JButton("Send it!");
		//button1.setBorderPainted(false); //gets rid of button border
		//button1.setContentAreaFilled(false); //gets rid of button background
		button1.setText("Send it again!"); //Button text
		button1.setToolTipText("You rock!"); //set tool tip text
		thePanel.add(button1); //adds the button to panel

		JTextField textField = new JTextField("Here is a Field of Texts",15); //sets width, initially
		textField.setColumns(10); //change width of field
		textField.setText("Here is a Field of Texts"); //field of text
		textField.setToolTipText("helloooo"); 
		thePanel.add(textField);


		JTextArea textArea = new JTextArea(15,25); //15 by 15 characters 
		textArea.setText("Helloooo there, My name is Noah Pan and \nI am an Electrical Engineering \nand Design Major \nfrom RPI");
		textArea.setLineWrap(true); //Turns on Line Wrap
		textArea.setWrapStyleWord(true); //Makes sure that words dont get cut off at the end
		int numoflines = textArea.getLineCount(); //gets number of lines
		textArea.append("\nnumber of lines:" + numoflines); //appends it to the text Area.
		thePanel.add(textArea); 

		JScrollPane scrollbar1 = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//VERTICAL_SCROLLBAR_AS_NEEDED, VERTICAL_SCROLLBAR_ALWAYS,VERTICAL_SCROLLBAR_NEVER
		//HORIZONTAL_SCROLLBAR_AS_NEEDED, HORIZONTAL_SCROLLBAR_ALWAYS, HORIZONTAL_SCROLLBAR_NEVER
		thePanel.add(scrollbar1);
		textArea.requestFocus();

		this.add(thePanel); //Adds Panel to Frame

		this.setVisible(true);


	}

	public static void main(String[] args){
		new Swing1();
	}


}