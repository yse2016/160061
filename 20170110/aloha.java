public class Aloha{
	public static void main(String[] args) {
		Alohaman am = new Alohaman();

	
		int num = args.length;


		if(num == 0){
			am.sayAloha();
		} else if (num == 1){
			int data1 = Integer.parseInt(args[0]);
			am.sayAloha(data1);
		} else if (num ==2){

			int data1 = Integer.parseInt(args[0]);
			int data2 = Integer.parseInt(args[1]);
			am.sayAloha(data1, data2);

		}
	}
}

class Alohaman{
	private String msg;
	private String msg2;

	public Alohaman(){
		this.msg = "Aloha";
		this.msg2 = "あぉは";
	}
	public void sayAloha(){
		System.out.println(this.msg);
	}
	public void sayAloha(int n){
		for(int i = 0; i < n; i++){
			System.out.println(this.msg);
	}
}
	public void sayAloha(int n, int x){
		for(int i = 0; i < n; i++){
			if(i%x == 0){
					System.out.println(this.msg2);
				}else{
					System.out.println(this.msg);
			}
		}
	}
}