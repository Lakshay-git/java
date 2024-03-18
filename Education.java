public class Education {
    void m1(int a,int b)
    {
        System.out.println("m1 method");
        System.out.println(a);
    }
    static void m2(String str)
    {
        System.out.println(str);
    }
public static void main(String[] arg)
{
    Education e = new Education();
    e.m1(10,20);
    Education.m2("Rohit");
    
}

}. 
