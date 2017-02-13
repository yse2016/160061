import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class test{
	public static void main(String[] args){
		IdeanMan idean = new IdeanMan();
	}
}

class IdeanMan implements ActionListener{
	JFrame frame;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JPanel panel;
	JTextField textfield;
	JTextArea textarea;
	JTextArea textarea2;
	String q;
	String a;
	int max = 128;
	String[] datas = new String[max];
	int co = 0;
	int num = 0;	
	

	public IdeanMan(){
		frame = new JFrame("");
		frame.setLocation(600 , 100);
		frame.setSize(600 , 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn1 = new JButton("出題");
		btn1.addActionListener(this);
		btn1.setActionCommand("indean");


		btn2 = new JButton("答える");
		btn2.addActionListener(this);
		btn2.setActionCommand("idea");


		btn3 = new JButton("パス");
		btn3.addActionListener(this);
		btn3.setActionCommand("indean");



		textfield = new JTextField("",20);

		textarea = new JTextArea(5 , 20);
		textarea2 = new JTextArea(5 , 50);





		panel = new JPanel();
		frame.add(panel);
		panel.add(textfield);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(textarea);
	
		



		Container con = frame.getContentPane();
        con.setLayout(new GridLayout(2,1));
        con.add(panel);
        con.add(textarea2);
       




		
		frame.setVisible(true);
		try {
                // 1. ファイルを準備する
				File inFile = new File("data.txt");
				FileInputStream fis = new FileInputStream(inFile);
				InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
                // 2. ファイルからデータを読み取って表示する
				String line ;
				while ((line=br.readLine()) != null) {
					datas[co] = line;
					co++;
				}             
                // 3. ファイルを閉じる
				br.close();
			} catch (IOException e) {
				System.out.println("ファイル読み取りエラー");
				e.printStackTrace();
			}
	}

	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();

		if(cmd.equals("indean")){
			num = (int)(Math.random()*co);
			textarea.setText(datas[num]);
			//textarea.append("\n");

		} else if(cmd.equals("idea")){
			q = textarea.getText();
			a = textfield.getText();
			
			if(q.equals(a)){
				textarea2.append("Q."+q+"　　A."+a+"　　正解"+"\n");
			}else{
				textarea2.append("Q."+q+"　　A."+a+"　　不正解"+"\n");
			 }
			
		}
	}
}