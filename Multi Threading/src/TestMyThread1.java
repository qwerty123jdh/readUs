
public class TestMyThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main started "+Thread.currentThread().getName());
Thread t1 =new MyThread1(34);
t1.setName("Thread 1");
t1.start();
System.out.println("Thread 1 Started " +Thread.currentThread().getName());

Thread t2 = new MyThread1(23);
t2.setName("Thread 2");
t2.start();
System.out.println("Thread 2 Started " +Thread.currentThread().getName());
	}

}
