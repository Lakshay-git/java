public // public class Test{
    //     void m1(){
    //         System.out.println("m1 method");
    
    //     }
    //     static void m2(){
    //         System.out.println("m2 method");
    //     }
    
    //     public static void main(String[] args){
    //         Test t = new Test();
    //         t.m1();
    //         Test.m2();
    //     }
    // }
    
    class Test
    {
        void m1(int a,int b)
        {
            System.out.println(a+b);
        }
        int m1(int a,int b)
        {
            System.out.println(a+b);
        }
        public static voidmain(String[] arg)
        {
            Test t = new Test();
            t.m1(100,200);
        }
    }
    
    // inside a class it is not possible to create new method with same method signature  rr {
    
}
