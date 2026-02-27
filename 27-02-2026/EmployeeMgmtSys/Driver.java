import java.util.ArrayList;

public class Driver{
    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee("John Borkus", 0.5));
        employees.add(new Manager("Safety Chris",5000.69,"Boden works co."));
        employees.add(new Developper("depressed dev no 93", 80000000.01, "everything lol"));
        employees.add(new Employee("John Bingus", 0.5));
        System.out.println("all employee info:");
        for(Employee employee:employees){
            System.out.println(employee.toString());
        }
    }
}