
public class Supplier implements Runnable {
private Message msg;
public Supplier(Message msg)
{
this.msg=msg;	
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		System.out.println(name+" started");
		try {
			Thread.sleep(2000);
			
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		synchronized (msg) {
			msg.setMsg("Hello from thread");
			msg.notify();
		}

	}

}
