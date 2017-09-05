package Basic;

public class sumofn {

	public static void main(String[] args) {
	    System.out.print(sum(5));
	}
     public static int sum(int n){
    	 if( n == 0){
    		 return 0;
    	 }
    	 else
    		 return ( n + sum(n-1));
    	 
     }
}
