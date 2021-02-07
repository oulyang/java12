package m2d74;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User();
		try {
			u.register("rose", "123");
		} catch (IllegalNameException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
