
public class DemoCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("num of arguments :-" +args.length);
		
		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		
		int sum= a+b;
		for(String arg:args)
		{
		sum = sum+Integer.parseInt(arg);	
		}
		System.out.println(sum);
		

	}

}
