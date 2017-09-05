package Basic;

public class studentprogress {
	public static void main(String [] args){
		int marks = 90;
		String sportsplayer = "yes";
		
		if((marks < 40) && (sportsplayer =="no")){
			System.out.println("Student failed");
		}
		
		else if ((marks < 40) && (sportsplayer=="yes")){
		System.out.println("student passed in Sports Quota");
		}
		
	    else if ((marks > 40) && (marks < 80)){
		System.out.println("Student passed with B grade");
	    }
		
	    else {
	    	System.out.println("Student passed with A grade");
	    }
	}	
}
