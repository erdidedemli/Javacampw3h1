
public class Student extends User{


     private String Percentageofthecourse;
     private String CourseRegistered;
     
     public  Student() {
    	 System.out.println("Student Çalýþtý");
		
	}
     
	public String getPercentageofthecourse() {
		return Percentageofthecourse;
	}
	public void setPercentageofthecourse(String percentageofthecourse) {
		Percentageofthecourse = percentageofthecourse;
	}
	public String getCourseRegistered() {
		return CourseRegistered;
	}
	public void setCourseRegistered(String courseRegistered) {
		CourseRegistered = courseRegistered;
	}
}
