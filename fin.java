class ok{
     final void ip()
    
    {
        System.out.println(1);
    }
}
class b extends ok{
     final void ip()
    
    {
        System.out.println(2);
    }
   
}


class fin{
    public static void main(String[] args) {
        b br = new b();
        br.ip();
    }
}
//final keyword makes variavble constant 
// makes class imposible to inherit
//makes our method impoosible to be overriden