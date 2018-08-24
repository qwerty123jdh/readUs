import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DemoRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	
	//try {
		//System.out.println("Please enter your name");
		//String name = br.readLine();
		//System.out.println("You entered " +name);
				
	//}catch(IOException e)
	//{
		
		//e.printStackTrace();
	//}
	
try {
	System.out.println(" Enter a number");
	String n1 = br.readLine();
	int N1=Integer.parseInt(n1);
	System.out.println("Enter another number");
    String n2 = br.readLine();
    int N2 = Integer.parseInt(n2);
    if (N1>N2)
    	System.out.println(N1 +" is greater");
    else System.out.println(N2 +" is greater");
}	
catch(IOException e){
	e.printStackTrace();
	
}
}
	
	

}
