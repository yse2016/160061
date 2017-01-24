import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Idean{
	public static void main(String[] args){
		IdeanMan idean = new IdeanMan();
	}
}

class IdeanMan implements ActionListener{
	JFrame frame;
	JButton btn1;
	JButton btn2;
	JPanel panel;
	JTextArea textarea;
	

	public IdeanMan(){
		frame = new JFrame("idean");
		frame.setLocation(600 , 100);
		frame.setSize(300 , 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn1 = new JButton("選択");
		btn1.addActionListener(this);
		btn1.setActionCommand("indean");

		btn2 = new JButton("保存");
		btn2.addActionListener(this);
		btn2.setActionCommand("idea");

		textarea = new JTextArea(5 , 20);

		panel = new JPanel();
		frame.add(panel);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(textarea);

		


		
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();

		if(cmd.equals("indean")){
		} else if(cmd.equals("idea")){
		}
	}
}