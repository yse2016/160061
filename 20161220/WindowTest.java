import java.awt.*;
import javax.swing.*;

public class WindowTest{
	public static void main(String[] args){
		JFrame frame = new JFrame();
		JLabel label = new JLabel("hello");
		JButton button = new JButton("click here");

		frame.setBounds(200, 200, 250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout( new FlowLayout() );

		Container ctnr = frame.getContentPane();
		ctnr.add(label);
		ctnr.add(button);

		frame.setVisible(true);
	}
}