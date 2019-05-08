package Bank;

public class Demo {

	public static void main(String[] args) {

		Account rakesh=new Account(500);
		int r=rakesh.getAmt();
		System.out.println(r);
		
		
		Account yogesh=new Account(5000);
		System.out.println(yogesh.getAmt());
		
		Account deepak=new Account(50000000);
		System.out.println(deepak.getAmt());
		
	}

}

