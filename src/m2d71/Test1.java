package m2d71;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 获取异常简单的描述信息
 * String msg=exception.getMessage();
 * 打印异常追踪的堆栈信息
 * exception.printStackTrace();
 * 
 * 异常追踪信息从上往下看，不需要看sun公司的代码（包名）
 * @author yyds
 *
 */
public class Test1 {

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointerException e=new NullPointerException("空指针异常hghghghghg");
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
		new FileInputStream("D:\\应用\\虎牙.txt");
	}
	

}
