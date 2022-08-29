package inheritenceHomework;

public class Main {
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(3);
		student.setFirstName("Hasan");
		
		Instructor engin = new Instructor();
		engin.setId(7);
		engin.setFirstName("Engin");
		
		
		UserManager userManager = new UserManager();
		User[] users = {student, engin};
		
		userManager.addMultiple(users);
		
		userManager.updateMultiple(users);
		
		userManager.delete(engin);
	}
	
	
}
