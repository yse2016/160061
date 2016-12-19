import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPanelTest extends JFrame{
	public JPanelTest(){
		setSize(400, 300);
		setTitle("JPanelテスト");

		JLabel label = new JLabel();
		Container c = getContentPane();
		c.add(myjp);
	}

	public static void main(String[] args) {
		JFrame w = new JPanelTest();
		w.show();
	}
}

class MyJPanel extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("aloha", 20, 40);
	}
}