
public class StudentManager extends UserManager{
	
	   public  void CourseRegistered(Student student){

	        System.out.println( student.getUserName() +":kursa kayıt yapıldı");
	    }

	    public void exit(Student student){
	
	        System.out.println( student.getUserName() +":çıkış yapıldı");
	    }



}
