
public class MyThread1 extends Thread
{
	public void run()
	{
		this.tenToTwenty();
	}
	void tenToTwenty()
	{
		for(int i=11 ; i<=20 ; i++)
		{
			System.out.println("Thread number 1 :"+i);
			
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

