
public class MyRunnable1 implements Runnable {
	
	private Thread t1;
	
	public MyRunnable1() {
		t1=new Thread(this);
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Name :-" +Thread.currentThread().getName());

	}
	public static void main(String[]args)
	{
		Runnable r =new MyRunnable1();
	}

}
