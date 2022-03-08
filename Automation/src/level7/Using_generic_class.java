package level7;

import java.io.IOException;

import com.projectname.generic.FileLib;

public class Using_generic_class {

	public static void main(String[] args) throws IOException {

		FileLib f=new FileLib();
		
		System.out.println(f.getPropertyData("url"));
		
		f.setExcelData("CreateCustomer", 1, 4, "failed");
		
		System.out.println(f.getExcelData("CreateCustomer", 1, 4));
	}

}
