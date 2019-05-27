package oefeningen.OCA.mainPackage;

public class University {

	public static void main(String[] args) {
		EJavaCourse courses[] = {new EJavaCourse(), new EJavaCourse()};
		courses[0].courseName = "OCA";
		System.out.println(courses.length);
		
		//for (EJavaCourse c : courses) c= new EJavaCourse();
		
		for (int i = 0; i < courses.length; i++) {
			courses[i] = new EJavaCourse();
		}
		for (EJavaCourse c : courses) System.out.println(c.courseName);

	}

}
class EJavaCourse{
	String courseName = "Java";
}
