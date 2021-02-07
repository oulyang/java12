package m2d72;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * try catch中的finally语句
 * 
 * finally子句的代码是最后执行的，并一定会执行，即使try中的语句出现异常
 * 
 * 通常在finally语句块中释放/关闭资源
 * @author yyds
 *
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("D:\\应用\\虎牙\\新建文本文档.txt");
			
			String s=null;
			s.toString();
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e1){
			e1.printStackTrace();
		}catch(NullPointerException e2) {
			e2.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

}
