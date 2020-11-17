class CloneOfEmployee
{
public static void main(String[] args) throws CloneNotSupportedException
 {
   Employee e = new Employee(901,"hjkh");
   Employee e1 = (Employee) e.clone();
   System.out.println(e1.emp+"..........."+e1.name);
 }
}