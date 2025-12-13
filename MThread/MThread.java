class BMS implements Runnable{
    public void run()
    {
        try{
            for(int i=0;i<5;i++)
            {
                Thread.sleep(10000);
                System.out.println("BMS College Of Engineering");
            }
            System.out.println("BMS loop exiting");
        }
        catch(InterruptedException e)
        {
            System.out.println("error in BMS thread");
        }
    }
}
class CSE implements Runnable{
    public void run()
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                Thread.sleep(2000);
                System.out.println("CSE");
            }
            System.out.println("CSE loop exiting");
        }
        catch(InterruptedException e)
        {
            System.out.println("error in CSE thread");
        }
    }
}
public class MThread 
{
    public static void main(String args[])
    {
        Thread t1=new Thread(new BMS());
        Thread t2=new Thread(new CSE());
        t1.start();
        t2.start();
    }
    
}
