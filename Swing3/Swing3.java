import javax.swing.*;

import java.awt.event.*;

import javax.swing.event.ChangeEvent;

import javax.swing.event.ChangeListener;

import java.text.NumberFormat;

import javax.swing.border.*;

public class Swing3 extends JFrame{

	JButton button1;
	JLabel label, label1,label2;
	JTextField textField1, textField2;
	JCheckBox dollarSign, commaSign;
	JRadioButton addNums, subNums, multNums, divNums;
	JSlider howManyTimes;

	double number1, number2, totalCalc;

	public Swing3(){
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Swing3");

		JPanel thePanel = new JPanel();
		button1= new JButton("Button1");

		ListenForButton listen = new ListenForButton();
		button1.addActionListener(listen);

		thePanel.add(button1);

		label= new JLabel("Number1");
		thePanel.add(label);
		textField1 = new JTextField("",5);
		thePanel.add(textField1);

		label1= new JLabel("Number2");
		thePanel.add(label1);
		textField2= new JTextField("",5);
		thePanel.add(textField2);

		dollarSign = new JCheckBox("Dollars");
		commaSign = new JCheckBox("Commas");

		thePanel.add(dollarSign);
		thePanel.add(commaSign,true);

		addNums = new JRadioButton("Add");
		subNums = new JRadioButton("Subtract");
		multNums = new JRadioButton("Multiply");
		divNums = new JRadioButton("Divide");

		ButtonGroup operation = new ButtonGroup();
		operation.add(addNums);
		operation.add(subNums);
		operation.add(multNums);
		operation.add(divNums);

		JPanel thePanel1 = new JPanel();

		Border operBorder = BorderFactory.createTitledBorder("Operation");

		thePanel1.setBorder(operBorder);

		thePanel1.add(addNums);
		thePanel1.add(subNums);
		thePanel1.add(multNums);
		thePanel1.add(divNums);

		addNums.setSelected(true);

		thePanel.add(thePanel1);

		label2 = new JLabel("Perform How Many Times?");
		thePanel.add(label2);
		howManyTimes= new JSlider(0,99,1);
		howManyTimes.setMinorTickSpacing(1);
		howManyTimes.setMajorTickSpacing(10);
		howManyTimes.setPaintTicks(true);
		howManyTimes.setPaintLabels(true);

		//ListenForSlider listen1 = new ListenForSlider();
		//howManyTimes.addChangeListener(listen1);
		thePanel.add(howManyTimes);

		textField1.requestFocus();


		this.add(thePanel);
		this.setVisible(true);
	}

	private class ListenForButton implements ActionListener{
		public void actionPerformed(ActionEvent e){ //e represents Event.
			if(e.getSource() == button1){
				try{
					//System.out.println(textField1.getText()+","+textField2.getText());
					number1= Double.parseDouble(textField1.getText());
					number2= Double.parseDouble(textField2.getText());

				}
				catch(NumberFormatException excep){
					JOptionPane.showMessageDialog(Swing3.this, "Please Enter a Number","Error",JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}

				if(addNums.isSelected()){
					totalCalc= addNumbers(number1,number2,howManyTimes.getValue());
				}
				else if(subNums.isSelected()){
					totalCalc= subNumbers(number1,number2,howManyTimes.getValue());
				}
				else if(multNums.isSelected()){
					totalCalc= multNumbers(number1,number2,howManyTimes.getValue());
				}
				else{
					totalCalc= divNumbers(number1,number2,howManyTimes.getValue());
				}

				if(dollarSign.isSelected()){
					NumberFormat numFormat = NumberFormat.getCurrencyInstance();
					JOptionPane.showMessageDialog(Swing3.this, numFormat.format(totalCalc),"Solution",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(commaSign.isSelected()){
					NumberFormat numFormat = NumberFormat.getNumberInstance();
					JOptionPane.showMessageDialog(Swing3.this, numFormat.format(totalCalc),"Solution",JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					JOptionPane.showMessageDialog(Swing3.this, totalCalc,"Solution",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}
	private static double addNumbers( double num1, double num2, int times){
		double sum=0;
		for(int i=times;i>=0;i--){
			sum= num1+num2;
			num1=sum;
		}
		return sum;
	}

	private static double subNumbers( double num1, double num2, int times){
		double diff=0;
		for(int i=times;i>=0;i--){
			diff= num1-num2;
			num1=diff;
		}
		return diff;
	}

	private static double multNumbers( double num1, double num2, int times){
		double pro=0;
		for(int i=times;i>=0;i--){
			pro= num1*num2;
			num1=pro;
		}
		return pro;
	}

	private static double divNumbers( double num1, double num2, int times){
		double quo=0;
		for(int i=times;i>=0;i--){
			quo= num1*num2;
			num1=quo;
		}
		return quo;
	}
/*
	private class ListenForSlider implements ChangeListener{


	}

*/
	public static void main(String[] args){
		new Swing3();
	}
}