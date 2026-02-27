public class Manager extends Employee{
    private String department;
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Manager(String name,double salary,String department){
        super(name, salary);
        this.department=department;
    }
    public String toString(){
        return super.toString()+" (works in "+department+")";
    }
}