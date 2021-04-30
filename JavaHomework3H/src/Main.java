
public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setUserName("engin");
		instructor.setEmail("engin@kodlama.io");
		instructor.setPassword("123123");
		instructor.setPhoneNumber("123456789");
		instructor.getCourseCount();
	   
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Erdi");
		student.setLastName("Dedemli");
		student.setUserName("erdidedemli");
		student.setEmail("erdidedemli38@gmail.com");
		student.setPassword("123123");
		student.setPhoneNumber("123456789");
	

	    User[] users = {student };
	        
	    UserManager userManager = new UserManager();
	    userManager.add(student);
	    userManager.addMultiple(users);
	        
	    StudentManager studentManager = new StudentManager();
	    studentManager.CourseRegistered(student);
	    studentManager.exit(student);

	    InstructorManager userlist = new InstructorManager();
	    userlist.ShowUsersİnfo(users);
	    userlist.Exit(instructor);
	}

}
