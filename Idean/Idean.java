import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

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
	JScrollPane scrollPane;
	int max = 128;
	String[] datas = new String[max];
	int co = 0;
	int num = 0;	
	

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
		//panel.add(textarea);

		scrollPane = new JScrollPane(textarea);

		Container con = frame.getContentPane();
        con.setLayout(new GridLayout(2,1));
        con.add(panel);
        con.add(scrollPane);




		
		frame.setVisible(true);
		try {
                // 1. ファイルを準備する
				File inFile = new File("data.txt");
				FileReader fr = new FileReader(inFile);
				BufferedReader br = new BufferedReader(fr);
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
			textarea.append("\n");
			num = (int)(Math.random()*co);
			textarea.append(datas[num]);

		} else if(cmd.equals("idea")){

			try {
                // 1. ファイルを準備する
                File f = new File("result.txt");
                FileWriter fw = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                String  data = textarea.getText();

                pw.println(data);

                // 3. ファイルを閉じる
                pw.close();

                } catch (IOException e) {
                    System.out.println("ファイル書き込みエラー");
                    e.printStackTrace();
            }
		}
	}
}