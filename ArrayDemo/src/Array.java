
public class Array {
public static void main(String[]args)
{
	
	int i =0;
	
	
	int [] numbers = {12,34,44,54,34,55,65,78,90,23,90};
	while (i<numbers.length)
	{
		
		System.out.println(numbers[i]);
		i++;
		
	}
	i=0;
	System.out.println();
	do
	{
		System.out.println(numbers[i]);
		i++;
	}while(i<numbers.length);
	int j =0;
	int search =54;
	
	boolean flag = false;
	while (j<numbers.length) {
		if (numbers[j]==54)
			flag=true;
		j++;}
	if (flag)
	{
		System.out.println("Value Found");
	}
	else
		System.out.println("Value not found");
	
	
	
	for (int x:numbers)
	{
		System.out.println(x);
	}
	
}
}
