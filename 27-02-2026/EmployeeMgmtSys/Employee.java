public class Employee{
    protected String name;
    protected double salary;
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
        return name+": "+salary+"k$/yr";
    }
}