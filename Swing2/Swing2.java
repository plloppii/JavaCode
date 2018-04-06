import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

import java.awt.event.*;

public class Swing2 extends JFrame{

	JButton button; //WTFFFFFlololol
	JTextField textField; //DEFINED AS GLOBAL VARIABLES SO ALL SUBCLASSES CAN SEE.
	JTextArea textArea;
	int buttonClicked;

	public Swing2(){
		this.setSize(700,400); //Width x Height

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();

		int xPos= (dim.width/2)-(this.getWidth()/2); 
		int yPos= (dim.height/2)-(this.getHeight()/2); 

		this.setLocation(xPos,yPos); // make screen appear in the middle
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //kill when close window
		this.setTitle("Swing2"); //set title of the frame
		this.setResizable(false);

		JPanel thePanel = new JPanel(); //define Jpanel, only needs to be seen by the constructor.
		button = new JButton("Click here mutherfucker"); //object is defined above.
		textArea = new JTextArea(20,40); //object also defined above. (Global variable)
		textArea.setText("Tracking events\n");
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		JScrollPane scrollbar = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		textField = new JTextField(" ",20);
		textField.setText("Type Here");

		ListenForButton listen1 = new ListenForButton();
		button.addActionListener(listen1); //Action is a something like a on screen button press

		ListenForKeys listen2 = new ListenForKeys(); 
		textField.addKeyListener(listen2); //Key is something like a keyboard press

		ListenForWindow listen3 = new ListenForWindow();
		this.addWindowListener(listen3); //listen if something happens to frame/window

		ListenForMouse listen4 = new ListenForMouse();
		thePanel.addMouseListener(listen4);

		thePanel.add(button);
		//thePanel.add(textArea);
		thePanel.add(scrollbar);
		thePanel.add(textField);

	

		this.add(thePanel);
		this.setVisible(true);
	}

	private class ListenForMouse implements MouseListener{
		public void mouseClicked(MouseEvent e){
			textArea.append("Mouse Position: "+e.getX()+" , "+e.getY()+"\n");
			textArea.append("Mouse ScreenPosition: "+e.getXOnScreen()+" , "+e.getYOnScreen()+"\n");
			textArea.append("Mouse Button: "+ e.getButton()+"\n");
			textArea.append("Mouse Clicks: "+ e.getClickCount()+"\n");
		}
		public void mouseEntered(MouseEvent e){

		}
		public void mouseExited(MouseEvent e){

		}
		public void mousePressed(MouseEvent e){

		}
		public void mouseReleased(MouseEvent e){

		}

	}

	private class ListenForWindow implements WindowListener{ //frame is windows
		// called when window is the active window.
		public void windowActivated(WindowEvent e){
			textArea.append("Swing2 is active\n");
		}
		// if this.dispose() is called, this will be called 
		public void windowClosed(WindowEvent e){

		}
		// called if window is closed from menu
		public void windowClosing(WindowEvent e){

		}
		// called if window is not active (Clicked to a different window.)
		public void windowDeactivated(WindowEvent e){
			textArea.append("Swing2 is deactive\n");
		}
		// gone from minizaed state to regular state
		public void windowDeiconified(WindowEvent e){
			textArea.append("Window is Deiconified\n");
		}
		// went to minimized 
		public void windowIconified(WindowEvent e){
			textArea.append("Window is iconified\n");
		}
		//window is minimized. 
		public void windowOpened(WindowEvent e){
			textArea.append("Window is opened\n");
		}
	}

	private class ListenForButton implements ActionListener{
		public void actionPerformed(ActionEvent e){ //e represents Event.
			if(e.getSource() == button){
				buttonClicked++;
				textArea.append("Button Clicked: "+ buttonClicked + "\n");
			}
		}
	}


	private class ListenForKeys implements KeyListener{


		public void keyPressed(KeyEvent e){ //called when key is clicked on
			textArea.append("Key Hit: "+ e.getKeyChar() + "\n");
		}
		public void keyReleased(KeyEvent e){ //called when key is released
			textArea.append(e.getKeyChar()+" Key Released\n");

		}
		public void keyTyped(KeyEvent e){ //called when key is hit

		}
	}

	public static void main(String[] args){
		new Swing2();
	}
}