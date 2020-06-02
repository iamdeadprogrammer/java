interface course
{
    int reg=100;
    public void coursefee(String coursename,int amount);
    default void coursefaculty( )
    {
        System.out.println("nagoor babu sir");
    }
    static void instituename()
    {
        System.out.println("durga soft");
    }
}
class java implements course
{
    String cname;
    int cfee;
    public void coursefee(String coursename,int amount)
    {
        cname=coursename;
        cfee=amount;
        int totalfee=reg+cfee;
        System.out.println("the amount for" + cname +" is " + totalfee);
    }

}
public class institue
{
    public static void main(String[] args)
    {
        java j=new java();
        j.coursefee("java",1000);
        j.coursefaculty();
        course.instituename();
    }
}