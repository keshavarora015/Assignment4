package Assignment4;
import java.io.*;

public class IO2 {
	public static void main(String[] args) throws IOException {
			FileWriter fw=new FileWriter("C:\\Users\\ve00ym227\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\LabAssignment\\src\\Assignment4\\demo.txt");
			BufferedWriter bw =new BufferedWriter(fw);
		
			System.out.println("Enter Text!");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			bw.write(br.readLine());
			br.close();
		    bw.close();
		    fw.close();
		    System.out.println("Text Written File!!");
	}

}
