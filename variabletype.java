import java.util.Arrays;

public class variabletype {
    public static void main(String[] args) {
//int 
        int MyNumber = 5;
        System.out.println("this is number " + MyNumber);
        //string
        String MyString = "hellow world";
        System.out.println("this is String " + MyString);
        
        // float
        float MyFloat = 9.5f;
        System.err.println("this is float " + MyFloat);
        
        // double
        Double MyDouble = 9.5;
        System.out.println("this is Double " + MyDouble);
        //boolen
        boolean MyBoolen = true;
        System.out.println("this is boolen " + MyBoolen);
        // char
        char MyChar = 'a';
        System.out.println("this is character " + MyChar);
        
        // array
        
        System.out.println("declaring array");
        int[] MyArray = new int[5];
        MyArray[0] = 1;
        MyArray[1] = 2;
        MyArray[2] = 3;
        MyArray[3] = 4;
        MyArray[4] = 5;

        int[] MyArray1 = { 5, 4, 3, 2, 1 };

        System.out.println("printing array");

        System.out.println(MyArray[1]);
        // 2

        System.out.println("this is array " + Arrays.toString(MyArray));
        // this is array [1, 2, 3, 4, 5]

        for (int i = 0; i < MyArray.length; i++) {
            System.out.println(MyArray[i]);
        }
        // 1
        // 2
        // 3
        // 4
        // 5
        // for (int i = 0; i < MyArray.length; i++) {
        //     System.out.print(MyArray[i]);
        // }
        System.out.println("this is array " + Arrays.toString(MyArray1));
        // this is array [5, 4, 3, 2, 1]

    }
}
