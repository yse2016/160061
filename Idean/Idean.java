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
	//JButton button;
	//JPanel panel;
	//JTextField textfield;
	//JTextArea textarea;

	public IdeanMan(){
		frame = new JFrame("idean");
		frame.setLocation(400 , 400);
		frame.setSize(500 , 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}