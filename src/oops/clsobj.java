package oops;
   class student{
	   String name;
	   int id;
	   char grade;
	   String report;
	   
	   void performance(){
		   System.out.println( name + " bearing ID number " + id + " has academic grade " + grade );
		   System.out.println("His conduct was found " + report );
	   }
   }

public class clsobj {

	public static void main(String[] args) {
		student student1 = new student();
		 student1.name = "LALITH";
		student1.id = 1;
		student1.grade ='A';
		student1.report = "Good";
		
		 student1.performance();
		
		
		
		

	}


		
	}


