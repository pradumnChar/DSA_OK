class A{
    int a=10;
    void u()
    
    {
System.out.println(1);
    }
}

class B extends A{
     int a=20;
    
     void set()
    {
        super.u();
       
        System.out.println(a);
    }
}


class C {
    public static void main(String[] args) {
       // int a=20;
   
        B b = new B();
        // A a = new A();
        b.set();
       //  a.set();
    }
    
}
