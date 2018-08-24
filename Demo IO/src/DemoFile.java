import java.io.File;
import java.io.IOException;
public class DemoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myfile = new File("myfile.txt");
				try {
					myfile.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		System.out.println("File created successfully");
	}

}
