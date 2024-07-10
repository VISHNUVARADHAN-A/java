
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayandarraylist {

    public static void main(String[] args) {
        
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
        for (int i = MyArray.length-1 ; i >=0; i--) {
             System.out.print(MyArray[i]);
        }
        System.out.println("this is array " + Arrays.toString(MyArray1));
        // this is array [5, 4, 3, 2, 1]



        //Arry list
        ArrayList<String> a = new ArrayList<String>();
        a.add("A");
        a.add("B");
        a.add("c");
        System.out.println(a.get(2));

        for(int i=0; i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        System.out.println("enanched for loop");
        for( String val :a)
        {
            System.out.println(val);
        }
        System.out.println(a.contains("A"));
        System.out.println(a.contains("C"));

        //conver normal list to array list
        String[] name = {"A1","B2","C3","D4"};
        List<String> nameArrayList =Arrays.asList(name);
        System.out.println(nameArrayList.contains("E5"));
        System.out.println(nameArrayList.contains("D4"));
    }
}