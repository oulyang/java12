package m2d72;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ret=m();
		System.out.println(ret);//100
	}
	public static int m() {
		int i=100;
		try {
			System.out.println("111111");
			return i;
		}finally {
			i++;
		}
		
	}

}
