import java.util.Scanner; 
public class sgpak 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.print("enter n:");
        int n=sc.nextInt();
        details d[]=new details[n];
        for(i=0;i<n;i++)
        {
            d[i]=new details();
            d[i].accept();
            d[i].sgpa();
            d[i].display();
        }
    } 
}
class details
{
    Scanner sc = new Scanner(System.in);
    String usn;
    String name;
    int[] c;
    int[] m;
    double sg;
    int ns;
    public void accept()
    {
        System.out.print("eneter usn:");
        usn=sc.next();
        System.out.print("enter name:");
        name=sc.next();
        System.out.print("enter number of subjects:");
        ns=sc.nextInt();
        c=new int[ns];
        m=new int[ns];
        
        for(int j=0;j<ns;j++)
        {
            System.out.print("enter credit:");
            c[j]=sc.nextInt();
            System.out.print("enter marks:");
            m[j]=sc.nextInt();
        }
    }
    public double sgpa()
    {
        int totalm=0,totalcredit=0;
        for(int j=0;j<ns;j++)
        {
            int g;
            if (m[j]<100 && m[j]>=90)
            {
                g=10;
            }
            else if (m[j]<90 && m[j]>=80)
            {
                g=9;
            }
            else if (m[j]<80 && m[j]>=70)
            {
                g=8;
            }
            else if (m[j]<70 && m[j]>=60)
            {
                g=7;
            }
            else if (m[j]<60 && m[j]>=50)
            {
                g=6;
            }
            else if (m[j]<50)
            {
                g=5;
            }
            else{
                g=0;
            }
            totalm=totalm+c[j]*g;
            totalcredit+=c[j];

        }
        sg=(double)totalm/totalcredit;
        return sg;
    }
    public void display()
    {
        System.out.println("---Student Details----");
        System.out.println("usn:"+usn);
        System.out.println("name:"+name);
        System.out.println("sgpa:"+sg);

        
    }
    
}