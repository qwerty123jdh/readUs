
public class Consumer implements Runnable {
private Message msg;
public Consumer(Message m)
{this.msg=m;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		synchronized (msg)
		{
			System.out.println(name+ " willing to get notified at time " + System.currentTimeMillis());
			try {
				msg.wait();
			}catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(name +" consumer thread gt notified at time :" +System.currentTimeMillis());
			System.out.println(name +"processed");
				
			}
		}

	}


