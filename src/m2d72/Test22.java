package m2d72;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//try->finally->return
		try {
			System.out.println("bbbb");
			return;
		}finally {
			System.out.println("aaaaa");
		}
		*/
		
		//try->exit
		try {
			System.out.println("bbbb");
			System.exit(0);
		}finally {
			System.out.println("aaaaa");
		}
	}

}
