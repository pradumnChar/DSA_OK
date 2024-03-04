/*class test {
    int i;
    public void getVlaues(int i)
    {
        //i=i here both point to the local variable itself hence no cahnge occur on instance variab
    
        this.i=i;//this.i referes to curr class instance variable, and i t=refers to local varaible
    }
     public void print()
    {System.out.println(i);}
class ok{public static void main(String[] args) {test t = new test();t.getVlaues(10);t.print();}}*/
//above includes the need , problem , solution realted to this ke=eywords

//2);
class test {
    int i;
    public void getVlaues(int i)
    {
       
       System.out.println(i=10);
    }
     public void print()
    {
        getClass();
    }
class ok{public static void main(String[] args) {
    test t = new test();

    t.print();}
}
}






