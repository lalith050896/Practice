package lab;

class Assignment{
	public static void main(String[] args){
		Student std1 = new Student("LALITH KUMAR","845357607262");
		std1.enroll("java");
		std1.enroll("python");
		std1.checkbalance();
		std1.pay(200);
		std1.tostring();
		std1.setCity("hyderabad");
		System.out.print(std1.getCity());
		
	
		
	}
	static class Student{
		private String name;
		private String uid;
		private static int id = 100;
		private String email;
		private String userID;
		private String courses;
		private int balance = 0;
		private int costofcourse = 300;
		private String phone;
		private String city;
		private String state;

		
		public Student(String name,String uid){
			id++;
			System.out.println("student regitered !!! with ID: "+id);
			this.name = name;
			this.uid = uid;
			setemail();
			genuserID();
			
			}
		
		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		private void setemail(){
			email = name.toLowerCase() +id+ "@gmail.com";
			System.out.println("email ID: "+email);
		}
		private void genuserID(){
			int min = 1000;
			int max = 9000;
			int random = (int) Math.random()*(max - min);
			random = random + min;
			userID = id+ "" +random+ "" +uid.substring(8);
			System.out.println("User ID: "+userID);	
		}
		private void enroll(String courses){
			this.courses = this.courses + courses;
			balance = balance + costofcourse;
			System.out.println(this.courses);
	
		}
		private void pay(int amount){
			balance = balance - amount;
			System.out.println("An amount of "+amount+ "paid and the balance is:" +balance);
			
		}
		private void checkbalance(){
			System.out.println(balance);
		}
		private void showcourses(){
			System.out.println(courses);
			
		}
		private void tostring(){
			System.out.println("[NAME IS: " +name+ "]\n [COURSES ARE: " +courses+ "]\n [BALANCE IS: "+balance+ "]\n");
			
			
		}
	}
	}