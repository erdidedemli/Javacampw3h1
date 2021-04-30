
public class Instructor extends User{



	int courseCount;
	public  Instructor() {
		System.out.println("Instructor Çalýþtý");
	}
	
	public int getCourseCount() {
		return courseCount;
	}

	public void setCourseCount(int courseCount) {
		this.courseCount = courseCount;
	}
}
