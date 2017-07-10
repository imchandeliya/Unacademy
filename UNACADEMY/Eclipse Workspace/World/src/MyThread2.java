
public class MyThread2 extends Thread
{
	public void run()
	{
		this.fiftyToSixty();
	}
	
	void fiftyToSixty()
	{
		for(int i=51 ; i<=60 ; i++)
		{
			System.out.println("Thread number 2 :"+i);
			
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
