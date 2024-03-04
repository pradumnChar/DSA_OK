class ok{
    private int emp_id;
    private String emp_name;
    public void setemp_id(int emp) {
        emp_id = emp;
    }
    public int getemp_id() {
       return (emp_id);
    }
    public void setemp_name(String name) {
        emp_name = name;
    }
    public String getemp_name() {
       return emp_name;
    }
}
class op{
    public static void main(String[] args) {
        ok o = new ok();
        o.setemp_id(2);
        o.setemp_name("Pradumn");
        System.out.println(o.getemp_id() + " " + o.getemp_name());
    }

}