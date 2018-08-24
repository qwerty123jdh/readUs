
public class MyThread1 extends Thread {
 int data;
 
 public MyThread1()
 {
	 data =0;
 }
 public MyThread1(int data)
 {
	 
	 this.data=data;
 }
 public void run()
 {
	 System.out.println("Data =" +data);
	 System.out.println("Main "+Thread.currentThread().getName());
 }
}
