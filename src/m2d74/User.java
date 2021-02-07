package m2d74;

public class User {

	public void register(String username,String password) throws IllegalNameException {
		if(null==username||username.length()<6||username.length()>14) {
			throw new IllegalNameException("用户名不合法");
		}
		System.out.println("欢迎使用");
	}

}
