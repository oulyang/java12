package m2d72;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * try catch�е�finally���
 * 
 * finally�Ӿ�Ĵ��������ִ�еģ���һ����ִ�У���ʹtry�е��������쳣
 * 
 * ͨ����finally�������ͷ�/�ر���Դ
 * @author yyds
 *
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("D:\\Ӧ��\\����\\�½��ı��ĵ�.txt");
			
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
