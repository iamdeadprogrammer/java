
// nice good example and good work 

// i mention some points check it in commnets

// import java.io.*;  what is the use of this imports 
// import java.util.*; what is the use of this imports
interface BankI // allwasy give end I like BankI
{
    float p = 1000; // - variables by default public final abstract
    float t = 2;

    public void rateofinterest(); // method name should be allways camelCase
}

class SBI implements BankI {
    float r = 9 / 100f;

    public void rateofinterest() {
        float i = (p * t * r) / 100;
        System.out.println(i);
        System.out.println(t);
        System.out.println(p);
        System.out.println("the rate of interest  " + i);
    }
}

class HDFC implements BankI {
    float r1 = 10 / 100f;

    public void rateofinterest() {

        float i1 = (p * t * r1) / 100;
        System.out.println("the rate of interest   " + i1);
    }
}

public class bank { // class Name should be allways caps firt letter Bank
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.rateofinterest();
        HDFC hdfc = new HDFC();
        hdfc.rateofinterest();
    }
}
