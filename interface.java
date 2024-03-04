interface ok{
    abstract void yes();
     int joy=0;

}
class k implements ok{
    public void yes(){
        System.out.println("d");
    }
    public static void main(String[] args) {
        k o = new k();
        o.yes();

    }
}
