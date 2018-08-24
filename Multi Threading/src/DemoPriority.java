
public class DemoPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started" +Thread.currentThread().getName());
		Thread t1=new MyThread();
		t1.setName("HIGH");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		System.out.println("Main completed:- " +Thread.currentThread().getName());

	}

}
