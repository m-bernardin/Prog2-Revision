public class Person {
private String name;
private int age,deptNo;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getDeptNo() {
        return deptNo;
    }
    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(String name,int deptNo,int age){
        this.age=age;
        this.deptNo=deptNo;
        this.name=name;
    }
}