
public class MyThread extends Thread {
@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("Main Started"+Thread.currentThread().getName());
	System.out.println("Hello");
	System.out.println("Thread Started");
}
}
