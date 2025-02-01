package JavaCrashCourse;

public class S2_varibles {
    public static void main(String[] args) {
        // primitive
        int number =10;
        float decimalnumber = 10.5f;
        char character = 'A';
        boolean booleanvalue = true;
        short shortnumber = 10;
        long longnumber = 1000000000;  
        //non primitive 
        String string = "hello world";
        System.out.println(number + " " + decimalnumber + " " + character + " " + booleanvalue + " " + string + " " + shortnumber + " " + longnumber);
        final int constant = 10;
        System.out.println(constant);
        //constant = 20; // this will give error

    }
}
