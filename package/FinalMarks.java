import java.util.*;
import CIE.*;
import SEE.*;
public class FinalMarks 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of students:");
        int n=sc.nextInt();
        Internals[] internals=new Internals[n];
        External[] external=new External[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Student"+(i+1)+":");
            System.out.println("usn:");
            String usn=sc.next();
            System.out.println("name:");
            String name=sc.next();
            System.out.println("sem:");
            int sem=sc.nextInt();
            int im[]=new int[5];
            System.out.println("enter internal marks:");
            for(int j=0;j<5;j++)
                im[j]=sc.nextInt();
            internals[i]=new Internals(im);
            int sm[]=new int[5];
            System.out.println("enter see marks:");
            for(int j=0;j<5;j++)
                sm[j]=sc.nextInt();
            external [i]=new External(usn,name,sem,sm);
            
        }
        System.out.println("Final Marks:");
        for(int i=0;i<n;i++)
        {
            System.out.println("\nStudent:"+external[i].name+"\nUsn:"+external[i].usn+"\nSem:"+external[i].sem);
            System.out.println("course\tInternals\tSEE\tFinalMarks");
            for(int j=0;j<5;j++)
            {
                int finalmarks=internals[i].internalmarks[j]+(external[i].seemarks[j]/2);
                System.out.println((j+1)+"\t"+internals[i].internalmarks[j]+"\t"+external[i].seemarks[j]+"\t"+finalmarks);

            }
        }
        
    }
    
}
