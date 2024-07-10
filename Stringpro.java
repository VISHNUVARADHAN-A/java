

public class Stringpro {
    public static void main(String[] args) {
        //String literal = java will not another objectmemory allocation. because hello is already available on A1
        String A1  ="hello"; 
        String A2 = "hello";
        System.out.println(System.identityHashCode(A1));
        System.out.println(System.identityHashCode(A2));
        // new object memory even hi is available in A3
        String A3= new String("hi");
        String A4= new String("hi");
        System.out.println(System.identityHashCode(A3));
        System.out.println(System.identityHashCode(A4));
        String s = "hi hello welcome";
        String[] splittedString =s.split(" ");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[2]);

        String[] splittedString1 =s.split("");
        System.out.println(splittedString1[0]);
        System.out.println(splittedString1[1]);
        System.out.println(splittedString1[2]);

        String[] splittedString2 =s.split("hello");
        System.out.println(splittedString2[0]);
        System.out.println(splittedString2[1]);
        System.out.println(splittedString2[1].trim());



    }
}
