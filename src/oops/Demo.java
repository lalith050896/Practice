package oops;
     class person{
	 String name;
	 String email;
	 String number;
	
	  void profession(){
		System.out.println( name +  " is developer");
		System.out.println("His email is " + email );
		System.out.println("His contact number is " + number );
		
	}
	void personal(){
		System.out.println( name + " likes coding");
		
	}
}


public class Demo {
	

	public static void main(String[] args) {
		person person1 = new person();
		person1.name = "lalith";
		person1.email ="lalith050896@gmail.com";
		person1.number = "73867760015";
		
		 person1.profession();
		 person1.personal();
	
	}

}
