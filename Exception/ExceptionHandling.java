import java.util.*;
class WrongAge extends Exception{
    public WrongAge(String msg){
        super(msg);
    }
}
class SonAgeException extends Exception{

    public SonAgeException(String msg){
        super(msg);
    }
}
class Father
{
    public int fage;
    public Father(int fage)throws WrongAge{
        if(fage<0){
            throw new WrongAge("father age entered is negetive,age cant be negetive");
        }
        this.fage=fage;
    }
}
class Son extends Father{
    int sage;
    public Son(int fage,int sage) throws WrongAge,SonAgeException{
        super(fage);
        if(fage<=sage){
            throw new SonAgeException("son age cant be less than father age");
        }
        this.sage=sage;
    }
}
public class ExceptionHandling 
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    try{
        System.out.println("enter father age:");
        int fage=sc.nextInt();
        System.out.println("enter son age:");
        int sage=sc.nextInt();
        Son s1=new Son(fage,sage);
        System.out.println("father age:"+fage);
        System.out.println("son age:"+sage);

    }
    catch(WrongAge e){
        System.out.println("wrongage:"+e.getMessage());
    }
    catch(SonAgeException e){
        System.out.println("sonageexception:"+e.getMessage());
    }
    catch(Exception e){
        System.out.println("general:"+e.getMessage());
    }
    finally{
        System.out.println("excecution done");
    }   
 }
}
