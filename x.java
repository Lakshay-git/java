// class X {
//     int a=100,b=200;
//     static int x=500,y=60;
//     public static void main(String[] args){
//         X t = new X();
//         t.add(7,5);
//     }
    // void add(int a,int b)
    // {
    //     System.out.println(a+b);
           
    //         System.out.println(this.a+this.b);
    //     }
    // }

    // when there is ambiguity b/w instance variable and local variavble name 
    //use this keyword to access the inside a method to access instance variable 

    //this keyword will not work if the method is define as the static method 

    //it is always good to define local and instance variable with different name 



class X {
    void m1(int a)
    {
        System.out.println(a);
    }
    void m1(int a,int b)
    {
        System.out.println(a+b);
    }
   
    }
}