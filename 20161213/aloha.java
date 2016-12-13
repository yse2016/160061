public class aloha{
	public static void main(String[] args) {
		String mainMsg;
	//String subMsg;	
		while(true){

			mainMsg = new java.util.Scanner(System.in).nextLine();


			
			if(mainMsg.equals("exit")){
				break;
			}
			System.out.println(mainMsg);
		}
	}
}