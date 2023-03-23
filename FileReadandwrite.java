package Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadandwrite {

	public static void main(String[] args) {
		/*
		File myfile =new File ("C:\\Users\\Lenovo\\eclipse-workspace\\Practice\\src\\pss\\sas.txt");
        try {
			myfile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        */   //CREATE A NEW FILE
		
		
		/*
		try {
			FileWriter fileWriter=new FileWriter("C:\\Users\\Lenovo\\eclipse-workspace\\Practice\\src\\pss\\sas.txt");
			fileWriter.write("this is the new file");
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		File myFile=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Practice\\src\\pss\\sas.txt");
		try {
			Scanner sc=new Scanner(myFile);
			while(sc.hasNextLine()) {
				String line=sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
		
        
        
	}

}
