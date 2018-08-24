import java.io.IOException;
import java.io.InputStreamReader;
public class DemoReadData {
public static void main(String []args)
{
	InputStreamReader rd =new InputStreamReader(System.in);
	try {
	System.out.println("Enter a number");
	int value = rd.read();
	System.out.println("you entered :-"+value);
	
	}catch (IOException e)
	{
		e.printStackTrace();
	}
}
}
