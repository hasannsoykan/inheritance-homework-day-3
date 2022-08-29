package inheritenceHomework;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getId() + " numarali kullanici eklendi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	
	public void update(User user) {
		System.out.println(user.getId()+" numarali kullanici kendi ismiyle " +user.getFirstName() + " olarak guncellendi.");
	}
	
	
	public void updateMultiple(User[] users) {
		for (User user : users) {
			update(user);
		}
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli kullanici silinmistir.");
	}
	
	public void deleteMultiple(User[] users) {
		for (User user: users) {
			delete(user);
		}
	}

}
