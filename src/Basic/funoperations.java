package Basic;

public class funoperations {
	public static void main(String[] args){
	     printname();
		int A = 40;
		int B = 50;
		sum(A,B);
		product(A,B);
	}
	 static void printname(){
		 System.out.println("This is lalith");
	 }
	 static void sum(int A, int B){
		int sum =  A + B;
		System.out.println("the sum of" +A + " and " +B + " is " +sum);
	 }
	 static int product(int A, int B){
		 int product = A * B;	
		 System.out.println("the product of " +A + " and " +B + "  is "  +product);
		 return 0;
		 
	 }
	 
	 
	 
	 
	 
	 
     
}
