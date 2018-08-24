package com.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myapp implements Runnable{
	public void run()
	{
		perform();
	}
	void perform()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello\t"+i+"\t"+ Thread.currentThread());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class ExecutorDemo {
public static void main(String[]args)
{ExecutorService exec =Executors.newSingleThreadExecutor();
for(int i=0;i<3;i++)
{
	exec.execute(new myapp());
	
}
System.out.println("After submitting tasks");
System.out.println("After the loop");

exec.execute(new myapp());
exec.shutdown();
System.out.println("done");

//shutdown prevents new tasks from being submitted to that Executor.
	

	
}
}
