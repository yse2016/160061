import java.io.*;


public class ShowTextFile{
	public static void main(String[] args) {

		String fileName = args[0];
		FileReader inFile = null;

		try{
			inFile = new FileReader(fileName);
	
			
			int data = 0;
			while((data = inFile.read())!= -1){
			System.out.print((char)data);	
			}

			inFile.close();
			

		} catch(IOException e){
			System.out.println("えらーでーす");
			e.printStackTrace();
		}
	}
}
