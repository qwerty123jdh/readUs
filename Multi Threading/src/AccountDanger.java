
public class AccountDanger implements Runnable {
	private Account acct=new Account();
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x=0;x<5;x++)
		{
			makeWithdrawal(10);
			if(acct.getBalance()<0) {
				System.out.println(" account is overdrawn! ");
			}
			}
		}
	private void makeWithdrawal(int amt)
	{
		if(acct.getBalance()>=amt)
		{
			System.out.println(Thread.currentThread().getName()+" is going to withdraw ");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException ex)
		{
				}
		acct.withdraw(amt);
        System.out.println(Thread.currentThread().getName()+ " completes the withdrawal ");		
		}
		else 
		{
			System.out.println(" Not enough in account for "+ Thread.currentThread().getName()+" to withdraw "+acct.getBalance());
		}
	}
	public static void main(String[]args)
	{
		AccountDanger r = new AccountDanger();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName(" Soumajit ");
		one.setName(" Sen ");
		one.start();
		two.start();
	}

	}

