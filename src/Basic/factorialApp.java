package Basic;

public class factorialApp {

	public static void main(String[] args) {
		
		System.out.print(fact(5));
		  
	}
	public static double fact(double n){
		if ((n == 0) || (n == 1)){
			return 1;
		}
		else {
			return (n * fact(n-1));
			
		}
	}

}
