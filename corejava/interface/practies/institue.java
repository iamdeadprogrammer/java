interface course { // Interface must Be Starting Letter is Capital letter
    // for readability perpose append capital I letter at end of the inerface name
    int reg = 100; // amount allways float .


    public void coursefee(String coursename, int amount); // method and variable names must be cameCase()

    default void coursefaculty() { // method name camelCase
        System.out.println("nagoor babu sir");
    }

    static void instituename() {  // method name camelCase
        System.out.println("durga soft");
    }
}

class java implements course { // Class must Be Starting Letter is Capital letter
    String cname;
    int cfee;

    public void coursefee(String coursename, int amount) { // method and variable names must be cameCase()
        cname = coursename;
        cfee = amount;
        int totalfee = reg + cfee;
        System.out.println("the amount for" + cname + " is " + totalfee);
    }

}

public class institue { // Class must Be Starting Letter is Capital letter
    public static void main(String[] args) {
        java j = new java();
        j.coursefee("java", 1000);
        j.coursefaculty();
        course.instituename();
    }
}