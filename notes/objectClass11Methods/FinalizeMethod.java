public class FinalizeMethod
{
public static void main(String[] args)
{
 Temp s =new Temp();
                      //s.finalize();
 System.out.println(s);
 s=null;

System.gc();
  				//  new Temp();
				//System.gc();
System.out.println(s);

}
}

class Temp 
  {
   public String toString()
    {
    return "temp";
     }
public void finalize()
  {
   System.out.println("finalize method called");
  }
}