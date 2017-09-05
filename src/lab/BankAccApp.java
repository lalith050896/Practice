package lab;

 class BankAccApp {
	
	public static void main(String[] args){
		
	BankAccount acc1 = new BankAccount("845357607262", 1000 );
	acc1.setName("AVULA LALITH KUMAR");
	System.out.println("Account holder name is: " +acc1.getName());
		acc1.deposit(1000);
		acc1.deposit(2000);
		acc1.paybill(1500);
		acc1.accure() ; 
     }
 }
 
class BankAccount implements Interest {
	private static int ID = 2000;
	private String name;
	private String accnum;
	private final String ifsc = "20454";
	private String UID;
	private double balance;

	
	BankAccount(String UID, double initdeposit ){
		System.out.printf("NEW ACCOUNT CREATED\n");
		this.UID = UID;
		ID++;
		genAccountnumber();
		balance = initdeposit;
		System.out.println("INITIAL DEPOSIT IS: " +balance);
		System.out.println("Bank code is: " +ifsc);
	
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	private void genAccountnumber(){
		
		int random = (int)(Math.random()* 100);
		accnum = ID+ "" +random+ "" + UID.substring(0,4);
		System.out.println(accnum);
			
	}
	public void deposit(double amount){
		balance = balance + amount;
		System.out.println("Balance after deposit of " +amount+ "is " +balance);
			
	}
	public void paybill(double amount){
		balance = balance - amount;
		System.out.println("Balance after paying bill of " +amount+ "is " +balance);
	}
	public void accure(){
		balance = balance * (1 + rate/100);
		System.out.println("Balance with interest rate is: " +balance);
		
	}
	
}
