package SEE;
import CIE.Personal;
public class External extends Personal
{
    public int externalmarks[]=new int[5];
    public External(String usn,String name,int sem, int m[])
    {
        super(usn,name,sem);
        for(int i=0;i<5;i++)
        {
            this.externalmarks[i]=marks[i];
        }
    }
    
}
