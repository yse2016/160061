import java.io.*;

public class ShowText{
	public static void main(String[] args) {
		try{
			File inFile = new File("data.txt");
			FileReader fr = new FileReader(inFile);
			BufferedReader br = new BufferedReader(fr);
			for( int i = 0; i<10; i++){
				String line = br.readLine();
				System.out.println(line);
			}

			br.close();

		}catch(IOException e){
			System.out.println("era");
			e.printStackTrace();
		}
	}
}