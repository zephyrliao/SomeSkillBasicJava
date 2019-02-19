package tuning;

public class ArrayCopy {
	public static void main(String[] args) {
		User[]users = new User[] {new User(1, "admin", "admin@qq.com", "0"),new User(2,"maco","maco@qq.com","1"),new User(3,"kitty","kitty@qq,com","2")};
		
		int size = users.length;
		User[]target = new User[size];
		System.arraycopy(users, 0, target, 0, size);
		 
		 for (int i = 0; i < size; i++) {
			 System.out.println(target[i].getUseName());
		}
		 
		
	}
}
