package Basic;

public class loops {

	public static void main(String[] args) {
		String [] studentnames;
		studentnames = new String [5];
		studentnames[0] = "lalith";
		studentnames[1] = "prathibha";
		studentnames[2] = "ashu";
		studentnames[3] = "chand";
		studentnames[4] = "sai";
		
		System.out.println("\n PRINTIING USING DO-WHILE \n");
		int i = 0;
		do {
			System.out.println(studentnames[i]);
			i++;
		} while(i<=4);
		
		System.out.println("\n PRINTING USING WHILE LOOP\n ");
		int n = 0 ;
		while(n<=4){
			System.out.println(studentnames[n]);
			n++;
		}
		
		System.out.println("\n PRINTING USING FOR LOOP\n ");
		int m = 0;
		for(m = 0; m <= 4; m++){
			System.out.println(studentnames[m]);
		}

	}

}
