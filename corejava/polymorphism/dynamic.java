class Bank
{
    void getRateOfIn(int p,int t,int r)
    {
        float res=(p*t*r)/100;
        System.out.println("the interest is " +res);
    }
}
class SBI extends Bank{
    void getRateOfIn(int p,int t,int r)
    {
        float res=(p*t*r)/100;
        System.out.println("the rate of interest of sbi is " +res);
    }
}
class ICICI extends Bank{
    void getRateOfIn(int p,int t,int r)
    {
        float res=(p*t*r)/100;
        System.out.println("the rate of interest of icici bank " +res);
    }
}
public class dynamic
{
    public static void main(String[] args)
    {
        Bank b=new Bank();
        b.getRateOfIn(100,2,9);
        SBI sbi=new SBI();
        sbi.getRateOfIn(200,2,10);
        ICICI icici=new ICICI();
        icici.getRateOfIn(200,4,4);
    }
}