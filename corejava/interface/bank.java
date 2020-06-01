import java.io.*;
import java.util.*;
interface Bank
{
    float p=1000;
    float t=2;
    public void rateofinterest();
}
class SBI implements Bank
{
    float r=9/100;
    public void rateofinterest()
    {
        float i=(p*t*r)/100;
        System.out.println("the rate of interest"+i);
    }
}
class HDFC implements Bank
{
    float r1=10/100;
    public void rateofinterest()
    {
        float i1=(p*t*r1)/100;
        System.out.println("the rate of interest"+i1);
    }
}
public class bank{
    public static void main(String[] args){
        SBI sbi=new SBI();
        sbi.rateofinterest();
        HDFC hdfc=new HDFC();
        hdfc.rateofinterest();
    }
}


