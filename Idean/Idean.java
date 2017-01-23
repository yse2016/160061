import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Idean{
	public static void main(String[] args){
		IdeanMan idean = new IdeanMan();
	}
}

class IdeanMan{
	JFrame frame;
	JButton btn1;
	JButton btn2;
	JPanel panel;
	//JTextField textfield;
	//JTextArea textarea;

	public IdeanMan(){
		frame = new JFrame("idean");
		frame.setLocation(600 , 100);
		frame.setSize(300 , 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn1 = new JButton("Click");
		btn2 = new JButton("Drop");

		panel = new JPanel();
		frame.add(panel);
		panel.add(btn1);
		panel.add(btn2);
		

		frame.setVisible(true);
	}
}