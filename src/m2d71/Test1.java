package m2d71;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * ��ȡ�쳣�򵥵�������Ϣ
 * String msg=exception.getMessage();
 * ��ӡ�쳣׷�ٵĶ�ջ��Ϣ
 * exception.printStackTrace();
 * 
 * �쳣׷����Ϣ�������¿�������Ҫ��sun��˾�Ĵ��루������
 * @author yyds
 *
 */
public class Test1 {

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointerException e=new NullPointerException("��ָ���쳣hghghghghg");
		String msg=e.getMessage();
		System.out.println(msg);
		
		e.printStackTrace();
		System.out.println("hello");
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		m1();	
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			/*
			at m2d7/m2d71.Test1.m3(Test1.java:46)
			at m2d7/m2d71.Test1.m2(Test1.java:42)
			at m2d7/m2d71.Test1.m1(Test1.java:38)
			at m2d7/m2d71.Test1.main(Test1.java:31)
			*/
		}

	}
	public static void m1() throws FileNotFoundException{
		m2();
	}
	private static void m2() throws FileNotFoundException{
		// TODO Auto-generated method stub
		m3();
	}
	private static void m3() throws FileNotFoundException{
		// TODO Auto-generated method stub
		new FileInputStream("D:\\Ӧ��\\����.txt");
	}
	

}
