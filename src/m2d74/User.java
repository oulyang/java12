package m2d74;

public class User {

	public void register(String username,String password) throws IllegalNameException {
		if(null==username||username.length()<6||username.length()>14) {
			throw new IllegalNameException("�û������Ϸ�");
		}
		System.out.println("��ӭʹ��");
	}

}
