package lab;

public class Assignment {

	public void main(String[] args) {
		Student std1 = new Student("lalithkumar","845357607262");
		

	}
	class Student{
		private String name;
		private String SSN;
		
		
		Student (String name,String SSN){
			this.name = name;
			this.SSN = SSN;	
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getSSN() {
			return SSN;
		}


		public void setSSN(String sSN) {
			SSN = sSN;
		}
		
	}

}
