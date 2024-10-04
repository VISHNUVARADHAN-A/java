

public class CreateMethodDemo {
    public static void main(String[] args) {
        System.out.println("hello from Main");
        DemoStatic();
        CreateMethodDemo d = new CreateMethodDemo();
        d.getdata();
        CreateMethodDemo2 d1 = new CreateMethodDemo2();
        d1.getdata();
        d1.getdata1();
        CreateMethodDemo2.DemoStatic1();

    }

        public static void DemoStatic(){
            System.out.println("hello from Demo static");
        }
        public void getdata(){
            System.out.println("hello from Demovoid");
        }
}
