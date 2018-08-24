
public class TestMyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started"+Thread.currentThread().getName());
		
		Thread t =new MyThread();
		t.start();
		System.out.println("Thread 1 Started"+Thread.currentThread().getName());
		
Thread t1 =new MyThread();
t1.start();
System.out.println("Thread 2 started" + Thread.currentThread().getName());
System.out.println("Main Completed"+ Thread.currentThread().getName());
	}

}
