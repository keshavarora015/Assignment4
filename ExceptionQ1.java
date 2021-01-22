package Assignment4;

import java.io.*;

public class ExceptionQ1 {
	public static void main(String[] args) throws IOException {
			try {
				FileInputStream fis=new FileInputStream("C:\\Users\\ve00ym227\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\LabAssignment\\src\\Assignment4\\Muhammadali.jpg");
				FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\ve00ym227\\\\Documents\\\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\\\LabAssignment\\\\src\\\\Assignment4\\\\muhammadAliCopy.jpg"); 
				int i=0;
				while((i=fis.read())!=-1)
				{
					fos.write(i);
				}
				fos.flush();
				fis.close();
				fos.close();
				System.out.println("File Copied!!");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			
		
		
		
	}

}
