import javax.swing.*;

import java.awt.event.*;

public class Swing4 extends JFrame{

	JButton button;
	String infoOnComponent = "";
	JList favoriteMovies, favoriteColors;
	DefaultListModel defListModel = new DefaultListModel();
	JScrollPane scroller;

	public Swing4(){
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Swing4");

		JPanel thePanel= new JPanel();

		button = new JButton();

		ListenForButton listen = new ListenForButton();

		button.addActionListener(listen);
		thePanel.add(button);

		String[] movies = {"Matrix", "Minority Report", "Big"};

		favoriteMovies = new JList(movies);
		favoriteMovies = new JList(movies);
		favoriteMovies.setFixedCellHeight(30);
		favoriteMovies.setFixedCellWidth(150);
		favoriteMovies.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); //multiple interval selection
		
		String[] colors = {"Black","Blue","White","Green","Orange","Grey"};
		
		for(String color: colors){
			defListModel.addElement(color);
		}

		defListModel.add(2,"Purple");

		favoriteColors = new JList(defListModel);

		favoriteColors.setVisibleRowCount(4);

		scroller = new JScrollPane(favoriteColors,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		favoriteColors.setFixedCellHeight(30);
		favoriteColors.setFixedCellWidth(150);

		this.add(favoriteMovies);
		this.add(scroller);

		this.add(thePanel);
		this.setVisible(true);

	}


	private class ListenForButton implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if (e.getSource() ==button){
				if(defListModel.contains("Black")) infoOnComponent +="Black is here\n";
				if(!defListModel.isEmpty()) infoOnComponent += "Isn't Empty\n";
			
				infoOnComponent += "Elements in the list "+defListModel.size() +"\n";
				infoOnComponent += "First Element "+defListModel.firstElement() +"\n";
				infoOnComponent += "Last Element "+defListModel.lastElement() +"\n";
				infoOnComponent += "Element in index 1 "+ defListModel.get(1) + "\n";

				defListModel.remove(0);
				defListModel.removeElement("Blue");
				Object[] arrayOfList = defListModel.toArray();

				for(Object color: arrayOfList){
					infoOnComponent += color+"\n";
				}

				JOptionPane.showMessageDialog(Swing4.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);

				infoOnComponent ="";
			}
		}

	}



	public static void main(String[] args){
		new Swing4();
	}

}